package com.luis.desafio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luis.desafio.entities.Order;

@Service
public class OrderService {
    
    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {

        double total = order.getBasic() - order.getBasic() * (order.getDiscount() / 100);

        total += shippingService.shipment(order);

        return total;
        
    }
    
}
