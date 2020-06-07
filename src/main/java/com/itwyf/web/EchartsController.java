package com.itwyf.web;

import com.itwyf.entity.Echarts;
import com.itwyf.service.EchartsService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: EchartsDemo
 * @description:
 * @author: 吴云飞
 * @create: 2020-06-07 13:10
 */

@Controller
public class EchartsController {

    @GetMapping("/index")
    public String index(){
        return "echarts";
    }
    @Autowired
    private EchartsService echartsService;
    @RequestMapping ("/echarts")
    @ResponseBody
    public JSONArray echartJson(Model model) {
        List<Echarts> list = echartsService.findAll();
        JSONArray jsonArray = JSONArray.fromObject(list);
        model.addAttribute(jsonArray);
        System.out.println(jsonArray);
        return jsonArray;
    }
}
