package com.github.ymka.guppy.adapter.delegates;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.ymka.guppy.ItemDelegate;
import com.github.ymka.guppy.R;
import com.github.ymka.guppy.adapter.Item;

import org.jetbrains.annotations.NotNull;

/**
 * Created by Alexander Kondenko.
 */
public class SecondDelegate implements ItemDelegate<Item.SecondItem, SecondDelegate.Holder> {

    @NotNull
    @Override
    public Class<Item.SecondItem> itemType() {
        return Item.SecondItem.class;
    }

    @NotNull
    @Override
    public Holder createVewHolder(@NotNull ViewGroup parent) {
        return new Holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_second, parent, false));
    }

    @Override
    public void bindView(int position, Item.SecondItem item, @NotNull Holder holder) {
        holder.label.setText(item.getName());
    }

    public static class Holder extends RecyclerView.ViewHolder {

        public final TextView label;

        public Holder(View view) {
            super(view);
            label = view.findViewById(R.id.secondLabel);
        }
    }

}
