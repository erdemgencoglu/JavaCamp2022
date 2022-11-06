package kodlama.io.devs.backend.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

/**
 *
 * @author erdem
 */
@Data
@AllArgsConstructor
@Entity
@Table(name = "LANGUAGE")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "NAME", nullable = false)
    private String name;
    @Nullable
    @OneToMany(mappedBy = "language", cascade = CascadeType.ALL)
    private List<Technologies> technologies;

    public Language() {
        technologies = new ArrayList<>();
    }

}
