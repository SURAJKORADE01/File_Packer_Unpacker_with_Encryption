import java.awt.*;
import java.awt.event.*;

class MainFrame extends Frame implements ActionListener 
{
    Label userName, passWord, message;
    TextField userText, passText;
    Button submit;

    int attempts = 0;

    MainFrame() 
    {
        // Set up the frame
        setTitle("File Packer Unpacker - Login");
        setSize(400, 200);
        setLayout(new GridLayout(4, 2));

        // Create components
        userName = new Label("Username:");
        passWord = new Label("Password:");
        message = new Label();
        userText = new TextField();
        passText = new TextField();
        passText.setEchoChar('*');
        submit = new Button("Login");

        // Add components to the frame
        add(userName);
        add(userText);
        add(passWord);
        add(passText);
        add(new Label());
        add(submit);
        add(message);

        // Add action listener
        submit.addActionListener(this);

        // Close the window on clicking the close button
        addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent windowEvent) 
            {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) 
    {
        String username = userText.getText();
        String password = passText.getText();

        if (authenticate(username, password)) 
        {
            // Open new window with options
            new OptionFrame();
            dispose();
        } 
        
        else 
        {
            attempts++;
            message.setText("Invalid login. Attempts left: " + (3 - attempts));

            if (attempts == 3) {
                message.setText("Maximum attempts reached. Exiting...");
                try {
                    Thread.sleep(1000); // Display message for 2 seconds
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                System.exit(0);
            }
        }
    }

    // Dummy authentication function, replace with actual authentication logic
    private boolean authenticate(String username, String password) {
        return username.equals("admin") && password.equals("admin");
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
