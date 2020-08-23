/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.backend.entidades.rut;

/**
 *
 * @author shido
 */
public class Rut {

    private String rutSinValidar;
    private String rutSinDv;
    private boolean rutValido;
    private String rutInv;
    

    public Rut(String rutSinValidar) {
        
        this.rutValido = false;
        this.rutSinValidar = rutSinValidar.replace("-", "");
        this.rutSinValidar = rutSinValidar.replace(".", "");
        this.rutSinDv = rutSinValidar.substring(0, rutSinValidar.length() - 1);
        this.rutInv = "";
        
    }
    
    public static boolean rutBienEscrito(String rut){
        return rut.matches("[0-9]{7,8}[-]{0,1}[0-9]{1,1}");
    }
    
    public String getRut(){
        return rutSinValidar;
    }

    private String invertirRut() {
        for (int i = 0; i < rutSinDv.length(); i++) {
            rutInv += rutSinDv.charAt(rutSinDv.length() - i - 1);
        }
        return rutInv;
    }
    
    private int multiplicarPorIndicesYSumar(){
        String rutInv = invertirRut();
        int[] indices = {2,3,4,5,6,7};
        int j = 0;
        int suma = 0;
        for (int i = 0; i < rutInv.length(); i++) {
            suma += Integer.parseInt(Character.toString(rutInv.charAt(i))) * indices[j];
            j++;
            if (j == indices.length){
                j = 0;
            }
        }
        return suma;
    }

    public boolean isRutValido() {
        return obtenerDigitoVerificado().equals(Character.toString(rutSinValidar.charAt(rutSinValidar.length()-1)));
    }
    
    private int obtenerResto(){
        int suma = multiplicarPorIndicesYSumar();
        return suma % 11;
    }

    
    private String obtenerDigitoVerificado(){
        int DV = 11 - obtenerResto();
        System.out.println("DV: "+DV);
        if (DV == 11){
            return "0";
        }else if (DV == 10){
            return "k";
        }else{
            return String.valueOf(DV);
        }
    }

}
