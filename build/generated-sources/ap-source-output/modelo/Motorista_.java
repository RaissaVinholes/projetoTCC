package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Frete;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-28T09:44:43")
@StaticMetamodel(Motorista.class)
public class Motorista_ { 

    public static volatile SingularAttribute<Motorista, String> renach;
    public static volatile SingularAttribute<Motorista, String> telefone;
    public static volatile SingularAttribute<Motorista, Date> datanasc;
    public static volatile SingularAttribute<Motorista, String> endereco;
    public static volatile SingularAttribute<Motorista, String> cpf;
    public static volatile SingularAttribute<Motorista, String> nome;
    public static volatile SingularAttribute<Motorista, Long> id;
    public static volatile ListAttribute<Motorista, Frete> fretes;
    public static volatile SingularAttribute<Motorista, String> email;

}