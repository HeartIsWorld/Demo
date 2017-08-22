package demo.test;

import java.util.ArrayList;
import java.util.List;

public class Page<E> extends ArrayList<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * 封装返回页面信息
	 */
	

    public Page() {
        super();
    }
    
    
    public List<E> getResult() {
        return this;
    }
}
