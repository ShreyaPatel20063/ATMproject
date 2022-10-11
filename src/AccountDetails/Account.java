package AccountDetails;     //what is your acc details - acc no, name , password

import java.util.*;

public class Account {
    //Adding details to check in Login_SignUp form
    ArrayList<ArrayList<Object>> accdetails = new ArrayList<>(3);
    static Double[] balance = new Double[3];
    public Account(){

        /** 2D ArrayList
         * CardNumber, Password, CVV */


        for (int i = 0; i < 3; i++) {
            accdetails.add(new ArrayList<>());
        }

        accdetails.get(1).add("123412341234");
        accdetails.get(1).add("2006");
        accdetails.get(1).add("123");
        balance[1] = 5000.00;

        accdetails.get(2).add("456745674567");
        accdetails.get(2).add("2407");
        accdetails.get(2).add("232");
        balance[2] = 5000.00;

        accdetails.get(0).add("369369369369");
        accdetails.get(0).add("0910");
        accdetails.get(0).add("143");
        balance[0] = 5000.00;


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

    public Double setBalance(String cno){
        int ind = index(cno);
        return balance[ind];
    }


    public int index(String cno){           // kind of session == login info
        int flag =-1;
        for (int i = 0; i < 3; i++) {
            if(accdetails.get(i).contains(setCno(cno))){
                flag =i;
                System.out.println(flag);                           //11111111111
                break;
            }
        }
        System.out.println(flag);                                   //2222222222
        return flag;
    }



    public boolean containAc(String cno, String pswrd, String cvv){
        int index = index(cno);

        if(index >=0){
            Object[] acc ;
            acc = accdetails.get(index).toArray();
            if(acc[1].equals(setPswrd(pswrd))  && acc[2].equals(setCvv(cvv))){
                System.out.println("Pswrd match");
                return true;
            }else{
                System.out.println("Pswrd/CVV does not match!!");
                return false;
            }
        }else {
            return false;
        }
    }


}