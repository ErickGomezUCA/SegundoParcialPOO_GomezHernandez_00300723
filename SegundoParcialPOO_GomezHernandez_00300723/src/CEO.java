import java.util.Vector;

// Composite 1: CEO
public class CEO extends Person implements DepartmentComponent {
    // Common Composite attributes
    // Composite content
    private Vector<DepartmentComponent> content;

    public CEO(String name, int age, int id) {
        super(name, age, id);
        this.content = new Vector<DepartmentComponent>();
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
        System.out.println("[CEO " + getName() + "]: Consists of the following departments:");
        for (DepartmentComponent element : content) {
            // Delegate printing information to content of composite
            element.showInformation();
        }
    }
}
