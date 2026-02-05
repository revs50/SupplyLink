package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.edutech.progressive.entity.Warehouse;
import com.edutech.progressive.service.WarehouseService;

public class WarehouseServiceImplArraylist implements WarehouseService {
    List<Warehouse> warehouseList = new ArrayList<>();

    @Override
    public List<Warehouse> getAllWarehouses() {
        return warehouseList;
    }

    @Override
    public int addWarehouse(Warehouse warehouse) {
        warehouseList.add(warehouse);
        return warehouseList.size();
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() {
        List<Warehouse> sortedList = new ArrayList<>(warehouseList);
        sortedList.sort(Comparator.comparing(Warehouse::getCapacity));
        return sortedList;
        //Collections.sort(wlist);
        //return wlist;
    }

    @Override
    public void emptyArrayList() {
        warehouseList.clear();
    }

    @Override
    public void updateWarehouse(Warehouse warehouse) {

    }

    @Override
    public void deleteWarehouse(int warehouse) {

    }

    @Override
    public Warehouse getWarehouseById (int warehouseId) {
        return null;
    }

    @Override
    public List<Warehouse> getWarehouseBySupplier(int supplierId) {
        return null;
    }

    @Override
    public List<Warehouse> getWarehousesSortedByName() throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getWarehousesSortedByName'");
    }

}