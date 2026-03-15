import java.util.HashMap;
import java.util.Map;

class RoomInventory {

    // Stores available room count for each room type
    private Map<String, Integer> roomAvailability;

    // Constructor initializes inventory
    public RoomInventory() {
        roomAvailability = new HashMap<>();
        initializeInventory();
    }

    // Initialize default availability
    private void initializeInventory() {
        roomAvailability.put("SingleRoom", 10);
        roomAvailability.put("DoubleRoom", 5);
        roomAvailability.put("SuiteRoom", 2);
    }

    // Returns the availability map
    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }

    // Update room availability
    public void updateAvailability(String roomType, int count) {
        roomAvailability.put(roomType, count);
    }
}

public class BookMyStayApp {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        System.out.println("Initial Room Availability:");
        for (Map.Entry<String, Integer> entry : inventory.getRoomAvailability().entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Example update
        inventory.updateAvailability("SingleRoom", 8);

        System.out.println("\nUpdated Room Availability:");
        for (Map.Entry<String, Integer> entry : inventory.getRoomAvailability().entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}