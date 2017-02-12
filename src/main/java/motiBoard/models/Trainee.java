package motiBoard.models;

/**
 * Created by Geddy on 11-2-2017.
 */

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import java.util.Date;

@Entity
public class Trainee {

    @Id
    private String userId;
    private String displayName;
    private String email;
    private int startWeight;
    private int currentWeight;
    private int targetWeight;
    private Date startdate;

    private Trainee(){}

    public Trainee(String userId,String displayName,String email){
        this.userId = userId;
        this.displayName = displayName;
        this.email = email;
    }

}
