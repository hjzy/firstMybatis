package cn.yifansun.pojo;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/1/29,13:38
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {

    private String id;
    private String title;
    private String author;
    private Date createTime;//属性名和字段名不一致
    private int views;
    //set，get....
}