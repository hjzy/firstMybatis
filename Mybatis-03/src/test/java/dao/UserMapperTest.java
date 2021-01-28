package dao;

import cn.yifansun.dao.UserMapper;
import cn.yifansun.pojo.User;
import cn.yifansun.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;


/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/1/23,21:26
 */
public class UserMapperTest {
//    使用log4j时必须创建logger对象
    static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //底层主要应用反射
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserByUserid(1);
        System.out.println(user);
        sqlSession.close();
    }


}
