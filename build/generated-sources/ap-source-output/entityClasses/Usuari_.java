package entityClasses;

import entityClasses.Partides;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-14T20:38:48")
@StaticMetamodel(Usuari.class)
public class Usuari_ { 

    public static volatile SingularAttribute<Usuari, String> nik;
    public static volatile ListAttribute<Usuari, Partides> partidesList;
    public static volatile SingularAttribute<Usuari, Integer> id;
    public static volatile SingularAttribute<Usuari, String> contra;
    public static volatile SingularAttribute<Usuari, String> email;

}