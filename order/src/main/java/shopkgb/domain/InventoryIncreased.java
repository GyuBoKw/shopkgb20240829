package shopkgb.domain;

import java.util.*;
import lombok.*;
import shopkgb.domain.*;
import shopkgb.infra.AbstractEvent;

@Data
@ToString
public class InventoryIncreased extends AbstractEvent {

    private Long id;
    private String name;
    private Integer stock;
}
