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
public class Petugas {
    private String nama;
	private String idPetu;
	
		public void setNama (String nama){
					this.nama = nama;
				}
				
		
		public String getNama(){
			return nama;
			}
			
		public String getIDPetu(){
			return idPetu;
			}
		
		public void setIDPetu(String idPetu)
			throws Exception{
				for (char i: idPetu.toCharArray()){
					if (Character.isLetter (i)){
						throw new Exception("ID harus angka.");
						}
						}
					this.idPetu=idPetu;
					}
					}
	
    

