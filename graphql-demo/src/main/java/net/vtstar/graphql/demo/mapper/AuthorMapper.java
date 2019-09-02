package net.vtstar.graphql.demo.mapper;

import net.vtstar.graphql.demo.domain.Author;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: liuxu
 * @Date: 2019/7/25
 * @Description:
 */
@Mapper
public interface AuthorMapper {

    List<Author> findList();
}
