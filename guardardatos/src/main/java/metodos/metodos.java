
package metodos;
import java.util.Vector;
import ingresados.ingresados;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.*;

public class metodos {
    
    Vector vPrincipal = new Vector ();
    
    public void guardar(ingresados uningresados){
        vPrincipal.addElement(uningresados);
    }
    
    public void guardarArchivo(ingresados ingresados){
        try {
           FileWriter fw = new FileWriter("Ingresados.txt",true);
           BufferedWriter bw = new BufferedWriter(fw);
           PrintWriter pw = new PrintWriter(bw);
           pw.print(""+ingresados.getNombre());
           pw.print("|"+ingresados.getApellido());
           pw.print("|"+ingresados.getDpi());
           pw.print("|"+ingresados.getNit());
           pw.close();
           
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
        public DefaultTableModel listaingresados(){
            Vector cabeceras = new Vector();
            cabeceras.addElement("Nombre");
            cabeceras.addElement("Apellido");
            cabeceras.addElement("DPI");
            cabeceras.addElement("NIT");
            
            DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras,0);
            
            try{
                FileReader fr = new FileReader("ingresados.txt");
                BufferedReader br = new BufferedReader(fr);
                String d;
                while((d=br.readLine())!=null){
                    StringTokenizer dato = new StringTokenizer(d,"|");
                    Vector x = new Vector();
                    while(dato.hasMoreTokens()){
                        x.addElement(dato.nextToken());
                    }
                    mdlTabla.addRow(x);
                    
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            return mdlTabla;
        }
    }

