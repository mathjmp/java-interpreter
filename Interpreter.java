
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
        final Scanner scanner = new Scanner();

        while(true) {
            
            System.out.print("> ");
            String line = reader.readLine();
            List<Token> tokens = scanner.scan(line);
            System.out.println(tokens);
        }
    }
}