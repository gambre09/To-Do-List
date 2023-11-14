import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;

    public class TitleBar extends JPanel{
        JLabel TitleText = new JLabel("To Do List");
        public TitleBar(){
            this.setPreferredSize(new Dimension(400,100));
            this.setBackground(new Color(96, 196, 164));

            TitleText.setPreferredSize(new Dimension(200,80));
            TitleText.setFont(new Font("Sans-serif", Font.BOLD,30));
            TitleText.setHorizontalAlignment(JLabel.CENTER);
            this.add(this.TitleText);
        }
    }
