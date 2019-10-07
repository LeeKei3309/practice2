import java.io.*;
import java.util.Scanner;
/**
 * クラス FileReader の注釈をここに書きます.
 * 
 * @author (모리모토 케이2018190042 오타 오아키 2018315058)
 * @version (バージョン番号もしくは日付)
 */
public class FileReader
{
    public static void main(String[] args){
        FileReader fin = null;
        try{
            File file = new File("txt file");
            FileReader filereader = new FileReader(file);
            HashMap<String,String> capitalCities = new HashMap<String,String>();
            Scanner scanner = new Scanner(new FileReader("words.txt"));
            while(scanner.hasNext()){
                String word = scanner.nextLine();
                wordVector.add(word);
            }
        }catch(IOException e){
            System.out.println("입출력 오류");{
            }

        }
    }
}
