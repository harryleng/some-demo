package com.example.springboot.service.impl;

import com.example.springboot.dao.StudentMapper;
import com.example.springboot.po.StudentEntity;
import com.example.springboot.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@Service
public class StudentServiceImpl implements StudentService
{
    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<StudentEntity> getStudentAll()throws Exception
    {
        return studentMapper.getStudentAll();
    }

    @Override
    public int insertStudent(String name, String age, String address)throws Exception
    {
        StudentEntity studentEntity=new StudentEntity();
        studentEntity.setName(name);
        studentEntity.setAge(Integer.valueOf(age));
        studentEntity.setAddress(address);
        studentMapper.insertStudent(studentEntity) ;
        return 1;
    }
}
