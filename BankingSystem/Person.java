class Person{
    private String name;
    private String PAN;
    private String address;
    private long accountNumber;
    Person(String name, String PAN, String address, long accountNumber){
        this.name = name;
        this.PAN = PAN;
        this.address = address;
        this.accountNumber = accountNumber;
    }
    Person(String name, String PAN, long accountNumber){
        this.name = name;
        this.PAN = PAN;
        this.accountNumber = accountNumber;
    }
    public String getName(){
        return this.name;
    }
    
    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setName(String name){
        this.name = name;
    }

    public long getAccountNumber(){
        return this.accountNumber;
    }

    public String toString(){
        return this.name+" -> "+this.accountNumber;
    }
}