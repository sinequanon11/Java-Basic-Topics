package OOPEncapsulation.OzgurHoca;

public class Course {

    private String name; // ENC'da fields'leri private yapıyoruz
    private int minScore; // istediğimiz şekilde erişebilmek için

    public Course(String name) {    // CONST'lar private olmuyor, anlamsız olur
        this.name = name;
    }

    public Course(String name, int minScore) {
        this.name = name;
        this.setMinScore(minScore);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinScore() {
        return minScore;
    }

    public void setMinScore(int minScore) {
        if(minScore<50)
        System.out.println("Your Score: " + minScore + ", You failed");
        else
            System.out.println("Your Score: " + minScore +", Congrats, you passed");
        this.minScore = minScore;
    }
}
