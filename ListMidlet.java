import javax.microedition.midlet.*;  
import javax.microedition.lcdui.*;  

public class ListMidlet extends MIDlet {  
    private Display display;  
    private List list;  

    protected static final String[] items = {"UX/UI Design", "Graphic Design", "Products Design", "Data visualization Design"};  

    public ListMidlet() {  
        this.display = Display.getDisplay(this);  
        this.list = new List("Selection", List.IMPLICIT, items, null);  
    }  

    protected void startApp() {  
        display.setCurrent(list);  
    }  

    protected void pauseApp() {}  

    protected void destroyApp(boolean unconditional) {}  
}