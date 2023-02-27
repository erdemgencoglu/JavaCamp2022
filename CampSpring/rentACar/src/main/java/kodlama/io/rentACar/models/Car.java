package kodlama.io.rentACar.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "plate", unique = true)
    private String plate;
    @Column(name = "dailyPrice")
    private double dailyPrice;
    @Column(name = "modelYear")
    private int modelYear;
    @Column(name = "state")
    private int state; //1 - avaible, 2- rented, 3- Maintanence
    @ManyToOne
    @JoinColumn(
            name = "model_id"
    )
    private Model model;
}
