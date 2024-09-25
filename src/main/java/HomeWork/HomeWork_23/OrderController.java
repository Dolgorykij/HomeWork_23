package HomeWork.HomeWork_23;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService service) {
        this.orderService = service;
    }

    @GetMapping("/add")
    public void addOrder (@RequestParam List<Integer> goods) {
        orderService.addOrder(goods);
    }
    @GetMapping("/get")
    public List <Integer> goods () {
        return orderService.getOrder();
    }
}
