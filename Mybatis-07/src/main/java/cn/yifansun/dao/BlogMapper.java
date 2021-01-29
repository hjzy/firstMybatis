package cn.yifansun.dao;

import cn.yifansun.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/1/29,13:44
 */
public interface BlogMapper {
    int addBlog(Blog blog);
    //需求1
    List<Blog> queryBlogIf(Map map);
    List<Blog> queryBlogChoose(Map map);
    int updateBlog(Map map);
    List<Blog> queryBlogForeach(Map map);
}
