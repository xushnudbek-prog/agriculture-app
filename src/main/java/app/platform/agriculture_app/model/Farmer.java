package app.platform.agriculture_app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Farmer {
    private String id;
    private String name;
    private String location;
    private String cropType;
    private double landSize; // in hectares
}
