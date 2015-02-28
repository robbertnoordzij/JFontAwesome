package nl.robbertnoordzij.JFontAwesome;

import java.awt.Font;
import java.io.InputStream;

/**
 * Simple implementation of FontAwsome for AWT and Swing
 * 
 * @author Robbert Noordzij
 */
public enum FA {
	GLASS("\uf000"),
	MUSIC("\uf001"),
	SEARCH("\uf002"),
	ENVELOPE_O("\uf003"),
	HEART("\uf004"),
	STAR("\uf005"),
	STAR_O("\uf006"),
	USER("\uf007"),
	FILM("\uf008"),
	TH_LARGE("\uf009"),
	TH("\uf00a"),
	TH_LIST("\uf00b"),
	CHECK("\uf00c"),
	REMOVE("\uf00d"),
	CLOSE("\uf00d"),
	TIMES("\uf00d"),
	SEARCH_PLUS("\uf00e"),
	SEARCH_MINUS("\uf010"),
	POWER_OFF("\uf011"),
	SIGNAL("\uf012"),
	GEAR("\uf013"),
	COG("\uf013"),
	TRASH_O("\uf014"),
	HOME("\uf015"),
	FILE_O("\uf016"),
	CLOCK_O("\uf017"),
	ROAD("\uf018"),
	DOWNLOAD("\uf019"),
	ARROW_CIRCLE_O_DOWN("\uf01a"),
	ARROW_CIRCLE_O_UP("\uf01b"),
	INBOX("\uf01c"),
	PLAY_CIRCLE_O("\uf01d"),
	ROTATE_RIGHT("\uf01e"),
	REPEAT("\uf01e"),
	REFRESH("\uf021"),
	LIST_ALT("\uf022"),
	LOCK("\uf023"),
	FLAG("\uf024"),
	HEADPHONES("\uf025"),
	VOLUME_OFF("\uf026"),
	VOLUME_DOWN("\uf027"),
	VOLUME_UP("\uf028"),
	QRCODE("\uf029"),
	BARCODE("\uf02a"),
	TAG("\uf02b"),
	TAGS("\uf02c"),
	BOOK("\uf02d"),
	BOOKMARK("\uf02e"),
	PRINT("\uf02f"),
	CAMERA("\uf030"),
	FONT("\uf031"),
	BOLD("\uf032"),
	ITALIC("\uf033"),
	TEXT_HEIGHT("\uf034"),
	TEXT_WIDTH("\uf035"),
	ALIGN_LEFT("\uf036"),
	ALIGN_CENTER("\uf037"),
	ALIGN_RIGHT("\uf038"),
	ALIGN_JUSTIFY("\uf039"),
	LIST("\uf03a"),
	DEDENT("\uf03b"),
	OUTDENT("\uf03b"),
	INDENT("\uf03c"),
	VIDEO_CAMERA("\uf03d"),
	PHOTO("\uf03e"),
	IMAGE("\uf03e"),
	PICTURE_O("\uf03e"),
	PENCIL("\uf040"),
	MAP_MARKER("\uf041"),
	ADJUST("\uf042"),
	TINT("\uf043"),
	EDIT("\uf044"),
	PENCIL_SQUARE_O("\uf044"),
	SHARE_SQUARE_O("\uf045"),
	CHECK_SQUARE_O("\uf046"),
	ARROWS("\uf047"),
	STEP_BACKWARD("\uf048"),
	FAST_BACKWARD("\uf049"),
	BACKWARD("\uf04a"),
	PLAY("\uf04b"),
	PAUSE("\uf04c"),
	STOP("\uf04d"),
	FORWARD("\uf04e"),
	FAST_FORWARD("\uf050"),
	STEP_FORWARD("\uf051"),
	EJECT("\uf052"),
	CHEVRON_LEFT("\uf053"),
	CHEVRON_RIGHT("\uf054"),
	PLUS_CIRCLE("\uf055"),
	MINUS_CIRCLE("\uf056"),
	TIMES_CIRCLE("\uf057"),
	CHECK_CIRCLE("\uf058"),
	QUESTION_CIRCLE("\uf059"),
	INFO_CIRCLE("\uf05a"),
	CROSSHAIRS("\uf05b"),
	TIMES_CIRCLE_O("\uf05c"),
	CHECK_CIRCLE_O("\uf05d"),
	BAN("\uf05e"),
	ARROW_LEFT("\uf060"),
	ARROW_RIGHT("\uf061"),
	ARROW_UP("\uf062"),
	ARROW_DOWN("\uf063"),
	MAIL_FORWARD("\uf064"),
	SHARE("\uf064"),
	EXPAND("\uf065"),
	COMPRESS("\uf066"),
	PLUS("\uf067"),
	MINUS("\uf068"),
	ASTERISK("\uf069"),
	EXCLAMATION_CIRCLE("\uf06a"),
	GIFT("\uf06b"),
	LEAF("\uf06c"),
	FIRE("\uf06d"),
	EYE("\uf06e"),
	EYE_SLASH("\uf070"),
	WARNING("\uf071"),
	EXCLAMATION_TRIANGLE("\uf071"),
	PLANE("\uf072"),
	CALENDAR("\uf073"),
	RANDOM("\uf074"),
	COMMENT("\uf075"),
	MAGNET("\uf076"),
	CHEVRON_UP("\uf077"),
	CHEVRON_DOWN("\uf078"),
	RETWEET("\uf079"),
	SHOPPING_CART("\uf07a"),
	FOLDER("\uf07b"),
	FOLDER_OPEN("\uf07c"),
	ARROWS_V("\uf07d"),
	ARROWS_H("\uf07e"),
	BAR_CHART_O("\uf080"),
	BAR_CHART("\uf080"),
	TWITTER_SQUARE("\uf081"),
	FACEBOOK_SQUARE("\uf082"),
	CAMERA_RETRO("\uf083"),
	KEY("\uf084"),
	GEARS("\uf085"),
	COGS("\uf085"),
	COMMENTS("\uf086"),
	THUMBS_O_UP("\uf087"),
	THUMBS_O_DOWN("\uf088"),
	STAR_HALF("\uf089"),
	HEART_O("\uf08a"),
	SIGN_OUT("\uf08b"),
	LINKEDIN_SQUARE("\uf08c"),
	THUMB_TACK("\uf08d"),
	EXTERNAL_LINK("\uf08e"),
	SIGN_IN("\uf090"),
	TROPHY("\uf091"),
	GITHUB_SQUARE("\uf092"),
	UPLOAD("\uf093"),
	LEMON_O("\uf094"),
	PHONE("\uf095"),
	SQUARE_O("\uf096"),
	BOOKMARK_O("\uf097"),
	PHONE_SQUARE("\uf098"),
	TWITTER("\uf099"),
	FACEBOOK_F("\uf09a"),
	FACEBOOK("\uf09a"),
	GITHUB("\uf09b"),
	UNLOCK("\uf09c"),
	CREDIT_CARD("\uf09d"),
	RSS("\uf09e"),
	HDD_O("\uf0a0"),
	BULLHORN("\uf0a1"),
	BELL("\uf0f3"),
	CERTIFICATE("\uf0a3"),
	HAND_O_RIGHT("\uf0a4"),
	HAND_O_LEFT("\uf0a5"),
	HAND_O_UP("\uf0a6"),
	HAND_O_DOWN("\uf0a7"),
	ARROW_CIRCLE_LEFT("\uf0a8"),
	ARROW_CIRCLE_RIGHT("\uf0a9"),
	ARROW_CIRCLE_UP("\uf0aa"),
	ARROW_CIRCLE_DOWN("\uf0ab"),
	GLOBE("\uf0ac"),
	WRENCH("\uf0ad"),
	TASKS("\uf0ae"),
	FILTER("\uf0b0"),
	BRIEFCASE("\uf0b1"),
	ARROWS_ALT("\uf0b2"),
	GROUP("\uf0c0"),
	USERS("\uf0c0"),
	CHAIN("\uf0c1"),
	LINK("\uf0c1"),
	CLOUD("\uf0c2"),
	FLASK("\uf0c3"),
	CUT("\uf0c4"),
	SCISSORS("\uf0c4"),
	COPY("\uf0c5"),
	FILES_O("\uf0c5"),
	PAPERCLIP("\uf0c6"),
	SAVE("\uf0c7"),
	FLOPPY_O("\uf0c7"),
	SQUARE("\uf0c8"),
	NAVICON("\uf0c9"),
	REORDER("\uf0c9"),
	BARS("\uf0c9"),
	LIST_UL("\uf0ca"),
	LIST_OL("\uf0cb"),
	STRIKETHROUGH("\uf0cc"),
	UNDERLINE("\uf0cd"),
	TABLE("\uf0ce"),
	MAGIC("\uf0d0"),
	TRUCK("\uf0d1"),
	PINTEREST("\uf0d2"),
	PINTEREST_SQUARE("\uf0d3"),
	GOOGLE_PLUS_SQUARE("\uf0d4"),
	GOOGLE_PLUS("\uf0d5"),
	MONEY("\uf0d6"),
	CARET_DOWN("\uf0d7"),
	CARET_UP("\uf0d8"),
	CARET_LEFT("\uf0d9"),
	CARET_RIGHT("\uf0da"),
	COLUMNS("\uf0db"),
	UNSORTED("\uf0dc"),
	SORT("\uf0dc"),
	SORT_DOWN("\uf0dd"),
	SORT_DESC("\uf0dd"),
	SORT_UP("\uf0de"),
	SORT_ASC("\uf0de"),
	ENVELOPE("\uf0e0"),
	LINKEDIN("\uf0e1"),
	ROTATE_LEFT("\uf0e2"),
	UNDO("\uf0e2"),
	LEGAL("\uf0e3"),
	GAVEL("\uf0e3"),
	DASHBOARD("\uf0e4"),
	TACHOMETER("\uf0e4"),
	COMMENT_O("\uf0e5"),
	COMMENTS_O("\uf0e6"),
	FLASH("\uf0e7"),
	BOLT("\uf0e7"),
	SITEMAP("\uf0e8"),
	UMBRELLA("\uf0e9"),
	PASTE("\uf0ea"),
	CLIPBOARD("\uf0ea"),
	LIGHTBULB_O("\uf0eb"),
	EXCHANGE("\uf0ec"),
	CLOUD_DOWNLOAD("\uf0ed"),
	CLOUD_UPLOAD("\uf0ee"),
	USER_MD("\uf0f0"),
	STETHOSCOPE("\uf0f1"),
	SUITCASE("\uf0f2"),
	BELL_O("\uf0a2"),
	COFFEE("\uf0f4"),
	CUTLERY("\uf0f5"),
	FILE_TEXT_O("\uf0f6"),
	BUILDING_O("\uf0f7"),
	HOSPITAL_O("\uf0f8"),
	AMBULANCE("\uf0f9"),
	MEDKIT("\uf0fa"),
	FIGHTER_JET("\uf0fb"),
	BEER("\uf0fc"),
	H_SQUARE("\uf0fd"),
	PLUS_SQUARE("\uf0fe"),
	ANGLE_DOUBLE_LEFT("\uf100"),
	ANGLE_DOUBLE_RIGHT("\uf101"),
	ANGLE_DOUBLE_UP("\uf102"),
	ANGLE_DOUBLE_DOWN("\uf103"),
	ANGLE_LEFT("\uf104"),
	ANGLE_RIGHT("\uf105"),
	ANGLE_UP("\uf106"),
	ANGLE_DOWN("\uf107"),
	DESKTOP("\uf108"),
	LAPTOP("\uf109"),
	TABLET("\uf10a"),
	MOBILE_PHONE("\uf10b"),
	MOBILE("\uf10b"),
	CIRCLE_O("\uf10c"),
	QUOTE_LEFT("\uf10d"),
	QUOTE_RIGHT("\uf10e"),
	SPINNER("\uf110"),
	CIRCLE("\uf111"),
	MAIL_REPLY("\uf112"),
	REPLY("\uf112"),
	GITHUB_ALT("\uf113"),
	FOLDER_O("\uf114"),
	FOLDER_OPEN_O("\uf115"),
	SMILE_O("\uf118"),
	FROWN_O("\uf119"),
	MEH_O("\uf11a"),
	GAMEPAD("\uf11b"),
	KEYBOARD_O("\uf11c"),
	FLAG_O("\uf11d"),
	FLAG_CHECKERED("\uf11e"),
	TERMINAL("\uf120"),
	CODE("\uf121"),
	MAIL_REPLY_ALL("\uf122"),
	REPLY_ALL("\uf122"),
	STAR_HALF_EMPTY("\uf123"),
	STAR_HALF_FULL("\uf123"),
	STAR_HALF_O("\uf123"),
	LOCATION_ARROW("\uf124"),
	CROP("\uf125"),
	CODE_FORK("\uf126"),
	UNLINK("\uf127"),
	CHAIN_BROKEN("\uf127"),
	QUESTION("\uf128"),
	INFO("\uf129"),
	EXCLAMATION("\uf12a"),
	SUPERSCRIPT("\uf12b"),
	SUBSCRIPT("\uf12c"),
	ERASER("\uf12d"),
	PUZZLE_PIECE("\uf12e"),
	MICROPHONE("\uf130"),
	MICROPHONE_SLASH("\uf131"),
	SHIELD("\uf132"),
	CALENDAR_O("\uf133"),
	FIRE_EXTINGUISHER("\uf134"),
	ROCKET("\uf135"),
	MAXCDN("\uf136"),
	CHEVRON_CIRCLE_LEFT("\uf137"),
	CHEVRON_CIRCLE_RIGHT("\uf138"),
	CHEVRON_CIRCLE_UP("\uf139"),
	CHEVRON_CIRCLE_DOWN("\uf13a"),
	HTML5("\uf13b"),
	CSS3("\uf13c"),
	ANCHOR("\uf13d"),
	UNLOCK_ALT("\uf13e"),
	BULLSEYE("\uf140"),
	ELLIPSIS_H("\uf141"),
	ELLIPSIS_V("\uf142"),
	RSS_SQUARE("\uf143"),
	PLAY_CIRCLE("\uf144"),
	TICKET("\uf145"),
	MINUS_SQUARE("\uf146"),
	MINUS_SQUARE_O("\uf147"),
	LEVEL_UP("\uf148"),
	LEVEL_DOWN("\uf149"),
	CHECK_SQUARE("\uf14a"),
	PENCIL_SQUARE("\uf14b"),
	EXTERNAL_LINK_SQUARE("\uf14c"),
	SHARE_SQUARE("\uf14d"),
	COMPASS("\uf14e"),
	TOGGLE_DOWN("\uf150"),
	CARET_SQUARE_O_DOWN("\uf150"),
	TOGGLE_UP("\uf151"),
	CARET_SQUARE_O_UP("\uf151"),
	TOGGLE_RIGHT("\uf152"),
	CARET_SQUARE_O_RIGHT("\uf152"),
	EURO("\uf153"),
	EUR("\uf153"),
	GBP("\uf154"),
	DOLLAR("\uf155"),
	USD("\uf155"),
	RUPEE("\uf156"),
	INR("\uf156"),
	CNY("\uf157"),
	RMB("\uf157"),
	YEN("\uf157"),
	JPY("\uf157"),
	RUBLE("\uf158"),
	ROUBLE("\uf158"),
	RUB("\uf158"),
	WON("\uf159"),
	KRW("\uf159"),
	BITCOIN("\uf15a"),
	BTC("\uf15a"),
	FILE("\uf15b"),
	FILE_TEXT("\uf15c"),
	SORT_ALPHA_ASC("\uf15d"),
	SORT_ALPHA_DESC("\uf15e"),
	SORT_AMOUNT_ASC("\uf160"),
	SORT_AMOUNT_DESC("\uf161"),
	SORT_NUMERIC_ASC("\uf162"),
	SORT_NUMERIC_DESC("\uf163"),
	THUMBS_UP("\uf164"),
	THUMBS_DOWN("\uf165"),
	YOUTUBE_SQUARE("\uf166"),
	YOUTUBE("\uf167"),
	XING("\uf168"),
	XING_SQUARE("\uf169"),
	YOUTUBE_PLAY("\uf16a"),
	DROPBOX("\uf16b"),
	STACK_OVERFLOW("\uf16c"),
	INSTAGRAM("\uf16d"),
	FLICKR("\uf16e"),
	ADN("\uf170"),
	BITBUCKET("\uf171"),
	BITBUCKET_SQUARE("\uf172"),
	TUMBLR("\uf173"),
	TUMBLR_SQUARE("\uf174"),
	LONG_ARROW_DOWN("\uf175"),
	LONG_ARROW_UP("\uf176"),
	LONG_ARROW_LEFT("\uf177"),
	LONG_ARROW_RIGHT("\uf178"),
	APPLE("\uf179"),
	WINDOWS("\uf17a"),
	ANDROID("\uf17b"),
	LINUX("\uf17c"),
	DRIBBBLE("\uf17d"),
	SKYPE("\uf17e"),
	FOURSQUARE("\uf180"),
	TRELLO("\uf181"),
	FEMALE("\uf182"),
	MALE("\uf183"),
	GITTIP("\uf184"),
	GRATIPAY("\uf184"),
	SUN_O("\uf185"),
	MOON_O("\uf186"),
	ARCHIVE("\uf187"),
	BUG("\uf188"),
	VK("\uf189"),
	WEIBO("\uf18a"),
	RENREN("\uf18b"),
	PAGELINES("\uf18c"),
	STACK_EXCHANGE("\uf18d"),
	ARROW_CIRCLE_O_RIGHT("\uf18e"),
	ARROW_CIRCLE_O_LEFT("\uf190"),
	TOGGLE_LEFT("\uf191"),
	CARET_SQUARE_O_LEFT("\uf191"),
	DOT_CIRCLE_O("\uf192"),
	WHEELCHAIR("\uf193"),
	VIMEO_SQUARE("\uf194"),
	TURKISH_LIRA("\uf195"),
	TRY("\uf195"),
	PLUS_SQUARE_O("\uf196"),
	SPACE_SHUTTLE("\uf197"),
	SLACK("\uf198"),
	ENVELOPE_SQUARE("\uf199"),
	WORDPRESS("\uf19a"),
	OPENID("\uf19b"),
	INSTITUTION("\uf19c"),
	BANK("\uf19c"),
	UNIVERSITY("\uf19c"),
	MORTAR_BOARD("\uf19d"),
	GRADUATION_CAP("\uf19d"),
	YAHOO("\uf19e"),
	GOOGLE("\uf1a0"),
	REDDIT("\uf1a1"),
	REDDIT_SQUARE("\uf1a2"),
	STUMBLEUPON_CIRCLE("\uf1a3"),
	STUMBLEUPON("\uf1a4"),
	DELICIOUS("\uf1a5"),
	DIGG("\uf1a6"),
	PIED_PIPER("\uf1a7"),
	PIED_PIPER_ALT("\uf1a8"),
	DRUPAL("\uf1a9"),
	JOOMLA("\uf1aa"),
	LANGUAGE("\uf1ab"),
	FAX("\uf1ac"),
	BUILDING("\uf1ad"),
	CHILD("\uf1ae"),
	PAW("\uf1b0"),
	SPOON("\uf1b1"),
	CUBE("\uf1b2"),
	CUBES("\uf1b3"),
	BEHANCE("\uf1b4"),
	BEHANCE_SQUARE("\uf1b5"),
	STEAM("\uf1b6"),
	STEAM_SQUARE("\uf1b7"),
	RECYCLE("\uf1b8"),
	AUTOMOBILE("\uf1b9"),
	CAR("\uf1b9"),
	CAB("\uf1ba"),
	TAXI("\uf1ba"),
	TREE("\uf1bb"),
	SPOTIFY("\uf1bc"),
	DEVIANTART("\uf1bd"),
	SOUNDCLOUD("\uf1be"),
	DATABASE("\uf1c0"),
	FILE_PDF_O("\uf1c1"),
	FILE_WORD_O("\uf1c2"),
	FILE_EXCEL_O("\uf1c3"),
	FILE_POWERPOINT_O("\uf1c4"),
	FILE_PHOTO_O("\uf1c5"),
	FILE_PICTURE_O("\uf1c5"),
	FILE_IMAGE_O("\uf1c5"),
	FILE_ZIP_O("\uf1c6"),
	FILE_ARCHIVE_O("\uf1c6"),
	FILE_SOUND_O("\uf1c7"),
	FILE_AUDIO_O("\uf1c7"),
	FILE_MOVIE_O("\uf1c8"),
	FILE_VIDEO_O("\uf1c8"),
	FILE_CODE_O("\uf1c9"),
	VINE("\uf1ca"),
	CODEPEN("\uf1cb"),
	JSFIDDLE("\uf1cc"),
	LIFE_BOUY("\uf1cd"),
	LIFE_BUOY("\uf1cd"),
	LIFE_SAVER("\uf1cd"),
	SUPPORT("\uf1cd"),
	LIFE_RING("\uf1cd"),
	CIRCLE_O_NOTCH("\uf1ce"),
	RA("\uf1d0"),
	REBEL("\uf1d0"),
	GE("\uf1d1"),
	EMPIRE("\uf1d1"),
	GIT_SQUARE("\uf1d2"),
	GIT("\uf1d3"),
	HACKER_NEWS("\uf1d4"),
	TENCENT_WEIBO("\uf1d5"),
	QQ("\uf1d6"),
	WECHAT("\uf1d7"),
	WEIXIN("\uf1d7"),
	SEND("\uf1d8"),
	PAPER_PLANE("\uf1d8"),
	SEND_O("\uf1d9"),
	PAPER_PLANE_O("\uf1d9"),
	HISTORY("\uf1da"),
	GENDERLESS("\uf1db"),
	CIRCLE_THIN("\uf1db"),
	HEADER("\uf1dc"),
	PARAGRAPH("\uf1dd"),
	SLIDERS("\uf1de"),
	SHARE_ALT("\uf1e0"),
	SHARE_ALT_SQUARE("\uf1e1"),
	BOMB("\uf1e2"),
	SOCCER_BALL_O("\uf1e3"),
	FUTBOL_O("\uf1e3"),
	TTY("\uf1e4"),
	BINOCULARS("\uf1e5"),
	PLUG("\uf1e6"),
	SLIDESHARE("\uf1e7"),
	TWITCH("\uf1e8"),
	YELP("\uf1e9"),
	NEWSPAPER_O("\uf1ea"),
	WIFI("\uf1eb"),
	CALCULATOR("\uf1ec"),
	PAYPAL("\uf1ed"),
	GOOGLE_WALLET("\uf1ee"),
	CC_VISA("\uf1f0"),
	CC_MASTERCARD("\uf1f1"),
	CC_DISCOVER("\uf1f2"),
	CC_AMEX("\uf1f3"),
	CC_PAYPAL("\uf1f4"),
	CC_STRIPE("\uf1f5"),
	BELL_SLASH("\uf1f6"),
	BELL_SLASH_O("\uf1f7"),
	TRASH("\uf1f8"),
	COPYRIGHT("\uf1f9"),
	AT("\uf1fa"),
	EYEDROPPER("\uf1fb"),
	PAINT_BRUSH("\uf1fc"),
	BIRTHDAY_CAKE("\uf1fd"),
	AREA_CHART("\uf1fe"),
	PIE_CHART("\uf200"),
	LINE_CHART("\uf201"),
	LASTFM("\uf202"),
	LASTFM_SQUARE("\uf203"),
	TOGGLE_OFF("\uf204"),
	TOGGLE_ON("\uf205"),
	BICYCLE("\uf206"),
	BUS("\uf207"),
	IOXHOST("\uf208"),
	ANGELLIST("\uf209"),
	CC("\uf20a"),
	SHEKEL("\uf20b"),
	SHEQEL("\uf20b"),
	ILS("\uf20b"),
	MEANPATH("\uf20c"),
	BUYSELLADS("\uf20d"),
	CONNECTDEVELOP("\uf20e"),
	DASHCUBE("\uf210"),
	FORUMBEE("\uf211"),
	LEANPUB("\uf212"),
	SELLSY("\uf213"),
	SHIRTSINBULK("\uf214"),
	SIMPLYBUILT("\uf215"),
	SKYATLAS("\uf216"),
	CART_PLUS("\uf217"),
	CART_ARROW_DOWN("\uf218"),
	DIAMOND("\uf219"),
	SHIP("\uf21a"),
	USER_SECRET("\uf21b"),
	MOTORCYCLE("\uf21c"),
	STREET_VIEW("\uf21d"),
	HEARTBEAT("\uf21e"),
	VENUS("\uf221"),
	MARS("\uf222"),
	MERCURY("\uf223"),
	TRANSGENDER("\uf224"),
	TRANSGENDER_ALT("\uf225"),
	VENUS_DOUBLE("\uf226"),
	MARS_DOUBLE("\uf227"),
	VENUS_MARS("\uf228"),
	MARS_STROKE("\uf229"),
	MARS_STROKE_V("\uf22a"),
	MARS_STROKE_H("\uf22b"),
	NEUTER("\uf22c"),
	FACEBOOK_OFFICIAL("\uf230"),
	PINTEREST_P("\uf231"),
	WHATSAPP("\uf232"),
	SERVER("\uf233"),
	USER_PLUS("\uf234"),
	USER_TIMES("\uf235"),
	HOTEL("\uf236"),
	BED("\uf236"),
	VIACOIN("\uf237"),
	TRAIN("\uf238"),
	SUBWAY("\uf239"),
	MEDIUM("\uf23a");
	
	public final static Font TTF = getFont();
	
	public final static String VERSION = "4.3.0";
	
	private String icon;
	
	private FA(String icon) {
		this.icon = icon;
	}
	
	public String toString() {
		return icon;
	}
	
	private static Font getFont() {
		try  {
			InputStream inputStream = FA.class.getResourceAsStream("./fontawesome-webfont.ttf");
			Font font = Font.createFont(Font.TRUETYPE_FONT, inputStream).deriveFont(Font.PLAIN);
			return font;
		} catch (Exception exception) {
			return null;
		}
	}
}
