package cn.yifansun.utils;

import java.util.UUID;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/1/29,13:48
 */
public class IDutils {


    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
