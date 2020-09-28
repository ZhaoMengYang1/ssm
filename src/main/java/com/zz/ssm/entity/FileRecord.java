package com.zz.ssm.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author:zhaomengyang
 * @Date:2020/9/27
 */
public class FileRecord {
    private static final long serialVersionUID = 1L;


    /**
     * 记录ID
     */
    private String id;

    /**
     * 源文件名
     *
     **/
    private String orgName;

    /**
     * 服务器生成的文件名
     */
    private String serverLocalName;

    /**
     * 服务器储存路径
     */
    private String serverLocalPath;

    /**
     * 网络路径，生成的文件夹+系统生成文件名
     */
    private String networkPath;

    /**
     * 上传类型
     */
    private Integer uploadType;

    /**
     * 文件MD5值
     */
    private String md5Value;

    /**
     * 文件大小
     */
    private Long fileSize;

    /**
     * 是否分片 0 否 1是
     */
    private Integer isZone;

    /**
     * 分片总数
     */
    private Integer zoneTotal;

    /**
     * 分片时间
     */
    private Date zoneDate;

    /**
     * 分片合并时间
     */
    private Date zoneMergeDate;

    /**
     * 文件类型
     */
    private String fileType;

    /**
     * 设备信息
     */
    private String uploadDevice;

    /**
     * 上传设备IP
     */
    private String uploadIp;

    /**
     * 储存日期
     */
    private Date storageDate;

    /**
     * 下载统计
     */
    private Integer downloadCount;

    /**
     * 上传统计
     */
    private Integer uploadCount;

    /**
     * 是否合并
     */
    private Integer isMerge;

    /**
     * 上传人员
     */
    private String createBy;

    /**
     * 上传日期
     */
    private Date createTime;

    /**
     * 删除标记 1正常 -1删除
     */
    private Integer delFlag;

    protected Serializable pkVal() {
        return this.id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getServerLocalName() {
        return serverLocalName;
    }

    public void setServerLocalName(String serverLocalName) {
        this.serverLocalName = serverLocalName;
    }

    public String getServerLocalPath() {
        return serverLocalPath;
    }

    public void setServerLocalPath(String serverLocalPath) {
        this.serverLocalPath = serverLocalPath;
    }

    public String getNetworkPath() {
        return networkPath;
    }

    public void setNetworkPath(String networkPath) {
        this.networkPath = networkPath;
    }

    public Integer getUploadType() {
        return uploadType;
    }

    public void setUploadType(Integer uploadType) {
        this.uploadType = uploadType;
    }

    public String getMd5Value() {
        return md5Value;
    }

    public void setMd5Value(String md5Value) {
        this.md5Value = md5Value;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public Integer getIsZone() {
        return isZone;
    }

    public void setIsZone(Integer isZone) {
        this.isZone = isZone;
    }

    public Integer getZoneTotal() {
        return zoneTotal;
    }

    public void setZoneTotal(Integer zoneTotal) {
        this.zoneTotal = zoneTotal;
    }

    public Date getZoneDate() {
        return zoneDate;
    }

    public void setZoneDate(Date zoneDate) {
        this.zoneDate = zoneDate;
    }

    public Date getZoneMergeDate() {
        return zoneMergeDate;
    }

    public void setZoneMergeDate(Date zoneMergeDate) {
        this.zoneMergeDate = zoneMergeDate;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getUploadDevice() {
        return uploadDevice;
    }

    public void setUploadDevice(String uploadDevice) {
        this.uploadDevice = uploadDevice;
    }

    public String getUploadIp() {
        return uploadIp;
    }

    public void setUploadIp(String uploadIp) {
        this.uploadIp = uploadIp;
    }

    public Date getStorageDate() {
        return storageDate;
    }

    public void setStorageDate(Date storageDate) {
        this.storageDate = storageDate;
    }

    public Integer getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
    }

    public Integer getUploadCount() {
        return uploadCount;
    }

    public void setUploadCount(Integer uploadCount) {
        this.uploadCount = uploadCount;
    }

    public Integer getIsMerge() {
        return isMerge;
    }

    public void setIsMerge(Integer isMerge) {
        this.isMerge = isMerge;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }


    public FileRecord() {
    }

    public FileRecord(String id, String orgName, String serverLocalName, String serverLocalPath, String networkPath,
                      Integer uploadType, String md5Value, Long fileSize, Integer isZone, Integer zoneTotal, Date zoneDate,
                      Date zoneMergeDate, String fileType, String uploadDevice, String uploadIp, Date storageDate,
                      Integer downloadCount, Integer uploadCount, Integer isMerge, String createBy, Date createTime,
                      Integer delFlag) {
        super();
        this.id = id;
        this.orgName = orgName;
        this.serverLocalName = serverLocalName;
        this.serverLocalPath = serverLocalPath;
        this.networkPath = networkPath;
        this.uploadType = uploadType;
        this.md5Value = md5Value;
        this.fileSize = fileSize;
        this.isZone = isZone;
        this.zoneTotal = zoneTotal;
        this.zoneDate = zoneDate;
        this.zoneMergeDate = zoneMergeDate;
        this.fileType = fileType;
        this.uploadDevice = uploadDevice;
        this.uploadIp = uploadIp;
        this.storageDate = storageDate;
        this.downloadCount = downloadCount;
        this.uploadCount = uploadCount;
        this.isMerge = isMerge;
        this.createBy = createBy;
        this.createTime = createTime;
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        return "FileRecord [id=" + id + ", orgName=" + orgName + ", serverLocalName=" + serverLocalName
                + ", serverLocalPath=" + serverLocalPath + ", networkPath=" + networkPath + ", uploadType="
                + uploadType + ", md5Value=" + md5Value + ", fileSize=" + fileSize + ", isZone=" + isZone
                + ", zoneTotal=" + zoneTotal + ", zoneDate=" + zoneDate + ", zoneMergeDate=" + zoneMergeDate
                + ", fileType=" + fileType + ", uploadDevice=" + uploadDevice + ", uploadIp=" + uploadIp
                + ", storageDate=" + storageDate + ", downloadCount=" + downloadCount + ", uploadCount="
                + uploadCount + ", isMerge=" + isMerge + ", createBy=" + createBy + ", createTime=" + createTime
                + ", delFlag=" + delFlag + "]";
    }







}
