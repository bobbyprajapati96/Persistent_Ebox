package class_package_clone;

class Customer implements Cloneable {
    String name;
    String id;
    String country;

    public Customer() {}

    public Customer(String name, String id, String country) {
        this.name = name;
        this.id = id;
        this.country = country;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}