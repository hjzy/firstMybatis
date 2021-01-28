package cn.yifansun.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student
{
    private int id;
    private String name;

    //学生需要关联一个老师
    private Teacher teacher;
}