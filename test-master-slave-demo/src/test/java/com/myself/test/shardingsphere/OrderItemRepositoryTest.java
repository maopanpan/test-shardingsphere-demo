package com.myself.test.shardingsphere;

import com.myself.test.shardingsphere.entity.Order;
import com.myself.test.shardingsphere.entity.OrderItem;
import com.myself.test.shardingsphere.repository.OrderItemRepository;
import com.myself.test.shardingsphere.repository.OrderRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class OrderItemRepositoryTest extends MasterSlaveApplicationTests {

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private OrderRepository orderRepository;

    //    @Test
    public void selectAll() {
        List<OrderItem> items = orderItemRepository.selectAll();
        System.err.println(items);
    }

    @Test
    public void insert() {
        Order order = new Order();
        order.setOrderId(1000);
        order.setUserId(23);
        order.setStatus("01");
        orderRepository.insert(order);

        order = new Order();
        order.setOrderId(10001);
        order.setUserId(24);
        order.setStatus("02");
        orderRepository.insert(order);
    }

    @Test
    public void queryOrder() {
        Map<String, Object> resultMap = orderRepository.findById(1);
        Assert.assertNotNull(resultMap);
    }
}