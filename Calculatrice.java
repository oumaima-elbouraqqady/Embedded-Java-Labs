import javax.microedition.midlet.*;  
import javax.microedition.lcdui.*;  

public class Calculatrice extends MIDlet implements CommandListener {  
    private Command exitCommand; // The exit command  
    private Display display; // The display for this MIDlet  
    private Command add, sub, mul, div, mod;  
    private TextField t1, t2, t3;  
    private Form form;  

    public Calculatrice() {  
        display = Display.getDisplay(this);  
        exitCommand = new Command("Exit", Command.EXIT, 30);  
        add = new Command("Add", Command.SCREEN, 1);  
        sub = new Command("Sub", Command.SCREEN, 2);  
        mul = new Command("Mul", Command.SCREEN, 3);  
        div = new Command("Div", Command.SCREEN, 4);  
        mod = new Command("Mod", Command.SCREEN, 5);  
        form = new Form("");  
        form.addCommand(add);  
        form.addCommand(sub);  
        form.addCommand(mul);  
        form.addCommand(div);  
        form.addCommand(mod);  
        form.addCommand(exitCommand);  
        t1 = new TextField("Num1", "Default Text", 30, TextField.ANY);  
        t2 = new TextField("Num2", "Default Text", 30, TextField.ANY);  
        t3 = new TextField("Answer", "Default Text", 30, TextField.ANY);  
        form.append(t1);  
        form.append(t2);  
        form.append(t3);  
        form.setCommandListener(this);  
    }  

    public void startApp() {  
        TextBox tb = new TextBox("Hello", "Hello, World!", 256, 0);  
        display.setCurrent(form);  
    }  

    public void pauseApp() {}  

    public void destroyApp(boolean unconditional) {}  

    public void commandAction(Command c, Displayable s) {  
        double sum;  
        if (c == exitCommand) {  
            destroyApp(false);  
            notifyDestroyed();  
        }  

        if (c == add) {  
            double x = Double.parseDouble(t1.getString());  
            double y = Double.parseDouble(t2.getString());  
            sum = x + y;  
            t3.setString("" + sum);  
        }  
        
        if (c == sub) {  
            double x = Double.parseDouble(t1.getString());  
            double y = Double.parseDouble(t2.getString());  
            sum = x - y;  
            t3.setString("" + sum);  
        }  

        if (c == mul) {  
            double x = Double.parseDouble(t1.getString());  
            double y = Double.parseDouble(t2.getString());  
            sum = x * y;  
            t3.setString("" + sum);  
        }  

        if (c == div) {  
            double x = Double.parseDouble(t1.getString());  
            double y = Double.parseDouble(t2.getString());  
            sum = x / y;  
            t3.setString("" + sum);  
        }  

        if (c == mod) {  
            double x = Double.parseDouble(t1.getString());  
            double y = Double.parseDouble(t2.getString());  
            sum = x % y;  
            t3.setString("" + sum);  
        }  
    }  
}