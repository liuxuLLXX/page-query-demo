package net.vtstar.orm.demo.orm.repository;

import net.vtstar.orm.demo.domain.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @Auther: liuxu
 * @Date: 2019/7/25
 * @Description:
 */
@RepositoryRestResource(path = "equipment")
public interface EquipRepository extends JpaRepository<Equipment, Long> {
}
