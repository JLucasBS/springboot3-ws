package dev.jlucasbs.study.spring_ws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.jlucasbs.study.spring_ws.entities.OrderItem;
import dev.jlucasbs.study.spring_ws.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {

}
