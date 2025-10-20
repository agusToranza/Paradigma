package ActividadPopMarket;

import java.util.ArrayList;

public class Carrito {

    Cliente nombreCliente;

    ArrayList<Producto> carrito = new ArrayList<>();
    ArrayList<CuponDeDescuento> cuponesDeDescuento = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        this.carrito.add(producto);
    }

    public void agregarCuponDescuento(CuponDeDescuento cupon) {
        this.cuponesDeDescuento.add(cupon);
    }

    public void setCliente(Cliente cliente) {
        this.nombreCliente = cliente;
    }

    public int calcularPrecioTotal() {
        int precioTotalCarrito = 0;
        for(Producto producto : carrito) {
            precioTotalCarrito += producto.getPrecioUnitario();
        }
        return precioTotalCarrito;
    }
}
