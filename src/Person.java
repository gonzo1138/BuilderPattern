
public class Person {

    private String _name;
    private String _geburtstag;
    private String _lieblingsfarbe;

    public Person(){}


    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        _name = name;
    }

    public String get_geburtstag() {
        return _geburtstag;
    }

    public void set_geburtstag(String geburtstag) {
        _geburtstag = geburtstag;
    }

    public String get_lieblingsfarbe() {
        return _lieblingsfarbe;
    }

    public void set_lieblingsfarbe(String lieblingsfarbe) {
        _lieblingsfarbe = lieblingsfarbe;
    }

    @Override
    public String toString() {
        return _name + "\t" + _geburtstag + "\t" + _lieblingsfarbe;
    }
}