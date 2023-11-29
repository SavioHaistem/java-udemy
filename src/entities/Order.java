package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Order {
    private Date moment;
    private OrderStatus status;
    private final Client client;
    private final ArrayList<OrderItem> OrderItems = new ArrayList<>();
    private final SimpleDateFormat birthDateFormat = new SimpleDateFormat("(dd/MM/yyyy)");
    private final SimpleDateFormat orderMomentFormat = new SimpleDateFormat("(dd/MM/yyyy)");

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
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

    @Override
    public String toString() {
        StringBuilder clientString = new StringBuilder();

        clientString.append("ORDER SUMMARY:\n");
        clientString.append("Order moment: ").append(this.orderMomentFormat.format(this.moment)).append("\n");
        clientString.append("Order status: ").append(this.status).append("\n");
        clientString.append("Client: ").append(client.getName()).append(" ");
        clientString.append(this.birthDateFormat.format(this.client.getBirthDate())).append(" - ");
        clientString.append(this.client.getEmail()).append("\n");
        clientString.append("Order items: ").append("\n");

        for ( OrderItem orderItem : this.OrderItems) {
            clientString.append(orderItem.getProduct().getName()).append(", ");
            clientString.append("Quantity: ").append(orderItem.getQuantity()).append(", ");
            clientString.append("Subtotal: $").append(orderItem.subTotal()).append("\n");
        }

        return clientString.toString();
    }
}