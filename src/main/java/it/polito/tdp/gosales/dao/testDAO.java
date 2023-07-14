package it.polito.tdp.gosales.dao;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.gosales.model.Arco;
import it.polito.tdp.gosales.model.DailySale;
import it.polito.tdp.gosales.model.Products;
import it.polito.tdp.gosales.model.Retailers;

public class testDAO {

	public static void main(String[] args) {

		GOsalesDAO dao = new GOsalesDAO();
		List<Products> prod = new ArrayList<>();

		prod = dao.getNodes("Relax");

		for (Products p : prod)
			System.out.println(p);

		System.out.println(prod.size()+"");




		// TODO Auto-generated method stub

	/*	List<Retailers> listR = new ArrayList<>();
		List<Products> listP = new ArrayList<>();
		List<DailySale> listS = new ArrayList<>();
		
		
		listR = dao.getAllRetailers();
		System.out.println(listR.size());
		
		listP = dao.getAllProducts();
		System.out.println(listP.size());
		
		listS = dao.getAllSales();
		System.out.println(listS.size());
		
		
		*/
	}

}
