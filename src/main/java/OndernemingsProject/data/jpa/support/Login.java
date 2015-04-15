package OndernemingsProject.data.jpa.support;

//import services.UserServices;

import java.util.List;

/**
 * Created by thijs on 10/03/15.
 */
public class Login {
    private String username;
    private String password;
   // static UserServices userServices;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static boolean usernameInDatabase(String username){
        boolean present = false;
    //    userServices = new UserServices();
      //  List<String> usernames = userServices.getUsernames();

     //   for (String user : usernames){
       //     if(user.equals(username)){
        //    present = true;
          //  }
        //}
        return present;
    }

    public static boolean checkPassWord(String username, String password){
        boolean correct = false;


        return correct;
    }
}
