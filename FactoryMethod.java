// Clase abstracta Helado
abstract class Helado {
    abstract String getSabor();
}

// Clase concreta HeladoChocolate
class HeladoChocolate extends Helado {
    @Override
    String getSabor() {
        return "Chocolate";
    }
}

// Clase concreta HeladoVainilla
class HeladoVainilla extends Helado {
    @Override
    String getSabor() {
        return "Vainilla";
    }
}

// Clase abstracta TiendaHelados (Factory Method)
abstract class TiendaHelados {
    // Metodo fabrica que sera implementado por las subclases
    abstract Helado crearHelado();

    public void venderHelado() {
        Helado helado = crearHelado(); // Crear el helado usando el metodo fabrica
        System.out.println("Vendiendo un helado de tipo: " + helado.getSabor());
    }
}

// Tienda de helados de chocolate
class TiendaChocolate extends TiendaHelados {
    @Override
    Helado crearHelado() {
        return new HeladoChocolate(); // Crea un helado de chocolate
    }
}

// Tienda de helados de vainilla
class TiendaVainilla extends TiendaHelados {
    @Override
    Helado crearHelado() {
        return new HeladoVainilla(); // Crea un helado de vainilla
    }
}

public class HeladoFactory {
  public static void main(String[] args) {
        TiendaHelados tienda1 = new TiendaChocolate(); // Tienda de chocolate
        TiendaHelados tienda2 = new TiendaVainilla(); // Tienda de vainilla

        tienda1.venderHelado(); // Salida: Vendiendo un helado de tipo: Chocolate
        tienda2.venderHelado(); // Salida: Vendiendo un helado de tipo: Vainilla
    }
}