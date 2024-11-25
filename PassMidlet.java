import javax.microedition.lcdui.*;  
import javax.microedition.midlet.*;  

public class PassMidlet extends MIDlet {  
    String str2;  
    private Display display;  
    private TextBox textbox;  

    public PassMidlet() {  
        this.display = Display.getDisplay(this);  
        this.textbox = new TextBox("Titre du texte", "Bonjour", 20, TextField.PASSWORD);   
        str2 = textbox.getString();  
    }  

    protected void startApp() {  
        display.setCurrent(textbox);   
        System.out.println(str2);  
    }  

    protected void pauseApp() {}  

    protected void destroyApp(boolean unconditional) {}  
}