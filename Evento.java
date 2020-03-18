/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;
import java.lang.*;
import java.util.Scanner;
/**
 *
 * @author ben-10
 */
public class Evento {
    /*
    essa classe deve conter metodos para criar um evento que contenha toda info necessária.
    bem como os métodos para retornar essas informações
    */
    String getNome(){
        String auxnome;
        System.out.println("Insira o nome do evento:");
        try (Scanner tc = new Scanner(System.in)) {
            auxnome = tc.nextLine();
            return auxnome;
        }
        catch(Exception e){
            System.out.println("Oops, não possível alocar memória para o nome");
            return null;
        }
    }
    String getResumo(){
        String auxRes;
        System.out.println("Insira um resumo do evento:");
        try (Scanner tc = new Scanner(System.in)){
            auxRes = tc.nextLine();
            return auxRes;
        }
        catch(Exception e){
            System.out.println("Oops, não possível alocar memória para o resumo");
            return null;
        }
    }
    String getDeta(){
        String auxDeta;
        System.out.println("Insira os detalhes do evento:");
        try (Scanner tc = new Scanner(System.in)){
            auxDeta = tc.nextLine();
            return auxDeta;
        }
        catch(Exception e){
            System.out.println("Oops, não possível alocar memória para os detalhes");
            return null;
        }
    }
    String nome = null, resumo = null, detalhes = null;
    nome = getNome();
    resumo = getResumo();
    detalhes = getDeta();
    if(nome == null)
        throw new Exception("Não foi possível nomear esse evento");
}
