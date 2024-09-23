package finalprjwebtoonservice.infra;

import finalprjwebtoonservice.config.kafka.KafkaProcessor;
import finalprjwebtoonservice.domain.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class HistoriesViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private HistoriesRepository historiesRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenHistoryCreated_then_CREATE_1(
        @Payload HistoryCreated historyCreated
    ) {
        try {
            if (!historyCreated.validate()) return;

            // view 객체 생성
            Histories histories = new Histories();
            // view 객체에 이벤트의 Value 를 set 함
            histories.setMyPoint(
                histories.getMyPoint() +
                String.valueOf(historyCreated.getMyPoint())
            );
            histories.setUserId(historyCreated.getUserId());
            histories.setStatus(historyCreated.getStatus());
            // view 레파지 토리에 save
            historiesRepository.save(histories);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenUserCreated_then_CREATE_2(
        @Payload UserCreated userCreated
    ) {
        try {
            if (!userCreated.validate()) return;

            // view 객체 생성
            Histories histories = new Histories();
            // view 객체에 이벤트의 Value 를 set 함
            histories.setUserId(userCreated.getUserId());
            histories.setStatus(userCreated.getStatus());
            // view 레파지 토리에 save
            historiesRepository.save(histories);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //>>> DDD / CQRS
}
