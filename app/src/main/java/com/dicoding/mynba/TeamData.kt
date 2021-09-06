package com.dicoding.mynba

object TeamData {
    private val teamNames = arrayOf("Boston Celtics",
        "Brooklyn Nets",
        "Chicago Bulls",
        "Dallas Mavericks",
        "Golden State Warriors",
        "Los Angeles Clippers",
        "Los Angeles Lakers",
        "New York Knicks",
        "Philadelpia 76ers",
        "Washington Wizards")

    private val teamDetails = arrayOf("The Boston Celtics are an American professional basketball team based in Boston. The Celtics compete in the National Basketball Association as a member of the league's Eastern Conference Atlantic Division.",
        "The Brooklyn Nets are an American professional basketball team based in the New York City borough of Brooklyn. The Nets compete in the National Basketball Association as a member of the Atlantic Division of the Eastern Conference. The team plays its home games at Barclays Center.",
        "The Chicago Bulls are an American professional basketball team based in Chicago. The Bulls compete in the National Basketball Association as a member of the league's Eastern Conference Central Division. The team was founded on January 16, 1966, and played its first game during the 1966–67 NBA season.",
        "The Dallas Mavericks are an American professional basketball team based in Dallas. The Mavericks compete in the National Basketball Association as a member of the Western Conference Southwest Division.",
        "The Golden State Warriors are an American professional basketball team based in San Francisco. The Warriors compete in the National Basketball Association, as a member of the league's Western Conference Pacific Division.",
        "The Los Angeles Clippers are an American professional basketball team based in Los Angeles. The Clippers compete in the National Basketball Association as a member of the Pacific Division in the league's Western Conference.",
        "The Los Angeles Lakers are an American professional basketball team based in Los Angeles. The Lakers compete in the National Basketball Association as a member of the league's Western Conference Pacific Division.",
        "The New York Knickerbockers, more commonly referred to as the New York Knicks, are an American professional basketball team based in the New York City borough of Manhattan. The Knicks compete in the National Basketball Association as a member of the Atlantic Division of the Eastern Conference.",
        "The Philadelphia 76ers are an American professional basketball team based in the Philadelphia metropolitan area. The 76ers compete in the National Basketball Association as a member of the league's Eastern Conference Atlantic Division and play at the Wells Fargo Center.",
        "The Washington Wizards are an American professional basketball team based in Washington, D.C. The Wizards compete in the National Basketball Association as a member of the league's Eastern Conference Southeast Division.")

    private val teamOverview = arrayOf("""
Head Coach      : Brad Steven
Arena/Stadium   : TD Garden
Mascot          : Lucky The Leprechaun
Owners          : Boston Basketball Partners
All Star Player : Jayson Tatum, Kemba Walker, Jaylen Brown
    """.trimIndent(),
            """
                Head Coach      : Steve Nash
                Arena/Stadium   : Barclays Center
                Mascot          : BrooklyKnight, Sly the Silver Fox, Duncan the Dragon
                Owners          : Joseph C Tsai
                All Star Player : Kevin Durant, James Harden, Kyrie Irving
            """.trimIndent(),
            """
                Head Coach      : Billy Donovan
                Arena/Stadium   : United Center
                Mascot          : Benny The Bull
                Owners          : Jerry Reinsdorf
                All Star Player : Zach Lavine
            """.trimIndent(),
            """
                Head Coach      : Rick Carlisle
                Arena/Stadium   : American Airlines Center
                Mascot          : Champ
                Owners          : Mark Cuban
                All Star Player : Luka Doncic, Kristaps Porzingis 
            """.trimIndent(),
            """
                Head Coach      : Steve Kerr
                Arena/Stadium   : Chase Center
                Mascot          : None
                Owners          : Joseph S. Lacob
                All Star Player : Stephen Curry, Klay Thompson
            """.trimIndent(),
            """
                Head Coach      : Tyronn Lue
                Arena/Stadium   : Staples Center
                Mascot          : Chuck
                Owners          : Steve Ballmer
                All Star Player : Kawhi Leonard, Paul George
            """.trimIndent(),
            """
                Head Coach      : Frank Vogel
                Arena/Stadium   : Staples Center
                Mascot          : None
                Owners          : Buss Family Trust
                All Star Player : Lebron James, Anthony Davis
            """.trimIndent(),
            """
                Head Coach      : Tom Thibodeau
                Arena/Stadium   : Madison Square Garden
                Mascot          : None
                Owners          : James Dolan
                All Star Player : Julius Randle
            """.trimIndent(),
            """
                Head Coach      : Doc Rivers
                Arena/Stadium   : Wells Fargo Center
                Mascot          : Franklin The Dog
                Owners          : Josh Harris
                All Star Player : Joel Embiid, Ben Simmons
            """.trimIndent(),
            """
                Head Coach      : Scott Brooks
                Arena/Stadium   : Capital One Arena
                Mascot          : G-Wiz
                Owners          : Ted Leonsis
                All Star Player : Bradley Beal, Russel Westbrook
            """.trimIndent())

    private val teamImages = intArrayOf(R.drawable.bs_celtics,
        R.drawable.bkn_nets,
        R.drawable.cg_bulls,
        R.drawable.ds_mavericks,
        R.drawable.gs_warriors,
        R.drawable.la_clipper,
        R.drawable.la_lakers,
        R.drawable.ny_knicks,
        R.drawable.phi_sixers,
        R.drawable.wsh_wizard)

    val listData: ArrayList<Team>
        get() {
            val list = arrayListOf<Team>()
            for (position in teamNames.indices) {
                val team = Team()
                team.name = teamNames[position]
                team.detail = teamDetails[position]
                team.photo = teamImages[position]
                team.overview = teamOverview[position]
                list.add(team)
            }
            return list
        }
}