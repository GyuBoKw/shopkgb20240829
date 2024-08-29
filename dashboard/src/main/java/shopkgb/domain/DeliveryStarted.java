package shopkgb.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import shopkgb.infra.AbstractEvent;

@Data
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String Address;
    private Long productId;
    private Integer qty;
}
