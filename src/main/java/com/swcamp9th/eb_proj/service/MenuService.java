package com.swcamp9th.eb_proj.service;

import com.swcamp9th.eb_proj.dto.MenuDTO;
import com.swcamp9th.eb_proj.repository.MenuRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

    private final MenuRepository menuRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public MenuService(MenuRepository menuRepository, ModelMapper modelMapper) {
        this.menuRepository = menuRepository;
        this.modelMapper = modelMapper;
    }

    public MenuDTO findByMenuCode(int menuCode) {
        return modelMapper.map(menuRepository.findById(menuCode), MenuDTO.class);
    }
}
