/**
 * Created by Mickaël on 30/08/2017.
 */

var instance;

function getInstance(){
        if(instance == null){
            instance = "Opgevulde instantie";
            console.log("de instantie bevat " + instance);
        }
        else
        {
            console.log("Er bestaat al een instantie");
        }
}