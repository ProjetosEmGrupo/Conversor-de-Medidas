import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

public class Index {
	public static void main(String[] args) {
		
		//Classes
		Conversao ClasseConversao = new Conversao();
		
		//Janela
	    Frame f = new Frame("Conversor de Medidas");
	    f.setLocationRelativeTo(null); 
	    f.setLayout(null);    
	    f.setSize(400, 250);    
	    f.setVisible(true); 

	    //Componentes internos das janelas
	    //Mensagem
	    Label mensagem;
	    mensagem = new Label("Selecione o tipo de medida a ser convertida:");  
	    mensagem.setBounds(70, 50, 300, 50);
	    f.add(mensagem);
	    
	   //ComboBox das medidas
	    String medidas[]={"Comprimento","Massa","Armazenamento","Tempo","Velocidade"};       
	    JComboBox ComboBoxMedidas = new JComboBox(medidas);    
	    ComboBoxMedidas.setBounds(70, 100 , 200, 30);
	    f.add(ComboBoxMedidas);
	        
	     //Botão de Seleção
	     Button BotaoSelecionar = new Button("Selecionar Medida");  
	     BotaoSelecionar.setBounds(70, 160, 120, 30);  
	     f.add(BotaoSelecionar);
	     BotaoSelecionar.addActionListener( new ActionListener() { 
	    	 public void actionPerformed(ActionEvent e) { 
	    		 f.setVisible(false);
	    		 String Valor = ComboBoxMedidas.getSelectedItem().toString();
	    		 ClasseConversao.SelecionarMedida(Valor);
	    		 String a = ClasseConversao.s0;
	    		 String b = ClasseConversao.s1;
	    		 String c = ClasseConversao.s2;
	    		 String d = ClasseConversao.s3;
	    		 Valores.main(args, Valor, a, b, c, d);
	    		 } 
	    	 });
	     
	     //Botão de Sair
	     Button BotaoSair = new Button("Sair");  
	     BotaoSair.setBounds(200, 160, 120, 30);
	     f.add(BotaoSair);
	     BotaoSair.addActionListener( new ActionListener() { 
	    	 public void actionPerformed(ActionEvent e) { 
	    		 ClasseConversao.SairPrograma();
	    		 } 
	    	 });
	}
}
