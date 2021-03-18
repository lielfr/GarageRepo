# GarageRepo
This is an example of a GUI client for the Israeli Ministry of Transportation's [Garages API](https://data.gov.il/dataset/musachim).

The following technologies are used:
* **JavaFX** for the GUI
* **Retrofit2** and **Jackson** for the API access
* **Maven** for project management
* Google's **Roboto** for the font.

## Running

Running via Maven is straightforward: just run the following three goals: `clean`, `install`, `javafx:run`. You can just write them together as one goal: `clean install javafx:run`.

## Screenshots

### Before Searching

![Screen Shot 2021-03-18 at 16 48 12](https://user-images.githubusercontent.com/360928/111645771-bb191b00-8809-11eb-9e55-ea6ac2d6589d.png)

### Search Example

![Screen Shot 2021-03-18 at 16 52 32](https://user-images.githubusercontent.com/360928/111646543-69bd5b80-880a-11eb-9068-4b9f5040fb81.png)

## References and Tools Used

1. [https://stackoverflow.com/questions/12173288/specifying-external-font-in-javafx-css](https://stackoverflow.com/questions/12173288/specifying-external-font-in-javafx-css)

2. [https://square.github.io/retrofit/](https://square.github.io/retrofit/)

3. [https://data.gov.il/dataset/musachim/resource/bb68386a-a331-4bbc-b668-bba2766d517d](https://data.gov.il/dataset/musachim/resource/bb68386a-a331-4bbc-b668-bba2766d517d)

4. [http://www.jsonschema2pojo.org/](http://www.jsonschema2pojo.org/)

5. [https://openjfx.io/](https://openjfx.io/)

## License
The code is available under the MIT license (see LICENSE file for more details).

The Roboto font is redistributed under the Apache 2 (see LICENSE_Roboto.txt for more details). You can find it (and many other fonts) in [Google Fonts](https://fonts.google.com/).