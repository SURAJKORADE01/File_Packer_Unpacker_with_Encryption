1. Name of the project: File Packer Unpacker with Encryption

2. Technology used: Java Programming

3. User interface used: Graphical User Interface

4. Platform required: Windows NT platform or Linux

5. Architectural requirement: Intel 32-bit processor

6. Features provided by File Packer-Unpacker: Using this project, we can fetch data from all files and merge them into one file. Additionally, we can extract all packed files whenever required.

7. Purpose of the project: The main purpose of this project is to merge a large number of files into one file, avoiding memory wastage. We also provide data security using the concept of encryption.

8. Description:

    i) This project is used to perform packing and unpacking activities for multiple types of files.
    
    ii) In this project, I have used Java as the front-end as well as the back-end for platform independence.
    
    iii) The frontend of the project is created using Java AWT (Abstract Window Toolkit). The AWT provides a set of APIs for creating and managing GUI components like windows, text fields, buttons, etc.
    
    iv) The backend of the project works in two different parts. The first part performs the packing activity, and the second part performs the unpacking activity.
    
    v) Four windows are created in this project. The first window is the authentication window. In this window, we accept the username and password from the user for authentication purposes. When the user submits the username and password, we check whether the credentials are correct. If the username or password is incorrect, we provide three attempts to the user. If the user is unable to provide the correct username and password in three attempts, we close the project.
    
    vi) After successful authentication, we open the second window, which displays two options: Pack and Unpack.
    
    vii) When the user presses the Pack button, we open the third window, which accepts the name of the directory to be packed and the name of the packed file from the user.
    
    viii) The name of the packed file is newly created and contains the data and metadata of all files from the specified directory.
    
    ix) When the user clicks the Submit button, we perform the “Packing Activity.” After that, the previous window is displayed, which contains two options: Pack and Unpack.
    
    x) When the user clicks the Unpack button, we open the fourth window, which accepts the name of the packed file from the user.
    
    xi) When the user clicks the Extract Here button, we perform the “Unpacking Activity.”

    xii) Packing Activity: 
   
        • In the case of the packing activity, we accept the directory name and file name from the user.
        • We create a new regular file with the name specified by the user.
        • Now, open the directory and traverse each file from that directory. In the newly created file, write metadata as a header and actual file data in sequence.
        • While writing data, perform encryption.
        • Each file's name, size, and checksum should be written in a log file, which gets created in the system directory.
        • After packing, display the packing report.

    xiii) Unpacking Activity:

       • In the case of the unpacking activity, we accept the packed file name from the user.
       • For authentication of the packed file, use any logic like a Magic Number, which gets added at the beginning of the packed file.
       • Open the packed file in read mode and perform the following activities:
           • Reading the header.
           • From the name specified in the header, create a new file.
           • Write data into the newly created file from the packed file.
           • Repeat all the above steps until we reach the end of the packed file.
       • After unpacking, display the unpacking report.
