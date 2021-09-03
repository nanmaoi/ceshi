package com.boot.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@Data
@Component
@ConfigurationProperties(prefix = "person")
// @PropertySource 指定配置文件路径，支持 properties 和 XML 的配置文件，但不支持 yml。
//@PropertySource(value = "classpath:****.properties")
public class Person {

    private String name;
    private Integer age;
    private Boolean happy;
    private Date birth;
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;
}
