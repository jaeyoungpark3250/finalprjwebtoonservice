package finalprjwebtoonservice.domain;

import finalprjwebtoonservice.domain.*;
import finalprjwebtoonservice.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OpenRejected extends AbstractEvent {

    private Long id;
    private String userId;
    private String webtoonId;
    private String status;
}
