package AccountDetails;     //what is your acc details - acc no, name , password
import java.io.*;
import java.util.*;

public class Account {
    Scanner sc = new Scanner(System.in);
    //Adding details to check in Login_SignUp form
    ArrayList<ArrayList<Object>> accdetails = new ArrayList<>(5);
    public Account(){

        /** 2D ArrayList
         * CardNumber, Password, CVV */


        for (int i = 0; i < 3; i++) {
            accdetails.add(new ArrayList<>());
        }

        accdetails.get(1).add("123412341234");
        accdetails.get(1).add("2006");
        accdetails.get(1).add("123");

        accdetails.get(2).add("456745674567");
        accdetails.get(2).add("2407");
        accdetails.get(2).add("232");

        accdetails.get(0).add("369369369369");
        accdetails.get(0).add("0910");
        accdetails.get(0).add("143");


    }

    Object setCno(String cno){
        return cno;
    }
    Object setPswrd(String pswrd){
        return pswrd;
    }
    Object setCvv(String cvv){
        return cvv;
    }

    public int index(String cno){
        int flag =-1;
        for (int i = 0; i < 3; i++) {
            if(accdetails.get(i).contains(setCno(cno))){
                flag =i;
                break;
            }
        }
        return flag;
    }

    public boolean containAc(String cno, String pswrd, String cvv){
        int index = index(cno);
        //System.out.println(index);
        if(index >=0){
            //System.out.println(index);
            Object[] acc = new Object[3];
            acc = accdetails.get(index).toArray();
            if(acc[1].equals(setPswrd(pswrd))  && acc[2].equals(setCvv(cvv))){
                return true;
            }else{
                System.out.println("Pswrd/CVV does not match!!");
                return false;
            }
        }else {
            return false;
        }
    }

    /*public static void main(String[] args) {
        Account ac = new Account();
        System.out.println(ac.containAc("123412341234", "2006", "123"));
    }*/
}