module KingJump {
    requires hanyaeger;

    exports KingJump;

    //opens audio;
    opens backgrounds;
    opens sprites;
    exports KingJump.Scene;
    exports KingJump.Character;
    exports KingJump.Buttons;
}
