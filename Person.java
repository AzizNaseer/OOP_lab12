package S2;

import java.io.Serializable;

public class Person implements Serializable {
    protected String name;
    protected String id;
    public Person(){}
    public Person(String name,String id){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Name = " + name +
                " Id = " + id ;
    }
}
