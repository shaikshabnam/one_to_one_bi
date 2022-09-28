package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindCompanyAndGst {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		GST gst = entityManager.find(GST.class, 3);
		if (gst != null) {
			System.out.println("----gst details-----");
			System.out.println("gst id is :" + gst.getId());
			System.out.println("gst number is :" + gst.getNumber());
			System.out.println("gst status is :" + gst.getStatus());
			System.out.println("**********************************");

			Company company = gst.getCompany();
			if (company != null) {
				System.out.println("------company detauils-----------");
				System.out.println("company id is :" + company.getId());
				System.out.println("company name is :" + company.getName());
				System.out.println("company address is :" + company.getAddress());
			} else {
				System.out.println("company is not registered");
			}
		} else {
			System.out.println("GST is not registered");
		}
	}
}
