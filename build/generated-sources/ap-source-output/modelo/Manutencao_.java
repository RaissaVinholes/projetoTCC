package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Caminhao;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-28T09:44:43")
@StaticMetamodel(Manutencao.class)
public class Manutencao_ { 

    public static volatile SingularAttribute<Manutencao, String> oficina;
    public static volatile SingularAttribute<Manutencao, String> endereco;
    public static volatile SingularAttribute<Manutencao, Double> valor;
    public static volatile SingularAttribute<Manutencao, String> problema;
    public static volatile SingularAttribute<Manutencao, Long> id;
    public static volatile SingularAttribute<Manutencao, Date> datamanut;
    public static volatile SingularAttribute<Manutencao, Caminhao> caminhao;

}