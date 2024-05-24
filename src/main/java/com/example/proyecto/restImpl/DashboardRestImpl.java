package com.example.proyecto.restImpl;

import com.example.proyecto.constents.CafeConstant;
import com.example.proyecto.rest.DashboardRest;
import com.example.proyecto.service.DashboardService;
import com.example.proyecto.utils.CafeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class DashboardRestImpl implements DashboardRest {
    @Autowired
    DashboardService dashboardService;

    @Override
    public ResponseEntity<Map<String, Object>> getCount() {
        return dashboardService.getCount();
    }
}
