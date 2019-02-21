import helloPackage.Main;

import java.util.ArrayList;
import java.util.List;

//Changed public to abstract
public class Apartment  {//was 'extends Apartment'

    private Main mainOne;


    public void setMainOne(Main mainOne){
        this.mainOne = mainOne;
    }

    private String roomFloor;
    private String roomType;
    private String roomNumber;
    private String roomPrice;
    private String rq;
    private String request;

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
    public void setRequest(String rq){
        this.rq = rq;

    }
    public String getRequest(String rq){
        return rq;

    }

    private List<RoomType> orders = new ArrayList<RoomType>();

    public List<RoomType> getOrders() {
        return orders;
    }

    public void setOrders(List<RoomType> orders) {
        this.orders = orders;
    }



    }

