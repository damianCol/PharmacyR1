package FlatFiles;

import Logic.DatesCustomer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel Higuera
 * @date 2016
 */
public class FlatFileCustomer {
  private File file =null;
  private FileReader fr = null;
  private BufferedReader br = null;
  private FileWriter fw = null;
  private PrintWriter pw = null; 

    public FlatFileCustomer() {
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public FileReader getFr() {
        return fr;
    }

    public void setFr(FileReader fr) {
        this.fr = fr;
    }

    public BufferedReader getBr() {
        return br;
    }

    public void setBr(BufferedReader br) {
        this.br = br;
    }

    public FileWriter getFw() {
        return fw;
    }

    public void setFw(FileWriter fw) {
        this.fw = fw;
    }

    public PrintWriter getPw() {
        return pw;
    }

    public void setPw(PrintWriter pw) {
        this.pw = pw;
    }
 
    public List<DatesCustomer> readFile(String filename,String separator){
       List<DatesCustomer> clientList = new ArrayList<>();
    try {
          this.setFile(new File(filename));
          this.setFr(new FileReader(this.getFile()));
          this.setBr(new BufferedReader(this.getFr()));
          String record;
          SimpleDateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy");
          while((record = this.getBr().readLine())!=null){
             String fields[] = record.split(separator);
             DatesCustomer client = new DatesCustomer();
             client.setId(Long.parseLong(fields[0]));
             client.setName(fields[1]);
             client.setLastName(fields[2]);
             client.setPhoto(fields[3]);
             char gender = fields[4].charAt(0);
             client.setGender(gender);
             client.setDateBirth(dateFormat.parse(fields[5]));
             clientList.add(client);
          }
          this.getBr().close();
          this.getFr().close();
      } catch (FileNotFoundException fnfex){
         
      }
       catch (IOException | ParseException  ex) {
          Logger.getLogger(FlatFileCustomer.class.getName()).log(Level.SEVERE, null, ex);
      }
       return clientList;
    }
    
    public void writeFile(List<DatesCustomer> clientList,String filename, String separator){
      SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
          this.setFw(new FileWriter(filename)); //El true sirve para adicionar información 
          this.setPw(new PrintWriter(this.getFw()));
          
          for (DatesCustomer client : clientList) //Con esto se recorre la lista
          {
            this.getPw().print(client.getId() + separator);
            this.getPw().print(client.getName() + separator);
            this.getPw().print(client.getLastName()+ separator);
            this.getPw().print(client.getPhoto()+ separator);
            this.getPw().print(client.getGender() + separator);
            this.getPw().print(dateFormat.format(client.getDateBirth())+ separator);;
          }
          this.getPw().close();
          this.getFw().close();
      } catch (IOException ex) {
          Logger.getLogger(FlatFileCustomer.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

  
}
