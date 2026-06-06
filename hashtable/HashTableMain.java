class Entity
{
    String key;
    String value;

    public Entity(String key,String value)
    {
        this.key=key;
        this.value=value;
    }

}
class HashTable 
{
    Entity entities[]=new Entity[100];

    public void putKey(String key,String value)
    {
        int hash=Math.abs((key.hashCode())%entities.length);
        entities[hash]=new Entity(key,value);

    }

    public String get(String key)
    {
        int hash=Math.abs((key.hashCode())%entities.length);
        if(entities[hash].value!=null&&entities[hash].key.equals(key))
        {
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key)
    {
        int hash=Math.abs((key.hashCode())%entities.length);
        if(entities[hash].value!=null&&entities[hash].key.equals(key))
        {
            entities[hash]=null;
        }
    }

}


public class HashTableMain
{
    public static void main(String[] args) 
    {
        HashTable ht=new HashTable();
        ht.putKey("harish","mandya");
        ht.putKey("dhanush","mysure");
        ht.putKey("dilip","udupi");
        ht.putKey("shyam","ballari");
        System.out.println(ht.get("harish"));
   
    }   
}