package com.example.gabi2.quizradiobutton;

import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.icu.text.DecimalFormat;

public class perguntas extends AppCompatActivity{
    RadioButton resposta1;
    RadioButton resposta2;
    RadioButton resposta3;
    RadioButton resposta4;
    RadioButton resposta5;
    Button enviar;
    TextView pergunta;
    TextView titulo;
    TextView warning;
    Double contador;
    Integer op = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.perguntas);

        //Respostas
        resposta1 = (RadioButton)findViewById(R.id.resposta1);
        resposta2 = (RadioButton)findViewById(R.id.resposta2);
        resposta3 = (RadioButton)findViewById(R.id.resposta3);
        resposta4 = (RadioButton)findViewById(R.id.resposta4);
        resposta5 = (RadioButton)findViewById(R.id.resposta5);

        //pergunta
        pergunta = (TextView)findViewById(R.id.pergunta);

        //Título das Questões
        titulo = (TextView)findViewById(R.id.questao1);

        //Aviso no TextView
        warning = (TextView)findViewById(R.id.warning);

        //Botão Conferir
        enviar = (Button)findViewById((R.id.enviar));

        //Se ele clicar em Enviar
        enviar.setOnClickListener(new View.OnClickListener() {
                                   @RequiresApi(api = Build.VERSION_CODES.N)
                                   public void onClick(View v) {
                                       if(resposta1.isChecked() || resposta2.isChecked() || resposta3.isChecked() || resposta4.isChecked() || resposta5.isChecked()) {
                                           warning.setText("");


                                           //QUESTÃO 1


                                           if (op == 0) {

                                               //Opção Certa
                                               if (resposta3.isChecked()) {
                                                   contador = 1.00;
                                                   resposta3.setTextColor(Color.GREEN);
                                               }else if (resposta2.isChecked()) {
                                                   resposta2.setTextColor(Color.RED);
                                                   contador = 0.00;
                                               }
                                               else if (resposta1.isChecked()) {
                                                   resposta1.setTextColor(Color.RED);
                                                   contador = 0.00;
                                               }
                                               else if (resposta4.isChecked()) {
                                                   resposta4.setTextColor(Color.RED);
                                                   contador = 0.00;
                                               }
                                               else if (resposta5.isChecked()) {
                                                   resposta5.setTextColor(Color.RED);
                                                   contador = 0.00;
                                               }

                                               enviar.setText("Próximo");
                                               enviar.setTextColor(Color.WHITE);
                                               op++;
                                           }
                                           else if (enviar.getText() == "Próximo" && op == 1) {

                                               //desmarcandp
                                               resposta1.setChecked(false);
                                               resposta2.setChecked(false);
                                               resposta3.setChecked(false);
                                               resposta4.setChecked(false);
                                               resposta5.setChecked(false);

                                               //deixando preto
                                               resposta1.setTextColor(Color.BLACK);
                                               resposta2.setTextColor(Color.BLACK);
                                               resposta3.setTextColor(Color.BLACK);
                                               resposta4.setTextColor(Color.BLACK);
                                               resposta5.setTextColor(Color.BLACK);
                                               titulo.setText("Questão 2");
                                               pergunta.setText("analise as afirmativas a seguir e assinale a alternativa correta:.\n" +
                                                       "I. Além do Android SDK, a configuração padrão para preparar um ambiente de desenvolvimento Android inclui a instalação do JDK.\n" +
                                                       "II. O Android Virtual Device Manager provê uma interface gráfica do usuário, através da qual podese criar e gerenciar Android Virtual Devices (AVDs).\n" +
                                                       "III. Atualmente, somente é possível criar ambientes de desenvolvimento Android em sistemas operacionais open-source, como Ubuntu Linux e FreeBSD.\"");
                                               resposta1.setText("Uma classe filha");
                                               resposta2.setText("Uma biblioteca");
                                               resposta3.setText("Comunicador de páginas Java");
                                               resposta4.setText("A classe principal Java");
                                               resposta5.setText("N.D.A");
                                               enviar.setText("Conferir");
                                           }

                                           else if(enviar.getText() == "Conferir" && op == 1){
                                               if (resposta3.isChecked()) {
                                                   contador = contador + 1.00;
                                                   resposta3.setTextColor(Color.GREEN);
                                               }else if (resposta2.isChecked()) {
                                                   resposta2.setTextColor(Color.RED);
                                               }
                                               else if (resposta4.isChecked()) {
                                                   resposta4.setTextColor(Color.RED);
                                               }
                                               else if (resposta1.isChecked()) {
                                                   resposta1.setTextColor(Color.RED);
                                               }
                                               else if (resposta5.isChecked()) {
                                                   resposta5.setTextColor(Color.RED);
                                               }

                                               enviar.setText("Próximo");
                                               enviar.setTextColor(Color.WHITE);
                                               op++;
                                           }
                                           else if(enviar.getText() == "Próximo" && op == 2){
                                               resposta1.setChecked(false);
                                               resposta2.setChecked(false);
                                               resposta3.setChecked(false);
                                               resposta4.setChecked(false);
                                               resposta5.setChecked(false);
                                               resposta1.setTextColor(Color.BLACK);
                                               resposta2.setTextColor(Color.BLACK);
                                               resposta3.setTextColor(Color.BLACK);
                                               resposta4.setTextColor(Color.BLACK);
                                               resposta5.setTextColor(Color.BLACK);
                                               titulo.setText("Questão 3");
                                               pergunta.setText("Apesar dos incrementos das capacidades de memória e de processamento dos dispositivos móveis, limites são sempre atingidos em razão da demanda crescente dos usuários por aplicativos com as mais variadas funções, muitas vezes envolvendo o uso de múltiplos sensores e recursos gráficos de alta qualidade.\n" +
                                                       "\n" +
                                                       "Caso o conjunto de aplicativos utilizados exceda o total de memória disponível, o sistema operacional Android irá");
                                               resposta1.setText("Solicitar ao usuário que termine um dos aplicativos em uso");
                                               resposta2.setText("Terminar automaticamente o aplicativo de menor prioridade");
                                               resposta3.setText("Bloquear toda a execução do sistema, requerendo reinício");
                                               resposta4.setText("Terminar todos os aplicativos");
                                               resposta5.setText("Terminar apenas o aplicativo em uso");
                                               enviar.setText("Conferir");
                                           }
                                           else if(enviar.getText() == "Conferir" && op == 2){
                                               //resposta certa
                                               if (resposta2.isChecked()) {
                                                   contador = contador + 1.00;
                                                   resposta2.setTextColor(Color.GREEN);

                                                   //respostas erradas
                                               }else if (resposta1.isChecked()) {
                                                   resposta1.setTextColor(Color.RED);
                                               }
                                               else if (resposta3.isChecked()) {
                                                   resposta3.setTextColor(Color.RED);
                                               }
                                               else if (resposta4.isChecked()) {
                                                   resposta4.setTextColor(Color.RED);
                                               }
                                               else if (resposta5.isChecked()) {
                                                   resposta5.setTextColor(Color.RED);
                                               }
                                               enviar.setText("Próximo");
                                               enviar.setTextColor(Color.WHITE);
                                               op++;
                                           }
                                           else if(enviar.getText() == "Próximo" && op == 3){

                                               //dermarcar
                                               resposta1.setChecked(false);
                                               resposta2.setChecked(false);
                                               resposta3.setChecked(false);
                                               resposta4.setChecked(false);
                                               resposta5.setChecked(false);

                                               //tirar a cor vermelha
                                               resposta1.setTextColor(Color.BLACK);
                                               resposta2.setTextColor(Color.BLACK);
                                               resposta3.setTextColor(Color.BLACK);
                                               resposta4.setTextColor(Color.BLACK);
                                               resposta5.setTextColor(Color.BLACK);
                                               titulo.setText("Questão 4");

                                               //Indicando perguntas e respostas
                                               pergunta.setText("A respeito dos arquivos que compõem um projeto android, assinale a opção correta");
                                               resposta1.setText("O arquivo mainActivity.java contém os métodos básicos de acesso ao android e às bibliotecas necessárias para que os aplicativos sejam executadosa");
                                               resposta2.setText("O arquivo persistent.xml, criado por padrão no diretório raiz da aplicação, é utilizado para o armazenamento de constantes utilizadas no aplicativo");
                                               resposta3.setText("Cada atividade criada em um aplicativo deve ser declarada no arquivo activity.xml");
                                               resposta4.setText("As permissões necessárias, bem como o intent-filters, os receptores e as referências a outros arquivos ficam armazenadas no arquivo R.java");
                                               resposta5.setText("O arquivo main.xml define a interface de usuário para sua atividade");
                                               enviar.setText("Conferir");
                                           }
                                           else if(enviar.getText() == "Conferir" && op == 3){

                                               //resposta certa
                                               if (resposta5.isChecked()) {
                                                   contador = contador + 1.00;
                                                   resposta5.setTextColor(Color.GREEN);

                                                   //respostas erradas
                                               }else if (resposta1.isChecked()) {
                                                   resposta1.setTextColor(Color.RED);
                                               }
                                               else if (resposta2.isChecked()) {
                                                   resposta2.setTextColor(Color.RED);
                                               }
                                               else if (resposta3.isChecked()) {
                                                   resposta3.setTextColor(Color.RED);
                                               }
                                               else if (resposta4.isChecked()) {
                                                   resposta4.setTextColor(Color.RED);
                                               }
                                               //next
                                               enviar.setText("Próximo");
                                               enviar.setTextColor(Color.WHITE);
                                               op++;
                                           }
                                           else if(enviar.getText() == "Próximo" && op == 4){

                                               //desmarcando
                                               resposta1.setChecked(false);
                                               resposta2.setChecked(false);
                                               resposta3.setChecked(false);
                                               resposta4.setChecked(false);
                                               resposta5.setChecked(false);

                                               //tirando o vermelho
                                               resposta1.setTextColor(Color.BLACK);
                                               resposta2.setTextColor(Color.BLACK);
                                               resposta3.setTextColor(Color.BLACK);
                                               resposta4.setTextColor(Color.BLACK);
                                               resposta5.setTextColor(Color.BLACK);

                                               //perguntas e respostas
                                               titulo.setText("Questão 5");
                                               pergunta.setText(" Como obter uma resposta de uma atividade no Android" );
                                               resposta1.setText("startActivityToResult()");
                                               resposta2.setText("startActiivtyForResult()");
                                               resposta3.setText("Bundle()");
                                               resposta4.setText("Show()");
                                               resposta5.setText("Nenhuma das anteriores");
                                               enviar.setText("Conferir");
                                           }
                                           else if(enviar.getText() == "Conferir" && op == 4){

                                               //resposta certa
                                               if (resposta2.isChecked()) {
                                                   contador = contador + 1.00;
                                                   resposta2.setTextColor(Color.GREEN);

                                                   //respostas erradas
                                               }else if (resposta1.isChecked()) {
                                                   resposta1.setTextColor(Color.RED);
                                               }
                                               else if (resposta3.isChecked()) {
                                                   resposta3.setTextColor(Color.RED);
                                               }
                                               else if (resposta4.isChecked()) {
                                                   resposta4.setTextColor(Color.RED);
                                               }
                                               else if (resposta5.isChecked()) {
                                                   resposta5.setTextColor(Color.RED);
                                               }
                                               //next
                                               enviar.setText("Próximo");
                                               enviar.setTextColor(Color.WHITE);
                                               op++;
                                           }
                                           else if(enviar.getText() == "Conferir" && op == 5){

                                               //certa
                                               if (resposta4.isChecked()) {
                                                   contador = contador + 1.00;
                                                   resposta4.setTextColor(Color.GREEN);

                                                   //erradas
                                               }else if (resposta1.isChecked()) {
                                                   resposta1.setTextColor(Color.RED);
                                               }
                                               else if (resposta2.isChecked()) {
                                                   resposta2.setTextColor(Color.RED);
                                               }
                                               else if (resposta3.isChecked()) {
                                                   resposta3.setTextColor(Color.RED);
                                               }
                                               else if (resposta5.isChecked()) {
                                                   resposta5.setTextColor(Color.RED);
                                               }

                                               enviar.setText("Próximo");
                                               enviar.setTextColor(Color.WHITE);
                                               op++;
                                           }
                                           else if(enviar.getText() == "Próximo" && op == 5){

                                               //desmarcar
                                               resposta1.setChecked(false);
                                               resposta2.setChecked(false);
                                               resposta3.setChecked(false);
                                               resposta4.setChecked(false);
                                               resposta5.setChecked(false);

                                               //tirar vermelho
                                               resposta1.setTextColor(Color.BLACK);
                                               resposta2.setTextColor(Color.BLACK);
                                               resposta3.setTextColor(Color.BLACK);
                                               resposta4.setTextColor(Color.BLACK);
                                               resposta5.setTextColor(Color.BLACK);

                                               //pergunta e respostas
                                               titulo.setText("Questão 6");
                                               pergunta.setText("Qual é a tela inicial no android?");
                                               resposta1.setText("Actividade inicial de uma aplicação");
                                               resposta2.setText("O serviço inicial de uma aplicação");
                                               resposta3.setText("Método inicial de uma aplicação");
                                               resposta4.setText("Tela inicial de uma aplicação");
                                               resposta5.setText("Uma activity_main");
                                               enviar.setText("Conferir");
                                           }
                                           else if(enviar.getText() == "Conferir" && op == 6){
                                               if (resposta4.isChecked()) {
                                                   contador = contador + 1.00;
                                                   resposta4.setTextColor(Color.GREEN);
                                               }else if (resposta1.isChecked()) {
                                                   resposta1.setTextColor(Color.RED);
                                               }
                                               else if (resposta2.isChecked()) {
                                                   resposta2.setTextColor(Color.RED);
                                               }
                                               else if (resposta3.isChecked()) {
                                                   resposta3.setTextColor(Color.RED);
                                               }
                                               else if (resposta5.isChecked()) {
                                                   resposta5.setTextColor(Color.RED);
                                               }

                                               enviar.setText("Próximo");
                                               enviar.setTextColor(Color.WHITE);
                                               op++;
                                           }
                                           else if(enviar.getText() == "Próximo" && op == 6){

                                               //desmercar
                                               resposta1.setChecked(false);
                                               resposta2.setChecked(false);
                                               resposta3.setChecked(false);
                                               resposta4.setChecked(false);
                                               resposta5.setChecked(false);

                                               //tirar o vermelho
                                               resposta1.setTextColor(Color.BLACK);
                                               resposta2.setTextColor(Color.BLACK);
                                               resposta3.setTextColor(Color.BLACK);
                                               resposta4.setTextColor(Color.BLACK);
                                               resposta5.setTextColor(Color.BLACK);

                                               //perguntas e respostas
                                               titulo.setText("Questão 7");
                                               pergunta.setText("O que é ANR no android?");
                                               resposta1.setText("Quando o aplicativo não está respondendo ANR irá ocorrer");
                                               resposta2.setText("Caixa de diálogo é chamado como ANR");
                                               resposta3.setText("Quando Android vigorosamente mata um aplicativo, ele é chamado de ANR");
                                               resposta4.setText("Quando o android não suporta o API");
                                               resposta5.setText("Nenhuma das anteriores");
                                               enviar.setText("Conferir");
                                           }
                                           else if(enviar.getText() == "Conferir" && op == 7){

                                               //certa
                                               if (resposta1.isChecked()) {
                                                   contador = contador + 1.00;
                                                   resposta1.setTextColor(Color.GREEN);

                                                   //erradas
                                               }else if (resposta2.isChecked()) {
                                                   resposta2.setTextColor(Color.RED);
                                               }
                                               else if (resposta3.isChecked()) {
                                                   resposta3.setTextColor(Color.RED);
                                               }
                                               else if (resposta4.isChecked()) {
                                                   resposta4.setTextColor(Color.RED);
                                               }
                                               else if (resposta5.isChecked()) {
                                                   resposta5.setTextColor(Color.RED);
                                               }

                                               enviar.setText("Próximo");
                                               enviar.setTextColor(Color.WHITE);
                                               op++;
                                           }
                                           else if(enviar.getText() == "Próximo" && op == 7){

                                               //desmarcar
                                               resposta1.setChecked(false);
                                               resposta2.setChecked(false);
                                               resposta3.setChecked(false);
                                               resposta4.setChecked(false);
                                               resposta5.setChecked(false);

                                               //tirar o vermelho
                                               resposta1.setTextColor(Color.BLACK);
                                               resposta2.setTextColor(Color.BLACK);
                                               resposta3.setTextColor(Color.BLACK);
                                               resposta4.setTextColor(Color.BLACK);
                                               resposta5.setTextColor(Color.BLACK);

                                               //perguntas e respostas
                                               titulo.setText("Questão 8");
                                               pergunta.setText("Qual é o ciclo de vida fragmento no android?" );
                                               resposta1.setText("onReceive()");
                                               resposta2.setText("onCreate()");
                                               resposta3.setText("onAttach()-> onCreate() -> onCreateView() -> onActivityCreated() -> onStart() -> onResume()");
                                               resposta4.setText("onStart()");
                                               resposta5.setText("Nenhuma das Anteriores");
                                               enviar.setText("Conferir");
                                           }
                                           else if(enviar.getText() == "Conferir" && op == 8){

                                               //certa
                                               if (resposta3.isChecked()) {
                                                   contador = contador + 1.00;
                                                   resposta3.setTextColor(Color.GREEN);

                                                   //erradas
                                               }else if (resposta1.isChecked()) {
                                                   resposta1.setTextColor(Color.RED);
                                               }
                                               else if (resposta2.isChecked()) {
                                                   resposta2.setTextColor(Color.RED);
                                               }
                                               else if (resposta4.isChecked()) {
                                                   resposta4.setTextColor(Color.RED);
                                               }
                                               else if (resposta5.isChecked()) {
                                                   resposta5.setTextColor(Color.RED);
                                               }

                                               enviar.setText("Próximo");
                                               enviar.setTextColor(Color.WHITE);
                                               op++;
                                           }
                                           else if(enviar.getText() == "Próximo" && op == 8){

                                               //desmarcar
                                               resposta1.setChecked(false);
                                               resposta2.setChecked(false);
                                               resposta3.setChecked(false);
                                               resposta4.setChecked(false);
                                               resposta5.setChecked(false);

                                               //tirar vermelho
                                               resposta1.setTextColor(Color.BLACK);
                                               resposta2.setTextColor(Color.BLACK);
                                               resposta3.setTextColor(Color.BLACK);
                                               resposta4.setTextColor(Color.BLACK);
                                               resposta5.setTextColor(Color.BLACK);

                                               //pergunta e respostas
                                               titulo.setText("Questão 9");
                                               pergunta.setText("Qual é o propósito de super. onCreate() super. onCreate() no android?");
                                               resposta1.setText("Para criar uma janela gráfica para subclasse");
                                               resposta2.setText("Ele permite que os desenvolvedores a escrever o programa");
                                               resposta3.setText("Para criar um método");
                                               resposta4.setText("Iniciar um código");
                                               resposta5.setText("Nenhuma das anteriores");
                                               enviar.setText("Conferir");
                                           }
                                           else if(enviar.getText() == "Conferir" && op == 9){

                                               //certa
                                               if (resposta5.isChecked()) {
                                                   contador = contador + 1.00;
                                                   resposta5.setTextColor(Color.GREEN);
                                               }else if (resposta1.isChecked()) {
                                                   resposta1.setTextColor(Color.RED);
                                               }
                                               else if (resposta2.isChecked()) {
                                                   resposta2.setTextColor(Color.RED);
                                               }
                                               else if (resposta3.isChecked()) {
                                                   resposta3.setTextColor(Color.RED);
                                               }
                                               else if (resposta4.isChecked()) {
                                                   resposta4.setTextColor(Color.RED);
                                               }

                                               enviar.setText("Obter Resultado");
                                               enviar.setTextColor(Color.WHITE);
                                               op++;
                                           }
                                           else if(enviar.getText() == "Próximo" && op == 9){

                                               //desmarcar
                                               resposta1.setChecked(false);
                                               resposta2.setChecked(false);
                                               resposta3.setChecked(false);
                                               resposta4.setChecked(false);
                                               resposta5.setChecked(false);

                                               //tirar vermelho
                                               resposta1.setTextColor(Color.BLACK);
                                               resposta2.setTextColor(Color.BLACK);
                                               resposta3.setTextColor(Color.BLACK);
                                               resposta4.setTextColor(Color.BLACK);
                                               resposta5.setTextColor(Color.BLACK);

                                               //pergunta e respostas
                                               titulo.setText("Questão 10");
                                               pergunta.setText("Quais são os principais componentes no android?");
                                               resposta1.setText("Atividade");
                                               resposta2.setText("Serviços");
                                               resposta3.setText("Broadcast Receiver");
                                               resposta4.setText("Provedor de Conteúdo");
                                               resposta5.setText("Nenhuma da anteriores");
                                               enviar.setText("Conferir");
                                           }

                                           //resultado
                                           else if(enviar.getText() == "Ver Resultado" && op == 10) {
                                               titulo.setText("Resultado");
                                               resposta1.setVisibility(View.GONE);
                                               resposta2.setVisibility(View.GONE);
                                               resposta3.setVisibility(View.GONE);
                                               resposta4.setVisibility(View.GONE);
                                               resposta5.setVisibility(View.GONE);
                                               enviar.setVisibility(View.GONE);
                                               if (contador == 0.00) {
                                                   pergunta.setText("Opa!.\n" +
                                                           "Você não acertou nenhuma questão :C");
                                               } else {
                                                   Double porcentagem = (contador / 10.00) * 100.00;
                                                   DecimalFormat number = new DecimalFormat("#.00");
                                                   pergunta.setText("Porcentagem: " + String.valueOf(number.format(porcentagem)) + "% Acertos: " + contador);
                                               }
                                           }
                                       }else{
                                           warning.setText("Selecione uma resposta");
                                       }


                                   }
                               }
        );


    }
}
