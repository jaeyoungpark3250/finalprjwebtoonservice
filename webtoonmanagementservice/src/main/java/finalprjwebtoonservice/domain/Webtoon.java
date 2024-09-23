package finalprjwebtoonservice.domain;

import finalprjwebtoonservice.WebtoonmanagementserviceApplication;
import finalprjwebtoonservice.domain.OpenChecked;
import finalprjwebtoonservice.domain.ReadFailed;
import finalprjwebtoonservice.domain.Updateed;
import finalprjwebtoonservice.domain.Uploaded;
import finalprjwebtoonservice.domain.WebtoonReaded;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Webtoon_table")
@Data
//<<< DDD / Aggregate Root
public class Webtoon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        Uploaded uploaded = new Uploaded(this);
        uploaded.publishAfterCommit();

        Updateed updateed = new Updateed(this);
        updateed.publishAfterCommit();

        OpenChecked openChecked = new OpenChecked(this);
        openChecked.publishAfterCommit();

        WebtoonReaded webtoonReaded = new WebtoonReaded(this);
        webtoonReaded.publishAfterCommit();

        ReadFailed readFailed = new ReadFailed(this);
        readFailed.publishAfterCommit();
    }

    public static WebtoonRepository repository() {
        WebtoonRepository webtoonRepository = WebtoonmanagementserviceApplication.applicationContext.getBean(
            WebtoonRepository.class
        );
        return webtoonRepository;
    }

    public void webtoonUpload() {
        //implement business logic here:

        Uploaded uploaded = new Uploaded(this);
        uploaded.publishAfterCommit();
    }

    public void webtoonUpdate() {
        //implement business logic here:

        Updateed updateed = new Updateed(this);
        updateed.publishAfterCommit();
    }

    public void webtoonOpen() {
        //implement business logic here:

        OpenChecked openChecked = new OpenChecked(this);
        openChecked.publishAfterCommit();
    }

    //<<< Clean Arch / Port Method
    public static void openApprove(OpenApproved openApproved) {
        //implement business logic here:

        /** Example 1:  new item 
        Webtoon webtoon = new Webtoon();
        repository().save(webtoon);

        WebtoonReaded webtoonReaded = new WebtoonReaded(webtoon);
        webtoonReaded.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(openApproved.get???()).ifPresent(webtoon->{
            
            webtoon // do something
            repository().save(webtoon);

            WebtoonReaded webtoonReaded = new WebtoonReaded(webtoon);
            webtoonReaded.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void openReject(OpenRejected openRejected) {
        //implement business logic here:

        /** Example 1:  new item 
        Webtoon webtoon = new Webtoon();
        repository().save(webtoon);

        ReadFailed readFailed = new ReadFailed(webtoon);
        readFailed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(openRejected.get???()).ifPresent(webtoon->{
            
            webtoon // do something
            repository().save(webtoon);

            ReadFailed readFailed = new ReadFailed(webtoon);
            readFailed.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
