package finalprjwebtoonservice.domain;

import finalprjwebtoonservice.domain.*;
import finalprjwebtoonservice.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CheckRejected extends AbstractEvent {

    private Long id;
    private Integer point;
    private String userId;
    private String webtoonId;
    private String status;
    private String myPoint;
}
