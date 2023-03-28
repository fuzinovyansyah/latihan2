import java.util.LinkedList;

public class latihan2 {
    public static void main(String[] args) {
        
        LinkedList<String> hewan = new LinkedList<>();

        
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");
        hewan.add("Kucing");

        System.out.println("Nama Hewan: " + hewan);
        System.out.println("Hewan yang di hapus : Kelinci, Kambing");
        
        LinkedList<String> deleteHewan = new LinkedList<>();
        hewan.remove("Kelinci");
        hewan.remove("Kambing");

        System.out.println("Setelah di hapus : " + hewan);
    }
}
