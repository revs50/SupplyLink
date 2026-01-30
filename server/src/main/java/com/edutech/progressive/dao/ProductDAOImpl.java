package com.edutech.progressive.dao;


import java.util.List;
//import java.util.Map;

import com.edutech.progressive.entity.Product;

public class ProductDAOImpl implements ProductDAO{

    @Override
    public int addProduct(Product product) {
        return -1;

        // String sql = "insert into product(product_id, warehouse_id, product_name, product_description) values(?,?,?,?)";
        // try (PreparedStatement) {
            
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }
    }

    @Override
    public Product getProductById(int productId) {
        return null;
    }

    @Override
    public void updateProduct(Product product) {
        
    }

    @Override
    public void deleteProduct(int productId) {
        
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }
    

}
