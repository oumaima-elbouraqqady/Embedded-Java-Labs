import javax.microedition.lcdui.*;  
import javax.microedition.midlet.*;  

public class midletjouj extends MIDlet implements CommandListener {  
    private Display display;  
    private Form form;  
    private boolean started = false;  

    public midletjouj() {}  

    protected void startApp() {  
        if (!started) {  
            display = Display.getDisplay(this);  
            form = new Form("Item Layout");  
            form.append("Hello");  
            form.append("World\n");  
            form.append("Let's start \n a new line\n");  
            form.append("Second line");  
            form.append(new TextField("Name", "Said", 32, TextField.ANY));  
            form.append("Address");  
            form.append(new TextField(null, null, 32, TextField.ANY));  
            display.setCurrent(form);  
            started = true;  
        }  
    }  

    protected void pauseApp() {}  

    protected void destroyApp(boolean unconditional) {}  

    public void commandAction(Command c, Displayable d) {  
        if (c.getCommandType() == Command.EXIT) {  
            destroyApp(true);  
            notifyDestroyed();  
        }  
    }  
}