import java.io.*;
import java.net.Socket;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket(); // Comunicação entre dois computadores

        // Fluxo de Entrada com Arquivo
        InputStream is = s.getInputStream(); // Rede  // System.in; Habilitar o teclado no console // new FileInputStream("lorem.txt"); Arquivo
        InputStreamReader isr = new InputStreamReader(is); // transformar bit e bites em caracters
        BufferedReader br = new BufferedReader(isr);

        // Fluxo de Escrita/Saída de Arquivo
        OutputStream fos = s.getOutputStream(); // Rede //System.out; Exibir no console // new FileOutputStream( "lorem3.txt");
        Writer ows = new OutputStreamWriter(fos); // transformar bit e bites em caracters
        BufferedWriter bw = new BufferedWriter(ows);

        String linha = br.readLine();

        while (linha != null && !linha.isEmpty()) {
            bw.write(linha);
            bw.newLine();
            bw.flush(); //exibir de forma imediata
            linha = br.readLine(); // pular linha
        }

        br.close();
        bw.close();

    }
}
