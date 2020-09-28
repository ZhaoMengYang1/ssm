package com.zz.ssm.util;

import org.springframework.stereotype.Component;

/**
 * @Description TODO 文件上传配置
 * @ClassName FileUploadConfig
 ***/
@Component
public class FileUploadConfig {
    private String uploadFolder;
    private String staticAccessPath;
    private String localPath;
    private String userHeaderPicPath;
    private String archivesFilePath;
    private String domain;
    public String getUploadFolder() {
        return uploadFolder;
    }
    public void setUploadFolder(String uploadFolder) {
        this.uploadFolder = uploadFolder;
    }
    public String getStaticAccessPath() {
        return staticAccessPath;
    }
    public void setStaticAccessPath(String staticAccessPath) {
        this.staticAccessPath = staticAccessPath;
    }
    public String getLocalPath() {
        return localPath;
    }
    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }
    public String getUserHeaderPicPath() {
        return userHeaderPicPath;
    }
    public void setUserHeaderPicPath(String userHeaderPicPath) {
        this.userHeaderPicPath = userHeaderPicPath;
    }
    public String getArchivesFilePath() {
        return archivesFilePath;
    }
    public void setArchivesFilePath(String archivesFilePath) {
        this.archivesFilePath = archivesFilePath;
    }
    public String getDomain() {
        return domain;
    }
    public void setDomain(String domain) {
        this.domain = domain;
    }



    public FileUploadConfig() {
        super();
        // TODO Auto-generated constructor stub
    }



    public FileUploadConfig(String uploadFolder, String staticAccessPath, String localPath, String userHeaderPicPath,
                            String archivesFilePath, String domain) {
        super();
        this.uploadFolder = uploadFolder;
        this.staticAccessPath = staticAccessPath;
        this.localPath = localPath;
        this.userHeaderPicPath = userHeaderPicPath;
        this.archivesFilePath = archivesFilePath;
        this.domain = domain;
    }


    @Override
    public String toString() {
        return "FileUploadConfig [uploadFolder=" + uploadFolder + ", staticAccessPath=" + staticAccessPath
                + ", localPath=" + localPath + ", userHeaderPicPath=" + userHeaderPicPath + ", archivesFilePath="
                + archivesFilePath + ", domain=" + domain + "]";
    }






}
