public class MegaBytesConverter {

    public static void printMegaBytesandKiloBytes(int kiloBytes){

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            int megaBytes = kiloBytes / 1024;
            int remKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remKiloBytes + " KB" );
        }

    }
}
