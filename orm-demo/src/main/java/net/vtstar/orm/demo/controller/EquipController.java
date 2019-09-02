package net.vtstar.orm.demo.controller;

import net.vtstar.orm.demo.domain.Equipment;
import net.vtstar.orm.demo.orm.mapper.EquipMapper;
import net.vtstar.orm.demo.service.EquipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: liuxu
 * @Date: 2019/7/25
 * @Description:
 */
@RestController
@RequestMapping("/api/equip")
public class EquipController {
    @Autowired
    private EquipService equipService;


    @PostMapping
    public Equipment save(@RequestBody Equipment equipment){
        return equipService.save(equipment);
    }

    @GetMapping("/{id}")
    public Equipment findOne(@PathVariable Long id){
        return equipService.findById(id);
    }

    @GetMapping
    public List<Equipment> findAll(){
        return equipService.findAll();
    }
}
