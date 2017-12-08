/**
 *
 */
package calcio.biglietti.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author maeda
 *
 */
@Controller
public class SampleJspController {

	@RequestMapping(value = "/", method = GET)
	public String show() {
		// jspのファイル名
		return "test";
	}
}