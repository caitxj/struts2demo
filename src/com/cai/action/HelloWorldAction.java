package com.cai.action;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.cai.model.Circle;
import com.cai.model.User;
import com.cai.util.Counter;


public class HelloWorldAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5836945642350696856L;

	private String msg;
	
	private User user;
	
	private Map<String, Object> jsonModel=new HashMap<>();
	
	private List<User> users=new ArrayList<>();
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	private File upImage;
	
	private Circle circle;
	
	private Counter counter;
	
	private String upImageContentType;
	
	private String upImageFileName;
	
	public String excute(){
		for(int i=0;i<5;i++){
			User u=new User();
			u.setName("mj"+i);
			users.add(u);
		}
		user=new User();
		user.setName("JJ");
		
		msg="hello,World";
		System.out.println("--------------------------sadfasdfasd-f-------------------");
		if(circle!=null){
			System.out.println("cicle:"+circle.getRadius()+"-------------------------------------->");
		}
//		return SUCCESS;
		return "success";
	}
	
	public String userAdd(){
		msg="wwwe";
//		System.out.println("cicle:"+circle.getRadius()+"-------------------------------------->");
//		return SUCCESS;
		return "success";
	}
	
	public String uploadFile() {
		
//		try{
//		InputStream fin=new FileInputStream(upImage);
//		FileOutputStream fou=new FileOutputStream(new File(upImageFileName));
//		byte[] bytes=new byte[1024*5];
//		int count=0;
//		while((count=fin.read(bytes))!=-1){
//				fou.write(bytes);
//		}
//		fou.close();
//		fin.close();
//		}catch(Exception e){
//			System.out.println(e.getMessage());
//		}
		
		 String realpath = ServletActionContext.getServletContext().getRealPath("/images");
	        //D:\apache-tomcat-6.0.18\webapps\struts2_upload\images
	        System.out.println("realpath: "+realpath);
	        if (upImage != null) {
	            File savefile = new File(new File(realpath), upImageFileName);
	            if (!savefile.getParentFile().exists())
	                savefile.getParentFile().mkdirs();
	            try {
					FileUtils.copyFile(upImage, savefile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//	            ActionContext.getContext().put("message", "�ļ��ϴ��ɹ�");
	        }
//		return SUCCESS;
	        return "success";
	}
	
	public String ajaxOut() throws IOException{
		for(int i=0;i<5;i++){
			User u=new User();
			u.setName("mj-michael"+i);
			users.add(u);
		}
		jsonModel.put("userList", users);
		return "success";
//		HttpServletResponse res=ServletActionContext.getResponse();
//		PrintWriter pw=res.getWriter();
//		pw.write(10);
//		pw.flush();
//		pw.close();
		
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public File getUpImage() {
		return upImage;
	}

	public void setUpImage(File upImage) {
		this.upImage = upImage;
	}

	public String getUpImageContentType() {
		return upImageContentType;
	}

	public void setUpImageContentType(String upImageContentType) {
		this.upImageContentType = upImageContentType;
	}

	public String getUpImageFileName() {
		return upImageFileName;
	}

	public void setUpImageFileName(String upImageFileName) {
		this.upImageFileName = upImageFileName;
	}

//	@Override
//	public void validate() {
//		if(user!=null){
//			if(StringUtils.isBlank(user.getName())){
//				addFieldError("user.name", "user's name requried.......");
//			}
//		}
//	}

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public Map<String, Object> getJsonModel() {
		return jsonModel;
	}

	public void setJsonModel(Map<String, Object> jsonModel) {
		this.jsonModel = jsonModel;
	}
	
	
	
	
}
