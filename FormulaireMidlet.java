import javax.microedition.midlet.*;  
import javax.microedition.lcdui.*;  

public class FormulaireMidlet extends MIDlet implements CommandListener {  
    private Display display;  
    private Form form;  
    private boolean started = false;  

    public FormulaireMidlet() {}  

    protected void startApp() {  
        if (!started) {  
            display = Display.getDisplay(this);  
            form = new Form("Item Layout");  
            form.append("Salut");  
            form.append("GSEII 2");  
            form.append("\nCeci est un formulaire");  
            form.append("\nVeuillez saisir vos informations");  
            form.append(new TextField("Nom d'utilisateur", null, 32, TextField.ANY));  
            form.append(new TextField("Email", null, 32, TextField.ANY));  
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