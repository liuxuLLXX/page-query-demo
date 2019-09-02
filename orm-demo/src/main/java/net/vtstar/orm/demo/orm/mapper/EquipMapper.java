package net.vtstar.orm.demo.orm.mapper;

import net.vtstar.orm.demo.domain.Equipment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: liuxu
 * @Date: 2019/7/25
 * @Description:
 */
@Mapper
public interface EquipMapper {

    Equipment findById(Long id);

    List<Equipment> findAll();
}
