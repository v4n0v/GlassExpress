package ru.glass_express.objects;

import java.util.List;


public class CarMarks {
    Integer[] ids;

    public String[] getMarkTitles() {
        return markTitles;
    }

    String[] markTitles;
    public CarMarks(){}

//    public CarMarks(List<Integer> ids, List<String> markTitles) {
//        this.ids = ids;
//        this.markTitles = markTitles;
//    }

    public CarMarks(Integer[] ids,
                    String[] markTitles) {
        this.ids = ids;
        this.markTitles = markTitles;
    }
//    public List<Integer> getIds() {
//        return ids;
//    }
//
//    public void setIds(List<Integer> ids) {
//        this.ids = ids;
//    }
//
//    public List<String> getMarkTitles() {
//        return markTitles;
//    }
//
//    public void setMarkTitles(List<String> markTitles) {
//        this.markTitles = markTitles;
//    }


}

