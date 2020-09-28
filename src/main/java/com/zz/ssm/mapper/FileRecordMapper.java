package com.zz.ssm.mapper;

import com.zz.ssm.entity.FileRecord;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author:zhaomengyang
 * @Date:2020/9/27
 */
@Component
public interface FileRecordMapper {

    /*
     * 获得所有上传文件的记录
     */
    public List<FileRecord> getAllRecord();


    /*
     * 根据id获得上传文件记录
     * xml中用#{id}取值
     */
    public FileRecord getRecordById(@Param("id") String id);


    /*
     * 添加记录
     */
    public int add(FileRecord entity);


    /*
     * 删除记录
     */
    public int delete(int id);


    /*
     * 跟新文件记录
     */
    public int update(FileRecord entity);

    /*
     * 根据MD5和类型查询
     */
    public List<FileRecord> selectList(FileRecord queryWrapper);




}
