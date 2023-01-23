import javax.imageio.stream.FileImageOutputStream;
import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        // Fluxo de Entrada com Arquivo
        OutputStream fos = new FileOutputStream( "lorem2.txt");
        Writer ows = new OutputStreamWriter(fos); // transformar bit e bites em caracters
        BufferedWriter bw = new BufferedWriter(ows);

        bw.write("orem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.newLine();
        bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,");

        bw.close();
    }
}
