package org.course.generics.challenge1;

import java.util.*;

public class Layer<T extends Mappable> {
    private List<T> layerElements;

    public Layer(T[] elements) {
//        this.layerElements = elements;
        this.layerElements = new ArrayList<T>(List.of(elements));
    }

    public void addElements(T... elements){
//        if (layerElements.contains(elem)){
//            return;
//        }
        layerElements.addAll(List.of(elements));
    }

    public void renderLayer(){
        for (T elem : layerElements){
            elem.render();
        }
    }
}
