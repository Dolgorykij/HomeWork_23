package HomeWork.HomeWork_23;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    private final Goods goods;

    public OrderService(Goods goods) {
        this.goods = goods;
    }

    public void addOrder (List<Integer> goodsId) {
        goods.addOrder(goodsId);
    }
    public List<Integer> getOrder () {
        return goods.getOrder();
    }
}
