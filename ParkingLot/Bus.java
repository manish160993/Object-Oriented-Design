class Bus implements Vehicle{
    private String license;
    private SIZE size;
    Bus(String license, SIZE size){
        this.setLicense(license);
        this.setSIZE(size);
    }
    public void setLicense(String license){
        this.license = license;
    }
    public void setSIZE(SIZE size){
        this.size = size;
    }
    public String getLicense(){
        return this.license;
    }
    public SIZE getSIZE(){
        return this.size;
    }
    public String toString(){
        return this.getLicense()+" "+this.getSIZE();
    }
}