package com.myself.test.shardingsphere.repository;

import com.myself.test.shardingsphere.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

@Mapper
public interface OrderRepository {
    
    void createIfNotExistsTable();
    
    void truncateTable();
    @Transactional
    Long insert(Order model);
    
    void delete(Long orderId);
    
    void dropTable();
}
