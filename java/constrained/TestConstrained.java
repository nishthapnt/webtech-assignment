package constrained;
import java.beans.PropertyVetoException;
public class TestConstrained {
    public static void main(String[] args) {
        Person p = new Person();

        p.addVetoableChangeListener(evt -> {
            int newAge = (int) evt.getNewValue();
            if (newAge < 18) {
                throw new PropertyVetoException("Age must be 18+", evt);
            }
        });

        try {
            p.setAge(16); // ❌
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}