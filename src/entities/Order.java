package entities;

import entities.enums.OrderStatus;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class Order {
    private Date moment;
    private OrderStatus status;
    private ArrayList<OrderItem> OrderItems;
    private DateTimeFormatter momentFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addOrder(OrderItem orderItem) {
        OrderItems.add(orderItem);
    }

    public void removeItem(OrderItem orderItem) {
        OrderItems.remove(orderItem);
    }

    public Double total() {
        double orderValue = 0;

        for ( OrderItem order : OrderItems ) {
            orderValue += order.subTotal();
        }

        return orderValue;
    }
}
