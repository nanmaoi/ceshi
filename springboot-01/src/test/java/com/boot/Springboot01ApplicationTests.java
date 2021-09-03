package com.boot;

import com.boot.pojo.Dog;
import com.boot.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class Springboot01ApplicationTests {

    @Autowired
    DataSource dataSource;


    @Test
    void contextLoads() throws SQLException {
        //查看一下默认的数指源: com.dataSource.hikari.HikariDataSource
        System.out.println(dataSource.getClass());
        //获得数期库连接
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        //xxxx TempLate : SpringBoot已经配置好模板bean，拿来即川CRUD
        //关闭
        connection.close();
    }

}
