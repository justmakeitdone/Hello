package com.yoyo.handler;

import com.yoyo.entity.Student;
import com.yoyo.mappers.StudentMapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.spring.web.json.Json;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//@Import(StudentRestController.class)
//@ComponentScan("com.yoyo.mappers")
//上面这两个注解好像不需要
@EnableSwagger2
@RestController
@RequestMapping("/rest")
public class StudentRestController {
    @Resource
    private StudentMapper studentMapper;

    @ApiOperation("插入数据")
//    @PostMapping("/insert")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public void insert(@RequestBody Student student){
        studentMapper.save(student);
    }

    @ApiOperation("测试")
    @RequestMapping("/test")
    public String test(){
        System.out.print("12345");
        return "test";
    }
    @ApiOperation("测试")
    @RequestMapping("/getLastDayOfMonth")
    public static String getLastDayOfMonth(int year,int month)
    {
        Calendar cal = Calendar.getInstance();
//        Date date = new Date();
//        cal.setTime(date);
        int lastDay1 = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        //String lastDayOfMonth1 = sdf.format(cal.getTime());
        //设置年份
        cal.set(Calendar.YEAR,year);
        //设置月份
        cal.set(Calendar.MONTH, month-1);
        //获取某月最大天数
        int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        //设置日历中月份的最大天数
        cal.set(Calendar.DAY_OF_MONTH, lastDay);
        //格式化日期

        String lastDayOfMonth = sdf.format(cal.getTime());

        System.out.print(lastDayOfMonth);
        String rq = "2017-10";

        DateFormat format2 =  new SimpleDateFormat("yyyy-MM");
        Date date = new Date();
        try{
            date = format2.parse(rq);
        }catch(Exception e){
            e.printStackTrace();
        }
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM");
        c.add(Calendar.MONTH, -1);
        String time = format.format(c.getTime());

        System.out.println(time);
 return null;
    }

    @ApiOperation("jsonObject与jsonArray")
    @RequestMapping("/jsonUse")
    public String jsonUse(){
        String jsonString =  "{\"data\":{\"items\":[{\"itemstring\":\"手机\",\"itemcoord\":{\"x\":0,\"y\":100,\"width\":40,\"height\":20},}],\"session_id\":\"\",},\"code\":0,\"message\":\"OK\"}";
//        Json
        return null;
    }


}
