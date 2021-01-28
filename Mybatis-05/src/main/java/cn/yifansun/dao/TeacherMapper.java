package cn.yifansun.dao;

import cn.yifansun.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/1/28,20:16
 */
public interface TeacherMapper {
    Teacher getTeacher(@Param("tid") int id);
}
