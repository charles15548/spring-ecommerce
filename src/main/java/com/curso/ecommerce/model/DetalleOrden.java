package com.curso.ecommerce.model;

import lombok.Data;

@Data
public class DetalleOrden {
	private Integer id;
	private String nombre;
	private double cantidad;
	private double precio;
	private double total;
}
