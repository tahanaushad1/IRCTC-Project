package com.example.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.binding.PassengerInfo;
import com.example.binding.TicketInfo;

@RestController
public class TicketRestController {
	@PostMapping(
			value="/ticket",
			produces= {"application/json"},
			consumes= {"application/json"}
			
			)
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo request){
		System.out.println(request);
		TicketInfo tinfo=new TicketInfo();
		tinfo.setTicketid(1200);
		tinfo.setPnr("kkjh609");
		tinfo.setTicket("Confirm");
		return new ResponseEntity<TicketInfo>(tinfo,HttpStatus.CREATED);
		
	}
	
}
