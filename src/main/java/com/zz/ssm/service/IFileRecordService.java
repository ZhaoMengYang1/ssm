package com.zz.ssm.service;

import com.zz.ssm.entity.Result;
import com.zz.ssm.entity.FileRecord;
import com.zz.ssm.entity.FileZoneRecord;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

/**
 * @Author:zhaomengyang
 * @Date:2020/9/27
 */

public interface IFileRecordService {

    Result upload(HttpServletRequest request, Integer uploadType, Integer storageYear);

    Result zoneUpload(HttpServletRequest request, String contentType, FileZoneRecord fileZoneRecord);

    Result md5Check(FileZoneRecord fileZoneRecord, Integer checkType, String contentType, HttpServletRequest request);

    Result mergeZoneFile(String totalmd5, HttpServletRequest request);

    Result delZoneFile(String totalmd5);

    Result delFile(String fileId);

    FileRecord getById(String id);

    boolean saveOrUpdate(FileRecord fileRecord);

    boolean removeById(String id);

    boolean removeByIds(ArrayList arrayList);

    void save(FileRecord fileRecord);

    boolean selectMD5(String md5Value);

    boolean selectUploadType(Integer uploadType);
//    void recordDownloadLog(String fileId, FileRecord fileRecord);


}
