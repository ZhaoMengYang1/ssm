package com.zz.ssm.mapper;

import com.zz.ssm.entity.FileZoneRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author:zhaomengyang
 * @Date:2020/9/27
 */
public interface FileZoneRecordMapper {
    /*
     * 获得所有上传分片的记录
     */
    public List<FileZoneRecord> getAllRecord();


    /*
     * 根据id获得上传分片记录
     * @param注解xml中用#{id}或${id}取值都可以
     */
    public FileZoneRecord getRecordById(@Param("id") String id);

    /*
     * 添加记录
     */
    public int add(FileZoneRecord entity);


    /*
     * 删除记录
     */
    public int delete(int id);




}
