package coverage2;

public class Home {
    private String name;
    private String address1;
    
    public Home(String name,String address1){
        this.name=name;
        this.address1=address1;
    }

    public Home(){
    	reset();
    }
    
    public void reset(){
        this.name="";
        this.address1="";
    }

    //add comments
    public String getName(){
        return name;
    }
    
    public void setName(String name)
    {
    	this.name=name;
    }
    
    public void setAddress(String address1)
    {
    	this.address1=address1;
    }
    
    public String getAddress(){
        return address1;
    }
}
