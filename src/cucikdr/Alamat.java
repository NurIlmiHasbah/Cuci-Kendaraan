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
public class Alamat {
    private String jalan;
			private String kota;
			private String prov;

				public String getJalan() {
				return jalan;
				}

				public void setJalan(String jalan) 
                                    throws Exception {
                                if (jalan.length()>30) return;
                                   this.jalan = jalan;
				
				this.jalan = jalan;
				}

				public String getKota() {
				return kota;
				}

				public void setKota(String kota) {
				this.kota = kota;
				}

				public String getProv() {
				return prov;
				}

				public void setProv(String prov) {
				this.prov = prov;
				}
                                
                                public void cetakAlamat(){
                                    System.out.println("Jalan: "+ jalan);
                                    System.out.println("Kota: "+ kota);
                                    System.out.println("Provinsi: "+ prov);
                                }
                                
                                
    
    
}
