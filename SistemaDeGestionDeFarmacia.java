// Ejemplo de código para el sistema de gestión de farmacia
public class Medicine {
    private String name;
    private String description;
    private int quantity;
 
    public Medicine(String name, String description, int quantity) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }
 
    public String getName() {
        return name;
    }
 
    public String getDescription() {
        return description;
    }
 
    public int getQuantity() {
        return quantity;
    }
 
    public void decreaseQuantity(int quantity) {
        this.quantity -= quantity;
    }
 }
 