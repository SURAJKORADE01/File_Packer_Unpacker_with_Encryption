import java.awt.*;
import java.awt.event.*;

class UnpackFrame extends Frame implements ActionListener {
    Label fileLabel;
    TextField fileText;
    Button submit;

    UnpackFrame() {
        setTitle("File Unpacker - Unpacking");
        setSize(400, 150);
        setLayout(new GridLayout(2, 2));

        fileLabel = new Label("Packed File Name:");
        fileText = new TextField();
        submit = new Button("Unpack");

        add(fileLabel);
        add(fileText);
        add(new Label());
        add(submit);

        submit.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String packedFileName = fileText.getText();

        // Call the Unpacker class
        Unpacker.main(new String[]{packedFileName});
    }
}
