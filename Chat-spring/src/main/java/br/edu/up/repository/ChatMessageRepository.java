package br.edu.up.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.model.ChatMessage;

public interface ChatMessageRepository extends JpaRepository<ChatMessage, String> {

}
