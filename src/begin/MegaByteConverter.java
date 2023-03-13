package udemy.buchalka.begin;

public class MegaByteConverter {
    public static void printMegaBytesAndKiloBytes (int mb) {
        //XX KB = YY MB and ZZ KB
        if (mb < 0) {
            System.out.println("Invalid Value");
        } else {
            int mbSize = 1024;
            int mod = (int) Math.floor( mb / 1024);
            int rem = mb % mbSize;
            System.out.println(mb + " KB = " + mod + " MB and " + rem + " KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }
}
