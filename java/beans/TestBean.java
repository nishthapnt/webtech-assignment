package beans;

public class TestBean {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Nishtha");
        p.setAge(20);

        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
