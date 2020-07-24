
package clients;

import clients.dtos.ClientOuput;
import clients.dtos.CreateOrEditClientInput;

public interface ClientsAppService {

    public void createOrEditClient(CreateOrEditClientInput input);
    
    public void deleteClient(Long id);
    
    public ClientOuput getClient(Long id);
}
