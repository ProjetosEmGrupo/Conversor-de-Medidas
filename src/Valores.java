import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComboBox;

public class Valores {
	public static void main(String[] args, String Valor, String s0, String s1, String s2, String s3) {
	
		//Classes
		Index TelaInicial = new Index();
		Conversao ClasseConversao = new Conversao();
		
		//Janela
		Frame f = new Frame("Conversão de "+Valor);
	    f.setLocationRelativeTo(null);
	    f.setLayout(null);    
	    f.setSize(500, 500);    
	    f.setVisible(true);
	    
	    //Componentes internos das janelas
	    //Mensagem
	    Label mensagem;
	    mensagem = new Label("Conversão de "+Valor+":");  
	    mensagem.setBounds(70, 50, 300, 50);
	    f.add(mensagem);
	    
	    //Campo de entrada
	    TextField CampoEntrada;  
	    CampoEntrada = new TextField();  
	    CampoEntrada.setBounds(70, 100, 150, 30);
        CampoEntrada.setColumns(10);
        CampoEntrada.addKeyListener((KeyListener) new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char vChar = e.getKeyChar();
                if (!(Character.isDigit(vChar) || 
                		(vChar == KeyEvent.VK_BACK_SPACE) || 
                		(vChar == KeyEvent.VK_DELETE) || 
                		(vChar == KeyEvent.VK_PERIOD))) {
                    e.consume();
                }
            }
        });
        f.add(CampoEntrada);
	    
	    //ComboBox das medidas de entrada
	    String Grandezas[] = {s0, s1, s2, s3};
	    JComboBox ComboBoxMedidasEntrada = new JComboBox(Grandezas);    
	    ComboBoxMedidasEntrada.setBounds(270, 100 , 100, 30);    
	    f.add(ComboBoxMedidasEntrada);
	    
	    //Campo de saida do valor
		 Label CampoSaida;
		 CampoSaida = new Label();
		 CampoSaida.setBounds(70, 150, 150, 30);
		 CampoSaida.setEnabled(true);
		 CampoSaida.setText("");
		 f.add(CampoSaida);
	    
	    //ComboBox das medidas de saida
	    JComboBox ComboBoxMedidasSaida = new JComboBox(Grandezas);    
	    ComboBoxMedidasSaida.setBounds(270, 150 , 100, 30);    
	    f.add(ComboBoxMedidasSaida);
	    
	    //Botão de Converter
	     Button BotaoConverter = new Button("Converter");
	     BotaoConverter.setBounds(70, 200, 120, 30);
	     f.add(BotaoConverter);
	     BotaoConverter.addActionListener( new ActionListener() { 
	    	 public void actionPerformed(ActionEvent e) { 
	    		 String GrandezaEntrada = ComboBoxMedidasEntrada.getSelectedItem().toString();
	    		 String GrandezaSaida = ComboBoxMedidasSaida.getSelectedItem().toString();
	    		 String EntradaTexto = CampoEntrada.getText();
	    		 float EntradaFloat = Float.parseFloat(EntradaTexto);
	    		 ClasseConversao.Converter(Valor, EntradaFloat, GrandezaEntrada, GrandezaSaida);
	    		 CampoSaida.setText(ClasseConversao.Resposta);
	    		 } });
	     
	     //Botão de Voltar
	     Button BotaoVoltar = new Button("Voltar");  
	     BotaoVoltar.setBounds(70, 250, 120, 30);  
	     f.add(BotaoVoltar);
	     BotaoVoltar.addActionListener( new ActionListener() { 
	    	 public void actionPerformed(ActionEvent e) { 
	    		 f.setVisible(false);
	    		 TelaInicial.main(args);
	    		 } });
	     
	     //Botão de Sair
	     Button BotaoSair = new Button("Sair");  
	     BotaoSair.setBounds(200, 250, 120, 30);
	     f.add(BotaoSair);
	     BotaoSair.addActionListener( new ActionListener() { 
	    	 public void actionPerformed(ActionEvent e) { 
	    		 ClasseConversao.SairPrograma();
	    		 } });
	}
}