/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.springsaleappdemo;

import com.mycompany.pojo.Product;
import com.mycompany.repositories.impl.CategoryRepositoryImpl;
import com.mycompany.repositories.impl.ProductRepositoryIml;
import java.util.HashMap;
import java.util.Map;



/**
 *
 * @author admin
 */
public class SpringSaleAppDemo {

    public static void main(String[] args) {
        CategoryRepositoryImpl s2 =  new CategoryRepositoryImpl();
//        s.getCates().forEach(c -> System.out.println(c.getName()));

        ProductRepositoryIml s = new ProductRepositoryIml();
          
//          Map<String, String> params = new HashMap<>();
////          params.put("kw", "iPhone");
//          params.put("orderBy", "price");
//          s.getProducts(params).forEach(p -> System.out.printf("%s - %.1f\n", p.getName(), p.getPrice()));
          Product p = new Product();
          p.setName("ABC");
          p.setPrice(123l);
          p.setCategoryId(s2.getCateById(1));
          
          s.addOrUpdate(p);
    }
}
