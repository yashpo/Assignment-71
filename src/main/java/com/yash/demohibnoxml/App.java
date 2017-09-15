package com.yash.demohibnoxml;

import org.hibernate.Session;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Flower flower1 = new Flower();
    	flower1.setFlowerId("501");
    	flower1.setFlowerType("Orange");
    	flower1.setWeeklySales("5670");
    	
    	Flower flower2 = new Flower();
    	flower2.setFlowerId("502");
    	flower2.setFlowerType("Red");
    	flower2.setWeeklySales("8754");
    		
    	Manager manager1 = new Manager();
    	manager1.setManagerId("801");
    	manager1.setManagerName("Johny Cash");
    	
    	Manager manager2 = new Manager();
    	manager2.setManagerId("802");
    	manager2.setManagerName("Phani raj");
    	
    	FlowerShop shop = new FlowerShop();
    	shop.setFlowerShopId("101");
    	shop.setFlowerShopName("AAA");
    	
    	shop.getFlowers().add(flower1);
    	shop.getFlowers().add(flower2);
    	shop.getManagers().add(manager1);
    	shop.getManagers().add(manager2);
    	
    	Session session = ServiceProvider.getSession();
    			
    	session.beginTransaction();
    //-----------------------------------

    	
    	session.save(shop);
    	session.save(manager1);
    	session.save(flower1);
    	session.save(flower2);
    	session.save(manager2);
    					
    		
    //------------------------------------	
    	session.getTransaction().commit();
    			
    	session.close();
    }
}
