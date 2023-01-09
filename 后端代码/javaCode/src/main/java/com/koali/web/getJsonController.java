package com.koali.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.koali.model.case10.CountData;
import com.koali.service.Impl.getDataJsonImpl;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class getJsonController {
    @Autowired
    @Qualifier("getDataJsonImpl")
    private com.koali.service.getDataJson getDataJson = new getDataJsonImpl();

    @RequestMapping("getDatajson")
    @ResponseBody
    public String getCountData() throws JsonProcessingException {
        CountData countData = getDataJson.getCountData();
        ObjectMapper mapper = new ObjectMapper();
        String jsonStr = mapper.writeValueAsString(countData);
        System.out.println("jsonStr = " + jsonStr);
        return jsonStr;
    }
}
