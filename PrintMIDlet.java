import javax.microedition.lcdui.*;  
import javax.microedition.midlet.*;  

public class PrintMIDlet extends MIDlet {  
    private Display display;  
    private Form helloForm;  

    public PrintMIDlet() {  
        helloForm = new Form("Hello! Midlet, I'm OUMAIMA ");  
    }  

    protected void startApp() {  
        display = Display.getDisplay(this);  
        display.setCurrent(helloForm);  
    }  

    protected void pauseApp() {}  

    protected void destroyApp(boolean unconditional) {}  
}