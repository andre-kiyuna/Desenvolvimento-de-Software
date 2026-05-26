/*import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Pessoa p1 = new Pessoa("Neymar Junior", "857.984.398-90", "10/08/1988");
        Pessoa p2 = new Pessoa("Cristiano Ronaldo", "873.244.190-95", "20/01/1984");
        Pessoa p3 = new Pessoa("Lionel Messi", "857.984.564.90", "02/10/1986");
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        System.out.println("Array sem ordenação: \n" + pessoas);
        Collections.sort(pessoas);
        System.out.println("Array ordenado: \n" + pessoas);

        // Busca binária
        Pessoa p4 = new Pessoa("Ronaldo de Assis", "857.984.786.90", "01/09/1982");
        System.out.println("Buscar nome "+ p4.getNome()+ ": "+ Collections.binarySearch(pessoas, p4));

        Pessoa p5 = new Pessoa("Ronaldo Nazário", "857.984.918.90", "01/09/1980");
        Pessoa p6 = new Pessoa("Romário Faria", "857.984.128.90", "01/09/1978");
        Pessoa p7 = new Pessoa("Arthur Coimbra", "857.984.341.90", "01/09/1976");

        ArrayList<Pessoa> pessoas2 = new ArrayList<>();
        pessoas2.add(p5);
        pessoas2.add(p6);
        pessoas2.add(p7);

        Collections.sort(pessoas2);
        // Busca disjunção nos arrays
        System.out.println("Conjuntos disjuntos? "+ Collections.disjoint(pessoas, pessoas2));
        pessoas2.add(p1);
        System.out.println("Depois de add p1 - Conjuntos disjuntos? "+ Collections.disjoint(pessoas, pessoas2));

        System.out.println("Frequência de nome: "+ p1.getNome() + Collections.frequency(pessoas, p1));
        Collections.reverse(pessoas2);
        System.out.println("Array após Collections.reverse: " + pessoas2);
    }
}
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.classfile.BufWriter;
import java.util.ArrayList;
import java.util.Collections;

import javax.imageio.plugins.bmp.BMPImageWriteParam;

public class App{
    public static void main(String[] args) throws Exception{
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        FileReader fl = new FileReader("src/cadastro_pessoas.csv");
        BufferedReader br = new BufferedReader(fl);
        String line = null;
        br.readLine(); // descarta linha 1
        while ((line = br.readLine()) != null){
            String dados[] = line.split(","); // quebra linha a cada ,
            Pessoa p = new Pessoa(dados[0], dados[1], dados[2]);
            pessoas.add(p);
        }
        br.close();
        System.out.println(pessoas.size() + " Pessoas cadastradas no sistema");
        Pessoa p2 = new Pessoa("Edson Nascimento", "857.984.341.90", "22/08/1974");
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/cadastropessoas.csv", true));
        bw.write(p2.escreveObjetoCsv());
        bw.close();
    }
}