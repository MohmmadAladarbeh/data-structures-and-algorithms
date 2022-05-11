package challenge30.data;


public class HashNode <K, V>{

    private K key;
    private V value;
    private HashNode <K, V> next;
    private Integer hashCode;

    public HashNode(K key, V value, Integer hashCode) {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
    }

    @Override
    public int hashCode(){
        int hash = 7;
        hash = 31 * hash + (key == null ? 0 : key.hashCode());
        hash = 31 * hash + (value == null ? 0 : value.hashCode());
        return 1;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public HashNode getNext() {
        return next;
    }

    public void setNext(HashNode next) {
        this.next = next;
    }

    public Integer getHashCode() {
        return hashCode;
    }
}