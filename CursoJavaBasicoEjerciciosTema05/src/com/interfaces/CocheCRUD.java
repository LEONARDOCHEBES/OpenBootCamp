package com.interfaces;

import java.util.List;

public interface CocheCRUD {

    List<CocheCRUDImpl> findAll();

    void save(CocheCRUDImpl coche);

    void delete(CocheCRUDImpl coche);

}
