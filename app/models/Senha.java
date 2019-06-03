package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Calendar;

/**
 * Senha entity
 */

@Entity
public class Senha extends BaseModel {

    @Column(nullable = false, length = 60)
    private String titulo;

    @Column(nullable = false, length = 60)
    private String usuario;

    @Column(nullable = false, length = 400)
    private String senha;

    @Column(nullable = false, length = 500)
    private String url;

    @Column(nullable = false, length = 500)
    private String descricao;

    @Column(nullable = false, length = 300)
    private String nomeIcone;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataCadastro;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataAlteracao;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataExpiracao;


}
