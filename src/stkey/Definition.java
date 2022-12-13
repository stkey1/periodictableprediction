package stkey;

/**
 * This method for definition of hashmap values
 * @author stkey
 * @return hashMap
 * @since 13.12.2022
 */

import java.util.HashMap;
public class Definition {
    public HashMap<String,String> implementation() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Au", "altın");
        hashMap.put("Na", "Sodyum");
        hashMap.put("K", "Potasyum");
        hashMap.put("Cu", "Bakır");
        hashMap.put("Ag", "Gümüş");
        hashMap.put("Sn", "Kalay");
        hashMap.put("Sb", "Antimon");
        hashMap.put("W ", "ungsten");
        hashMap.put("Hg ", "Cıva");
        hashMap.put("Pb ", "Kurşun");
        hashMap.put("Rn ", "Radon");
        return hashMap;
    }
}
