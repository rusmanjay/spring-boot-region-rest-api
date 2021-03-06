package region.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import region.api.models.Village;
import region.api.service.VillageService;

@RestController
@RequestMapping("/v1/village")
public class VillageController {

	@Autowired
	VillageService villageService;

	@RequestMapping(method = RequestMethod.GET)
	public Page<Village> findAll(Pageable pagable) {
		return villageService.findAll(pagable);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Village find(@PathVariable String id) {
		return villageService.findOne(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Village create(@RequestParam String id, @RequestParam String district_id, @RequestParam String name) {
		return villageService.create(id, district_id, name);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
	public Village update(@PathVariable String id, @RequestParam String district_id, @RequestParam String name) {
		return villageService.update(id, district_id, name);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable String id) {
		villageService.delete(id);
	}
}
