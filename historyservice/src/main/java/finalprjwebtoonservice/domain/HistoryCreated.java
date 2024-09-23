package finalprjwebtoonservice.domain;

import finalprjwebtoonservice.domain.*;
import finalprjwebtoonservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class HistoryCreated extends AbstractEvent {

    private Long id;
    private Integer myPoint;
    private String userId;
    private Integer price;
    private String status;

    public HistoryCreated() {
        super();
    }
}
//>>> DDD / Domain Event
