package finalprjwebtoonservice.domain;

import finalprjwebtoonservice.domain.*;
import finalprjwebtoonservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class CancelFailed extends AbstractEvent {

    private Long id;
    private Integer point;
    private String userId;
    private String webtoonId;
    private String status;

    public CancelFailed(Purchase aggregate) {
        super(aggregate);
    }

    public CancelFailed() {
        super();
    }
}
//>>> DDD / Domain Event
