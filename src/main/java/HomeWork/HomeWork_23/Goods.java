package HomeWork.HomeWork_23;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Component
@SessionScope
public class Goods {

    private final List<Integer> goodsList = new ArrayList<>();

    public void addOrder (List <Integer> goods) {
        goodsList.addAll(goods);
    }

    public List<Integer> getOrder () {
        return Collections.unmodifiableList(goodsList);
    }
}
