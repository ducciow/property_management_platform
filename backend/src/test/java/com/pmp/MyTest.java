package com.pmp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.jupiter.api.Test;

/**
 * @Author: duccio
 * @Date: 14, 06, 2022
 * @Description:
 */
public class MyTest {

    @Test
    public void testGenerator() {
        AutoGenerator autoGenerator = new AutoGenerator();

        // global config
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setAuthor("lian")
                .setOutputDir("D:\\workspace\\property_management_platform\\backend\\src\\main\\java")  // output path
                .setFileOverride(true)  // file override
                .setIdType(IdType.AUTO)  // generate primary key
                .setServiceName("%sService")  // service interface
                .setBaseResultMap(true)
                .setBaseColumnList(true)
                .setControllerName("%sController");  // controller interface

        // datasource
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver").setUrl("jdbc:mysql://localhost:3306/property_management_platform?serverTimezone=UTC")
                .setUsername("root").setPassword("root");

        // strategies
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(true)  // global capitalized naming
                .setNaming(NamingStrategy.underline_to_camel)  // map from db to entities
                //.setTablePrefix("tbl_")  // table name prefix
                .setInclude();

        // package naming
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.pmp").setMapper("mapper")
                .setService("service").setController("controller")
                .setEntity("bean").setXml("mapper");

        autoGenerator.setGlobalConfig(globalConfig).setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig).setPackageInfo(packageConfig);

        autoGenerator.execute();
    }

}
