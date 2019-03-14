class Account{
    private static long id = 0;
    private long accountNumber;
    private String pin;
    private String PAN;
    private double balance;
    private String routingNumber;
    Account(String pin, String PAN, double balance, String routingNumber){
        this.pin = pin;
        this.accountNumber = ++id;
        this.PAN = PAN;
        this.routingNumber = routingNumber;
        this.balance = balance;
    }
    Account(String pin, String PAN, String routingNumber){
        this.pin = pin;
        this.accountNumber = ++id;
        this.PAN = PAN;
        this.routingNumber = routingNumber;
        this.balance = 0.0;
    }
    public double getBalance(){
        return this.balance;
    }
    
    public void resetPin(String pin, String PAN) throws Exception{
        if(this.PAN.equals(PAN)){
            this.pin = pin;
        }else{
            throw new Exception("Please insert correct PAN details");
        }
        
    }
    

    public void credit(double balance){
        this.balance += balance;
    }

    public void debit(double balance, String pin) throws Exception{
        if(!this.pin.equals(pin)){
            throw new Exception("PIN MISMATCH");
        }
        if(this.balance >= balance){
            this.balance -= balance;
            return;
        }else{
            throw new Exception("Balance Insufficient");
        }
    }

    public long getAccountNumber(){
        return this.accountNumber;
    }
}