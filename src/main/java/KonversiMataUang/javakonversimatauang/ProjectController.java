/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KonversiMataUang.javakonversimatauang;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author asus
 */

@Controller
public class ProjectController {
    @RequestMapping("/input")
    public String IDRtoALL(HttpServletRequest data, Model hasil) {
        
        String inputidr = data.getParameter("var_idr");
        
        Double iIDR = Double.valueOf(inputidr);
        
        Double USD = iIDR * 0.000070;
        Double Won = iIDR * 0.084;
        Double EUR = iIDR * 0.00062;
        
        
        hasil.addAttribute("usd", USD);
        hasil.addAttribute("won", Won);
        hasil.addAttribute("eur", EUR);
        
        return "view";       
       
    }
}
