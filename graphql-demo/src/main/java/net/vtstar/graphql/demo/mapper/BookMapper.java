package net.vtstar.graphql.demo.mapper;

import net.vtstar.graphql.demo.domain.Author;
import net.vtstar.graphql.demo.domain.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: liuxu
 * @Date: 2019/7/25
 * @Description:
 */
@Mapper
public interface BookMapper {

    List<Book> findByAuthorId(Integer authorId);

    Book getById(Integer id);

    List<Book> findList();

    void create(Book book);

    void update(Book book);

    void deleteById(Integer id);
}
