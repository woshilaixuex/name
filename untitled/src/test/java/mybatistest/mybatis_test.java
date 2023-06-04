package mybatistest;
import com.mabatisl.example.mabatis.BrandMapper;
import org.apache.ibatis.io.*;
import org.apache.ibatis.session.*;
import org.junit.*;

import java.io.InputStream;
import com.mabatisl.example.mabatis.Brand;
import java.util.List;

public class mybatis_test{
    @Test
    public void testSelectAll()throws Exception{
        //接收参数
        int status = 1;
        String company_name = "华为";
        String brand_name = "华为";

        // 处理参数
        company_name = "%" + company_name + "%";
        brand_name = "%" + brand_name + "%";
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //sql对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取mapper接口
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
//        //执行
//        List<Brand> brands = mapper.selectAll();
//        System.out.println(brands);
//        sqlSession.close();
        List<Brand> brands = mapper.selectByCondition(status,company_name,brand_name);
        System.out.println(brands);
        sqlSession.close();
    }
}
