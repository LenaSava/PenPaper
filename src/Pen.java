public class Pen {
    private int inkAmount;
    private int inkCapacity;
//    private Paper paper;

    public Pen(int inkCapacity) {
        this.inkAmount = inkCapacity;
        this.inkCapacity = inkCapacity;
        System.out.println("Pan is alive!");
    }


    public int getInkAmount() {
        return this.inkAmount;
    }
    public int getInkCapacity() {
        return this.inkCapacity;
    }

    public void write(Paper paper, String message) throws OutOfInk, OutOfSpace {
        if ( this.inkAmount == 0 ) {
            throw new OutOfInk();
        }

        if ( message.length() > inkAmount ) {
            paper.addContent(message.substring(0, inkAmount));
            inkAmount = 0;
            return;
        }
        paper.addContent(message);
        inkAmount -= message.length();
    }

    public void refill() {
        this.inkAmount = this.inkCapacity;
    }

}
