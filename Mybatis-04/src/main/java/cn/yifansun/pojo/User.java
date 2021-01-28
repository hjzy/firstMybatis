package cn.yifansun.pojo;

//import jdk.jfr.DataAmount;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/1/23,20:57
 */
@Data
@ToString
//无参构造函数
@NoArgsConstructor
//有参构造函数
@AllArgsConstructor
public class User {
    private int id;  //id
    private String name;   //姓名
    private String password;   //密码
}