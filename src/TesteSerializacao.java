import java.io.*;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        /*
        Dentro da máquina virtual, ou JVM, temos a memória de objetos (HEAP), e o main, que controla estes objetos. A serialização é a transformação do objeto Java, localizado na memória, em um fluxo de bits e bytes, e vice-versa.

        Isto é possível graças a duas classes:

        java.io.ObjectOutputStream = Objeto -> Bits e Bytes
        java.io.ObjectInputStream = Bits e Bytes -> Objeto
        A primeira para transformar o objeto em um fluxo de bits e bytes, e a segunda para fazer o caminho inverso.
         */

        //String nome = "Nico Steppat";

        // Transformar um objeto em um fluxo de bits e bites
        // Gravar objeto
        // ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
        // oos.writeObject(nome); // Serializar o objeto passando referencia
        // oos.close();

        // Converter bits e bites em objeto
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String nome = (String) ois.readObject();
        ois.close();
        System.out.println(nome);

    }
}
