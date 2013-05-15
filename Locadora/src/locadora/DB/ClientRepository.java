package locadora.DB;

import java.net.ConnectException;

import locadora.basics.Clients;
import locadora.exceptions.QueryException;

public interface ClientRepository {
	
	public void insert(Clients p) throws QueryException,ConnectException;

}
