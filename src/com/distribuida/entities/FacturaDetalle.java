package com.distribuida.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FacturaDetalle {

	private int idFacturaDetalle;
	private int cantidad;
	private Double subtotal;
	
	@Autowired
	private Factura factura;
	
	@Autowired 
	private Producto producto;
	
	public FacturaDetalle() {}

	public int getIdFacturaDetalle() {
		return idFacturaDetalle;
	}

	public void setIdFacturaDetalle(int idFacturaDetalle) {
		this.idFacturaDetalle = idFacturaDetalle;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Factura getFactura() {
		return factura;
	}

	//metodo inyector
	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Producto getProducto() {
		return producto;
	}

	//metodo inyector
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "FacturaDetalle [idFacturaDetalle=" + idFacturaDetalle + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", factura=" + factura + ", producto=" + producto + "]";
	}
	
}
