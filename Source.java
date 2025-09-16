class Source {

    private String text;
    private int current;
    private int start;
    private int line;

    public Source(final String text) {
        this.text = text;
        this.current = 0;
        this.start = 0;
        this.line = 1;
    }

    public String lexeme() {

        return text.substring(start, current);
    }

    public char peek() {

        if (isAtEnd()) {
            return '\0';
        }

        return text.charAt(current);
    }
    
    public void advance() {

        current++;
    }

    public boolean isNotAtEnd() {
        return Boolean.FALSE.equals(isAtEnd());
    }

    public boolean isAtEnd() {
        return current >= text.length();
    }

    public void setStart(int index) {
        this.start = index;
    }

    public int getCurrent() {
        return current;
    }

    public int getStart() {
        return start;
    }


    public int getLine() {
        return line;
    }
}
