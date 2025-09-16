
import java.util.List;

class Scanner {

    private final Source source;
    private final Chunk chunk;

    public Scanner(String text) {
        this.source = new Source(text);
        this.chunk = new Chunk();
    }

    public List<Token> scan() {
        
        while(source.isNotAtEnd()) {
            
            source.setStart(source.getCurrent());
            source.advance();
            char c = source.peek();
            analyze(c);
        }
        
        chunk.push(TokenType.EOF, source.getLine());
        
        return chunk.getTokens();
    }

    private void analyze(char c) {

        switch (c) {
            case '(': addToken(TokenType.LEFT_PARENTHESIS); break;
            case ')': addToken(TokenType.RIGHT_PARENTHESIS); break;
            case '{': addToken(TokenType.LEFT_CURLY_BRACE); break;
            case '}': addToken(TokenType.RIGHT_CURLY_BRACE); break;
            case ',': addToken(TokenType.COMMA); break;
            case '.': addToken(TokenType.DOT); break;
            case '-': addToken(TokenType.MINUS); break;
            case '+': addToken(TokenType.PLUS); break;
            case ';': addToken(TokenType.SEMICOLON); break;
            case '*': addToken(TokenType.STAR); break; 
            default: {
                Error.with(source.getLine(), "Unexpected character.");
                break;
            }
        }
    }

    private void addToken(TokenType type) {

        chunk.push(type, source.lexeme(), source.getLine());
    }
}