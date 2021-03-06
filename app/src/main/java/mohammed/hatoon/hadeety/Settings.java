package mohammed.hatoon.hadeety;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

public class Settings extends AppCompatActivity
         {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar= getSupportActionBar();
        actionbar.setTitle("Settings");

        Button editProfileB=(Button)findViewById(R.id.editprofile_butt);
        Button changePassB=(Button)findViewById(R.id.change_pass_butt);
        Button changeEmailB =(Button)findViewById(R.id.change_email_butt);
        Button changeUsernameB=(Button)findViewById(R.id.change_username_butt);
        Button logoutB=(Button)findViewById(R.id.logout_butt);
        Button aboutusB =(Button)findViewById(R.id.aboutus_butt);

        //edit profile button click action starts

       editProfileB.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v) {
              // code here

           }

       });

        //change password button click action starts

        changePassB.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // code here
            }
        });
//change email button click action starts

        changeEmailB.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // code here
            }
        });

        //change user name button click action starts

        changeUsernameB.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // code here
            }
        });

        //logout button click action starts

        logoutB.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // code here
            }
        });

        //about us button click action starts

        aboutusB.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // code here
            }
        });
     //navigation bar START
        // Create the AccountHeader
        AccountHeader headerResult = new AccountHeaderBuilder()
                .withActivity(this)
                .withCompactStyle(true)
                .withHeaderBackground(R.drawable.side_nav_bar)
                .addProfiles(
                        new ProfileDrawerItem().withName("username").withIcon(getResources().getDrawable(R.drawable.person))

                )
                .withSavedInstance(savedInstanceState)
                .build();

        new DrawerBuilder().withActivity(this).build();
        //if you want to update the items at a later time it is recommended to keep it in a variable
        PrimaryDrawerItem item1 = new PrimaryDrawerItem().withIdentifier(1); //Header takes you to the profile
        PrimaryDrawerItem item2 = new PrimaryDrawerItem().withIdentifier(2).withName("Profile");
        PrimaryDrawerItem item3 =  new PrimaryDrawerItem().withIdentifier(3).withName("Search");
        PrimaryDrawerItem item4 =  new PrimaryDrawerItem().withIdentifier(4).withName("Settings");

//create the drawer and remember the `Drawer` result object
        Drawer result = new DrawerBuilder()
                .withAccountHeader(headerResult)
                .withActivity(this)
                .withToolbar(toolbar)
                .addDrawerItems(

                        new DividerDrawerItem(),
                        new PrimaryDrawerItem().withIdentifier(2).withName("Profile"),
                        new PrimaryDrawerItem().withIdentifier(3).withName("Search") ,
                        new PrimaryDrawerItem().withIdentifier(4).withName("Settings")

                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        // do something with the clicked item :D
                        return true;
                    }
                })
                .build();

    }
             //navigation bar END
    }

