import javax.microedition.lcdui.*;  
import javax.microedition.midlet.*;  

public class sec extends MIDlet implements CommandListener {  
    private Display display;  
    private Form form;  
    private boolean started = false;  

    protected void startApp() {  
        if (!started) {  
            display = Display.getDisplay(this);  
            form = new Form("sec");  
            form.append("Hello, this is Oumaima's Design Oasis web site!");  

            // Text  
            String[] choix = {"Graphic Design", "Product Design", "UX/UI Design"};  
            ChoiceGroup choiceGroup = new ChoiceGroup("Selectionner une option:", ChoiceGroup.EXCLUSIVE, choix, null);  
            form.append(choiceGroup);  

            // Date  
            DateField dateField = new DateField("Select a date:", DateField.DATE);  
            form.append(dateField);  

            // Text Field  
            form.append(new TextField("Enter votre nom:", "", 32, TextField.ANY));  

            // Progress Bar  
            Gauge gauge = new Gauge("Progress:", true, 100, 0);  
            form.append(gauge);  

            // Exit Command  
            Command exitCommand = new Command("Exit", Command.EXIT, 0);  
            form.addCommand(exitCommand);  
        }  

        form.setCommandListener(this);  
        display.setCurrent(form);  
        started = true;  
    }  

    protected void pauseApp() {}  

    protected void destroyApp(boolean unconditional) {  
        // Clean up resources, if any  
    }  

    public void commandAction(Command c, Displayable d) {  
        if (c.getCommandType() == Command.EXIT) {  
            destroyApp(true);  
            notifyDestroyed();  
        }  
    }  
}