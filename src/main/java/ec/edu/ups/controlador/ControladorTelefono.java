/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Telefono;
import java.util.List;

/**
 *
 * @author Anahi
 */
public class ControladorTelefono extends Controlador {

    public ControladorTelefono() {
    }

    @Override
    public int cargarCodigo() {
        var copiaListaTelefonos = (List<Telefono>) List.copyOf(findAll());
        if (copiaListaTelefonos.isEmpty()) {
            return 1;
        } else {
            return copiaListaTelefonos.get(copiaListaTelefonos.size() - 1).getCodigo() + 1;
        }
    }

    
}
