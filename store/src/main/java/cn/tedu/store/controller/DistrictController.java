package cn.tedu.store.controller;

import cn.tedu.store.entity.District;
import cn.tedu.store.service.IDistrictService;
import cn.tedu.store.util.JsonResult;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("districts")
public class DistrictController extends BaseController {

  @Autowired
  IDistrictService service;

  @GetMapping("/")
  public JsonResult<List<District>> listByParent(String parent) {
    List<District> list = service.listByParent(parent);
    return new JsonResult<List<District>>(SUCCESS, list);
  }

}
