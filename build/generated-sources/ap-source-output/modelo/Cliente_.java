package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Frete;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-28T09:44:43")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> telefone;
    public static volatile SingularAttribute<Cliente, Date> datanasc;
    public static volatile SingularAttribute<Cliente, String> endereco;
    public static volatile SingularAttribute<Cliente, String> rg;
    public static volatile SingularAttribute<Cliente, String> cpf;
    public static volatile SingularAttribute<Cliente, String> nome;
    public static volatile SingularAttribute<Cliente, Long> id;
    public static volatile ListAttribute<Cliente, Frete> fretes;
    public static volatile SingularAttribute<Cliente, String> email;

}