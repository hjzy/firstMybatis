package cn.yifansun.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/1/28,20:15
 */
@Data
public class Teacher {
    private  int id;
    private String name;
    //一个老师多个学生
    private List<Student> students;
}
