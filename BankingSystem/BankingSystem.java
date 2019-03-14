import java.util.*;

class BankingSystem{
    public static void main(String[] args){
        ManishBank MB = new ManishBank();
        Scanner scan = new Scanner(System.in);
        while(true){
            try{
                 System.out.println("1. Press 1 to create Account. \n 2. Press 2 to check balance. \n 3. Press 3 to check Account Number.");
                int val = scan.nextInt();
                switch(val){
                    case 1:
                        Person person = MB.addCustomers(scan.next(), scan.next(), scan.nextDouble(), scan.next());
                        System.out.println(person);
                        break;
                    case 2:
                        double balance = MB.getBalance(scan.nextLong());
                        System.out.println(balance);
                        break;
                    case 3:
                        long accountNumber = MB.getAccountNumber(scan.next());
                        System.out.println(accountNumber);
                        break;
                    case 4:
                        balance = MB.transferBalance(scan.nextLong(), scan.nextLong(), scan.nextDouble(), scan.next());
                        //System.out.println(balance);
                        break;
                    default:
                        
                }
            }catch(Exception e){
                System.out.println(e);
            }
           
        }
    }
}