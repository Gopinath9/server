package com.rs.bean.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class School implements DisposableBean, InitializingBean {
	private String name;
	private String board;

	School() {
		System.out.println("Constructor of ban is invoked");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBoard() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("After properties set ");
	}

	public void destroy() throws Exception {
		System.out.println("destory method school bean is invoked!");
	}

	public void init() throws Exception {
		System.out.println("init");
	}
}