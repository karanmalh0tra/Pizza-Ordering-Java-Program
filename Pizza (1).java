/* Pizza.java
   An applet to illustrate some GUI components with a pizza 
   order form
   */
import java.awt.*;
import java.applet.*;
import javax.swing.*;

public class Pizza extends JApplet {
    Container contentPane = getContentPane();

    public void init() {

// Create a panel object and set its layout manager to put
// the components in a column

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(20, 1, 10, 10));
        myPanel.setBackground(Color.cyan);

// Create a label for the form heading and add it to the panel

        Label myLabel = new Label("Pizza Order Form");
        myPanel.add(myLabel);

// Create a text field for the customer's name and
//  address and add them to the panel

        JLabel nameLabel = new JLabel("Name:");
        JTextField myName = new JTextField(30);
        JLabel addrLabel = new JLabel("Address:");
        JTextField myAddr = new JTextField(30);
        myPanel.add(nameLabel);
        myPanel.add(myName);
        myPanel.add(addrLabel);
        myPanel.add(myAddr);
      
// Create radio buttons for pizza size and add them to the panel

        JLabel sizeLabel = new JLabel("Pizza Size");
        ButtonGroup sizeGroup = new ButtonGroup();
        JRadioButton s1 = new JRadioButton("small");
        JRadioButton s2 = new JRadioButton("medium");
        JRadioButton s3 = new JRadioButton("large", true);

// Put the radio buttons in the button group

        sizeGroup.add(s1);
        sizeGroup.add(s2);
        sizeGroup.add(s3);

// Put the radio buttons in the panel

        myPanel.add(sizeLabel);
        myPanel.add(s1);
        myPanel.add(s2);
        myPanel.add(s3);

// Create checkboxes for toppings and add them to the panel

        JLabel topLabel = new JLabel("Toppings");
        Checkbox top1 = new Checkbox("sausage");
        Checkbox top2 = new Checkbox("pepperoni");
        Checkbox top3 = new Checkbox("extra cheese");
        Checkbox top4 = new Checkbox("hamburger");
        Checkbox top5 = new Checkbox("olives");
        Checkbox top6 = new Checkbox("mushrooms");
        myPanel.add(topLabel);
        myPanel.add(top1);
        myPanel.add(top2);
        myPanel.add(top3);
        myPanel.add(top4);
        myPanel.add(top5);
        myPanel.add(top6);


// Now add the panel to the content pane

        contentPane.add(myPanel);

    }  // End of init()
} // End of the Pizza applet

