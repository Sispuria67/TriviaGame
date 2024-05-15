package View;

import javax.swing.*;
import java.awt.*;

public class QuestionPanel extends JPanel {

    private final JRadioButton myRadioOne;
    private final JRadioButton myRadioTwo;
    private final JRadioButton myRadioThree;
    private final JRadioButton myRadioFour;

    private final JButton mySubmit;

    private final ButtonGroup buttonGroup;

    private final JLabel myQuestion;





    public QuestionPanel() {
        myRadioOne = new JRadioButton();
        myRadioTwo = new JRadioButton();
        myRadioThree = new JRadioButton();
        myRadioFour = new JRadioButton();
        myQuestion = new JLabel("Question: ");
        mySubmit = new JButton("Submit");

        buttonGroup = new ButtonGroup();
        buttonGroup.add(myRadioOne);
        buttonGroup.add(myRadioTwo);
        buttonGroup.add(myRadioThree);
        buttonGroup.add(myRadioFour);
        layoutComponents();





    }
//use radio buttons
    private void layoutComponents() {
        this.setBorder(BorderFactory.createTitledBorder("Trivia Question"));


  this.add(myQuestion);

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        this.add(myRadioOne);
        this.add(myRadioTwo);
        this.add(myRadioThree);
        this.add(myRadioFour);


        this.add(mySubmit);



        //JOptionPane.showMessageDialog(this, "The Question is: ");
    }


}
