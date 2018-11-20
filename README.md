# Android Fundamentals
**Android Fundamentals - Concepts**
 
 When you compile your app, each XML layout file is compiled into a View resource.
 - Every View and ViewGroup object supports their own variety of XML attributes.
 -  Any View object may have an integer ID associated with it, to uniquely identify the View within the tree. When the app is compiled, this ID is referenced as an integer, but the ID is typically assigned in the layout XML file as a string, in the id attribute.
 
 Resource files are stored in folders located in the res folder, including:
 - **drawable**: For images and icons
 - **layout**: For layout resource files
 - **menu**: For menu items
 - **mipmap**: For pre-calculated, optimized collections of app icons used by the Launcher
 - **values**: For colors, dimensions, strings, and styles (theme attributes)

A ViewGroup is an object that holds other View (and ViewGroup) objects in order to define the layout of the user interface.

ViewGroup is the base class for:
- TextView - displays text
- ImageView - displays image
- Button - button with label, clickable
- View - plain rectangle
- EditText - input with different input types
- CheckBox - checkbox with a label, multiple choice behaviour, checked/unchecked
- RadioButton - single choice, checked/unchecked
- RatingBar - star rating
- Switch - on/off status
- SeekBar - displays progress
- SearchView - search input for queries
- ProgressBar - displays progress
-   LinearLayout - arrange views in horizontal/vertical row
-   RelativeLayout - arrange views relative to other views/parent
-   ScrollView - scrollable view that contains one child view
-   FrameLayout - block out an area on the screen to display a single item
-   RecyclerView - scrollable "list" of views or view groups
-   ConstraintLayout - position and size widgets in a flexible way

    
We can declare a layout in two ways:
-   Declare UI elements in XML.
-   Instantiate layout elements at runtime.


