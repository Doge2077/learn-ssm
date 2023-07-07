package com.learn.congfig;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.annotations.AutomapConstructor;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;


@Configuration
@EnableTransactionManagement
@ComponentScans({
        @ComponentScan("com.learn.bean"),
        @ComponentScan("com.learn.service"),
        @ComponentScan("com.learn.mappers")
})
public class mainConfiguration03 {

//    @Bean
//    public DataSource dataSource(){
//        return new PooledDataSource("com.mysql.cj.jdbc.Driver",
//                "jdbc:mysql://localhost:3306/jwb", "root", "023017lys");
//    }

    @Bean
    public DataSource dataSource() {
        return new HikariDataSource(new HikariConfig() {{
            setJdbcUrl("jdbc:mysql://localhost:3306/jwb");
            setDriverClassName("com.mysql.cj.jdbc.Driver");
            setUsername("root");
            setPassword("023017lys");
        }});
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(@Autowired DataSource dataSource){
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean;
    }

    @Bean
    public TransactionManager transactionManager(@Autowired DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

}
