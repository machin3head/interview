package com.interview.project.controller;

import com.interview.project.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StateController {

    private final StateService stateService;

    @Autowired
    public StateController(StateService stateService) {
        this.stateService = stateService;
    }


    /**
     *      TODO create a GET API to return a DTO containing all states with all their surveys
     *      sample payload
     *      [
     *          {
     *              stateId: 8,
     *              stateName: California,
     *              stateAbbreviation: CA,
     *              surveys: [
     *                  {
     *                      id: 3,
     *                      name: Land Appreciation 2017
     *                  }
     *              ]
     *          },
     *          etc...
     *      ]
     */

}
