package jun.yu.code.coverage.jacocotest;

public class Student {
    //add comment to id field
	// add comment by Ken
    private int id;
    private String name;
    private String address;
    private String address2;
    private String city;
    private String zip;
    private String state;
    private int score;
    
    public Student(int id, String name, int score,String address) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.address=address;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getScore() {
        return score;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address)
    {
    	this.address=address;
    }
    
    public String getAddress2(){
        return address2;
    }
    
    //add city methods
    public String getCity(){
        return city;
    }
    
    public void setCity(String city)
    {
    	this.city=city;
    }
    
    //add zip methods
    public String getZip(){
        return zip;
    }
    
    //add State methods
    public String getState(){
        return state;
    }
    
    public void setState(String state)
    {
    	this.state=state;
    }
}
