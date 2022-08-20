
package ingresados;

public class ingresados {
    
    private String nombre;
    private String apellido;
    private String dpi;
    private String nit;

    public ingresados() {
    }

    public ingresados(String nombre, String apellido, String dpi, String nit) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dpi = dpi;
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    
    
}
