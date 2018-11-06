public class Main {

    static public void main(String[] args) throws OutOfSpace, OutOfInk{

        Pen pen = new Pen(50);

        Paper paper = new Paper(500);

        pen.write(paper, "hello kitty!");

        pen.refill();
        paper.show();
    }

}
