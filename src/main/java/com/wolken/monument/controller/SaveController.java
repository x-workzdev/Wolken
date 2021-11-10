package com.wolken.monument.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wolken.monument.dao.DetailsDAO;
import com.wolken.monument.dto.DetailsDTO;
import com.wolken.monument.entity.DetailsEntity;

@Controller
public class SaveController {
	@Autowired
	DetailsDAO dao;

	@RequestMapping(value = "save", method = RequestMethod.POST)
	ModelAndView saveDetails(DetailsDTO dto) {
		ModelAndView view = new ModelAndView();
		System.out.println(dto);
		DetailsEntity entity = new DetailsEntity();
		BeanUtils.copyProperties(dto, entity);
		
		dao.save(entity);
		view.setViewName("hello");
		
		view.addObject("msg","Data saved");
		view.addObject("data",dto);
		return view;
	}
	
	@RequestMapping("getAll")
	ModelAndView getAllDetails() {
		ModelAndView view = new ModelAndView("hello");
		List list=dao.getAll();
		view.addObject("list",list);
		return view;
	}

}
