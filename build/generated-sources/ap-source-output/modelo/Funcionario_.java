package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Frete;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-28T09:44:43")
@StaticMetamodel(Funcionario.class)
public class Funcionario_ { 

    public static volatile SingularAttribute<Funcionario, String> telefone;
    public static volatile SingularAttribute<Funcionario, Date> datanasc;
    public static volatile SingularAttribute<Funcionario, String> endereco;
    public static volatile SingularAttribute<Funcionario, String> cpf;
    public static volatile SingularAttribute<Funcionario, String> nome;
    public static volatile SingularAttribute<Funcionario, Long> id;
    public static volatile ListAttribute<Funcionario, Frete> fretes;
    public static volatile SingularAttribute<Funcionario, String> email;

}