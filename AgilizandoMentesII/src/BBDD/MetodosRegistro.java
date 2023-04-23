/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BBDD;

import Usuario.Usuario;
import java.sql.*;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author terciodemarte
 */
public class MetodosRegistro {

    /**
     * Comprueba si el DNI contiene 8 numeros y Una letra mayuscula, pasado
     * desde el registro y que no existe en la BBDD
     *
     * @param con conexion a la base de datos
     * @param DNI DNI del usuario
     * @return boolean True si el DNI es correcto y no existe en la base de
     * datos
     */
    public static boolean comprobarDNI(Connection con, String DNI) {
        DNI = DNI.toUpperCase();
        PreparedStatement ps = null;
        ResultSet rs = null;

        HashMap<Integer, String> mapa = generarHashMap();

        if (DNI.matches("[0-9]{8}[A-Z]")) {
            if (DNI.substring(8).equals(mapa.get(Integer.parseInt(DNI.substring(0, 8)) % 23))) {
                // se prepara la sentencia para la BBDD como un String
                String selectDNI = "select dni from persona where dni = ?";

                try {

                    ps = con.prepareStatement(selectDNI);
                    ps.setString(1, DNI);
                    rs = ps.executeQuery();
                    rs.next();

                    //Es necesario usar el Next Para pasar a la primera Linea de la busqueda
                    //una vez en la primera linea podemos obtener la informacion;
                    if (DNI.equals(rs.getString(1))) {
                        return true;
                    }
                    return false;

                } catch (SQLException e) {
                    System.err.println("ERROR AL LEER DNI");
                    return false;
                }
            }
            return false;

        }
        return false;
    }

    /**
     * Comprueba si el Email tiene los parametros correctos (caracteres + "@" +
     * dominio + ".", pasado desde el registro y que no existe en la BBDD
     *
     * @param con conexion a la base de datos
     * @param email email del usuario
     * @return boolean True si el email es correcto y no existe en la base de
     * datos
     */
    public static boolean comprobrarEmail(Connection con, String email) {

        PreparedStatement ps = null;
        ResultSet rs = null;

        if (email.matches("[0-9a-zA-Z]+[@][a-z]+[.][a-z]{2,3}")) {

            // se prepara la sentencia para la BBDD como un String
            String selectEmail = "select email from persona where email = ?";

            try {

                ps = con.prepareStatement(selectEmail);
                ps.setString(1, email);
                rs = ps.executeQuery();

                //Es necesario usar el Next Para pasar a la primera Linea de la busqueda
                //una vez en la primera linea podemos obtener la informacion;
                rs.next();
                if (email.equals(rs.getString(1))) {
                    return true;
                }
                return false;

            } catch (SQLException e) {
                System.err.println("ERROR AL LEER EMAIL");
                return false;
            }

        }
        return false;

    }

    /**
     * Comprueba si el alias no esta vacio, pasado desde el registro y que no
     * existe en la BBDD
     *
     * @param con Conexion con la base de datos
     * @param alias alias del usuario
     * @return boolean True si el alias no existe en la BBDD
     */
    public static boolean comprobrarAlias(Connection con, String alias) {

        PreparedStatement ps = null;
        ResultSet rs = null;

        if (!"".equalsIgnoreCase(alias)) {

            // se prepara la sentencia para la BBDD como un String
            String selectAlias = "select alias from usuario where alias = ?";

            try {

                ps = con.prepareStatement(selectAlias);
                ps.setString(1, alias);
                rs = ps.executeQuery();
                rs.next();

                //Es necesario usar el Next Para pasar a la primera Linea de la busqueda
                //una vez en la primera linea podemos obtener la informacion;
                if (alias.equals(rs.getString(1))) {
                    return true;
                }
                return false;

            } catch (SQLException e) {
                System.err.println("ERROR AL LEER Alias");
                return false;
            }

        }
        return false;

    }

