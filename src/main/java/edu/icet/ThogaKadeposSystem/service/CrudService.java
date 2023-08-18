package edu.icet.ThogaKadeposSystem.service;

import edu.icet.ThogaKadeposSystem.dto.SuperDTO;

import java.util.List;

public interface CrudService <T extends SuperDTO,ID>{
    List<T> getAll();
    T search(ID id);
}
