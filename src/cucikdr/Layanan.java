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
public class Layanan {
    private Petugas petugas;
	private Costumer costumer;
	private Pencucian pencucian;
	private double biaya;
	
	
		public Costumer getCostumer(){
			return costumer;
			}
		
		public void setCostumer (Costumer costumer){
			this.costumer = costumer;
			}
			
		public Petugas getPetugas(){
			return petugas;
			}
			
		public void setPetugas(Petugas petugas){
			this.petugas = petugas;
			}
			
		public Pencucian getPencucian(){
			return pencucian;
			}
			
		public void setPencucian (Pencucian pencucian){
			
			this.pencucian = pencucian;
			}
			
			
		public void setBiaya(Pencucian pencucian){
			double a = pencucian.getHarga();
			this.biaya=a;
			}
			
		public double getBiaya(){
			return biaya;
			}
    
}