    /**
     * Comprueba que el nombre de usuario no esta vacio, pasado desde el
     * registro y que no existe en la BBDD
     *
     * @param con Conexion con la BBDD
     * @param nombreUsuario Nombre del usuario
     * @return boolean True si no existe el usuario
     */
    public static boolean comprobarNombreUsuario(Connection con, String nombreUsuario) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        if (!"".equalsIgnoreCase(nombreUsuario)) {

            // se prepara la sentencia para la BBDD como un String
            String selectNombreUsuario = "select nombre_usuario from usuario where nombre_usuario = ?";

            try {

                ps = con.prepareStatement(selectNombreUsuario);
                ps.setString(1, nombreUsuario);
                rs = ps.executeQuery();
                rs.next();

                //Es necesario usar el Next Para pasar a la primera Linea de la busqueda
                //una vez en la primera linea podemos obtener la informacion;
                if (nombreUsuario.equals(rs.getString(1))) {
                    return true;
                }
                return false;

            } catch (SQLException e) {
                System.err.println("ERROR AL LEER NombreUsuario");
                return false;
            }

        }
        return false;
    }

    /**
     * Metodo para comprobar que una fecha es correcta
     *
     * @param fecha Fecha para comprobar formato
     * @return True si el formato de la fecha es correcto
     */
    public static boolean comprobarFecha(String fecha) {
        if (fecha.matches("[0-9]{4}[-][0-9]{2}[-][0-9]{2}")) {
            String fechadivida[] = fecha.split("-");
            int fecha2[] = new int[fechadivida.length];
            for (int i = 0; i < fechadivida.length; i++) {
                fecha2[i] = Integer.parseInt(fechadivida[i]);
            }
            if (fecha2[0] <= 2013 && fecha2[0] >= 1900) {
                if (fecha2[1] <= 12 && fecha2[1] >= 1) {
                    if (fecha2[1] == 2) {
                        if (fecha2[2] <= 29 && fecha2[2] >= 1) {
                            return true;
                        } else if (fecha2[1] == 8) {
                            if (fecha2[2] <= 31 && fecha2[2] >= 1) {
                                return true;
                            }
                        } else if (fecha2[1] % 2 == 0) {
                            if (fecha2[2] <= 30 && fecha2[2] >= 1) {
                                return true;
                            }
                        }

                    }

                }
            }
            return true;
        }
        return false;
    }

    /**
     * Metodo para comprobar que el curso introducido es correcto
     *
     * @param curso Curso en el que se encuentra el alumno,0 si es profesor
     * @return True si es un curso valido
     */
    public static boolean comprobarCurso(int curso) {
        if (curso >= 0 || curso <= 4) {
            return true;
        }
        return false;
    }
    
    /**
     * Metodo para insertar usuario a nuestra base de datos
     * @param con
     * @param usuario
     * @param password
     * @param alias
     * @param nombre
     * @param apellido1
     * @param apellido2
     * @param DNI
     * @param curso
     * @param fecha
     * @param email
     * @param profesor 
     */
    public static void registrarUsuario(Connection con,String usuario,String password,String alias,String nombre,String apellido1,String apellido2,String DNI,int curso,String fecha,String email,boolean profesor){
        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;
        PreparedStatement ps3 = null;
        ResultSet rs = null;
        int id=0;

        //SQL
        String select = "select id_usuario from usuario where nombre_usuario = ?";
        String insert1 = "insert into usuario(nombre_usuario,contrasena,alias) values (?,md5(?),?)";
        String insert2 = "insert into persona(id_usuario,nombre,apellido1,apellido2,dni,email,curso,fecha_naci,profesor) values (?,?,?,?,?,?,?,?,?)";

        try {

            //Preparo el primer insert
            ps1= con.prepareStatement(insert1);
            ps1.setString(1, usuario);
            ps1.setString(2, password);
            ps1.setString(3, alias);
            
            //Ejecuto el primer insert
            ps1.executeUpdate();
            
            //Busco el id del nuevo usuario
            ps2= con.prepareStatement(select);
            ps2.setString(1, usuario);
            rs = ps2.executeQuery();
            rs.next();
            id=rs.getInt(1);
            
            //Preparo el segundo insert
            ps3= con.prepareStatement(insert2);
            ps3.setInt(1, id);
            ps3.setString(2, nombre);
            ps3.setString(3, apellido1);
            ps3.setString(4, apellido2);
            ps3.setString(5, DNI);
            ps3.setString(6, email);
            ps3.setInt(7, curso);
            ps3.setString(8, fecha);
            ps3.setBoolean(9, profesor);
            
            //Ejecuto el segundo insert
            ps3.executeUpdate();
            
   
        } catch (NumberFormatException e) {
            System.err.println("Error de conversion de numero");
        } catch (SQLException ex) {
            Logger.getLogger(MetodosCalculo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Metodo para generar un mapa para saber que letra va con los numeros del
     * DNI
     *
     * @return HashMap (Resto,Letra)
     */
    private static HashMap<Integer, String> generarHashMap() {
        HashMap<Integer, String> mapa = new HashMap();
        mapa.put(0, "T");
        mapa.put(1, "R");
        mapa.put(2, "W");
        mapa.put(3, "A");
        mapa.put(4, "G");
        mapa.put(5, "M");
        mapa.put(6, "Y");
        mapa.put(7, "F");
        mapa.put(8, "P");
        mapa.put(9, "D");
        mapa.put(10, "X");
        mapa.put(11, "B");
        mapa.put(12, "N");
        mapa.put(13, "J");
        mapa.put(14, "Z");
        mapa.put(15, "S");
        mapa.put(16, "Q");
        mapa.put(17, "V");
        mapa.put(18, "H");
        mapa.put(19, "L");
        mapa.put(20, "C");
        mapa.put(21, "K");
        mapa.put(22, "E");
        return mapa;

    }
}
