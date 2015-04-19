/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cucikdr;

/**
 *
 * @author USER
 */
public class Pencucian {
    private String jPencucian;
	private double harga;
	
		public void setJPencucian (String jPencucian)
		throws Exception {
			if (!jPencucian.equals("Inside Cleaning") && !jPencucian.equals ("Outside Cleaning") && !jPencucian.equals("Complete"))
				return;
				this.jPencucian= jPencucian;
				}
		
		String getJPencucian (){
			return jPencucian;
			}
			
		double getHarga(){
			return harga;
			}
			
		public void setHarga (){
                    
			if (jPencucian.equals("Inside Cleaning")){
				harga = 10000;
				}
			else if (jPencucian.equals("Outside Cleaning")){
				harga = 30000;
				}
			else if (jPencucian.equals("Complete")){
				harga = 35000;
				}
                        else { System.out.println("error!!!");
			}
                        this.harga=harga;
    
}
}