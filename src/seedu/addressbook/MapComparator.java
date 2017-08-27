package seedu.addressbook;

/*
* Code from https://stackoverflow.com/questions/5369573/how-sort-an-arraylist-of-hashmaps-holding-several-key-value-pairs-each
* Used for sorting ArrayList<HashMap<String, String>>
* */

import java.util.Comparator;
import java.util.Map;

class MapComparator implements Comparator<Map<String, String>>
{
    private final String key;

    public MapComparator(String key)
    {
        this.key = key;
    }

    public int compare(Map<String, String> first,
                       Map<String, String> second)
    {
        // TODO: Null checking, both for maps and values
        String firstValue = first.get(key);
        String secondValue = second.get(key);
        return firstValue.compareTo(secondValue);
    }
}