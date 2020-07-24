
package clients;

import clients.dtos.ClientOuput;
import clients.dtos.CreateOrEditClientInput;
import com.enterpriseframework.service.AppServiceBase;


public class ClientsAppServiceImpl  extends AppServiceBase implements ClientsAppService{

    @Override
    public void createOrEditClient(CreateOrEditClientInput input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteClient(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClientOuput getClient(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
