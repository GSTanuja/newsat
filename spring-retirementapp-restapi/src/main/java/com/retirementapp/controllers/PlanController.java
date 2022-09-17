

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/Plans-restapi")
public class PlanController {

	@Autowired
	IPlanService iPlanService;

	@PostMapping("/plans")
	public ResponseEntity<Plan> addPlan(@RequestBody Plan plan) {
		Plan newPlan = iPlanService.addPlan(plan);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "one plan added");
		return ResponseEntity.ok().headers(headers).body(newPlan);
	}

	@PutMapping("/plans")
	public ResponseEntity<String> updatePlan(@RequestBody Plan plan) {
		iPlanService.updatePlan(plan);
		HttpHeaders headers = new HttpHeaders();
		return ResponseEntity.ok("updated");
	}

	@DeleteMapping("/plans/id/{uanId}")
	public ResponseEntity<Void> deletePlan(@PathVariable("uanId") int uanId) {
		iPlanService.deletePlan(uanId);
		return ResponseEntity.ok().build();
	}

	@GetMapping("/plans/uanId/{uanId}")
	public ResponseEntity<Plan> getByPlanId(@PathVariable("uanId") int uanId) {
		Plan plan	= iPlanService.getByPlanId(uanId);
		ResponseEntity<Plan> responseEntity=new ResponseEntity <Plan>(plan,HttpStatus.OK);
		
		
		return responseEntity;
	}
	@GetMapping("/plans")
	public ResponseEntity<List<Plan>> getAll(){
	List<Plan> plan	=iPlanService.getAll();
	ResponseEntity<List<Plan>> responseEntity=new ResponseEntity<List<Plan>>(plan,HttpStatus.OK);
		return responseEntity;
		
		
	}

}
