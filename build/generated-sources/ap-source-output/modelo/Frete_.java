package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Caminhao;
import modelo.Cliente;
import modelo.Funcionario;
import modelo.Motorista;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-28T09:44:43")
@StaticMetamodel(Frete.class)
public class Frete_ { 

    public static volatile SingularAttribute<Frete, String> formaPagamento;
    public static volatile SingularAttribute<Frete, Cliente> cliente;
    public static volatile SingularAttribute<Frete, String> tipoCarga;
    public static volatile SingularAttribute<Frete, Double> kmPercorrido;
    public static volatile SingularAttribute<Frete, String> horarioEntrega;
    public static volatile SingularAttribute<Frete, Motorista> motorista;
    public static volatile SingularAttribute<Frete, Date> dataEntrega;
    public static volatile SingularAttribute<Frete, Double> valor;
    public static volatile SingularAttribute<Frete, String> destinoCarga;
    public static volatile SingularAttribute<Frete, Long> id;
    public static volatile ListAttribute<Frete, Funcionario> funcionarios;
    public static volatile SingularAttribute<Frete, Caminhao> caminhao;

}