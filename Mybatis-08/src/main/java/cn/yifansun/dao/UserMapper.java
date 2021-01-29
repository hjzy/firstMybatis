package cn.yifansun.dao;

import cn.yifansun.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/1/29,20:50
 */
public interface UserMapper {
    List<User> queryUserById(@Param("id") int id);
}
