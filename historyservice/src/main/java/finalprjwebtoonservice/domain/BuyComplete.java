package finalprjwebtoonservice.domain;

import finalprjwebtoonservice.domain.*;
import finalprjwebtoonservice.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class BuyComplete extends AbstractEvent {

    private Long id;
    private String userId;
    private Integer point;
    private Integer myPoint;
    private String webtoonId;
    private String status;
}
