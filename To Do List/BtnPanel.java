import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BtnPanel extends JPanel{
    private JButton addtask;
    private JButton clear;

    Border emptyborder = BorderFactory.createEmptyBorder();

    public BtnPanel(){
        this.setPreferredSize(new Dimension(400,80));
        this.setBackground(new Color(129,202,207));

        addtask = new JButton("Add Task");
        addtask.setPreferredSize(new Dimension(120, 50));
        addtask.setBorder(emptyborder);
        addtask.setFont(new Font("Sans-serif", Font.PLAIN,20));
        this.add(addtask);

        this.add(Box.createHorizontalStrut(20));

        clear = new JButton("Clear All Tasks");
        clear.setPreferredSize(new Dimension(180, 50));
        clear.setBorder(emptyborder);
        clear.setFont(new Font("Sans-serif", Font.PLAIN,20));
        this.add(clear);

    }
    public JButton getAddtaskbtn(){
        return addtask;
    }
    public JButton getclearbtn(){
        return clear;
    }
}
