package com.greenlearner.hackerrank.code30days;

import java.io.*;
import java.util.*;

public class Person {
    private int age;	
  
	public Person(int initialAge) {
        if(initialAge < 0){
            System.out.println("Age is not valid, setting age to 0.");
           this.age=0;
        }
  		this.age=initialAge;
	}

	public void amIOld() {
  		String msg = "You are old.";
          if(age<13){
              msg = "You are young.";
          }else if(age >=13 && age < 18){
              msg = "You are a teenager.";
          }
        System.out.println(msg);
	}

	public void yearPasses() {
  		age=age+1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}