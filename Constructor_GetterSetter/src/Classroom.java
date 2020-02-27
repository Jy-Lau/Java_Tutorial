public class Classroom {
    String block;   //can be set to private if getter setter for encapsulation
    int doors;  //can be set to private if getter setter for encapsulation
    String[] classroom; //can be set to private if getter setter for encapsulation

    public Classroom(){
        block="F4";
    }
    public Classroom(String block,int doors,String[] classroom){
        this.block=block;
        this.doors=doors;
        this.classroom=classroom;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String[] getClassroom() {
        return classroom;
    }

    public void setClassroom(String[] classroom) {
        this.classroom = classroom;
    }
}
