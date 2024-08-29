package shopkgb.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shopkgb.domain.*;
import shopkgb.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryCancelled extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String address;
    private Long productId;
    private Integer qty;

    public DeliveryCancelled(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryCancelled() {
        super();
    }
}
//>>> DDD / Domain Event
