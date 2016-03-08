package com.srivastava.models;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class CalcBean
 */
@Stateless
public class CalcBean implements CalcBeanRemote, CalcBeanLocal {

    /**
     * Default constructor. 
     */
    public CalcBean() {
        // TODO Auto-generated constructor stub
    }
    public int add(int x , int y){
    	return x + y;
    }

}
