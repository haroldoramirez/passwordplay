package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Calendar;

/**
 * Pais entity
 */

@Entity
public class Pais extends BaseModel {

    private static final long serialVersionUID = 1L;

    @Column(nullable = false, length = 100, unique = true)
    public String nome;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataCadastro;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataAlteracao;
}
