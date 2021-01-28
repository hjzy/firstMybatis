package cn.yifansun.dao;

import cn.yifansun.pojo.User;

import java.util.List;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/1/23,21:04
 */
public interface UserMapper {
//    查询全部
    List<User> selectUser();
//    根据id查询用户
    User getUserById(int id);
//    插入用户
    int addUser(User user);
//    修改用户
    int updateUser(User user);
//    删除用户
    int deleteUser(int id);
}
