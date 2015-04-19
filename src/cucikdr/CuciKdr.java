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
public class CuciKdr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
		
			Costumer costumer1 = new Costumer();
			try {
                            costumer1.setNama ( "Luli");
                        }catch (Exception e) {
                            System.out.println("Input nama salah!");
                        }
			
                                
                         Alamat alamat1 = new Alamat ();
                        try {
                        alamat1.setJalan("Ammana Majju");
                        } catch (Exception e) {
                             System.out.println("Input jalan salah!");
                             }
                        
                        try {
                        alamat1.setKota("Polewali Mandar");
                         } catch (Exception e) {
                        System.out.println("Input kota salah!");
                        } 
                        
                        try {
                        alamat1.setProv("Sulawesi Barat");
                        } catch (Exception e) {
                         System.out.println("Input provinsi salah!");
                        } 
                         
                        Kendaraan kendaraan1=new Kendaraan();
                        try {
                            kendaraan1.setJKendaraan("Mobil");
                        } catch (Exception e){
                          System.out.println("Input kendaraan salah!");
                        }
                        
                        Petugas petugas1 = new Petugas();
                           try {
                               petugas1.setNama("Lulu");
                           } catch (Exception e){
                          System.out.println("Input nama petugas salah!");
                           }
                           
                        Pencucian pencucian1 = new Pencucian();
                        try {
                            pencucian1.setJPencucian("Complete");
                            pencucian1.setHarga();
                        }catch (Exception e){
                            System.out.println("Input jenis pencucian salah!");
                        }
                        
                        
                        
                        
                        
       System.out.println("Transaksi");
       System.out.println("-------------");
       System.out.println("Costumer: " + costumer1.getNama());
       System.out.println("Alamat: "); alamat1.cetakAlamat();
       System.out.println("Jenis Kendaraan: " + kendaraan1.getPlat() + " "+ kendaraan1.getJKendaraan());
       System.out.println("Petugas: "+petugas1.getIDPetu()+" "+petugas1.getNama());
       System.out.println("Jenis Pencucian: "+pencucian1.getJPencucian());
            System.out.println("Harga: "+pencucian1.getHarga());
       
       System.out.println();
       System.out.println("Terima kasih :)");
                        }
                        }

			
		
		 
    

