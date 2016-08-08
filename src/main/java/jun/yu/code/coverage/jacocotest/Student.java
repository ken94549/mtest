package jun.yu.code.coverage.jacocotest;

public class Student {
    //add comment to id field
	// add comment by Ken
    private int id;
    private String name;
    private String address;
    private String address2;
    private String address3;
    private String address4;
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
    public String getAddress2(){
        return address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }
}
