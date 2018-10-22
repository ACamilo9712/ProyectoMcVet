package Actores;

public class Mascota
{
  private int idmascota;
  private String nombre_mascota;
  private String raza;
  private String color;
  Mascota siguiente;
  Mascota anterior;
  
  public Mascota(int idmascota, String nombre_mascota, String raza, String color)
  {
    this.idmascota = idmascota;
    this.nombre_mascota = nombre_mascota;
    this.raza = raza;
    this.color = color;
  }
  
  public int getIdmascota()
  {
    return this.idmascota;
  }
  
  public void setIdmascota(int idmascota)
  {
    this.idmascota = idmascota;
  }
  
  public String getNombre_mascota()
  {
    return this.nombre_mascota;
  }
  
  public void setNombre_mascota(String nombre_mascota)
  {
    this.nombre_mascota = nombre_mascota;
  }
  
  public String getRaza()
  {
    return this.raza;
  }
  
  public void setRaza(String raza)
  {
    this.raza = raza;
  }
  
  public String getColor()
  {
    return this.color;
  }
  
  public Mascota getSiguiente()
  {
    return this.siguiente;
  }
  
  public void setSiguiente(Mascota siguiente)
  {
    this.siguiente = siguiente;
  }
  
  public Mascota getAnterior()
  {
    return this.anterior;
  }
  
  public void setAnterior(Mascota anterior)
  {
    this.anterior = anterior;
  }
  
  public void setColor(String color)
  {
    this.color = color;
  }
}
