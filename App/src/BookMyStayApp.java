import java.util.HashMap;
import java.util.Map;

class RoomSearchService {

    public void searchAvailableRooms(Map<String, Integer> availability) {

        // Single Room
        if (availability.get("Single") > 0) {
            System.out.println("Single Room Available: " + availability.get("Single"));
            System.out.println("Beds: 1");
            System.out.println("Size: 250 sq ft");
            System.out.println("Price: ₹1500");
            System.out.println();
        }

        // Double Room
        if (availability.get("Double") > 0) {
            System.out.println("Double Room Available: " + availability.get("Double"));
            System.out.println("Beds: 2");
            System.out.println("Size: 400 sq ft");
            System.out.println("Price: ₹2500");
            System.out.println();
        }

        // Suite Room
        if (availability.get("Suite") > 0) {
            System.out.println("Suite Room Available: " + availability.get("Suite"));
            System.out.println("Beds: 3");
            System.out.println("Size: 750 sq ft");
            System.out.println("Price: ₹5000");
            System.out.println();
        }
    }
}

public class BookMyStayApp {

    public static void main(String[] args) {

        Map<String, Integer> availability = new HashMap<>();

        availability.put("Single", 10);
        availability.put("Double", 5);
        availability.put("Suite", 2);

        RoomSearchService searchService = new RoomSearchService();
        searchService.searchAvailableRooms(availability);
    }
}