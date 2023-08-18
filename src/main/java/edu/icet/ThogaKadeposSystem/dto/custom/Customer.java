package edu.icet.ThogaKadeposSystem.dto.custom;

import edu.icet.ThogaKadeposSystem.dto.SuperDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer implements SuperDTO {
    private String id;
    private String name;
    private String address;
    private double salary;

}
