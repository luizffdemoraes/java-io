import java.io.*;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {
        // Fluxo de Escrita de Arquivo
//        OutputStream fos = new FileOutputStream( "lorem2.txt");
//        Writer ows = new OutputStreamWriter(fos); // transformar bit e bites em caracters
//        BufferedWriter bw = new BufferedWriter(ows);

        FileWriter fw = new FileWriter("lorem2.txt");
        fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        fw.write(System.lineSeparator());
        fw.write(System.lineSeparator());
        fw.write(System.lineSeparator());
        fw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,");

        fw.close();
    }
}
