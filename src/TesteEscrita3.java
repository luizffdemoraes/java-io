import java.io.*;

public class TesteEscrita3 {
    public static void main(String[] args) throws IOException {

        /*
            ->    Fluxo de Escrita de Arquivo
        OutputStream fos = new FileOutputStream( "lorem2.txt");
        Writer ows = new OutputStreamWriter(fos); // transformar bit e bites em caracters

        -> Alto Nível
        BufferedWriter bw = new BufferedWriter(ows);
        PrintStream ps = new PrintStream("lorem2.txt");
         */

        //
        PrintWriter pw = new PrintWriter("lorem2.txt");
        pw.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        pw.println();
        pw.println();
        pw.println();
        pw.println("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,");

        pw.close();
    }
}
