package chen.vike.c680.tools;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.util.SparseArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 *
 *
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    private Context mContext;
    private SparseArray<View> mViews;

    public RecyclerViewHolder(View itemView, Context mContext) {
        super(itemView);
        this.mContext = mContext;
        mViews = new SparseArray<>();
    }

    private <T extends View> T findViewById(int viewId) {
        View view = mViews.get(viewId);
        if (view == null) {
            view = itemView.findViewById(viewId);
            mViews.put(viewId, view);
        }
        return (T) view;

    }

    public <T extends View> T getView(int viewId) {
        return findViewById(viewId);

    }

    public TextView getTextView(int viewId) {
        return (TextView) getView(viewId);
    }

    public Button getButton(int viewId) {
        return (Button) getView(viewId);
    }

    public ImageView getImageView(int viewId) {
        return (ImageView) getView(viewId);
    }

    public ImageButton getImageButton(int viewId) {
        return (ImageButton) getView(viewId);
    }

    public EditText getEditText(int viewId) {
        return (EditText) getView(viewId);
    }

    public RecyclerViewHolder setText(int viewId, String value) {
        TextView view = findViewById(viewId);
        view.setText(value);
        return this;
    }
    public RecyclerViewHolder setTextHtml(int viewId, String value) {
        TextView view = findViewById(viewId);
        view.setText(Html.fromHtml(value));
        return this;
    }
    public RecyclerViewHolder setVisibility(int viewId, int value) {
        TextView view = findViewById(viewId);
        view.setVisibility(value);
        return this;
    }

    public RecyclerViewHolder setBackground(int viewId, int resId) {
        View view = findViewById(viewId);
        view.setBackgroundResource(resId);
        return this;
    }

    public RecyclerViewHolder setClickListener(int viewId, View.OnClickListener listener) {
        View view = findViewById(viewId);
        view.setOnClickListener(listener);
        return this;
    }


}
