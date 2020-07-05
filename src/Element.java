public class Element {
    private String value;
    private int count = 1;

    public Element(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void incr(){
        this.count++;
    }

    @Override
    public String toString() {
        return "Element{" +
                "value='" + value + '\'' +
                ", count=" + count +
                '}';
    }
}
