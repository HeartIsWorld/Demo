package demo.test;

import java.util.List;


public class PageInfo<T> {

	 //结果集
    private List<T> list;
    
    public PageInfo() {
    }

    public PageInfo(List<T> list) {
        this(list, 8);
    }

    public PageInfo(List<T> list, int navigatePages) {
        if (list instanceof Page) {
        	System.out.println(true);
        }
    }

}
