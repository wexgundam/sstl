package org.mose.util.ftp;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

/**
 * Ftp工具类
 *
 * @author 靳磊
 * @date 2017-05-23
 */

public class FtpUtil {
    private static Logger logger = LoggerFactory.getLogger("exceptionLogger");

    /**
     * 建立ftp连接
     *
     * @param ftp      ftp地址
     * @param port     端口
     * @param username 账号
     * @param userpass 密码
     * @param path     连接后跳转路径
     *
     * @return
     *
     * @author 靳磊
     * @date 2017-05-23
     */
    public static FTPClient connectFtp(String ftp, int port, String username, String userpass, String path) {
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.setControlEncoding("GBK");
            ftpClient.connect(ftp, port);
            boolean isConn = ftpClient.login(username, userpass);
            if (isConn) {
                ftpClient.changeWorkingDirectory(path);
            }
        } catch (SocketException e) {
            logger.error(e.getMessage(), e);
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
        return ftpClient;
    }

    /**
     * 关闭连接
     *
     * @param ftpClient
     *
     * @author 靳磊
     * @date 2017-05-23
     */
    public static void disconnect(FTPClient ftpClient) {
        if (ftpClient.isConnected()) {
            try {
                ftpClient.disconnect();
                ftpClient = null;
            } catch (IOException e) {
                logger.error(e.getMessage(), e);
            }
        }
    }

    /**
     * 列出服务器文件列表
     *
     * @param ftpClient
     *
     * @return
     *
     * @author 靳磊
     * @date 2017-05-23
     */
    public static List<String> listFtpFile(FTPClient ftpClient) {
        List<String> listFiles = new ArrayList<String>();
        try {
            FTPFile ftpFile[] = ftpClient.listFiles();
            if (ftpFile.length > 0) {
                for (int i = 0; i < ftpFile.length; i++) {
                    if (ftpFile[i].isFile())
                        listFiles.add(ftpFile[i].getName());
                }
            }
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return listFiles;
    }

    /**
     * 读取文件内容，返回list
     *
     * @param ftpClient
     * @param filename
     *
     * @return
     *
     * @author 靳磊
     * @date 2017-05-23
     */
    public static List<String> readFileContent(FTPClient ftpClient, String filename) {
        List<String> list = new ArrayList<String>();
        InputStream is = null;
        try {
            ftpClient.setFileType(FTP.ASCII_FILE_TYPE);
            ftpClient.setBufferSize(1024 * 1024);
            is = ftpClient.retrieveFileStream(filename);
            if (is != null) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(is, "GBK"));
                String inLine = reader.readLine();
                while (inLine != null) {
                    if (!inLine.equals(""))
                        list.add(inLine);
                    inLine = reader.readLine();
                }
                reader.close();
            }
        } catch (UnsupportedEncodingException e) {
            logger.error(e.getMessage(), e);
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                logger.error(e.getMessage(), e);
            }
            is = null;
        }
        return list;
    }
}
