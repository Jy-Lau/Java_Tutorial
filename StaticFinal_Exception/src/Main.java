public class Main {

    public static void main(String[] args) {
        Song s=new Song("Don't Cry",400);
        try{
            checkSongLength(s.getLength());
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Length of the Song: "+s.getLength());
        }
    }
    private static void checkSongLength(long l) throws Exception{
        System.out.println("Start Checking");
        if(l>350){
            throw new Exception();
        }
    }
}
