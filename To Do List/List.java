import javax.swing.*;
import java.awt.*;

public class List extends JPanel {
    public List(){
        GridLayout Layout = new GridLayout(10,1);
        Layout.setVgap(5);
        this.setLayout(Layout);

    }
    public void indexnum(){
        Component[] listcomp = this.getComponents();
        for (int i = 0; i < listcomp.length; i++) {
            if(listcomp[i] instanceof Task){
                ((Task)listcomp[i]).writeindexj1(i+1);
            }
        }
    }
}
