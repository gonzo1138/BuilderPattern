public class PersonBuilder {

    Person p = new Person();

    public PersonBuilder(){}

    public PersonBuilder addName(String name) {
        p.set_name(name);
        return this;
    }
    public PersonBuilder addGeburtstag(String geburtstag) {
        p.set_geburtstag(geburtstag);
        return this;
    }
    public PersonBuilder addLieblingsfarbe(String lieblingsfarbe) {
        p.set_lieblingsfarbe(lieblingsfarbe);
        return this;
    }
    public Person build(){
        return p;
    }
}
