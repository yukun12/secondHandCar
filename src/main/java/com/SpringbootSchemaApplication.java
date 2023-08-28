package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.io.IOException;

@SpringBootApplication
@ServletComponentScan(value = "com.ServletContextListener")
@MapperScan(basePackages = {"com.dao"})
public class SpringbootSchemaApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        int port = 8086;
        String portPrefix = "--server.port=";
        for (String arg : args) {
            if (arg.startsWith(portPrefix)) {
                port = Integer.parseInt(arg.substring(portPrefix.length()));
            }
        }
        SpringApplication.run(SpringbootSchemaApplication.class, args);
//        try {
//            Runtime.getRuntime().exec(new String[]{"/bin/sh", "/c", "start http://localhost:" + port + "/springbootweb/admin/dist/index.html"});
//            //Runtime.getRuntime().exec("cmd /c start http://localhost:" + port+"/springbootweb/front/index.html");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder.sources(SpringbootSchemaApplication.class);
    }
}
