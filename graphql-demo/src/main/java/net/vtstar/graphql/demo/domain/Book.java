package net.vtstar.graphql.demo.domain;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: liuxu
 * @Date: 2019/7/15
 * @Description:
 */
@Data
public class Book {
    private Integer id;
    private String name;
    private Integer pageCount;
    private Integer authorId;
    private Date createTime;
    private Date updateTime;
}