// Leaf
public class Employee extends Person implements DepartmentComponent {
    // Common employees attributes
    private String workPosition;

    public Employee(String name, int age, int id, String workPosition) {
        super(name, age, id);
        this.workPosition = workPosition;
    }

    public String getWorkPosition() {
        return workPosition;
    }

    public void setWorkPosition(String workPosition) {
        this.workPosition = workPosition;
    }

    // Implemented execute method
    @Override
    public void showInformation() {
        System.out.println("[Employee " + getName() + "] I am " + getAge() + " years old. My work position is: " + workPosition);
    }
}
