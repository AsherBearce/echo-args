package edu.cnm.deepdive;

public class Echo {
  public static void main(String[] args){
    for (int i = 0; i < args.length; i++){
      System.out.printf("%d: %s%n", i, args[i].toUpperCase());
    }
  }
}