package dec9;
import java.math.BigDecimal;

public class TradeRequest {
    public int amount; // кол-во товара
    public BigDecimal total; // полная стоимость

    public int currentScale;

    public TradeRequest(int a, BigDecimal t) {
        this.amount = a;
        this.total = t;
    }

}

