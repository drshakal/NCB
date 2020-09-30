package org.mycompany.services;

import org.mycompany.models.Request;
import org.mycompany.models.RequestLog;
import org.mycompany.models.Responce;


public class FundTransfer {
	
	
	public static Responce doFundTransfer(Request request)
	{	System.out.print(request.getCurruncyCode());
		Responce responce=new Responce();
		responce.setFromAccountNumber(request.getFromAccountNumber());
		responce.setFromBalance("58000.00");
		responce.setJournalReferance("JRN9909096680");
		responce.setToBalance("9000.00");
		
		RequestLog requestLog=new RequestLog();

		
		requestLog.setFromAccountNumber(request.getFromAccountNumber());
		requestLog.setToAccountNumber(request.getToAccountNumber());
		requestLog.setFromAmount(request.getFromAmount());
		requestLog.setToAmount(request.getToAmount());
		requestLog.setCurruncyCode(request.getCurruncyCode());;
		requestLog.setDate(null);
		
		
//		ReuestForwartToRepository reuestForwartToRepository;
//		ReuestForwartToRepository.processDef(requestLog);
	 
		
		return responce;
		
	}

}
