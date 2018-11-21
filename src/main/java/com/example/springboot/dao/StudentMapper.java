package com.example.springboot.dao;

import com.example.springboot.po.StudentEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Administrator
 */
@Mapper
public interface StudentMapper
{
    /**
     *查询
     * @return
     */
    List<StudentEntity> getStudentAll();

    /**
     * 新增
     * @param studentEntity
     * @return
     */
    int insertStudent(StudentEntity studentEntity);
}
