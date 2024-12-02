package com.luis.desafio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luis.desafio.entities.Order;

@Service
public class ShippingService {

    @Autowired
    private OrderService orderService;

    public double shipment(Order order) {
        if (orderService.total(order) < 100) {
            return 20.0;
        } else if (orderService.total(order) < 200) {
            return 12.0;
        } else {
            return 0;
        }
    }
    
}
