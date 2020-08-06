package database;

public class User{

    String stName;
    String stID;
    String stDOB;


    public User(){
        this.stName = stName;
        this.stID = stID;
    }
    public User(String stName, String stID, String stDOB){
        this.stName = stName;
        this.stID = stID;
        this.stDOB = stDOB;

    }
    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getStID() {
        return stID;
    }

    public void setStID(String stID) {
        this.stID = stID;
    }

    public String getStDOB() {
        return stDOB;
    }


}


