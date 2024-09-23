package finalprjwebtoonservice.domain;

import finalprjwebtoonservice.domain.*;
import finalprjwebtoonservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class HistoryUpdated extends AbstractEvent {

    private Long id;
    private Integer point;
    private String userId;
    private String webtoonId;
    private String status;
    private String myPoint;

    public HistoryUpdated(History aggregate) {
        super(aggregate);
    }

    public HistoryUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
