import cn.yifansun.dao.UserMapper;
import cn.yifansun.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/1/29,20:53
 */
public class Test {
    //    使用log4j时必须创建logger对象
    static Logger logger = Logger.getLogger(Test.class);
    @org.junit.Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
    }
}
