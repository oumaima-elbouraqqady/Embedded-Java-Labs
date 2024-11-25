import javax.microedition.midlet.*;  
import javax.microedition.lcdui.*;  

public class OumaMidlet extends MIDlet {  
    private Display display;  
    private Form mainForm;  
    private StringItem Msg;  
    private Ticker t;  

    public OumaMidlet() {  
        display = Display.getDisplay(this);  
        mainForm = new Form("Ouma's Form");  
        t = new Ticker("Be careful, a Tiger is coming");  
        Msg = new StringItem("", "A Tiger");  

        mainForm.append(Msg);  
        // mainForm.addCommand(cmdExit);  

        // mainForm.setCommandListener(this);  
        try {  
            Image img = Image.createImage("/images/tiger.jpg");  
            mainForm.append(new ImageItem(null, img, ImageItem.LAYOUT_CENTER, null));  
            display.setCurrent(mainForm);  
        } catch (java.io.IOException e) {  
            e.printStackTrace();  
        }  
    }  

    public void startApp() {  
        mainForm.setTicker(t);  
        display.setCurrent(mainForm);  
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