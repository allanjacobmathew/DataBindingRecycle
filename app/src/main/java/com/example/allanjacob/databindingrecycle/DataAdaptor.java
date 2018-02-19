package com.example.allanjacob.databindingrecycle;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.allanjacob.databindingrecycle.databinding.DataRowBinding;

import java.util.List;



public class DataAdaptor extends RecyclerView.Adapter<DataAdaptor.MyViewHolder> {
    private List<DataClass> dataList;

    public DataAdaptor(List<DataClass> dataList) {

        this.dataList=dataList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        DataRowBinding dataRowBinding = DataRowBinding.inflate(layoutInflater,parent,false);
        return new MyViewHolder(dataRowBinding);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final DataClass dataClass=dataList.get(position);
        holder.bind(dataClass);

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private final DataRowBinding binding;

        public MyViewHolder( DataRowBinding dataRowBinding ) {
            super(dataRowBinding.getRoot());
            this.binding = dataRowBinding;
        }
        public void bind(DataClass dataClass) {
            binding.setItems(dataClass);
            binding.executePendingBindings();
        }

    }
}
