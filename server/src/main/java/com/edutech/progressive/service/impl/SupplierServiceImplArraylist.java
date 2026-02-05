package com.edutech.progressive.service.impl;

import com.edutech.progressive.entity.Supplier;
import com.edutech.progressive.service.SupplierService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SupplierServiceImplArraylist {//implements SupplierService {

    private static List<Supplier> supplierList = new ArrayList<>();

    //@Override
    public List<Supplier> getAllSuppliers() {
        return supplierList;
    }

    //@Override
    public int addSupplier(Supplier supplier) throws SQLException {
        supplierList.add(supplier);
        return supplierList.size();
    }

    //@Override
    public List<Supplier> getAllSuppliersSortedByName() {
        List<Supplier> sortedSupplier = new ArrayList<>(supplierList);
        sortedSupplier.sort(Comparator.comparing(Supplier::getSupplierName));
        return sortedSupplier;
    }

    //@Override
    public void emptyArrayList() {
        supplierList.clear();
        //supplierList = new ArrayList<>();
    }

    // JDBC/JPA placeholders (not used here)
    //@Override
    public void updateSupplier(Supplier supplier) {}

    //@Override
    public void deleteSupplier(int supplierId) {}

    //@Override
    public Supplier getSupplierById(int supplierId) {
        return null;
    }
}
