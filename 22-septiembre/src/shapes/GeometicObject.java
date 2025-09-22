package shapes;

import java.util.Date;

class GeometricObject { 
    private String color;
    private boolean filled;
    private Date dateCreated;

    // default constructor
    GeometricObject() {
        color = "white";
        filled = false;
        dateCreated = new Date();
    }

    // custom constructor
    GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date(); // mm-dd-yyyy hh-mm-ss
    }

     public String getColor() {
        return color;
     }
     
     public void setColor(String color) {
        this.color = color;
      }

      public boolean isFilled() {
        return filled;
      }

      public void setFilled(boolean filled) { 
        this.filled = filled;
      }

      public Date getDateCreated() {
        return dateCreated;
      }

      @Override
      public String toString(){
        return String.format("Color: %s \n Relleno: %b \n Fecha de creacion: %s", color, filled, dateCreated);
      }
}