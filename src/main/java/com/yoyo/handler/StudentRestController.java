package com.yoyo.handler;

import com.yoyo.entity.Student;
import com.yoyo.mappers.StudentMapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;

@EnableSwagger2
@RestController
@RequestMapping("/rest")
public class StudentRestController {

    @Resource
    private StudentMapper studentMapper;

    @ApiOperation("插入数据")
    @PostMapping("/insert")
    public void insert(@RequestBody Student student){
        studentMapper.save(student);
    }

    @ApiOperation("测试")
    @RequestMapping("/test")
    public String test(){
        System.out.print("12345");
        return "test";
    }
}
