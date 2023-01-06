public class Person {
    public static void main(String[] args) {
        Person brandon = new Person("bdon");
        System.out.println(brandon.getName());
        brandon.setName("Brandon");
        brandon.sayHello();
    }
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Howdy diddly, " + getName() + ".");
    }


}
