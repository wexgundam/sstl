package org.mose.util.model;

/**
 * 下拉框的实体类
 * Author  靳磊
 * Date  2017/6/11.
 */
public class ComboboxVO {
    private String value;//字段值
    private String content;//字段内容

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
