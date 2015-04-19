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
public class Kendaraan {
    private String plat;
	private String jKendaraan;
	
	public void setPlat(String plat){
        Integer.parseInt(plat);
        this.plat = plat;
		}
		
	String getPlat(){
		return plat;
		}
		
	public void setJKendaraan(String jKendaraan)
		throws Exception {
			if (!jKendaraan.equals("Mobil") && !jKendaraan.equals("Motor") && !jKendaraan.equals("Truk"))
				return;
			this.jKendaraan = jKendaraan;
			}
			
	String getJKendaraan(){
		return jKendaraan;
		}
    
}
