class Large implements Spot{
    private long id;
    private final SIZE size = SIZE.L;
    private boolean booked;
    Large(long id, boolean booked){
        this.setId(id);
        this.setBooked(booked);
    }
    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return this.id;
    }
    public SIZE getSIZE(){
        return this.size;
    }
    public void setBooked(boolean booked){
        this.booked = booked;
    }
    public boolean isBooked(){
        return this.booked;
    }
    public String toString(){
        return this.getId()+" "+this.getSIZE()+" "+this.isBooked();
    }
}