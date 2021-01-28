package cn.yifansun.dao;

import cn.yifansun.pojo.Teacher;
import cn.yifansun.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/1/28,20:25
 */
public class Test {
    //    使用log4j时必须创建logger对象
    static Logger logger = Logger.getLogger(Test.class);

    @org.junit.Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //底层主要应用反射
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teachers =teacherMapper.getTeacher(1);
        System.out.println(teachers);
        sqlSession.close();
    }
}
