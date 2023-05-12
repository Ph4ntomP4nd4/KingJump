module KingJump {
    requires hanyaeger;

    exports KingJump;

    //opens audio;
    opens backgrounds;
    opens sprites;
    exports KingJump.Scene;
    exports KingJump.Character;
    exports KingJump.Button;
    exports KingJump.Character.Enemy;
    exports KingJump.Map;
    exports KingJump.Platform;
    exports KingJump.Text;
    exports KingJump.InteractiveObject;
}
