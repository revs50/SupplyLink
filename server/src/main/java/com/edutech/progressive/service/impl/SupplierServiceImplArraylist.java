package com.edutech.progressive.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.edutech.progressive.dao.SupplierDAO;
import com.edutech.progressive.entity.Supplier;
import com.edutech.progressive.service.SupplierService;

public class SupplierServiceImplArraylist implements SupplierService {
    List<Supplier> supList = new ArrayList<>();

    @Override
    public List<Supplier> getAllSuppliers() {
        return supList;
    }

    @Override
    public int addSupplier(Supplier supplier) {
        supList.add(supplier);
        return supList.size();
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() {
        Collections.sort(supList);
        return supList;
    }

}