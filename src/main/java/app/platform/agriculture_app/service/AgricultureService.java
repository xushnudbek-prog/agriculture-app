package app.platform.agriculture_app.service;

import app.platform.agriculture_app.model.Farmer;
import app.platform.agriculture_app.model.Order;
import app.platform.agriculture_app.model.Product;
import app.platform.agriculture_app.model.Supplier;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class AgricultureService {

    private final List<Farmer> farmers = new ArrayList<>();
    private final List<Supplier> suppliers = new ArrayList<>();
    private final List<Product> products = new ArrayList<>();
    private final List<Order> orders = new ArrayList<>();

    @PostConstruct
    public void init() {
        // Dummy Farmers
        farmers.add(new Farmer("F1", "John Doe", "California", "Wheat", 50.5));
        farmers.add(new Farmer("F2", "Jane Smith", "Texas", "Corn", 120.0));
        farmers.add(new Farmer("F3", "Bob Johnson", "Iowa", "Soybean", 80.0));
        farmers.add(new Farmer("F4", "Alice Brown", "Florida", "Oranges", 30.0));

        // Dummy Suppliers
        suppliers.add(new Supplier("S1", "AgriCorp", "Fertilizers", "contact@agricorp.com"));
        suppliers.add(new Supplier("S2", "FarmMachinery Inc", "Machinery", "sales@farmmachinery.com"));
        suppliers.add(new Supplier("S3", "SeedMaster", "Seeds", "support@seedmaster.com"));

        // Dummy Products
        products.add(new Product("P1", "Nitrogen Fertilizer", "Fertilizers", 50.0, "S1"));
        products.add(new Product("P2", "Harvester 3000", "Machinery", 150000.0, "S2"));
        products.add(new Product("P3", "Corn Seeds", "Seeds", 200.0, "S3"));

        // Dummy Orders
        orders.add(new Order("O1", "F1", "P1", 10, 500.0, LocalDate.now().minusDays(5), "DELIVERED"));
        orders.add(new Order("O2", "F2", "P2", 1, 150000.0, LocalDate.now().minusDays(2), "PROCESSING"));
        orders.add(new Order("O3", "F3", "P3", 5, 1000.0, LocalDate.now().minusDays(1), "SHIPPED"));
    }

    public List<Farmer> getAllFarmers() {
        return farmers;
    }

    public List<Supplier> getAllSuppliers() {
        return suppliers;
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public List<Order> getAllOrders() {
        return orders;
    }
}
