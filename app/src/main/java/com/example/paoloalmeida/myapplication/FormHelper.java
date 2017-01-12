package com.example.paoloalmeida.myapplication;

import android.widget.EditText;
import android.widget.RatingBar;

import com.example.paoloalmeida.myapplication.modelo.Aluno;

/**
 * Created by paoloalmeida on 1/12/17.
 */

public class FormHelper {

    private final EditText campoNome;
    private final EditText campoEndereco;
    private final EditText campoTetefone;
    private final EditText campoSite;
    private final RatingBar campoNota;

    public FormHelper(FormActivity activity){
            campoNome = (EditText) activity.findViewById(R.id.form_nome);
            campoEndereco = (EditText) activity.findViewById(R.id.form_endereco);
            campoTetefone = (EditText) activity.findViewById(R.id.form_telefone);
            campoSite = (EditText) activity.findViewById(R.id.form_site);
            campoNota = (RatingBar) activity.findViewById(R.id.form_rate);
        }

    public Aluno pegaAluno() {
        Aluno aluno = new Aluno();

        aluno.setNome(campoNome.getText().toString());
        aluno.setEndereco(campoEndereco.getText().toString());
        aluno.setTelefone(campoTetefone.getText().toString());
        aluno.setSite(campoSite.getText().toString());
        aluno.setNota(Double.valueOf(campoNota.getProgress()));
        return aluno;

    }
}
