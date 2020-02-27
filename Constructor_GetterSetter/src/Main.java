public class Main {

    public static void main(String[] args) {
        Classroom c=new Classroom();
        System.out.println(c.block);
        c=new Classroom("F2",30,new String[]{"F4A01","F4A12"});
        System.out.println(c.block);
        System.out.println(c.doors);
        for (String s:
             c.classroom) {
            System.out.println(s);
        }
        //Getter Setter
        c=new Classroom();
        c.setBlock("B");c.setClassroom(new String[]{"B01","B02"});c.setClassroom(new String[]{"B01","B02"});c.setDoors(10);
        System.out.println(c.getBlock());
        System.out.println(c.getDoors());
        for (String s:
                c.getClassroom()) {
            System.out.println(s);
        }
    }
}
