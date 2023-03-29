public class Main {
    public static void main(String[] args) throws Exception {

        Persona persona = new Persona();
        persona.setEdad(34);
        persona.setNombre("Federico");
        persona.setTelefono(3516808968l);

        System.out.println("Edad: " +persona.getEdad());
        System.out.println("Nombre: " +persona.getNombre());
        System.out.println("Telefono: " +persona.getTelefono());

    }
}

class Persona {

    private int edad;
    private String nombre;
    private long telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(long telefono){
        this.telefono = telefono;
    }

    public long getTelefono(){
        return this.telefono;
    }

}
