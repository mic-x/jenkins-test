@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping("index")
	@ResponseBody
	public String data() {
		System.out.println("-----data-----");
		return "hello word";
	}
}