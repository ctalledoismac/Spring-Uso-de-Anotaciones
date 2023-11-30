package com.distribuida.principal;

import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.DatosEmpresa;
import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.Producto;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Cliente cliente1 = context.getBean("cliente", Cliente.class);
	       
        Producto producto1 = context.getBean("producto", Producto.class);
     
        Factura factura1 = context.getBean("factura", Factura.class);

        FacturaDetalle facturaDetalle1 = context.getBean("facturaDetalle", FacturaDetalle.class);

        DatosEmpresa datosEmpresa = context.getBean("datosEmpresa", DatosEmpresa.class);

        // Configuración de cliente1
        cliente1.setIdCliente(1);
        cliente1.setCedula("1234567890");
        cliente1.setNombre("Jose");
        cliente1.setEdad(25);
        cliente1.setFechaNacimiento(new Date());
        cliente1.setApellido("Roca");
        cliente1.setDireccion("por aqui");
        cliente1.setTelefono("123456789");
        cliente1.setCorreo("jose@gmail.com");

        // Configuración de factura1
        factura1.setIdFactura(1);
        factura1.setNumFactura("Fac-001");
        factura1.setFecha(new Date());
        factura1.setTotalNeto(50.2);
        factura1.setIva(0.12);
        factura1.setTotal(51.50);

        // Configuración de producto1
        producto1.setIdProducto(1);
        producto1.setNombre("manzana");
        producto1.setDescripcion("manzana verde");
        producto1.setPrecio(0.25);
        producto1.setStock(100);

        // Configuración de facturaDetalle1
        facturaDetalle1.setIdFacturaDetalle(1);
        facturaDetalle1.setCantidad(3);
        facturaDetalle1.setSubtotal(1.00);
        facturaDetalle1.setProducto(producto1);
        facturaDetalle1.setFactura(factura1);

        System.out.println(factura1.toString());
        System.out.println(facturaDetalle1.toString());
        System.out.println("------------------------------------------------------------------------");
        System.out.println(datosEmpresa.toString());
		
		context.close();
	}

}
