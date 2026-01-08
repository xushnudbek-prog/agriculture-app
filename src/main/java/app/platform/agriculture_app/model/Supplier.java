package app.platform.agriculture_app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Supplier {
    private String id;
    private String name;
    private String type; // e.g., Fertilizers, Seeds, Machinery
    private String contactInfo;
}
