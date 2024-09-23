package finalprjwebtoonservice.domain;

import finalprjwebtoonservice.domain.*;
import finalprjwebtoonservice.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class PaymenteComplete extends AbstractEvent {

    private Long id;
    private Integer price;
    private String userId;
    private String status;
}
