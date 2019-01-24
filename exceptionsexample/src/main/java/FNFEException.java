import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FNFEException {

    public static void main(String[] args) {//throws FileNotFoundException//

        File file = new File("E:/file.txt");

    {
        try { //conteaza ordinea codului in try, nu cea din catch
            new SimpleDateFormat("MM,dd,yyyy").parse("invalid.date");
            FileReader fr = new FileReader(file);
            Thread.sleep(1000);
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("File was not found");
        } catch (InterruptedException e) {
            //e.printStackTrace();
            System.out.println("Thread exception");
        } catch (ParseException e) {
            //e.printStackTrace();
            System.out.println("Parse date exception");
        } finally {
            //se executa intotdeauna
            System.out.println("Finally block");
//            File was not found
//            Finally block

        }
    }
}
}
