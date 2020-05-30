package edu.miu.testjenkins.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductsService {

    public List<String> getProducts(){
        List<String> products = new ArrayList<>();
        products.add("p1");
        products.add("p2");

    }
}
