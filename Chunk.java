import java.util.List;

class Chunk {


    private List<Token> tokens;

    public Chunk() {
        this.tokens = new java.util.ArrayList<>();
    }


    public void push(TokenType type, int line) {
        tokens.add(new Token(type, "", null, line));
    }

    public void push(TokenType type, String text, int line) {
        tokens.add(new Token(type, text, null, line));
    }

    public List<Token> getTokens() {
        return tokens;
    }
}   