import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interaction_window extends JFrame implements ActionListener {
    JTextField number_hello_input;
    JTextField name_hello_input;
    JTextField find_multiple_of_three_input;
    JTextArea output_field;
    JButton number_hello_submit;
    JButton name_hello_submit;
    JButton find_multiple_of_three_submit;


    Interaction_window(){
        this.setSize(450, 500);
        this.setResizable(false);
        this.setTitle("ASTON тестовое задание. Рочев Р.В. JAVA");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        JLabel info_on_number_hello = new JLabel();
        info_on_number_hello.setText("Вывод \"Привет\" если введено число больше 7");
        info_on_number_hello.setBounds(65, 0, 450, 20);
        this.add(info_on_number_hello);

        number_hello_input = new JTextField();
        number_hello_input.setBounds(65, 20, 200, 25);
        this.add(number_hello_input);

        number_hello_submit = new JButton("Ввод");
        number_hello_submit.setBounds(285, 20, 100, 25);
        number_hello_submit.addActionListener(this);
        this.add(number_hello_submit);

        JLabel info_on_name_hello = new JLabel();
        info_on_name_hello.setText("Вывод \"Привет, Вячеслав\" при вводе \"Вячеслав\"");
        info_on_name_hello.setBounds(65, 60, 450, 20);
        this.add(info_on_name_hello);

        name_hello_input = new JTextField();
        name_hello_input.setBounds(65, 80, 200, 25);
        this.add(name_hello_input);

        name_hello_submit = new JButton("Ввод");
        name_hello_submit.setBounds(285, 80, 100, 25);
        name_hello_submit.addActionListener(this);
        this.add(name_hello_submit);

        JLabel info_on_find_multiple_of_three = new JLabel();
        info_on_find_multiple_of_three.setText("Вывод элементов числового массива кратных 3.");
        info_on_find_multiple_of_three.setBounds(65, 120, 450, 20);
        JLabel input_format_help = new JLabel();
        input_format_help.setText("Формат ввода: числа через запятую.");
        input_format_help.setBounds(65, 140, 450, 20);
        this.add(info_on_find_multiple_of_three);
        this.add(input_format_help);

        find_multiple_of_three_input = new JTextField();
        find_multiple_of_three_input.setBounds(65, 160, 200, 25);
        this.add(find_multiple_of_three_input);

        find_multiple_of_three_submit = new JButton("Ввод");
        find_multiple_of_three_submit.setBounds(285, 160, 100, 25);
        find_multiple_of_three_submit.addActionListener(this);
        this.add(find_multiple_of_three_submit);

        JLabel output_label = new JLabel();
        output_label.setText("Вывод:");
        output_label.setBounds(65, 230, 450, 20);
        this.add(output_label);

        output_field = new JTextArea();
        output_field.setEditable(false);
        JScrollPane scroll = new JScrollPane(output_field);
        scroll.setBounds(65, 250, 320, 170);
        this.add(scroll);

        this.setVisible(true);
    }

    void relay_output_to_gui(String result){
        output_field.append(result+"\n");
        output_field.setCaretPosition(output_field.getDocument().getLength());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String output;
        if(e.getSource()==number_hello_submit){
           output = Main.number_hello(number_hello_input.getText());
           relay_output_to_gui(output);
        }
        else if (e.getSource()==name_hello_submit){
            output = Main.name_hello(name_hello_input.getText());
            relay_output_to_gui(output);
        }
        else if (e.getSource()==find_multiple_of_three_submit) {
            output = Main.find_dividable_by_three(find_multiple_of_three_input.getText());
            relay_output_to_gui(output);
        }
    }
}

