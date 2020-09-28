package com.zz.ssm.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author:zhaomengyang
 * @Date:2020/9/27
 */
public class FileZoneRecord {

    private static final long serialVersionUID = 1L;


    /**
     * 分片ID
     */
    private String id;

    /**
     * 分片名称
     */
    private String zoneName;

    /**
     * 分片的文件路径
     */
    private String zonePath;

    /**
     * 分片MD5
     */
    private String zoneMd5;

    /**
     * 分片记录MD5值
     */
    private Date zoneRecordDate;

    /**
     * 上传完成校验日期
     */
    private Date zoneCheckDate;

    /**
     * 总的分片数
     */
    private Integer zoneTotalCount;

    /**
     * 总文件的MD5值
     */
    private String zoneTotalMd5;

    /**
     * 当前分片索引
     */
    private Integer zoneNowIndex;

    /**
     * 文件开始位置
     */
    private Long zoneStartSize;

    /**
     * 文件结束位置
     */
    private Long zoneEndSize;

    /**
     * 文件总大小
     */
    private Long zoneTotalSize;
    /**
     * 分片文件后缀
     */
    private String zoneSuffix;

    /**
     * 文件记录ID
     */
    private String fileRecordId;

    protected Serializable pkVal() {
        return this.id;
    }




    public String getId() {
        return id;
    }




    public void setId(String id) {
        this.id = id;
    }




    public String getZoneName() {
        return zoneName;
    }




    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }




    public String getZonePath() {
        return zonePath;
    }




    public void setZonePath(String zonePath) {
        this.zonePath = zonePath;
    }




    public String getZoneMd5() {
        return zoneMd5;
    }




    public void setZoneMd5(String zoneMd5) {
        this.zoneMd5 = zoneMd5;
    }




    public Date getZoneRecordDate() {
        return zoneRecordDate;
    }




    public void setZoneRecordDate(Date zoneRecordDate) {
        this.zoneRecordDate = zoneRecordDate;
    }




    public Date getZoneCheckDate() {
        return zoneCheckDate;
    }




    public void setZoneCheckDate(Date zoneCheckDate) {
        this.zoneCheckDate = zoneCheckDate;
    }




    public Integer getZoneTotalCount() {
        return zoneTotalCount;
    }




    public void setZoneTotalCount(Integer zoneTotalCount) {
        this.zoneTotalCount = zoneTotalCount;
    }




    public String getZoneTotalMd5() {
        return zoneTotalMd5;
    }




    public void setZoneTotalMd5(String zoneTotalMd5) {
        this.zoneTotalMd5 = zoneTotalMd5;
    }




    public Integer getZoneNowIndex() {
        return zoneNowIndex;
    }




    public void setZoneNowIndex(Integer zoneNowIndex) {
        this.zoneNowIndex = zoneNowIndex;
    }




    public Long getZoneStartSize() {
        return zoneStartSize;
    }




    public void setZoneStartSize(Long zoneStartSize) {
        this.zoneStartSize = zoneStartSize;
    }




    public Long getZoneEndSize() {
        return zoneEndSize;
    }




    public void setZoneEndSize(Long zoneEndSize) {
        this.zoneEndSize = zoneEndSize;
    }




    public Long getZoneTotalSize() {
        return zoneTotalSize;
    }




    public void setZoneTotalSize(Long zoneTotalSize) {
        this.zoneTotalSize = zoneTotalSize;
    }




    public String getZoneSuffix() {
        return zoneSuffix;
    }




    public void setZoneSuffix(String zoneSuffix) {
        this.zoneSuffix = zoneSuffix;
    }




    public String getFileRecordId() {
        return fileRecordId;
    }




    public void setFileRecordId(String fileRecordId) {
        this.fileRecordId = fileRecordId;
    }




    public static long getSerialversionuid() {
        return serialVersionUID;
    }




    public FileZoneRecord() {
        // TODO Auto-generated constructor stub
    }




    public FileZoneRecord(String id, String zoneName, String zonePath, String zoneMd5, Date zoneRecordDate,
                          Date zoneCheckDate, Integer zoneTotalCount, String zoneTotalMd5, Integer zoneNowIndex, Long zoneStartSize,
                          Long zoneEndSize, Long zoneTotalSize, String zoneSuffix, String fileRecordId) {
        super();
        this.id = id;
        this.zoneName = zoneName;
        this.zonePath = zonePath;
        this.zoneMd5 = zoneMd5;
        this.zoneRecordDate = zoneRecordDate;
        this.zoneCheckDate = zoneCheckDate;
        this.zoneTotalCount = zoneTotalCount;
        this.zoneTotalMd5 = zoneTotalMd5;
        this.zoneNowIndex = zoneNowIndex;
        this.zoneStartSize = zoneStartSize;
        this.zoneEndSize = zoneEndSize;
        this.zoneTotalSize = zoneTotalSize;
        this.zoneSuffix = zoneSuffix;
        this.fileRecordId = fileRecordId;
    }




    @Override
    public String toString() {
        return "FileZoneRecord [id=" + id + ", zoneName=" + zoneName + ", zonePath=" + zonePath + ", zoneMd5=" + zoneMd5
                + ", zoneRecordDate=" + zoneRecordDate + ", zoneCheckDate=" + zoneCheckDate + ", zoneTotalCount="
                + zoneTotalCount + ", zoneTotalMd5=" + zoneTotalMd5 + ", zoneNowIndex=" + zoneNowIndex
                + ", zoneStartSize=" + zoneStartSize + ", zoneEndSize=" + zoneEndSize + ", zoneTotalSize="
                + zoneTotalSize + ", zoneSuffix=" + zoneSuffix + ", fileRecordId=" + fileRecordId + "]";
    }


}
