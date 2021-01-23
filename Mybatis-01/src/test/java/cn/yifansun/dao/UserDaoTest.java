package cn.yifansun.dao;

import cn.yifansun.pojo.User;
import cn.yifansun.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/1/23,21:26
 */
public class UserDaoTest {
    @Test
    public void test()
    {
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        try {
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            List<User> users = userDao.selectUser();

            for (User user : users) {
                System.out.println(user);
            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            //SqlSession不是线程安全的，因此，每收到一个请求打开一次，完成该请求后必须将其关闭。
            sqlSession.close();
        }
    }

}
