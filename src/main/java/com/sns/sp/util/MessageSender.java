package com.sns.sp.util;

import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;

public class MessageSender {
	static final String username = "gusqls31179@gmail.com";
	static final String password = "dkskzhsek1";

	public static String createKey() throws Exception { // 암호 생성
		StringBuffer key = new StringBuffer();
		Random rnd = new Random();

		for (int i = 0; i < 10; i++) {
			int index = rnd.nextInt(3);

			switch (index) {
			case 0:
				key.append((char) ((int) (rnd.nextInt(26)) + 97));
				break;
			case 1:
				key.append((char) ((int) (rnd.nextInt(26)) + 65));
				break;
			case 2:
				key.append((rnd.nextInt(10)));
				break;
			}
		}

		return key.toString();
	}



	public static String sendmail(String email) {
		
		String keyCode="";
		
		try {
			keyCode = createKey();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String subject = "[CLUB] 비밀번호 찾기 인증코드";

		String msg = "";
		msg += "<div align='center' style='border:1px solid black; font-family:verdana'> ";
		msg += "<h3 style='color:blue;'>비밀번호 찾기 인증코드입니다.</h3>";
		msg += "<div style='font-size: 130%'>";
		msg += "비밀번호가 <strong>";
		msg += keyCode + "</strong> 이 코드로 변경 되었습니다.</div><br/>";
		Properties props = new Properties();
		/*
		 * props.put("mail.smtp.user",username); props.put("mail.smtp.password",
		 * password);
		 */
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "25");
		props.put("mail.debug", "true");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.EnableSSL.enable", "true");
		props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.setProperty("mail.smtp.socketFactory.fallback", "false");
		props.setProperty("mail.smtp.port", "465");
		props.setProperty("mail.smtp.socketFactory.port", "465");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		System.out.println("??");
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));//
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
			message.setSubject(subject);
			message.setContent(msg, "text/html; charset=utf-8");// 내용
			// message.setContent("내용","text/html; charset=utf-8");//글내용을 html타입 charset설정
			System.out.println("send!!!");
			Transport.send(message);
			System.out.println("SEND");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return keyCode;
	}

}