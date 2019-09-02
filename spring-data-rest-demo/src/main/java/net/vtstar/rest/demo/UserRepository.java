package net.vtstar.rest.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * path="user"： 映射路由
 * User：实体类
 * Long：主键
 *
 * @author liuxu
 */
@RepositoryRestResource(path = "user")
public interface UserRepository extends JpaRepository<User, Long> {

    @RestResource(path = "lastname", rel = "lastname")
    List<User> findByLastnameLike(@Param("lastname") String lastname);

    @RestResource(path = "name", rel = "name")
    List<User> findByFirstnameAndLastname(@Param("firstname") String firstname, @Param("lastname") String lastname);


}