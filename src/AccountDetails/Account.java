package AccountDetails;     //what is your acc details - acc no, name , password
import java.io.*;

public class Account {

}
class FileCreating{
    FileCreating(){                 //constructor
        createFile();               //file creation called
    }
    void createFile(){              //file created here
        try{
            File file = new File("D:\\College\\second yr\\JAVA\\practice\\ATMproject\\src\\Acc_Details.txt");       //file name and path
            if(file.createNewFile()){
                System.out.println("File Created: " + file.getName());
            }
        } catch ( IOException io_exception) {                   //exception handling
            System.out.println("Error in creating File");
            io_exception.printStackTrace();                     //print details of where the code is showing error,pinpoint the exact line in which the method raised the exception
        }
    }   //File created


}