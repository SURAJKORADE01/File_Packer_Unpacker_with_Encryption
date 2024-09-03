import java.awt.*;
import java.awt.event.*;

class OptionFrame extends Frame implements ActionListener 
{
    Button packButton, unpackButton;

    OptionFrame() {
        setTitle("File Packer Unpacker - Options");
        setSize(300, 100);
        setLayout(new FlowLayout());

        packButton = new Button("Pack");
        unpackButton = new Button("Unpack");

        add(packButton);
        add(unpackButton);

        packButton.addActionListener(this);
        unpackButton.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == packButton) {
            new PackFrame();
        } else if (e.getSource() == unpackButton) {
            new UnpackFrame();
        }
    }
}
