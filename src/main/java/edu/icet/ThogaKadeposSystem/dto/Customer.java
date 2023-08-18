package edu.icet.ThogaKadeposSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer implements SuperDTO{
    private String id;
    private String name;
    private String address;
    private double salary;

}
