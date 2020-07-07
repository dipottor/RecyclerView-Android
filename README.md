# RecyclerViewAndroid
 
Easy steps to create your recycler view:

1.Create new empty android project 
2.Add recycler view in to your xml file (recycler dependacy need to be added) and add constraint to recycler view as per required UI.
3.Add layout manager to your recycler view using code or in XML using  app:layoutManager="androidx.recyclerview.widget.LinearLayoutManager"
4.Design your custom xml layout for recycler view - create new layout resource file (recycler row)
5.Define the model class to use the data source : data class Movie(val movieName:String, val movieRating:Int)
6.To pass data from main activity to data source create array list which will be consumed by Recycler Adapter.
7.Create recycler adapter class from RecyclerView.Adapter and ViewHolder to render the item
8. Bind the adapter to the data source to populate the RecyclerView
