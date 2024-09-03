import java.awt.*;
import java.awt.event.*;

class PackFrame extends Frame implements ActionListener {
    Label dirLabel, fileLabel;
    TextField dirText, fileText;
    Button submit;

    PackFrame() {
        setTitle("File Packer - Packing");
        setSize(400, 200);
        setLayout(new GridLayout(3, 2));

        dirLabel = new Label("Directory Name:");
        fileLabel = new Label("Packed File Name:");
        dirText = new TextField();
        fileText = new TextField();
        submit = new Button("Pack");

        add(dirLabel);
        add(dirText);
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
        String directoryName = dirText.getText();
        String packedFileName = fileText.getText();

        // Call the Packer class
        Packer.main(new String[]{directoryName, packedFileName});
    }
}
