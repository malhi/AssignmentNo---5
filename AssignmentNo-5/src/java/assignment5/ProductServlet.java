/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment5;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 *
 * @author c0653616
 */

public class ProductServlet {
     @GET
    @Produces("application/json")
    public String doGet() {
        return getResults("SELECT * FROM product");
    }

    private String getResults(String select__from_product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
