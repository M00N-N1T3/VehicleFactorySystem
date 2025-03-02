package Factory;

import factory.VehicleFactory;
import models.Vehicle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class VehicleFactoryTest {

    @Test
    public void canCreateExistingVehicles(){
        List<String> vehicleNames = List.of("car","truck","helicopter","plane","boat","bike");

        for (String vehicleName: vehicleNames){
            Vehicle vehicle = new VehicleFactory().getInstanceOf(vehicleName);

        }
    }

}
