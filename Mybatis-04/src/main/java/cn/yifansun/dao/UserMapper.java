package cn.yifansun.dao;

import cn.yifansun.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/1/23,21:04
 */
public interface UserMapper {
     @Select("select * from user")
     List<User> getUsers();

     //方法存在多个参数，所有参数前面必须加上@Param注解。
     @Select("select * from user where id= #{id} and name=#{name}")
     User getUserByNameAndId(@Param("id")int id,@Param("name")String name);
}
