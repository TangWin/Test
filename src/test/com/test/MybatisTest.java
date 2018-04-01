package com.test;

import com.dao.UserDao;
import com.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;

public class MybatisTest {

    @Test
    public void test(){
        try {
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
            SqlSession sqlSession= sqlSessionFactory.openSession();
//            User user=sqlSession.selectOne("user.getUserById",1);
//            System.out.println(user);

           UserDao userDao=sqlSession.getMapper(UserDao.class);
//           User user=userDao.getUserById(1);
            userDao.adduser(new User("123","123"));
//           User user=userDao.getUserAndCard(1);
//            System.out.println(user);
//            System.out.println(user.getCard().getCname());
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
