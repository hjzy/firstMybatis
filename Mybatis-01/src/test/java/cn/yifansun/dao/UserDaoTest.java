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
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            List<User> users = userDao.selectUser();

            for (User user : users) {
                System.out.println(user);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            //SqlSession不是线程安全的，因此，每收到一个请求打开一次，完成该请求后必须将其关闭。
            sqlSession.close();
        }
    }

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = userDao.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }
//增删改需要提交事务
    @Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int result= userDao.addUser(new User(4,"哈哈","12123"));
        System.out.println(result);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int result= userDao.updateUser(new User(4,"王五","12123"));
        System.out.println(result);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void deleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int result= userDao.deleteUser(4);
        System.out.println(result);
        sqlSession.commit();
        sqlSession.close();
    }
}
