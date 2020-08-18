package com.ssafy.jara.common.chating;

public class Socket {
	private String userName;	// 사용자
	private String content;		// 채팅 내용
	
	public Socket() {}

	public Socket(String userName, String content) {
		super();
		this.userName = userName;
		this.content = content;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Socket [userName=" + userName + ", content=" + content + "]";
	}

}
