public class Paper {
    private int maxSymbols;
    private int symbols;
    private String content;

    public Paper(int maxSymbols) {
        this.maxSymbols = maxSymbols;
        this.symbols = 0;
        this.content = "";
    }

    public int getMaxSymbols() {
        return this.maxSymbols;
    }
    public int getSymbols() {
        return this.symbols;
    }

    public void addContent(String message) throws OutOfSpace {
        if ( this.symbols + message.length() > this.maxSymbols ) {
            throw new OutOfSpace();
        }
        this.content += message;
        this.symbols = content.length();
    }

    public void show() {
        System.out.println(content);
    }


}
