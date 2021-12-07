import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class DrivingLicenseApplication {
    public static void main(String[] args){
        try {
            handle();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public static void handle() throws Exception {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Drivers Birth date in format MM/DD/YYYY");

        String strYear = myObj.nextLine();
        Date date = new SimpleDateFormat("MM/DD/YYYY").parse(strYear);
        Date dateNow = new Date();
        int difference = (int) ChronoUnit.DAYS.between( date.toInstant(), dateNow.toInstant());
        if(365* 16 > difference){
            int age = difference / 365;
            throw new Exception("The age of the applicant is " + age + " which is too early to apply for a driving license");
        }
    }
}
