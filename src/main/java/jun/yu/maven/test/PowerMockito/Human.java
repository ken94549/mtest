package jun.yu.maven.test.PowerMockito;

public class Human {
    public String name;
    public int age;
    public Puppy puppy;

    public Human(String name) {
        this.name = name;
    }

    public void buyPuppy(String name){
        puppy = Puppy.createPuppy(name, this);
    }

    public void walkWithPuppy() {
        puppy.goOnWalk(15);
    }

    public static void main(String[] args) {
        Human john = new Human("John");
        john.buyPuppy("Gatsby");
        john.puppy.performPuppyTasks();
        john.walkWithPuppy();
    }

    public void isSoHappy() {
        System.out.println("Yay!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
