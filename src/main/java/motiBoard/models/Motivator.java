package motiBoard.models;

/**
 * Created by Geddy on 10-2-2017.
 */

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Motivator {

    @Id
    private String userId;
    private String displayName;
    private String mainEmail;

    private Motivator(){}

    public Motivator(String userId,String displayName, String mainEmail){
        this.userId = userId;
        this.displayName = displayName;
        this.mainEmail = mainEmail;
    }
}
