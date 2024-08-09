package vnua.fita.sbcrudrestful.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import vnua.fita.sbcrudrestful.dto.OrderRequest;
import vnua.fita.sbcrudrestful.model.Order;
import vnua.fita.sbcrudrestful.model.OrderDetail;
import vnua.fita.sbcrudrestful.service.OrderService;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public Order createOrder(@RequestBody OrderRequest orderRequest) {
        Order order = orderRequest.getOrder();
        List<OrderDetail> orderDetails = orderRequest.getOrderDetails();
        return orderService.createOrder(order, orderDetails);
    }

    @GetMapping("/{orderId}")
    public Order getOrderById(@PathVariable Long orderId) {
        return orderService.getOrderById(orderId);
    }

    @GetMapping("/details/{orderId}")
    public List<OrderDetail> getOrderDetailsByOrderId(@PathVariable Long orderId) {
        return orderService.getOrderDetailsByOrderId(orderId);
    }
}
