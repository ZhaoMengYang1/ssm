package com.zz.ssm.service.impl;

import com.zz.ssm.mapper.FileZoneRecordMapper;
import com.zz.ssm.entity.FileRecord;
import com.zz.ssm.entity.FileZoneRecord;
import com.zz.ssm.service.IFileZoneRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:zhaomengyang
 * @Date:2020/9/27
 */
@Service
public class FileZoneRecordServiceImpl implements IFileZoneRecordService {

    @Autowired
    private  FileZoneRecordMapper fileZoneRecordMapper;

    @Override
    public FileZoneRecord selByMD5AndZoneTotalMd5(String zoneMd5, String zoneTotalMd5) {
//        QueryWrapper queryWrapper=new QueryWrapper();
//        queryWrapper.eq("zone_md5",zoneMd5);
//        queryWrapper.eq("zone_total_md5",zoneTotalMd5);
//        List<FileZoneRecord> list = fileZoneRecordMapper.selectList(queryWrapper);
//        if(list.size()>0){
//            return list.get(0);
//        }
        return null;
    }

    @Override
    public List<FileZoneRecord> selByTotalMd5(String zoneTotalMd5) {
//        QueryWrapper queryWrapper=new QueryWrapper();
//        queryWrapper.eq("zone_total_md5",zoneTotalMd5);
//        queryWrapper.orderByAsc("zone_now_index");
//        List<FileZoneRecord> list = fileZoneRecordMapper.selectList(queryWrapper);
//        return list;
        return null;
    }

    @Override
    public void save(FileZoneRecord fileZoneRecord) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeByIds(List<String> ids) {
        // TODO Auto-generated method stub

    }

    @Override
    public void updateById(FileRecord fileRecordb) {
        // TODO Auto-generated method stub

    }


}
