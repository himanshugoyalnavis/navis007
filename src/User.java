import java.util.Comparator;

public class User implements Comparable{
    private String userName;
    private String mailId;
    public User(){

    }
    public User(String userName,String mailId){
        this.userName=userName;
        this.mailId=mailId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }
    @Override
    public String toString(){
        return "User{"+"userName='"+userName+"'}";
    }

    @Override
    public int compareTo(Object o) {
       String s1= this.userName;
       String s2=((User)o).getUserName();
       return s1.compareTo(s2);
    }
}
