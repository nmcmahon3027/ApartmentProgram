import helloPackage.Main;

//Changed public to abstract
public class Apartment extends OneBedApartment {

    private Main mainOne;


    public void setMainOne(Main mainOne){
        this.mainOne = mainOne;
    }

    private String roomFloor;
    private String roomType;
    private String roomNumber;
    private String roomPrice;

    public Apartment(){}

    public void roomStudio(){
        mainOne.roomStudio(getRoomPrice());
    }

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

