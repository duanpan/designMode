
public class Person {

    private  HappyStrategy happyStrategy;
    private SadStratege sadStratege;

    public void setHappyStrategy(HappyStrategy happyStrategy) {
        this.happyStrategy = happyStrategy;
    }

    public void setSadStratege(SadStratege sadStratege) {
        this.sadStratege = sadStratege;
    }

    /**
     * 开心
     */
    public void happy(){
        happyStrategy.happy();
    }

    /**
     * 伤心难过
     */
    public void sad(){
        sadStratege.sad();
    }

}
