package com.example.springboot.controller;

import com.example.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 */
@RestController
public class StudentController
{
    @Autowired
    private StudentService studentService;

    @RequestMapping(value ="/get",method = RequestMethod.GET)
    public Map<String,Object> getStudentAll(){

        Map<String,Object> map=new HashMap<String,Object>();
        try
        {
            map.put("studentInfo",studentService.getStudentAll());
        }catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }

    @GetMapping(value ="/insert" )
    public Map<String,Object> insertStudent(String name,String age,String address){

        Map<String,Object> map=new HashMap<String,Object>();
        try
        {
            map.put("studentInfo",studentService.insertStudent(name,age,address));
        }catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }
}
