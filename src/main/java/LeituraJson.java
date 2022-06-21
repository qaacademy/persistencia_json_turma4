import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class LeituraJson {

    public static void main(String[] args) throws FileNotFoundException {

        Gson gson = new Gson();//Biblioteca que contem os metodos pra manipular o Arquivo Json
        Reader reader;//É Pacote Java.IO
        Map<String, String> dadosTesteMap = new HashMap<>();//Map é uma estrutura Chave - Valor, que armazenar os valores do arquivo json.
        reader = new FileReader("src/main/resources/massaTeste.json"); //Faz a leitura do Json, e transforma em bit
        dadosTesteMap = gson.fromJson(reader, Map.class);

        System.out.println(dadosTesteMap.get("url"));
        System.out.println(dadosTesteMap.get("produto"));
        System.out.println(dadosTesteMap.get("dataInicio"));



    }
}
