package com.pipesnfilters;

import java.io.Serializable;

/* Class that represents the data structure of the message that is exchanged between nodes */
/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public class MessageDetails implements Serializable
{
	String Message;
	int transID;
	
	MessageDetails(String msg, int rID)
	{
		
		this.Message = msg;
		this.transID = rID;
		
	}
	
	
}