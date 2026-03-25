package bound;


public class TestBound {
    public static void main(String[] args) {
        Person p = new Person();

        p.addPropertyChangeListener(evt -> {
            System.out.println("Age changed: " + evt.getOldValue() + " → " + evt.getNewValue());
        });

        p.setAge(25);
    }

}
