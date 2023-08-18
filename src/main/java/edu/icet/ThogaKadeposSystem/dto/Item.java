package edu.icet.ThogaKadeposSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item implements SuperDTO{
    private String code;
    private String description;
    private int qty;
    private double unitPrice;
}
