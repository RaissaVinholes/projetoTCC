package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Frete;
import modelo.Manutencao;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-28T09:44:43")
@StaticMetamodel(Caminhao.class)
public class Caminhao_ { 

    public static volatile SingularAttribute<Caminhao, Double> consumo;
    public static volatile ListAttribute<Caminhao, Manutencao> manutencoes;
    public static volatile SingularAttribute<Caminhao, Integer> ano;
    public static volatile SingularAttribute<Caminhao, String> renavam;
    public static volatile SingularAttribute<Caminhao, String> montadora;
    public static volatile SingularAttribute<Caminhao, Long> id;
    public static volatile SingularAttribute<Caminhao, String> modelo;
    public static volatile ListAttribute<Caminhao, Frete> fretes;
    public static volatile SingularAttribute<Caminhao, String> placa;

}