package com.example.springtest.db;

import com.example.springtest.vo.TeamVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

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

public static List<TeamVO> findAllTeam(){
        List<TeamVO> list = new ArrayList<>();
        SqlSession session =sqlSessionFactory.openSession();
        list = session.selectList("team.findAll");
        session.close();

        return list;
}

public static int insertTeam(TeamVO teamVO){
        int re = -1;
        SqlSession session = sqlSessionFactory.openSession();
        re = session.insert("team.insertTeam", teamVO);
        session.commit();
        session.close();
        return re;
}


}
