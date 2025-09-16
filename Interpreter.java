
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

class Interpreter {
 
    public static void start(String[] args) {

        try {

            if (args.length > 1) {
                System.exit(64);;
            }

            if (args.length == 1) {
                
                return;
            }
            
            interactive();

        } catch(IOException ex) {

        }

    }

    public static void interactive() throws IOException {

        final InputStreamReader input = new InputStreamReader(System.in);
        final BufferedReader reader = new BufferedReader(input);
       
        while(true) {
            
            System.out.print("> ");
            String line = reader.readLine();
            final Scanner scanner = new Scanner(line);
            List<Token> tokens = scanner.scan();
            System.out.println(tokens);
        }
    }
}