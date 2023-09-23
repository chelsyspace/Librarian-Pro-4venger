package com.example.library_4vengers;

public class DataClass {
    private String dataTitle;

    private String dataAuthor;
    private String dataDesc;
    private String dataLang;
    private String dataImage;
    private String key;
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public String getDataTitle() {
        return dataTitle;
    }

    public String getDataAuthor() {
        return dataAuthor;
    }

    public String getDataDesc() {
        return dataDesc;
    }
    public String getDataLang() {
        return dataLang;
    }
    public String getDataImage() {
        return dataImage;
    }
    public DataClass(String dataTitle, String dataAuthor, String dataDesc, String dataLang, String dataImage) {
        this.dataTitle = dataTitle;
        this.dataAuthor = dataAuthor;
        this.dataDesc = dataDesc;
        this.dataLang = dataLang;
        this.dataImage = dataImage;
    }
    public DataClass(){

    }

}
