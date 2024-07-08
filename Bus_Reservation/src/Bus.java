public class Bus {
    private int busNo;
    private boolean AC;
    private int capacity;

    Bus(int no,boolean ac,int cap){
        this.busNo = no;
        this.AC = ac;
        this.capacity = cap;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int cap){
        capacity = cap;
    }

    public int getBusNo(){
        return busNo;
    }

    public void setBusNo(int no){
        busNo = no;
    }

    public void setACype(boolean type){
        AC = type;
    }

    public boolean getACType(){
        return AC;
    }

    public void displayBusInfo(){
        System.out.println("Bus No:"+busNo+ " AC:"+AC +" Capacity:" + capacity);
    }
}
