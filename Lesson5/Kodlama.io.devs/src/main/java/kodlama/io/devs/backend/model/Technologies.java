package kodlama.io.devs.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TECHNOLOGIES")
public class Technologies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "NAME", nullable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name = "language_id")
    @JsonIgnore
    private Language language;

    public Technologies(String name, Language language) {
        this.name = name;
        this.language = language;
    }

}
//   @ManyToOne -> Çoka-Bir ilişki
//   @JoinColumn(name = "language_id") ->  Join yapılacak alanı ifade eder
//   @JsonIgnore ->İlgili değişkenin response larda görünürlüğünü pasif eder. (Java Jackson kütüphanesi anatasyonu)
