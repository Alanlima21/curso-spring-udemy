package com.alanlima.cursospring.services;

import org.springframework.mail.SimpleMailMessage;

import com.alanlima.cursospring.domain.Pedido;

public interface EmailService {

	void senderOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
