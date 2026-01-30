package com.edutech.progressive.service.impl;

import java.util.List;

import com.edutech.progressive.dao.SupplierDAO;
import com.edutech.progressive.entity.Supplier;
import com.edutech.progressive.service.SupplierService;

public class SupplierServiceImplJdbc implements SupplierService, SupplierDAO {

    @Override
    public List<Supplier> getAllSuppliers() {
        return null;
    }

    @Override
    public int addSupplier(Supplier supplier) {
        return -1;
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() {
        return null;
    }

    @Override
    public void deleteSupplier(int supplierId) {
        
    }

    @Override
    public void updateSupplier(Supplier supplier) {

    }

    @Override
    public Supplier getSupplierById(int supplierId) {
        return null;
    }

}