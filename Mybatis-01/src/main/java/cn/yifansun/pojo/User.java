package cn.yifansun.pojo;

//import jdk.jfr.DataAmount;

import lombok.Data;
import lombok.ToString;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/1/23,20:57
 */
@Data
@ToString
public class User {

    public User(){}
    private int id;  //id
    private String name;   //姓名
    private String pwd;   //密码

}