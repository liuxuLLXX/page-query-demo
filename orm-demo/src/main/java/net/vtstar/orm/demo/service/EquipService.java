package net.vtstar.orm.demo.service;

import lombok.extern.slf4j.Slf4j;
import net.vtstar.orm.demo.domain.Equipment;
import net.vtstar.orm.demo.orm.mapper.EquipMapper;
import net.vtstar.orm.demo.orm.repository.EquipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EquipService {

    @Autowired
    private EquipMapper equipMapper;

    @Autowired
    private EquipRepository equipRepository;


    public Equipment save(Equipment equipment) {
        return equipRepository.save(equipment);
    }

    public Equipment findById(Long id) {
        return equipMapper.findById(id);
    }

    public List<Equipment> findAll() {
        return equipMapper.findAll();
    }
}
