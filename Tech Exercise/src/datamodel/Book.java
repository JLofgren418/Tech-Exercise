package datamodel;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @since J2SE-1.8
 CREATE TABLE user (
  id INT NOT NULL AUTO_INCREMENT,    
  name VARCHAR(30) NOT NULL,   
  age INT NOT NULL,    
  PRIMARY KEY (id));
 */
@Entity
@Table(name = "MyBooks")
public class Book {

   @Id  // primary key
   @Column(name = "id") // specify the column name. Without it, it will use method name
   private Integer id;

   @Column(name = "title")
   private String title;

   @Column(name = "price")
   private Integer price;

   
   
   public Book() {
   }

   public Book(Integer id, String title, Integer price) {
	   		this.id = id;
	      this.price = price;
	      this.title = title;
	   }
   

   public Integer getId() {
	      return id;
   }

	public void setId(Integer id) {
	   this.id = id;
	}
   
   
   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
	   this.title = title;
   }

   public Integer getPrice() {
      return price;
   }

   public void setPrice(Integer price) {
	   this.price = price;
   }
 
}