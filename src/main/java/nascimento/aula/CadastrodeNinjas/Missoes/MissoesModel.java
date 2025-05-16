package nascimento.aula.CadastrodeNinjas.Missoes;


import jakarta.persistence.*;
import nascimento.aula.CadastrodeNinjas.Ninjas.NinjaModel;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.List;
import java.util.Map;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

//@OneToMany Uma missao tem varios ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;


}
