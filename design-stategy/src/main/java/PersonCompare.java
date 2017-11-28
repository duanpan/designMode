/**
 * 比较人的年龄
 */
public class PersonCompare implements Comparable<PersonCompare> {

    private int age;
    private int weight;
    private String name;

    private PersonCompare personCompare;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonCompare(PersonCompare personCompare) {
        this.personCompare = personCompare;
    }

    @Override
    public int compareTo(PersonCompare o) {
        if (this.getAge() > o.getAge()) {
            return 1;
        } else if (this.getAge() == o.getAge()) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "PersonCompare{" +
                "age=" + age +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", personCompare=" + personCompare +
                '}';
    }
}
