/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsoor;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
//improt javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class FXMLDocumentController implements Initializable {
    


    private TextField nm;

    private TextField nnm;

    private TextField pro;

    private TextField id;

    private TextField fnm;

    private TextField mnm;

    private TextField rid;

    private TextField rpn;





    private TextField nid;
    @FXML
    private AnchorPane mainAnchorPane;


  
    void IMGCHOOSER(ActionEvent event){
        
                    try 
         {
             
            String url="jdbc:mysql://localhost:3306/student";
        String uname="root";
        String pass="";
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
            Statement st=con.createStatement();
           
                 String sq= " INSERT INTO ut"
              + "(id, type, name, nname, profession, fname, mname, rname, rphone,nid )"
              + " VALUES (' "+id.getText()+ " ',' null ',' "+nm.getText()+ " ',' "+nnm.getText()+ " ',' "+pro.getText()+ " ',' "+fnm.getText()+ " ',' "+mnm.getText()+ " ',' "+rid.getText()+ " ',' "+rpn.getText()+ " ',' "+nid.getText()+ " ')"; 
            st.execute(sq);
            System.out.println("eeeee");
      
         } catch (  ClassNotFoundException | SQLException e) {
             System.out.println("errror:"+e);
                                                    }
         
            
     } 

    
    //report
    void getreport(ActionEvent event) {
         try {
           
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("report1.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
         } catch (Exception e) {
             System.out.println("error"+e);
         }

    }
    //search
    
    //input
    void getbgp(ActionEvent event) {
         try {
             //  ((Stage)(((Node)event.getSource()).getScene().getWindow())).close();
             System.out.println("this is working on bgp");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("bgp.fxml"));
        Parent r1=(Parent) fl.load();
   
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
      
         } catch (Exception e) {
             System.out.println("error in cuting in the menu item "+e);
         }

    }
    
    
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

/////start
    @FXML
    private void getnewapplication(ActionEvent event) {
          try {
             System.out.println("yes the fatching new application page is working");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("app11.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
        
         ((Stage)(((MenuBar)event.getSource()).getScene().getWindow())).close();
         } catch (Exception e) {
             System.out.println("error IN :"+e);
         }
    }

    @FXML
    private void getreport2(ActionEvent event) {
         try {
             System.out.println("oh no");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("REPORT1.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
      //   ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
         } catch (Exception e) {
             System.out.println("error"+e);
         }
    }

    @FXML
    private void getsms2(ActionEvent event) {
          try {
             System.out.println("oh no");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("SMS.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
       // Platform.exit();
        
        // ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
         } catch (Exception e) {
             System.out.println("error"+e);
         }
    }

    @FXML
    private void getsearch2(ActionEvent event) {
          try {
           
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("search.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
        ((Stage)(((MenuBar)event.getSource()).getScene().getWindow())).close();
         } catch (Exception e) {
             System.out.println("error"+e);
         }
    }

    private void getfile2(ActionEvent event) {
          try {
            // System.out.println("oh no");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("application_lot_reg.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
         //((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
         } catch (Exception e) {
             System.out.println("error"+e);
         }
    }

    @FXML
    private void getupdate2(ActionEvent event) {
           try {
           
             System.out.println("oh no");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("update.fxml"));
 Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
        
        
         } catch (Exception e) {
             System.out.println("error in update"+e);
         }
    }

    @FXML
    private void getbgp2(ActionEvent event) {
         try {
             System.out.println("oh no");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("bgp.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
         } catch (Exception e) {
             System.out.println("error"+e);
         }
    }

    private void getremindcardissue2(ActionEvent event) {
         try {
             System.out.println("oh no");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("Reminder_card_issue.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
       //  ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
         } catch (Exception e) {
             System.out.println("error"+e);
         }
    }
    
      void GETINPUTSAVE(ActionEvent event) {

    }

    @FXML
    private void table_new(ActionEvent event) {
      try {
             System.out.println("oh no");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("certificate.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
         } catch (Exception e) {
             System.out.println("TABLE _NEW"+e);
         }
    }

    @FXML
    private void getNewFlie(ActionEvent event) {
        try {
              Stage tage=new Stage();
             
             System.out.println("working on home");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("home.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
         tage.close();
         } catch (Exception e) {
             System.out.println("working on home :"+e);
         }
    }

    private void getNewFlie(Event event) {
         try {
             
             System.out.println("working on home");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("certificate.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
         } catch (Exception e) {
             System.out.println("working on home :"+e);
         }
    }

    @FXML
    private void calling_website(ActionEvent event) {
    try {
         
        Desktop.getDesktop().browse(new URI("http://utsorgo.epizy.com/"));
         
    } catch (IOException | URISyntaxException e1) {
        e1.printStackTrace();
    }
    }
    
    
}
