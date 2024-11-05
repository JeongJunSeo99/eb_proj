package com.swcamp9th.eb_proj.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MenuDTO {
    private Integer menuCode;
    private String menuName;
    private Integer menuPrice;
    private String categoryCode;
    private String orderableStatus;
}
