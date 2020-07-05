import java.util.ArrayList;
import java.util.List;

public class MyDictionary {

    private List<Element> elements = new ArrayList<>();

    public MyDictionary(String text) {
        String[] words = text.split(" ");
        boolean contains = false;
        for(int i = 0; i < words.length; i++){
            String value = words[i].toLowerCase();
            for (int j = 0; j < elements.size(); j++){
                if (elements.get(j).getValue().equals(value)){
                    elements.get(j).incr();
                    contains = true;
                    break;
                }
            }

            if (!contains){
                elements.add(new Element(value));
                contains = false;
            }
        }
        System.out.println(elements);
    }
}
