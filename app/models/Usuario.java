package models;

import io.ebean.annotation.JsonIgnore;
import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.Calendar;

/**
 * Usuario entity
 */

@Entity
public class Usuario extends BaseModel {

    @JsonIgnore
    private String confirmacaoToken;

    @Formats.NonEmpty
    @JsonIgnore
    private boolean validado;

    @Constraints.Required
    @Column(nullable = false, length = 60)
    private String nome;

    @Constraints.Required
    @Column(nullable = false, unique = true, length = 50)
    private String email;

    @Column(nullable = false)
    @JsonIgnore
    private String senha;

    //Declarar o papel padrão do usuário que é o usuario
    @Enumerated(EnumType.STRING)
    @JsonIgnore
    private Perfil perfil;

    @Column(nullable = false)
    @JsonIgnore
    private Boolean status;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataCadastro;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataAlteracao;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar ultimoAcesso;

}
