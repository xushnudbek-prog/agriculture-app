package app.platform.agriculture_app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String id;
    private String farmerId;
    private String productId;
    private int quantity;
    private double totalPrice;
    private LocalDate orderDate;
    private String status;
}
