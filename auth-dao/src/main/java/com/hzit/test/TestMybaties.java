package com.hzit.test;


import com.hzit.dao.ResourccesDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.Resourcces;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;


import java.io.IOException;
import java.io.Reader;
import java.util.List;



/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年08月03日 - 18:18
 * |    @description   测试类
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestMybaties {
    public static void main(String[] args) {
        Logger log= Logger.getLogger("TestMybaties");

        SqlSession session= SqlSessionHelper.getSqlSession();
        ResourccesDao res=session.getMapper(ResourccesDao.class);
        List<Resourcces> list=res.findAll();
         //Logger log=Logger.getLogger("TestMybaties");

        for(Resourcces o: list){
             log.debug(o);
        }




       /* try {
            Reader reader= Resources.getResourceAsReader("mybaties-config.xml");
            SqlSessionFactory gongchang=new SqlSessionFactoryBuilder().build(reader);
            SqlSession session=gongchang.openSession();
            List<Resourcces> list =session.selectList("com.hzit.ResourccesDao.findAll");
            for(Resourcces o:list){
                System.out.println(o);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }
}
