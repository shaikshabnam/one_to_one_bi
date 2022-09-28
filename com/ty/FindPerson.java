package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPerson {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Person person = entityManager.find(Person.class, 2);
		if (person != null) {
			System.out.println();
			System.out.println("---person details---");
			System.out.println("person id is :" + person.getId());
			System.out.println("person name is :" + person.getName());
			System.out.println("person gender is :" + person.getGender());
			System.out.println("-----------------------------------------");
			Pan pan = person.getPan();
			if (pan != null) {
				System.out.println("---pan details---");
				System.out.println("pan id is :" + pan.getId());
				System.out.println("pan number is :" + pan.getNumber());
				System.out.println("pan type is :" + pan.getType());
			} else {
				System.out.println("person dont have pan card");
			}
		} else {
			System.out.println("person id is not found");
		}
	}
}
