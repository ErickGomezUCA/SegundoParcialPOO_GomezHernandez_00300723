import java.util.Vector;

// Composite 2: Departments
public class Department implements DepartmentComponent {
    // Common Composite attributes
    private String name;
    // Composite content
    private Vector<DepartmentComponent> content;

    public Department(String name) {
        this.name = name;
        content = new Vector<DepartmentComponent>();
    }

    public void add(DepartmentComponent component) {
        content.add(component);
    }

    public void remove(DepartmentComponent component) {
        content.remove(component);
    }

    public Vector<DepartmentComponent> getContent() {
        return content;
    }

    // Implemented execute method
    @Override
    public void showInformation() {
        System.out.println("[Department " + name + "]: Consists of the following workers:");
        for (DepartmentComponent element : content) {
            // Delegate printing information to content of composite
            element.showInformation();
        }
    }
}
