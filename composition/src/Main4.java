class Room {
    private int number;
    private String type;

    public Room(int number, String type) {
        this.number = number;
        this.type = type;
    }

    public String getRoomInfo() {
        return "Room " + number + " - " + type;
    }
}

class House {
    private String address;
    private Room room; // Composition

    public House(String address, Room room) {
        this.address = address;
        this.room = room;
    }

    public void displayInfo() {
        System.out.println("Address: " + address);
        System.out.println("Room: " + room.getRoomInfo());
    }
}

public class Main4 {
    public static void main(String[] args) {
        Room room = new Room(1, "Bedroom");
        House house = new House("1234 Main St", room);
        house.displayInfo();
    }
}