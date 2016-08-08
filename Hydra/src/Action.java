import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;

public class Action {
	
	private Gui view;
	private Station stat;
	
	public Action(){
		this.view = new Gui();
		this.stat = new Station();
		
		this.view.addExecListener(new ExecListener());
	}

	class ExecListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//List<String> list = new ArrayList<String>();
			//String[] list = {};
			HashSet<String> list = new HashSet();
			String a,b;
			try{
				a = view.getAccid1();
				b = view.getAccid1a();
				list.add(a);
				list.add(b);
				//stat.genTable(list);
				
			}catch(StringIndexOutOfBoundsException ex){
				view.displayErrorMessage("Errorrrrr");
			}
		}
		
	}
	
	
}
