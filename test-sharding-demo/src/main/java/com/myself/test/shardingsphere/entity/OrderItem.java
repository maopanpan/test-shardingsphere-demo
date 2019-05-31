package com.myself.test.shardingsphere.entity;

import lombok.Data;

@Data
public final class OrderItem {
    
    private long orderItemId;
    
    private long orderId;
    
    private int userId;
    
    private String status;
    

}
