package com.cyclon.com.allstar.Data;

public enum Teams {
    arsenal,
    bournemouth,
    brighton,
    burnley,
    chelsea,
    crystalPalace,
    everton,
    huddersfield,
    leicester,
    liverpool,
    manchesterCity,
    manchesterUnited,
    newcastle,
    southampton,
    stokeCity,
    swansea,
    tottenham,
    watford,
    westBrom,
    westHam;

    public static Teams myTeams(int position) {
        switch (position) {
            case 1:
                return arsenal;
            case 2:
                return bournemouth;
            case 3:
                return brighton;
            case 4:
                return burnley;
            case 5:
                return chelsea;
            case 6:
                return crystalPalace;
            case 7:
                return everton;
            case 8:
                return huddersfield;
            case 9:
                return leicester;
            case 10:
                return liverpool;
            case 11:
                return manchesterCity;
            case 12:
                return manchesterUnited;
            case 13:
                return newcastle;
            case 14:
                return southampton;
            case 15:
                return stokeCity;
            case 16:
                return swansea;
            case 17:
                return tottenham;
            case 18:
                return watford;
            case 19:
                return westBrom;
            case 20:
                return westHam;
            default:
                return null;
        }
    }
}
