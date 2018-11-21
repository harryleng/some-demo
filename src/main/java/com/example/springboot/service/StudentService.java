package com.example.springboot.service;

import com.example.springboot.po.StudentEntity;

import java.util.List;

/**
 * @author Administrator
 */
public interface StudentService
{
    /**
     * 查询所有学生
     * @return
     */
    List<StudentEntity> getStudentAll()throws Exception;

    /**
     *
     * @param name
     * @param age
     * @param address
     * @return
     */
    int insertStudent(String name,String age,String address)throws Exception;
}
