package com.org.demo;


import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee {



	Accountant acc;

	public Manager(Accountant acc) {
		System.out.println("Manager constructor");
		this.acc=acc;
	}
	public void doWork() {
		System.out.println("Manager- manages the branch office");
	}

public void CallMeeting() {
	acc.doWork();
	}


}
