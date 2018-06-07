package org.mose.util.string;

import org.slf4j.LoggerFactory;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/**
 * 系统获取IP工具类
 *
 * @author 靳磊
 * @date 2017-05-23
 */
public final class IPUtil {
    private static org.slf4j.Logger logger = LoggerFactory.getLogger("exceptionLogger");

    /**
     * 取到当前机器的IP地址，这里可以直接获取该服务器的所有网卡ip，如果包括内外网网卡，就是两个ip，中间以,分隔
     *
     * @return
     *
     * @author 靳磊
     * @date 2017-05-23
     */
    public static String getIp() {
        String hostIp = null;
        if (hostIp == null) {
            List<String> ips = new ArrayList<String>();
            Enumeration<NetworkInterface> netInterfaces = null;
            try {
                netInterfaces = NetworkInterface.getNetworkInterfaces();
                while (netInterfaces.hasMoreElements()) {
                    NetworkInterface netInterface = netInterfaces.nextElement();
                    Enumeration<InetAddress> inteAddresses = netInterface.getInetAddresses();
                    while (inteAddresses.hasMoreElements()) {
                        InetAddress inetAddress = inteAddresses.nextElement();
                        if (!inetAddress.isLoopbackAddress() && inetAddress instanceof Inet4Address) {
                            ips.add(inetAddress.getHostAddress());
                        }
                    }
                }
            } catch (SocketException ex) {
                logger.error(ex.getMessage(), ex);
            }
            hostIp = collectionToDelimitedString(ips, ",");
        }
        return hostIp;
    }

    private static String collectionToDelimitedString(Collection<String> coll, String delim) {
        if (coll == null || coll.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<?> it = coll.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(delim);
            }
        }
        return sb.toString();
    }

    /**
     * 获取服务器名称
     *
     * @return
     */
    public static String getHostName() {
        String hostName = null;
        try {
            hostName = InetAddress.getLocalHost().getHostName();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return hostName;
    }

    public static void main(String[] args) {
        System.out.println(IPUtil.getHostName());
    }
}
