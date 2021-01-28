package cn.yifansun.dao;

import cn.yifansun.pojo.Student;
import cn.yifansun.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/1/28,20:16
 */
public interface StudentMapper {
    public List<Student> getStudent();
    public List<Student> getStudent2();
}
