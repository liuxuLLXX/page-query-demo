package net.vtstar.graphql.demo.domain;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @Auther: liuxu
 * @Date: 2019/7/15
 * @Description:
 */
@Data
public class Author {

    private Integer id;
    private String firstName;
    private String lastName;
    private Date createTime;
    private Date updateTime;
    private List<Book> books;

}
