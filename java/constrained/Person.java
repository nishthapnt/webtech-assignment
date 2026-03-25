package constrained;

import java.beans.*;

public class Person {

    private int age;
    private VetoableChangeSupport vcs = new VetoableChangeSupport(this);

    public void setAge(int newAge) throws PropertyVetoException {
        vcs.fireVetoableChange("age", this.age, newAge);
        this.age = newAge;
    }

    public void addVetoableChangeListener(VetoableChangeListener listener) {
        vcs.addVetoableChangeListener(listener);
    }
}