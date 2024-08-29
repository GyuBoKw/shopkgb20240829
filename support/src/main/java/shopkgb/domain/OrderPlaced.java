package shopkgb.domain;

import java.util.*;
import lombok.*;
import shopkgb.domain.*;
import shopkgb.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String customerId;
    private String customerName;
    private Long productId;
    private Integer qty;
    private String address;
}
