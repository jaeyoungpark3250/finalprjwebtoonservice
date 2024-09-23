package finalprjwebtoonservice.domain;

import finalprjwebtoonservice.domain.*;
import finalprjwebtoonservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class WebtoonReaded extends AbstractEvent {

    private Long id;
    private String webtoonId;
    private String title;
    private String author;
    private String episode;
    private String status;

    public WebtoonReaded(Webtoon aggregate) {
        super(aggregate);
    }

    public WebtoonReaded() {
        super();
    }
}
//>>> DDD / Domain Event
