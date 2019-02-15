

//Changed public to abstract
public class Apartment extends OneBedApartment {
    private String roomFloor;
    private String roomType;
    private String roomNumber;
    private String roomPrice;

    public Apartment(){}

    public String getRoomFloor(){
        return roomFloor;
    }

    public void setRoomFloor(String roomFloor){
        this.roomFloor = roomFloor;
    }

    public String getRoomType(){
        return roomType;
    }

    public void setRoomType(String roomType){
        this.roomType = roomType;
    }

    public String getRoomNumber(){
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber){
        this.roomNumber = roomNumber;
    }

    public String getRoomPrice(){
        return roomPrice;
    }

    public void setRoomPrice(String roomPrice){
        this.roomPrice = roomPrice;
    }



    }

