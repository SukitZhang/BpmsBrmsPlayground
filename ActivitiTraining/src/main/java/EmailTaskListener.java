import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.ExecutionListener;

public class EmailTaskListener implements ExecutionListener  {

    private static final long serialVersionUID = -5413645619452067523L;
   
    @Override
    public void notify(DelegateExecution execution) {
        //Pega id task
        //busca configura��es
        //seta tudo no fluxo
        execution.setVariable("email", "bigwillgluck@gmail.com");
    }

}
