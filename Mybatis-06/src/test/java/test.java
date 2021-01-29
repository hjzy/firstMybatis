import cn.yifansun.dao.TeacherMapper;

import cn.yifansun.pojo.Teacher;

import cn.yifansun.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;


/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/1/29,0:05
 */
public class test {
    @Test
    public void testGetTeacher(){
        SqlSession session = MybatisUtils.getSqlSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher.getName());
        System.out.println(teacher.getStudents());
    }
}
