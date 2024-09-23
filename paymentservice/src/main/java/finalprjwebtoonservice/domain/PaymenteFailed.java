package finalprjwebtoonservice.domain;

import finalprjwebtoonservice.domain.*;
import finalprjwebtoonservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class PaymenteFailed extends AbstractEvent {

    private Long id;
    private Integer price;
    private String userId;
    private String status;

    public PaymenteFailed(Payment aggregate) {
        super(aggregate);
    }

    public PaymenteFailed() {
        super();
    }
}
//>>> DDD / Domain Event
