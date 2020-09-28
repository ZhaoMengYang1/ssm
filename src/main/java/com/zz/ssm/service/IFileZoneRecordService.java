package com.zz.ssm.service;

import com.zz.ssm.entity.FileRecord;
import com.zz.ssm.entity.FileZoneRecord;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:zhaomengyang
 * @Date:2020/9/27
 */

public interface IFileZoneRecordService {

    FileZoneRecord selByMD5AndZoneTotalMd5(String zoneMd5, String zoneTotalMd5);

    List<FileZoneRecord> selByTotalMd5(String totalmd5);

    public void save(FileZoneRecord fileZoneRecord);

    public void removeByIds(List<String> ids);

    public void updateById(FileRecord fileRecordb);

}
