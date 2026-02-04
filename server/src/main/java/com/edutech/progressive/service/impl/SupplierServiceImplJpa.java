package com.edutech.progressive.service.impl;

import com.edutech.progressive.entity.Supplier;
import com.edutech.progressive.repository.ProductRepository;
import com.edutech.progressive.repository.ShipmentRepository;
import com.edutech.progressive.repository.SupplierRepository;
import com.edutech.progressive.repository.WarehouseRepository;
import com.edutech.progressive.service.SupplierService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SupplierServiceImplJpa implements SupplierService {
    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    WarehouseRepository warehouseRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ShipmentRepository shipmentRepository;

    private final SupplierRepository supplierRepository;

    @Autowired
    public SupplierServiceImplJpa(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @Override
    public List<Supplier> getAllSuppliers() throws SQLException{
        return supplierRepository.findAll();
    }

    @Override
    public int addSupplier(Supplier supplier) {
        return -1;
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() {
        return new ArrayList<>();
    }

    @Override
    public void updateSupplier(Supplier supplier) {
        // placeholder
    }

    @Override
    public void deleteSupplier(int supplierId) {
        // placeholder
    }

    @Override
    public Supplier getSupplierById(int supplierId) {
        return null;
    }

    @Override
    public void emptyArrayList() {
        // not applicable here
    }
}
