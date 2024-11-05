package com.swcamp9th.eb_proj.controller;

import com.swcamp9th.eb_proj.dto.MenuDTO;
import com.swcamp9th.eb_proj.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

    private final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "eb_proj is fine! !!! ";
    }

    @GetMapping("/meeus/{menuCode}")
    public MenuDTO findMenuByMenuCode(@PathVariable("menuCode") int menuCode) {
        MenuDTO returnMenu = menuService.findByMenuCode(menuCode);
        return  returnMenu;
    }
}
