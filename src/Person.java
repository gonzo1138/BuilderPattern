
public class Person {

    private String _name;
    private String _geburtstag;
    private String _lieblingsfarbe;

    public Person(){}


    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_geburtstag() {
        return _geburtstag;
    }

    public void set_geburtstag(String _geburtstag) {
        this._geburtstag = _geburtstag;
    }

    public String get_lieblingsfarbe() {
        return _lieblingsfarbe;
    }

    public void set_lieblingsfarbe(String _lieblingsfarbe) {
        this._lieblingsfarbe = _lieblingsfarbe;
    }

    @Override
    public String toString() {
        return this._name + "\t" + this._geburtstag + "\t" + this._lieblingsfarbe;
    }
}