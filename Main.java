abstract class Tool {
    private String name;
    public Tool(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public abstract void performFunction();
}

class Clipboard extends Tool {
    public Clipboard(String name) {
        super(name);
    }

    @Override
    public void performFunction() {
        System.out.println(getName() + " states: I keep things in order, holding everything neatly together.");
    }
}

class Calculator extends Tool {
    public Calculator(String name) {
        super(name);
    }

    @Override
    public void performFunction() {
        System.out.println(getName() + " declares: I solve problems, both big and small, with precision.");
    }
}

class Pen extends Tool {
    public Pen(String name) {
        super(name);
    }

    @Override
    public void performFunction() {
        System.out.println(getName() + " writes thoughtfully: I craft ideas into words, leaving a lasting mark.");
    }
}


public class Main {
    public static void main(String[] args) {
        Tool myClipboard = new Clipboard("Office Clipboard");
        Tool myCalculator = new Calculator("Scientific Calculator");
        Tool myPen = new Pen("Fountain Pen");

        myClipboard.performFunction(); 
        myCalculator.performFunction();
        myPen.performFunction();
    }
}
