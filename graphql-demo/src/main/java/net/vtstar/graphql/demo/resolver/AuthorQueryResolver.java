package net.vtstar.graphql.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import net.vtstar.graphql.demo.domain.Author;
import net.vtstar.graphql.demo.mapper.AuthorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: liuxu
 * @Date: 2019/7/15
 * @Description:
 */
@Component
public class AuthorQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private AuthorMapper authorMapper;

    public List<Author> getAuthorList() {
        return authorMapper.findList();
    }
}
