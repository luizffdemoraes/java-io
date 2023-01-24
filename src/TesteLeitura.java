import java.io.*;

public class TesteLeitura {
    // Checked pois o código não consegue validar durante a compilação
    public static void main(String[] args) throws IOException {
        // Fluxo de Entrada com Arquivo
        FileInputStream fis = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); // transformar bit e bites em caracters
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine(); // pular linha
        }

        br.close();
    }
}
