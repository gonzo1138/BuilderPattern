public class PersonBuilder {

    Person _builderPerson = new Person();


    public PersonBuilder(){
        _builderPerson = new Person();
    }


    public PersonBuilder addName(String name) {
        _builderPerson.set_name(name);
        return this;
    }
    public PersonBuilder addGeburtstag(String geburtstag) {
        _builderPerson.set_geburtstag(geburtstag);
        return this;
    }
    public PersonBuilder addLieblingsfarbe(String lieblingsfarbe) {
        _builderPerson.set_lieblingsfarbe(lieblingsfarbe);
        return this;
    }
    public Person build(){
        return _builderPerson;
    }
}
