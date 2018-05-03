package xysoft.im.adapter;


public abstract class BaseAdapter<T extends ViewHolder>
{
    public int getCount()
    {
        return 0;
    }

    public abstract T onCreateViewHolder(int viewType);

    public HeaderViewHolder onCreateHeaderViewHolder(int viewType, int position)
    {
        return null;
    }

    public int getItemViewType(int position)
    {
        return 0;
    }

    public abstract void onBindViewHolder(T viewHolder, int position);

    public void onBindHeaderViewHolder(HeaderViewHolder viewHolder, int position)
    {
    }


}
