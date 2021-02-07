package com.techelevator.tenmo;

import static org.junit.jupiter.api.Assertions.assertEquals;



import com.techelevator.tenmo.model.TransferTypes;

public class TransferTypeTest 
{
	
	TransferTypes transfer = new TransferType();
	
	public void transferTypeId_equals5()
	{
		transfer.setTransferTypeId(5);
		{
			assertEquals(transfer.getTransferTypeId(), 5);
		}
	}

}
			


