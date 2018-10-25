
package Actores;

public class Cliente
{
  private int idcliente;
  private String nombre_cliente;
  private String direccion;
  private String telefono;
  Cliente siguiente;
  CentralMascota central;
  
  public Cliente(int idcliente, String nombre_cliente, String direccion, String telefono, CentralMascota central)
  {
    this.idcliente = idcliente;
    this.nombre_cliente = nombre_cliente;
    this.direccion = direccion;
    this.telefono = telefono;
    this.central = central;
  }
  
  public int getIdcliente()
  {
    return this.idcliente;
  }
  
  public void setIdcliente(int idcliente)
  {
    this.idcliente = idcliente;
  }
  
  public String getNombre_cliente()
  {
    return this.nombre_cliente;
  }
  
  public void setNombre_cliente(String nombre_cliente)
  {
    this.nombre_cliente = nombre_cliente;
  }
  
  public String getDireccion()
  {
    return this.direccion;
  }
  
  public void setDireccion(String direccion)
  {
    this.direccion = direccion;
  }
  
  public String getTelefono()
  {
    return this.telefono;
  }
  
  public void setTelefono(String telefono)
  {
    this.telefono = telefono;
  }
  
  public Cliente getSiguiente()
  {
    return this.siguiente;
  }
  
  public void setSiguiente(Cliente siguiente)
  {
    this.siguiente = siguiente;
  }
  
  public CentralMascota getCentralMascota(){
      return this.central;
  }
}
