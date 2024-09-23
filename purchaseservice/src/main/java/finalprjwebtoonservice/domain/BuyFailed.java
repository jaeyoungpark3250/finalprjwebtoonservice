package finalprjwebtoonservice.domain;

import finalprjwebtoonservice.domain.*;
import finalprjwebtoonservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class BuyFailed extends AbstractEvent {

    private Long id;
    private Integer point;
    private String userId;
    private String webtoonId;
    private String status;

    public BuyFailed(Purchase aggregate) {
        super(aggregate);
    }

    public BuyFailed() {
        super();
    }
}
//>>> DDD / Domain Event
