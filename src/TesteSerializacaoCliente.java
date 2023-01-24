import java.io.*;

public class TesteSerializacaoCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

       // Cliente cliente = new Cliente();
       // cliente.setNome("Nico");
       // cliente.setProfissao("Dev");
       // cliente.setCpf("234113131");

        // Transformar um objeto em um fluxo de bits e bites
        // Gravar objeto
        // ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        // oos.writeObject(cliente); // Serializar o objeto passando referencia
        // oos.close();

        // Converter bits e bites em objeto
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente.getNome() + " " + cliente.getCpf());

    }
}
