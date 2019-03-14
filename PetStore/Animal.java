abstract class Animal{
    private String name;
    private int id;
    private static int count = 0;
    
    Animal(String name){
        setName(name);
        setId(count++);
    }

    Animal(){
        setId(count++);
    }

    public void setName(String name){
        this.name = name;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }
    
    public int getId(){
        return this.id;
    }
    
}