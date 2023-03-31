package com.example.springtest.db;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class DBManager {
    public static SqlSessionFactory sqlSessionFactory;
    static {
        try{
            String resource = "db/sqlMapConfig.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory =
                    new SqlSessionFactoryBuilder().build(inputStream);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


}
