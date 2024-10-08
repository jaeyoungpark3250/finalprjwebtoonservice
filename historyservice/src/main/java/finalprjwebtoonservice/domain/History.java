package finalprjwebtoonservice.domain;

import finalprjwebtoonservice.HistoryserviceApplication;
import finalprjwebtoonservice.domain.CheckCorrected;
import finalprjwebtoonservice.domain.CheckRejected;
import finalprjwebtoonservice.domain.HistoryUpdated;
import finalprjwebtoonservice.domain.OpenApproved;
import finalprjwebtoonservice.domain.OpenRejected;
import finalprjwebtoonservice.domain.UserCreated;
import finalprjwebtoonservice.domain.UserDeleted;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "History_table")
@Data
//<<< DDD / Aggregate Root
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        HistoryUpdated historyUpdated = new HistoryUpdated(this);
        historyUpdated.publishAfterCommit();

        CheckCorrected checkCorrected = new CheckCorrected(this);
        checkCorrected.publishAfterCommit();

        CheckRejected checkRejected = new CheckRejected(this);
        checkRejected.publishAfterCommit();

        UserCreated userCreated = new UserCreated(this);
        userCreated.publishAfterCommit();

        UserDeleted userDeleted = new UserDeleted(this);
        userDeleted.publishAfterCommit();

        OpenApproved openApproved = new OpenApproved(this);
        openApproved.publishAfterCommit();

        OpenRejected openRejected = new OpenRejected(this);
        openRejected.publishAfterCommit();
    }

    public static HistoryRepository repository() {
        HistoryRepository historyRepository = HistoryserviceApplication.applicationContext.getBean(
            HistoryRepository.class
        );
        return historyRepository;
    }

    //<<< Clean Arch / Port Method
    public static void paymentHistory(PaymenteFailed paymenteFailed) {
        //implement business logic here:

        /** Example 1:  new item 
        History history = new History();
        repository().save(history);

        HistoryCreated historyCreated = new HistoryCreated(history);
        historyCreated.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(paymenteFailed.get???()).ifPresent(history->{
            
            history // do something
            repository().save(history);

            HistoryCreated historyCreated = new HistoryCreated(history);
            historyCreated.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void paymentHistory(DecreasedComplete decreasedComplete) {
        //implement business logic here:

        /** Example 1:  new item 
        History history = new History();
        repository().save(history);

        HistoryCreated historyCreated = new HistoryCreated(history);
        historyCreated.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(decreasedComplete.get???()).ifPresent(history->{
            
            history // do something
            repository().save(history);

            HistoryCreated historyCreated = new HistoryCreated(history);
            historyCreated.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void paymentHistory(Increased increased) {
        //implement business logic here:

        /** Example 1:  new item 
        History history = new History();
        repository().save(history);

        HistoryCreated historyCreated = new HistoryCreated(history);
        historyCreated.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(increased.get???()).ifPresent(history->{
            
            history // do something
            repository().save(history);

            HistoryCreated historyCreated = new HistoryCreated(history);
            historyCreated.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void buyHistory(BuyFailed buyFailed) {
        //implement business logic here:

        /** Example 1:  new item 
        History history = new History();
        repository().save(history);

        HistoryUpdated historyUpdated = new HistoryUpdated(history);
        historyUpdated.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(buyFailed.get???()).ifPresent(history->{
            
            history // do something
            repository().save(history);

            HistoryUpdated historyUpdated = new HistoryUpdated(history);
            historyUpdated.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void buyHistory(
        PurchaseCancelComplete purchaseCancelComplete
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        History history = new History();
        repository().save(history);

        HistoryUpdated historyUpdated = new HistoryUpdated(history);
        historyUpdated.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(purchaseCancelComplete.get???()).ifPresent(history->{
            
            history // do something
            repository().save(history);

            HistoryUpdated historyUpdated = new HistoryUpdated(history);
            historyUpdated.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void buyHistory(PurchaseCancelFailed purchaseCancelFailed) {
        //implement business logic here:

        /** Example 1:  new item 
        History history = new History();
        repository().save(history);

        HistoryUpdated historyUpdated = new HistoryUpdated(history);
        historyUpdated.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(purchaseCancelFailed.get???()).ifPresent(history->{
            
            history // do something
            repository().save(history);

            HistoryUpdated historyUpdated = new HistoryUpdated(history);
            historyUpdated.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void buyHistory(CancelFailed cancelFailed) {
        //implement business logic here:

        /** Example 1:  new item 
        History history = new History();
        repository().save(history);

        HistoryUpdated historyUpdated = new HistoryUpdated(history);
        historyUpdated.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(cancelFailed.get???()).ifPresent(history->{
            
            history // do something
            repository().save(history);

            HistoryUpdated historyUpdated = new HistoryUpdated(history);
            historyUpdated.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void userInfoCheck(BuyComplete buyComplete) {
        //implement business logic here:

        /** Example 1:  new item 
        History history = new History();
        repository().save(history);

        CheckRejected checkRejected = new CheckRejected(history);
        checkRejected.publishAfterCommit();
        CheckCorrected checkCorrected = new CheckCorrected(history);
        checkCorrected.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(buyComplete.get???()).ifPresent(history->{
            
            history // do something
            repository().save(history);

            CheckRejected checkRejected = new CheckRejected(history);
            checkRejected.publishAfterCommit();
            CheckCorrected checkCorrected = new CheckCorrected(history);
            checkCorrected.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void userInfoCheck(CancelComplete cancelComplete) {
        //implement business logic here:

        /** Example 1:  new item 
        History history = new History();
        repository().save(history);

        CheckRejected checkRejected = new CheckRejected(history);
        checkRejected.publishAfterCommit();
        CheckCorrected checkCorrected = new CheckCorrected(history);
        checkCorrected.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(cancelComplete.get???()).ifPresent(history->{
            
            history // do something
            repository().save(history);

            CheckRejected checkRejected = new CheckRejected(history);
            checkRejected.publishAfterCommit();
            CheckCorrected checkCorrected = new CheckCorrected(history);
            checkCorrected.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void userCreate(Joind joind) {
        //implement business logic here:

        /** Example 1:  new item 
        History history = new History();
        repository().save(history);

        UserCreated userCreated = new UserCreated(history);
        userCreated.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(joind.get???()).ifPresent(history->{
            
            history // do something
            repository().save(history);

            UserCreated userCreated = new UserCreated(history);
            userCreated.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void userDelete(Withdrawed withdrawed) {
        //implement business logic here:

        /** Example 1:  new item 
        History history = new History();
        repository().save(history);

        UserDeleted userDeleted = new UserDeleted(history);
        userDeleted.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(withdrawed.get???()).ifPresent(history->{
            
            history // do something
            repository().save(history);

            UserDeleted userDeleted = new UserDeleted(history);
            userDeleted.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void webtoonOpenCheck(OpenChecked openChecked) {
        //implement business logic here:

        /** Example 1:  new item 
        History history = new History();
        repository().save(history);

        OpenApproved openApproved = new OpenApproved(history);
        openApproved.publishAfterCommit();
        OpenRejected openRejected = new OpenRejected(history);
        openRejected.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(openChecked.get???()).ifPresent(history->{
            
            history // do something
            repository().save(history);

            OpenApproved openApproved = new OpenApproved(history);
            openApproved.publishAfterCommit();
            OpenRejected openRejected = new OpenRejected(history);
            openRejected.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
