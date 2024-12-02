package com.luis.desafio.services;

import org.springframework.stereotype.Service;

import com.luis.desafio.entities.Order;

@Service
public class OrderService {
    public double total(Order order) {

        return order.getBasic() - order.getBasic() * (order.getDiscount() / 100);
        
    }
}
