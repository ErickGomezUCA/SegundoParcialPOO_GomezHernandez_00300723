import java.util.Vector;

// Composite
public class Department implements DepartmentComponent {
    // Common Composite attributes
    private String name;
    // Composite content
    private Vector<DepartmentComponent> workers;

    public Department(String name) {
        this.name = name;
        workers = new Vector<DepartmentComponent>();
    }

    public void add(DepartmentComponent component) {
        workers.add(component);
    }

    public void remove(DepartmentComponent component) {
        workers.remove(component);
    }

    public Vector<DepartmentComponent> getWorkers() {
        return workers;
    }

    // Implemented execute method
    @Override
    public void showInformation() {
        System.out.println("[Department " + name + "]: Consists of the following workers:");
        for (DepartmentComponent worker : workers) {
            // Delegate printing information to content of composite
            worker.showInformation();
        }
    }
}
