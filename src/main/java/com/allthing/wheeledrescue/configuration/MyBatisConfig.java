package com.allthing.wheeledrescue.configuration;

import com.allthing.wheeledrescue.infrastructure.mappers.mybatis.EmployeeEntityMapper;
import com.allthing.wheeledrescue.util.mybatis.UuidTypeHandler;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration("MybatisConfig")
public class MyBatisConfig {
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setTypeHandlers(new UuidTypeHandler());
        return factoryBean.getObject();
    }
    
    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory){
        return new SqlSessionTemplate(sqlSessionFactory);
    }
    
//    @Bean
//    public IdGenerator idGenerator() {
//        return new IdGenerator();
//    }
    
    @Bean
    public MapperFactoryBean<EmployeeEntityMapper> employeeEntityMapper(SqlSessionFactory sqlSessionFactory) {
        MapperFactoryBean<EmployeeEntityMapper> factoryBean = new MapperFactoryBean<>(EmployeeEntityMapper.class);
        factoryBean.setSqlSessionFactory(sqlSessionFactory);
        return factoryBean;
    }
}
