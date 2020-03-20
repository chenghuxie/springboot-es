package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author xiech
 * @create 2019-09-03 13:58
 */
@Document(indexName = "mytest",type = "user")
@Data
public class User {
    @Id
    private String id;
    private String name;
    private Integer age ;
    private  Integer sex;
}
