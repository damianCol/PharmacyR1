package FlatFiles;

import Logic.ProductSale;
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
public class FlatFileSale {
  private File file =null;
  private FileReader fr = null;
  private BufferedReader br = null;
  private FileWriter fw = null;
  private PrintWriter pw = null; 

    public FlatFileSale() {
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
 
    public List<ProductSale> readFile(String filename,String separator){
       List<ProductSale> productList = new ArrayList<>();
    try {
          this.setFile(new File(filename));
          this.setFr(new FileReader(this.getFile()));
          this.setBr(new BufferedReader(this.getFr()));
          String record;
          SimpleDateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy");
          while((record = this.getBr().readLine())!=null){
             String fields[] = record.split(separator);
             ProductSale product = new ProductSale();
             product.setId(Long.parseLong(fields[0]));
             product.setName(fields[1]);
             product.setPhoto(fields[2]);
             product.setKind_of_product((fields[3]));
             product.setDate_of_admission(dateFormat.parse(fields[4]));
             product.setPrice(Integer.parseInt(fields[5]));
             productList.add(product);
          }
          this.getBr().close();
          this.getFr().close();
      } catch (FileNotFoundException fnfex){
         
      }
       catch (IOException | ParseException  ex) {
          Logger.getLogger(FlatFileSale.class.getName()).log(Level.SEVERE, null, ex);
      }
       return productList;
    }
    
    public void writeFile(List<ProductSale> productList,String filename, String separator){
      SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
          this.setFw(new FileWriter(filename)); //El true sirve para adicionar información 
          this.setPw(new PrintWriter(this.getFw()));
          
          for (ProductSale product : productList) //Con esto se recorre la lista
          {
            this.getPw().print(product.getId() + separator);
            this.getPw().print(product.getName() + separator);
            this.getPw().print(product.getPhoto()+ separator);
            this.getPw().print(product.getKind_of_product() + separator);       
            this.getPw().print(dateFormat.format(product.getDate_of_admission())+ separator);
            this.getPw().println(product.getPrice() + separator);
          }
          this.getPw().close();
          this.getFw().close();
      } catch (IOException ex) {
          Logger.getLogger(FlatFileSale.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

  
}
