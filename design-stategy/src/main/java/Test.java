import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 测试不同人在不同心情的行为反应
 */
public class Test {

//    public static void main(String[] args) {
//        System.out.println("苏珊不同心情会做出的行为!");
//        MoodUtil.happy(1);
//        MoodUtil.sad(1);
//        System.out.println("---------------------------------------");
//        System.out.println("韩梅梅不同心情会做出的行为!");
//        MoodUtil.happy(3);
//        MoodUtil.sad(2);
//        System.out.println("---------------------------------------");
//        System.out.println("鲍勃不同心情会做出的行为!");
//        MoodUtil.happy(2);
//        MoodUtil.sad(3);
//
//
//    }

    public static void main(String[] args) {
        Person person=new Person();
        System.out.println("苏珊不同心情会做出的行为!");
        person.setHappyStrategy(new Risus());
        person.happy();
        person.setSadStratege(new Sleep());
        person.sad();
        System.out.println("---------------------------------------");
        System.out.println("韩梅梅不同心情会做出的行为!");
        person.setHappyStrategy(new Shopping());
        person.happy();
        person.setSadStratege(new Cry());
        person.sad();
        System.out.println("---------------------------------------");
        System.out.println("鲍勃不同心情会做出的行为!");
        person.setHappyStrategy(new Sing());
        person.happy();
        person.setSadStratege(new Shopping());
        person.sad();
    }


//    public static void main(String[] args) {
//
//        Person person1=new Person();
//        person1.setAge(18);
//        person1.setWeight(40);
//        person1.setName("苏珊");
//        Person person2=new Person();
//        person2.setAge(20);
//        person2.setWeight(46);
//        person2.setName("韩梅梅");
//        Person person3=new Person();
//        person3.setAge(24);
//        person3.setWeight(60);
//        person3.setName("鲍勃");
//
//        PersonCompare pc1=new PersonCompare(person1);
//        PersonCompare pc2=new PersonCompare(person2);
//        PersonCompare pc3=new PersonCompare(person3);
//        List personList=new ArrayList();
//        personList.add(person3);
//        personList.add(person1);
//        personList.add(person2);
//        Collections.sort(personList);
//        System.out.println(personList);
//    }

}
