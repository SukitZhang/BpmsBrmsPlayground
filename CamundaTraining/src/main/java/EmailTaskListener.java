import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;

public class EmailTaskListener implements ExecutionListener  {
   
    @Override
    public void notify(DelegateExecution execution) {
        //Pega id task
        //busca configura��es
        //seta tudo no fluxo
        execution.setVariable("email", "bigwillgluck@gmail.com");
    }

}
