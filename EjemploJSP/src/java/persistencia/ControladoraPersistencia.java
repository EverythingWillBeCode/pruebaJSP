/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Persona;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Silforoso
 */
public class ControladoraPersistencia {
    PersonaJpaController persJPA = new PersonaJpaController();
    
    public void crearPersona(Persona per){
            persJPA.create(per);
    }  
    
    public void eliminarPersona(int id){
        try {
            persJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, "No se pudo eliminar, no se encontró el ID: " + id, ex);
        }
    }
    
    public void eliminarPersona(Persona pers){
        try {
            persJPA.destroy(pers.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, "No se pudo eliminar: " + pers.getApellido(), ex);
        }
    }
    
    public List<Persona> traerPersonas(){
        return persJPA.findPersonaEntities();
    }
}


            