package Stack;

public class ReverseWord {
    private String[] input;
    private int maxSize;
    private int top;


    public ReverseWord(String in) {
        this.input = in.split("");
        this.maxSize = this.input.length;
        this.top = maxSize - 1;
    }

    public boolean isEmpty() {
        return (this.top == -1);
    }

    public void getString() {
        while (!isEmpty()) {
            System.out.print(this.pop());
        }
        System.out.println("");
    }

    public String pop() {
        return this.input[this.top--];
    }


}
