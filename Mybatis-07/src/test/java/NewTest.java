import cn.yifansun.dao.BlogMapper;
import cn.yifansun.pojo.Blog;
import cn.yifansun.utils.IDutils;
import cn.yifansun.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/1/29,13:57
 */
 public class NewTest {

    //    使用log4j时必须创建logger对象
    static Logger logger = Logger.getLogger(NewTest.class);
    @org.junit.Test
    public void initBlog(){
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);


        session.close();
    }
    @org.junit.Test
    public void testQueryBlogIf(){
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        HashMap<String, String> map = new HashMap<String, String>();
//        map.put("title","mysql");
        //map.put("author","yifan");
        List<Blog> blogs = mapper.queryBlogIf(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        session.close();
    }

    @Test
    public void testQueryBlogChoose(){
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("title","mysql");
        map.put("author","狂神说");
        map.put("views",9999);
        List<Blog> blogs = mapper.queryBlogChoose(map);

        System.out.println(blogs);

        session.close();
    }
    @Test
    public void testUpdateBlog(){
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("title","动态SQL");
        map.put("author","yifan");
        map.put("id","1");

        mapper.updateBlog(map);


        session.close();
    }


    @Test
    public void testQueryBlogForeach(){
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        map.put("ids",ids);

        List<Blog> blogs = mapper.queryBlogForeach(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }



        session.close();
    }
}
