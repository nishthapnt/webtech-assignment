package bound;

import java.beans.*;

public class Person {

    private int age;
    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public void setAge(int newAge) {
        int oldAge = this.age;
        this.age = newAge;
        pcs.firePropertyChange("age", oldAge, newAge);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }
}