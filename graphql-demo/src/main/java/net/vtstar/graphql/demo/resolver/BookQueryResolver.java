package net.vtstar.graphql.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import net.vtstar.graphql.demo.domain.Book;
import net.vtstar.graphql.demo.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: liuxu
 * @Date: 2019/7/15
 * @Description:
 */
@Component
public class BookQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private BookMapper bookMapper;

    public List<Book> getBookList() {
        return bookMapper.findList();
    }

    public Book getBookById(Integer id) {
        return bookMapper.getById(id);
    }
}
