package br.com.fiap.listviews;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class ContatosAdapter extends BaseAdapter {

    Context context;
    List<Contato> contatos;

    public ContatosAdapter(Context context, List<Contato> contatos) {
        this.context = context;
        this.contatos = contatos;
    }

    @Override
    public int getCount() {
        return this.contatos.size();
    }

    @Override
    public Object getItem(int position) {
        return (Object)this.contatos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);

        Contato contato = this.contatos.get(position);

        View v = layoutInflater.inflate(R.layout.activity_contatos, null);
        ImageView imgContato = (ImageView) v.findViewById(R.id.imgContato);
        TextView txtNome = (TextView) v.findViewById(R.id.txtNome);
        TextView txtTelefone = (TextView) v.findViewById(R.id.txtTelefone);
        TextView txtSobre = (TextView) v.findViewById(R.id.txtSobre);

        imgContato.setImageResource(contato.getImagem());
        txtNome.setText(contato.getNome());
        txtTelefone.setText(contato.getTelefone());
        txtSobre.setText(contato.getSobre());

        return v;

    }
}
