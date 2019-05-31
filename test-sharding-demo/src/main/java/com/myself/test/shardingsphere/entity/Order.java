package com.myself.test.shardingsphere.entity;

import lombok.Data;

@Data
public final class Order {
    
    private long orderId;
    
    private int userId;
    
    private String status;
    
    public long getOrderId() {
        return orderId;
    }

}
