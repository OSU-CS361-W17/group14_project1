import spark.Request;
import spark.Spark;

import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.staticFiles;

public class Main {

    public static void main(String[] args) {
        //This will allow us to server the static pages such as index.html, app.js, etc.
        staticFiles.location("/public");

        //This will listen to GET requests to /model and return a clean new model
        get("/model", (req, res) -> newModel());
        //This will listen to POST requests and expects to receive a game model, as well as location to fire to
        post("/fire/:row/:col", (req, res) -> fireAt(req));
        //This will listen to POST requests and expects to receive a game model, as well as location to place the ship
        post("/placeShip/:id/:row/:col/:orientation", (req, res) -> placeShip(req));
    }

    //This function should return a new model
    public Boolean createdNewModel() { return newModel(); }
    //For testing purposes

    private static Boolean newModel() {
        return true;
    }

    //This function should accept an HTTP request and deseralize it into an actual Java object.

    //public Boolean createdGetModelFromReq(Request req) { return getModelFromReq(req); }
    //For testing purposes

    private static Boolean getModelFromReq(Request req){
        return true;
    }

    //This controller should take a json object from the front end, and place the ship as requested, and then return the object.


    //public Boolean createdPlaceShip(Request req) {
        //return placeShip(req);
    //}
    //For testing purposes

    private static Boolean placeShip(Request req) {
        return true;
    }


    //public Boolean createdFireAt(Request req) { return fireAt(req); }
    //For testing purposes

    //Similar to placeShip, but with firing.
    private static Boolean fireAt(Request req) {
        return true;
    }

}