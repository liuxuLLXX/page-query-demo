package net.vtstar.graphql.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import net.vtstar.graphql.demo.domain.Book;
import net.vtstar.graphql.demo.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Auther: liuxu
 * @Date: 2019/7/25
 * @Description:
 */
@Component
public class BookMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private BookMapper bookMapper;

    Book createBook(Book book) {
        bookMapper.create(book);
        return bookMapper.getById(book.getId());
    }

    Book updateBook(Integer id, Book book) {
        book.setId(id);
        bookMapper.update(book);
        return bookMapper.getById(id);
    }

    Integer deleteBook(Integer id) {
        bookMapper.deleteById(id);
        return id;
    }


}
