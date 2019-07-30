package gen;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;

public class DataGen {

	
	public static class Pair{
		public String first;
		public String second;
		public Pair(String f, String s){
			this.first = f; 
			this.second = s;
		}		
		public String toString(){ return first + "-" + second;}
	}
	public static void main (String[] args){
		
		final int SIZE = 1000;
		final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		final String digits = "0123456789";
		
		final int MAX_DUR = 5;
		final int MAX_DELAY = 40;
		
		final int MAX_PAS = 180; 
		final int MIN_PAS = 90;
		final int MAX_CCREW = 4; 
		final int MIN_CCREW = 3;
		final int MAX_FCREW = 3; 
		final int MIN_FCREW = 2;
				
		final int FLEET_SIZE = 20;
		
		final String regPrefix = "XY-";
		
		final String[] airpotCodes = {"AAL","AAR","ABA","ABC","ABE","ABI","ABJ","ABQ","ABV","ABZ","ACA","ACC","ACE","ACK","ACY","ADA","ADD","ADL","AEP","AER","AES","AEX","AEY","AGA","AGB","AGC","AGP","AGS","AGU","AHB","AJF","AJL","AJU","AKC","AKL","AKX","ALA","ALB","ALC","ALG","AMA","AMD","AMM","AMQ","AMS","ANC","ANG","ANR","ANS","ANU","AOI","APA","APW","AQJ","AQP","ARN","ART","ASB","ASE","ASM","ASU","ATA","ATH","ATL","ATQ","ATW","AUA","AUH","AUS","AVL","AVP","AWZ","AYP","AYT","AZA","AZO","BAH","BAL","BAQ","BAT","BCB","BCN","BDA","BDI","BDL","BDO","BDS","BEB","BED","BEG","BEL","BER","BES","BEY","BFF","BFI","BFL","BFS","BGA","BGI","BGO","BGR","BGW","BGY","BHD","BHM","BHX","BIL","BIO","BJC","BJL","BJM","BJX","BKF","BKI","BKK","BKO","BLI","BLK","BLQ","BLR","BMA","BMI","BMV","BNA","BND","BNE","BNX","BOB","BOD","BOG","BOH","BOI","BOM","BON","BOS","BPN","BPT","BQH","BRA","BRE","BRO","BRQ","BRR","BRS","BRU","BRW","BSB","BSL","BTJ","BTM","BTR","BTS","BTV","BUD","BUF","BUR","BUT","BVA","BVB","BVC","BWE","BWI","BWN","BYJ","BZE","BZN","BZV","CAE","CAH","CAI","CAK","CAN","CBB","CBG","CBR","CCF","CCJ","CCK","CCP","CCS","CCU","CDC","CDG","CEB","CEK","CFB","CFD","CGH","CGK","CGN","CGO","CGR","CHA","CHC","CHM","CHR","CHS","CIA","CID","CIT","CIU","CIX","CJA","CJU","CKB","CKG","CKY","CLD","CLE","CLJ","CLL","CLO","CLT","CMB","CMH","CMI","CMN","CMX","CNF","CNG","CNN","CNX","COK","COO","COR","COS","CPH","CPT","CPV","CQM","CRK","CRL","CRP","CRW","CTA","CTG","CTS","CTU","CUL","CUN","CUZ","CVF","CVG","CVU","CWB","CWL","CXR","DAB","DAC","DAD","DAL","DAM","DAR","DAY","DBQ","DBV","DCA","DEB","DEL","DEN","DET","DFW","DIL","DIN","DKR","DLA","DLC","DLH","DME","DMK","DMM","DND","DNK","DNR","DOH","DOM","DPS","DRW","DSA","DSM","DTM","DTN","DTW","DUB","DUD","DUS","DVO","DWC","DXB","DXR","DYU","DZA","EAS","EAT","EBB","EBL","ECP","EDI","EGC","EGE","EIN","ELP","EMA","ENS","ENU","EOH","ERI","ESB","EUG","EUX","EVN","EWR","EXT","EYW","EZE","FAE","FAO","FAR","FAT","FCA","FCO","FDF","FDH","FEZ","FFA","FIE","FIH","FKB","FKL","FLG","FLL","FLN","FLR","FLW","FMM","FMO","FNA","FNC","FNT","FOD","FOR","FRA","FRU","FSC","FSD","FSP","FSZ","FUE","FUK","FUN","FWA","GAN","GAU","GBE","GCI","GCM","GCW","GDL","GDN","GEG","GEO","GGT","GIB","GIG","GIZ","GJT","GLA","GLO","GLU","GMP","GMU","GMZ","GND","GNV","GOA","GOI","GOJ","GOQ","GOT","GOV","GPS","GPT","GRB","GRK","GRO","GRR","GRU","GRW","GRX","GRZ","GSO","GSP","GST","GTR","GUA","GUM","GUR","GUW","GVA","GYD","GYE","GYN","GZA","HAH","HAJ","HAK","HAM","HAN","HAQ","HAV","HDY","HEL","HER","HFT","HGA","HGH","HGL","HHN","HIR","HKD","HKG","HKT","HLP","HMO","HND","HNL","HNM","HOF","HOG","HOR","HOT","HOU","HOV","HPH","HPN","HQM","HRE","HRG","HRI","HRL","HSV","HUF","HUH","HUU","HUY","HYA","HYD","IAD","IAH","IBZ","ICN","ICT","IDA","IDR","IEV","IFP","IGU","IKA","ILD","IND","INN","INU","INV","IOM","IPC","IPH","IPN","IQQ","IQT","ISB","ISC","ISL","ISP","IST","ITM","ITO","IWA","IXA","IXB","IXC","IXM","IXZ","JAC","JAI","JAU","JAX","JED","JER","JFK","JHM","JIB","JJN","JNB","JOG","JOI","JPA","JSI","JUB","JUL","KAN","KBL","KBP","KBR","KBV","KCH","KEF","KER","KGL","KHH","KHI","KIA","KIH","KIN","KIV","KIX","KLO","KMG","KNO","KOA","KOV","KRK","KRN","KRR","KRS","KRT","KSA","KSH","KSN","KTM","KTT","KTW","KUA","KUH","KUL","KUO","KWE","KWI","KZN","KZO","LAD","LAF","LAN","LAS","LAX","LBA","LBB","LBC","LBF","LBJ","LBU","LBV","LCA","LCG","LCK","LCY","LDY","LED","LEI","LEJ","LEN","LEU","LEX","LFT","LFW","LGA","LGB","LGG","LGK","LGW","LHE","LHR","LIH","LIM","LIN","LIR","LIS","LIT","LJU","LKO","LLW","LMN","LMT","LNK","LOP","LOS","LPA","LPB","LPL","LPQ","LRD","LRH","LSE","LTN","LUK","LUN","LUX","LVI","LWB","LWO","LXR","LYR","LYS","MAA","MAD","MAF","MAH","MAJ","MAN","MAO","MBJ","MBS","MCI","MCO","MCT","MCW","MCZ","MDC","MDE","MDL","MDQ","MDT","MDW","MDZ","MED","MEL","MEM","MEX","MFD","MGA","MGL","MGM","MHD","MHT","MIA","MJV","MKC","MKE","MKG","MLA","MLB","MLE","MLH","MLI","MLN","MLU","MME","MMH","MMX","MNL","MOB","MOO","MPM","MQC","MQL","MRS","MRU","MRY","MSN","MSO","MSP","MSQ","MST","MSU","MSY","MTJ","MTS","MTY","MUC","MUX","MVD","MVY","MXE","MXP","MYF","MYR","MYT","MZL","NAG","NAN","NAP","NAS","NAT","NBO","NCE","NCL","NDJ","NDL","NGB","NGO","NGS","NIC","NIM","NKC","NKG","NNG","NOS","NQY","NRN","NRT","NSN","NTE","NTL","NUE","NWI","NYO","OAK","OBN","ODS","OGG","OHD","OKA","OKC","OMA","OME","OMO","OMS","ONT","OOL","OPO","ORB","ORD","ORF","ORH","ORK","ORY","OSL","OST","OTP","OUA","OUL","OVB","OVD","OXB","OXF","PAE","PAP","PBG","PBH","PBI","PBM","PCL","PDG","PDL","PDP","PDV","PDX","PEE","PEK","PEM","PEN","PER","PEW","PFB","PFO","PHC","PHF","PHK","PHL","PHX","PIE","PIK","PIO","PIT","PIU","PIX","PKU","PLM","PLU","PMI","PMW","PNA","PNH","PNI","PNK","PNQ","PNS","PNZ","POA","POM","POO","POS","PPG","PPT","PQC","PRG","PRN","PSA","PSC","PSE","PSP","PTK","PTP","PTY","PUF","PUQ","PUS","PVD","PVG","PVR","PVU","PWK","PWM","PXO","PXU","PZO","QRO","RAI","RAK","RBA","RBD","RDD","RDU","REC","REP","RFD","RGI","RGN","RIC","RIV","RIW","RIX","RJL","RLG","RMS","RNO","RNS","RNT","ROA","ROC","ROR","ROS","ROV","ROW","RPR","RRG","RST","RSW","RTM","RUH","RUN","RVN","RYG","RYK","RZE","SAB","SAF","SAH","SAL","SAN","SAT","SAV","SAW","SBA","SBD","SBN","SBP","SCE","SCL","SCO","SCQ","SCT","SDF","SDQ","SDR","SDU","SEA","SEN","SEX","SFA","SFJ","SFN","SFO","SGC","SGF","SGN","SGU","SGY","SHA","SHD","SHE","SHV","SID","SIN","SIP","SIR","SJC","SJD","SJJ","SJK","SJO","SJU","SJZ","SKB","SKG","SKP","SKZ","SLC","SLK","SLM","SLN","SLU","SLZ","SMA","SMF","SNA","SNN","SOB","SOC","SOF","SOQ","SOU","SOY","SPG","SPU","SQL","SRE","SRG","SRQ","SSA","SSF","SSG","SSH","STI","STL","STN","STP","STR","STS","STT","STX","SUB","SUN","SUV","SUX","SVD","SVG","SVO","SVQ","SVX","SWF","SXB","SXF","SXM","SXR","SYD","SYR","SYX","SYZ","SZB","SZG","SZX","TAB","TAK","TAO","TAS","TBB","TBP","TBS","TBZ","TCQ","TER","TFN","TFS","TGD","TGI","TGM","TGU","THR","TIA","TIF","TIJ","TIP","TJM","TKK","TLL","TLS","TLV","TMS","TNA","TNG","TNM","TNR","TNT","TOL","TOS","TPA","TPE","TPP","TRD","TRE","TRF","TRI","TRN","TRS","TRU","TRV","TRW","TSA","TSE","TSN","TTN","TUL","TUN","TUS","TXL","TYL","TYS","TZL","UFA","UIH","UIO","ULN","UPG","URA","USH","USM","UTH","UUD","UUS","UVF","VAM","VAR","VAV","VCA","VCE","VCL","VCP","VCS","VDE","VDH","VGO","VGT","VIE","VII","VIX","VKG","VKO","VLC","VLI","VLL","VLN","VNO","VNS","VOG","VOZ","VPS","VRN","VTE","VVI","WAW","WDH","WGP","WLG","WMI","WRO","WUX","XCH","XIY","XMN","XNA","XNN","XRY","YAM","YAP","YAZ","YDT","YEG","YFB","YGO","YHK","YHM","YHZ","YIP","YJS","YLT","YLW","YMM","YMX","YNB","YNG","YON","YOO","YOW","YQB","YQM","YQR","YQT","YQX","YQY","YSB","YSJ","YTZ","YUL","YUM","YVR","YWG","YXE","YXH","YXU","YXX","YXY","YYC","YYD","YYJ","YYT","YYZ","YZF","ZAD","ZAG","ZAZ","ZCL","ZIH","ZLO","ZQN","ZRH"};
		
		final String[] delayCodesOptions = {"00","01","02","03","04","05","06","07","08","09","11","12","13","14","15","16","17","18","19","21","22","23","24","25","26","27","28","29","31","32","33","34","35","36","37","38","39","41","42","43","44","45","46","47","48","51","52","55","56","57","58","61","62","63","64","65","66","67","68","69","71","72","73","75","76","77","81","82","83","84","85","86","87","88","89","91","92","93","94","95","96","97","98","99"};
		
		final long offset = Timestamp.valueOf("2010-01-01 00:00:00").getTime();
		final long end = Timestamp.valueOf("2017-01-01 00:00:00").getTime();
		
		final String[] slotKindOptions = {"Flight", "Maintenance"};		
		
		final String[] maintenanceEventOptions = {"Delay", "Safety", "AircraftOnGround", "Maintenance", "Revision"};
		
		
		final String[] ataCodes = {"1100","1210","1220","1230","1240","1400","1410","1420","1430","1497","1800","1810","1820","1897","2100","2110","2120","2121","2130","2131","2132","2133","2134","2140","2150","2160","2161","2162","2163","2170","2197","2200","2210","2211","2212","2213","2214","2215","2216","2220","2230","2250","2297","2300","2310","2311","2312","2320","2330","2340","2350","2360","2370","2397","2400","2410","2420","2421","2422","2423","2424","2425","2430","2431","2432","2433","2434","2435","2436","2437","2440","2450","2460","2497","2500","2510","2520","2530","2540","2550","2551","2560","2561","2562","2563","2564","2565","2570","2571","2572","2597","2600","2610","2611","2612","2613","2620","2621","2622","2697","2700","2701","2710","2711","2720","2721","2722","2730","2731","2740","2741","2742","2750","2751","2752","2760","2761","2770","2780","2781","2782","2797","2800","2810","2820","2821","2822","2823","2824","2830","2840","2841","2842","2843","2844","2897","2900","2910","2911","2912","2913","2914","2915","2916","2917","2920","2921","2922","2923","2925","2926","2927","2930","2931","2932","2933","2934","2997","3000","3010","3020","3030","3040","3050","3060","3070","3080","3097","3100","3110","3120","3130","3140","3150","3160","3170","3197","3200","3201","3210","3211","3212","3213","3220","3221","3222","3230","3231","3232","3233","3234","3240","3241","3242","3243","3244","3245","3246","3250","3251","3252","3260","3270","3297","3300","3310","3320","3330","3340","3350","3397","3400","3410","3411","3412","3413","3414","3415","3416","3417","3418","3420","3421","3422","3423","3424","3425","3430","3431","3432","3433","3434","3435","3436","3440","3441","3442","3443","3444","3445","3446","3450","3451","3452","3453","3454","3455","3456","3457","3460","3461","3497","3500","3510","3520","3530","3597","3600","3610","3620","3697","3700","3710","3720","3797","3800","3810","3820","3830","3840","3897","4500","4597","4900","4910","4920","4930","4940","4950","4960","4970","4980","4990","4997","5100","5101","5102","5200","5210","5220","5230","5240","5241","5242","5243","5244","5245","5246","5247","5248","5250","5260","5270","5280","5297","5300","5301","5302","5310","5311","5312","5313","5314","5315","5320","5321","5322","5323","5324","5330","5340","5341","5342","5343","5344","5345","5346","5347","5350","5397","5400","5410","5411","5412","5413","5414","5415","5420","5497","5500","5510","5511","5512","5513","5514","5520","5521","5522","5523","5524","5530","5531","5532","5533","5534","5540","5541","5542","5543","5544","5550","5551","5552","5553","5554","5597","5600","5610","5620","5630","5640","5697","5700","5710","5711","5712","5713","5714","5720","5730","5740","5741","5742","5743","5744","5750","5751","5752","5753","5754","5755","5797","6100","6110","6111","6112","6113","6114","6120","6121","6122","6123","6130","6140","6197","6200","6210","6220","6230","6240","6297","6300","6310","6320","6321","6322","6330","6340","6397","6400","6410","6420","6440","6497","6500","6510","6520","6540","6597","6700","6710","6711","6720","6730","6797","7100","7110","7111","7112","7120","7130","7160","7170","7197","7200","7210","7220","7230","7240","7250","7260","7261","7270","7297","7300","7310","7311","7312","7313","7314","7320","7321","7322","7323","7324","7330","7331","7332","7333","7334","7397","7400","7410","7411","7412","7413","7414","7420","7421","7430","7497","7500","7510","7520","7530","7531","7532","7540","7597","7600","7601","7602","7603","7620","7697","7700","7710","7711","7712","7713","7714","7720","7721","7722","7730","7731","7732","7740","7797","7800","7810","7820","7830","7897","7900","7910","7920","7921","7922","7923","7930","7931","7932","7933","7997","8000","8010","8011","8012","8097","8100","8110","8120","8197","8200","8297","8300","8397","8500","8510","8520","8530","8540","8550","8560","8570","8597"};
		final String[] workOrderKindOptions = {"Forecast", "TechnicalLogBook"};
		
		final String[] frequencyUnitsKindOptions = {"Flights", "Days", "Miles"};
		final String[] MELCathegoryOptions = {"A", "B", "C", "D"};
		final String[] reportKindOptions = {"PIREP", "MAREP"};
		final String[] aircraftModels = {"A319","A320 family","A320neo family","A321","A330","A330neo","A340","A350 XWB","737","747","767","777"};
		final String[] aircraftManufacturers= {"Airbus","Airbus","Airbus","Airbus","Airbus","Airbus","Airbus","Airbus","Boeing","Boeing","Boeing","Boeing"};
		
		final int MAX_ATTCH_SIZE = 20;
		
		final int MAX_WORK_ORDERS = 10;
		
		// Slots
		

		//aircraft registration
		
		// fleet 
		String[] fleet = new String[FLEET_SIZE];
		String[] MSNs = new String[FLEET_SIZE];
		String[] models = new String[FLEET_SIZE];
		String[] manufacturers = new String[FLEET_SIZE];
		
		Random r = new Random(System.currentTimeMillis());
		for (int i=0; i<FLEET_SIZE; i++){		
			fleet[i] = regPrefix + alphabet.charAt(r.nextInt(alphabet.length())) + alphabet.charAt(r.nextInt(alphabet.length())) + alphabet.charAt(r.nextInt(alphabet.length()));						
			MSNs[i] = "MSN "+ r.nextInt((9999 - 1000) + 1) + 1000;
			int k = r.nextInt(aircraftModels.length);
			models[i] = aircraftModels[k];
			manufacturers[i] = aircraftManufacturers[k];
		}
		
		///CSV fleet generation 
		System.out.println("FLEET:");
		System.out.println("aircraft_reg_code,manufacturer_serial_number,aircraft_model,manufacturer");
		for (int i=0; i<FLEET_SIZE; i++){
			System.out.println(fleet[i]+","+MSNs[i]+","+models[i]+","+manufacturers[i]);
		}
		
		
		String[] aircraftRegs = new String[SIZE];
		r = new Random(System.currentTimeMillis());
		for (int i=0; i<SIZE; i++){		
			aircraftRegs[i] = fleet[r.nextInt(fleet.length)];			
			
			
		}
//		
//		for (String ar: aircraftRegs)
////			System.out.println(ar);
//		
		//arrival,  departure, delayCode, canceled 
		
		long diff = end - offset + 1;
		
		Timestamp[] scheduledDepartures = new Timestamp[SIZE];
		Timestamp[] scheduledArrivals = new Timestamp[SIZE];
		Timestamp[] actualDepartures = new Timestamp[SIZE];
		Timestamp[] actualArrivals = new Timestamp[SIZE];
		int[] delays = new int[SIZE];
		
		
		
		String[] delayCodes = new String[SIZE];
		
		boolean[] canceled = new boolean[SIZE];
		
		for (int i=0; i<SIZE; i++){	
			Timestamp rand = new Timestamp(offset + (long)(Math.random() * diff));
			Calendar cal = Calendar.getInstance();
			cal.setTimeInMillis(rand.getTime());			
			Timestamp scheduledDeparture = new Timestamp(cal.getTimeInMillis());
			scheduledDepartures[i] = scheduledDeparture;
			
			cal.add(Calendar.HOUR_OF_DAY, r.nextInt(MAX_DUR));
			Timestamp scheduledArrival = new Timestamp(cal.getTimeInMillis());
			scheduledArrivals[i] = scheduledArrival;
			
			canceled[i] = r.nextBoolean();
			
			if (canceled[i]) continue;
			
			Calendar cal1 = Calendar.getInstance();
			cal1.setTimeInMillis(scheduledDeparture.getTime());
			int delay =  r.nextInt(MAX_DELAY);
			delays[i] = delay;
			if (delay > 0) delayCodes[i] = delayCodesOptions[r.nextInt(delayCodesOptions.length)];
			else  delayCodes[i] = null;
			cal1.add(Calendar.MINUTE, delay);
			Timestamp actualDeparture = new Timestamp(cal1.getTimeInMillis());
			actualDepartures[i] = actualDeparture;
			
			Calendar cal2 = Calendar.getInstance();
			cal2.setTimeInMillis(scheduledArrival.getTime());
			cal1.add(Calendar.MINUTE, delay);
			Timestamp actualArrival = new Timestamp(cal2.getTimeInMillis());
			actualArrivals[i] = actualArrival;
						
		}
		
//		for (int i=0; i<SIZE; i++){	
////			System.out.println(scheduledDepartures[i] + " - " + scheduledArrivals[i]+ "; " + canceled[i] + ", " + delays[i] + " #" + delayCodes[i] + " ;" + actualDepartures[i] + " - " + actualArrivals[i]);
//		}			
		
		//Slot kinds, origin and destination, passangers
		
		String[] slotKinds = new String[SIZE];
		
		String[] flightIDs = new String[SIZE];
				
		
		Pair[] originDest = new Pair[SIZE];
		HashMap<String, String> orgDestToFlightNo = new HashMap<String, String>();
		
		int[] passangers = new int[SIZE];
		int[] cabinCrew = new int[SIZE];
		int[] flightCrew = new int[SIZE];
		
		boolean[] programmed = new boolean[SIZE];
		
		int[] maintenanceID = new int[SIZE];
		String[] airportMaintenance = new String[SIZE];
		String[] subsystem = new String[SIZE];
		Timestamp[] starttimes = new Timestamp[SIZE];
		int[] days = new int[SIZE]; //days
		int[] hours = new int[SIZE]; //hours
		int[] minutes = new int[SIZE]; //minutes
		String[] maintenanceKinds = new String[SIZE];
		Date[] departure = new Date[SIZE];
		UUID[][] attachment_files = new UUID[SIZE][MAX_ATTCH_SIZE];
		int[][] attachment_events = new int[SIZE][MAX_ATTCH_SIZE];
		
		
		//work package variables
		int[] workPackageIDs = new int[SIZE];
		Date[] executionDates = new Date[SIZE];
		String[] executionPlaces = new String[SIZE];
		
		int[][] workOrderIDs = new int[SIZE][MAX_WORK_ORDERS];
		String[][] workOrder_aircraftRegs = new String[SIZE][MAX_WORK_ORDERS];
		Date[][] workOrder_executionDates = new Date[SIZE][MAX_WORK_ORDERS];
		String[][] workOrder_executionPlaces = new String[SIZE][MAX_WORK_ORDERS];
		int[][] workOrder_workPackageIDs = new int[SIZE][MAX_WORK_ORDERS];
		String[][] workOrder_workOrderKinds = new String[SIZE][MAX_WORK_ORDERS];
		Date[][] workOrder_deadlines = new Date[SIZE][MAX_WORK_ORDERS];
		Date[][] workOrder_plannedDates = new Date[SIZE][MAX_WORK_ORDERS];
		int[][] workOrder_frequencies = new int[SIZE][MAX_WORK_ORDERS];
		String[][] workOrder_frequencyUnits = new String[SIZE][MAX_WORK_ORDERS];
		int[][] workOrder_forecastedManHours = new int[SIZE][MAX_WORK_ORDERS];
		String[][] workOrder_reporteurClasses = new String[SIZE][MAX_WORK_ORDERS];
		int[][] workOrder_reporteurIDs = new int[SIZE][MAX_WORK_ORDERS];
		Date[][] workOrder_dueDates = new Date[SIZE][MAX_WORK_ORDERS];
		boolean[][] workOrder_deferreds = new boolean[SIZE][MAX_WORK_ORDERS];
		String[][] workOrder_MELs = new String[SIZE][MAX_WORK_ORDERS];
		
		for (int i=0; i<SIZE; i++){	
			
			slotKinds[i] = slotKindOptions[r.nextInt(slotKindOptions.length)];
			
			//if maintenance
			if (slotKinds[i].equalsIgnoreCase("Maintenance") || delays[i]>0){
				programmed[i] = r.nextBoolean();
				maintenanceID[i] = r.nextInt(1000); 
				airportMaintenance[i] = airpotCodes[r.nextInt(airpotCodes.length)];
				subsystem[i] = ataCodes[r.nextInt(ataCodes.length)];
				starttimes[i] = scheduledDepartures[i]; 
				
				maintenanceKinds[i] = maintenanceEventOptions[r.nextInt(maintenanceEventOptions.length)];
				
				switch (maintenanceKinds[i]){
					case "Delay": {
						minutes[i] = r.nextInt(60); break;
					}
					case "Safety": {
						days[i] = r.nextInt(90); 
						hours[i] = r.nextInt(24);
						minutes[i] = r.nextInt(60);
						break;
					}
					case "AircraftOnGround": {
						days[i] = 0;
						hours[i] = r.nextInt(24);
						minutes[i] = r.nextInt(60);
						break;
					}
					case "Maintenance": {
						days[i] = r.nextInt(1);
						hours[i] = r.nextInt(24);
						minutes[i] = r.nextInt(60);
						break;
					}
					case "Revision": {
						days[i] = r.nextInt(31);
						hours[i] = r.nextInt(24);
						minutes[i] = r.nextInt(60);
						break;
					}
				}
				
				departure[i] = new Date(scheduledDepartures[i].getTime());
				
				
				for (int j=0 ; j<MAX_ATTCH_SIZE ; j++){
					attachment_files[i][j] = UUID.randomUUID();		
					attachment_events[i][j] = maintenanceID[i];					
				}
			
				
				//WorkPackages
				workPackageIDs[i] = r.nextInt(1000); 
				executionDates[i] = departure[i];
				executionPlaces[i] = airportMaintenance[i];
				
				for (int j=0 ; j<MAX_WORK_ORDERS ; j++){
					workOrderIDs[i][j] = r.nextInt(1000);
					workOrder_aircraftRegs[i][j] = aircraftRegs[i];
					workOrder_executionDates[i][j] =  departure[i];
					workOrder_executionPlaces[i][j] = airportMaintenance[i];
					workOrder_workPackageIDs[i][j] = workPackageIDs[i];
					workOrder_workOrderKinds[i][j] = workOrderKindOptions[r.nextInt(workOrderKindOptions.length)];
					
					
					Calendar c1 = Calendar.getInstance();
					c1.setTimeInMillis(departure[i].getTime());
					int dur = r.nextInt((250 - 20) + 1) + 20;
					c1.add(Calendar.DAY_OF_YEAR, dur);
					
					Calendar c2 = Calendar.getInstance();
					c2.setTimeInMillis(departure[i].getTime());
					dur = dur - r.nextInt((10 - 1) + 1) + 1;
					c2.add(Calendar.DAY_OF_YEAR, dur);
					
					
					workOrder_deadlines[i][j] = new Date(c1.getTimeInMillis());
					workOrder_plannedDates[i][j] = new Date(c2.getTimeInMillis());
					workOrder_frequencyUnits[i][j] = frequencyUnitsKindOptions[r.nextInt(frequencyUnitsKindOptions.length)];
					workOrder_frequencies[i][j] =  r.nextInt(100);
					workOrder_forecastedManHours[i][j] = r.nextInt(20);
					workOrder_reporteurClasses[i][j] = reportKindOptions[r.nextInt(reportKindOptions.length)];
					workOrder_reporteurIDs[i][j]  = r.nextInt(500);
					workOrder_dueDates[i][j] = new Date(c1.getTimeInMillis());
					workOrder_deferreds[i][j] = r.nextBoolean();
					workOrder_MELs[i][j] = MELCathegoryOptions[r.nextInt(MELCathegoryOptions.length)];
				}
			
			
			}
			
			
			/////////////////////////
			
			//if flight
			//if (!slotKinds[i].equalsIgnoreCase("Flight")) continue;
						
			String origin = airpotCodes[r.nextInt(airpotCodes.length)];
			String dest = airpotCodes[r.nextInt(airpotCodes.length)];
			while (origin.equalsIgnoreCase(dest)){
				dest = airpotCodes[r.nextInt(airpotCodes.length)];
			}			
			originDest[i] = new Pair(origin, dest);
			if (!orgDestToFlightNo.containsKey(origin+"-"+dest)){
				String flightNo = digits.charAt(r.nextInt(10))+""+digits.charAt(r.nextInt(10))+digits.charAt(r.nextInt(10))+digits.charAt(r.nextInt(10));
				orgDestToFlightNo.put(origin+"-"+dest, flightNo);
			}	
			
			
			passangers[i] =  r.nextInt((MAX_PAS - MIN_PAS) + 1) + MIN_PAS;
			cabinCrew[i] =  r.nextInt((MAX_CCREW - MIN_CCREW) + 1) + MIN_CCREW;
			flightCrew[i] =  r.nextInt((MAX_FCREW - MIN_FCREW) + 1) + MIN_FCREW;
			
			flightIDs[i] =  scheduledDepartures[i] + "-" + originDest[i].first + "-" + originDest[i].second + "-" + orgDestToFlightNo.get(originDest[i].toString()) + "-" + aircraftRegs[i];  
			
			
		}

		
//		for (String fID: flightIDs){
//			System.out.println(fID);
//		}
//		
//		for (Pair od: originDest){
//			System.out.print(od);System.out.print("; "); 
//			if (od != null) System.out.println(orgDestToFlightNo.get(od.toString()));
//		}
//		
//		
//
//		for (String s: slotKinds){
//			System.out.println(s);
//		}
//		
//			
//		for (int i=0; i<SIZE; i++){	
//			System.out.println(passangers[i] + ", "+ cabinCrew[i] + ", " + flightCrew[i]);
//		}
		
		
		
		//
		System.out.println("SQL inserts");
		
		
		String outputFlights = "";
		String outputMaintenances = "";
		for (int i=0; i<SIZE; i++){			
			if (slotKinds[i].equalsIgnoreCase("Flight"))			
				outputFlights += "("+"'"+aircraftRegs[i]+"'"+","+"'"+scheduledDepartures[i]+"'"+","+"'"+scheduledArrivals[i]+"'"+","+"'"+slotKinds[i]+"'"+","+"'"+flightIDs[i]+"'"+","+"'"+originDest[i].first+"'"+","+"'"+originDest[i].second+"'"+","+"'"+actualDepartures[i]+"'"+","+"'"+actualArrivals[i]+"'"+","+canceled[i]+","+"'"+delayCodes[i]+"'"+","+passangers[i]+","+cabinCrew[i]+","+flightCrew[i]+"),\n";
			else if (slotKinds[i].equalsIgnoreCase("Maintenance"))	
				outputMaintenances += "("+"'"+aircraftRegs[i]+"'"+","+"'"+scheduledDepartures[i]+"'"+","+"'"+scheduledArrivals[i]+"'"+","+"'"+slotKinds[i]+"'"+","+programmed[i]+"),\n";
				
		}
		System.out.println("FLIGHTS");
		System.out.println(outputFlights.replaceAll("'null'", "null"));
		System.out.println();
		System.out.println("MAINTENANCES");
		System.out.println(outputMaintenances.replaceAll("'null'", "null"));
		
		
		
		String outputOI = "";
		for (int i=0; i<SIZE; i++){	
			if (slotKinds[i].equalsIgnoreCase("Maintenance") || delays[i]>0)
				outputOI += "("+maintenanceID[i]+","+"'"+aircraftRegs[i]+"'"+","+"'"+airportMaintenance[i]+"'"+","+"'"+subsystem[i]+"'"+","+"'"+starttimes[i]+"'"+","+"'"+days[i]+":"+hours[i]+":"+minutes[i]+"'"+","+"'"+maintenanceKinds[i]+"'"+","+"'"+flightIDs[i]+"'"+","+"'"+departure[i]+"'"+","+"'"+delayCodes[i]+"'"+"),\n";
		}
		
		System.out.println();
		System.out.println("OIs");
		System.out.println(outputOI.replaceAll("'null'", "null"));
		
		String attachments = "";
		for (int i=0; i<SIZE; i++){	
			if (slotKinds[i].equalsIgnoreCase("Maintenance") || delays[i]>0){
				for (int j=0; j<MAX_ATTCH_SIZE; j++){	
					attachments +=  "("+"'"+attachment_files[i][j]+"'"+","+attachment_events[i][j]+"),\n";
				}
				
			}
		}
		System.out.println();
		System.out.println("ATTACHMENTS");
		System.out.println(attachments.replaceAll("'null'", "null"));
		
		
		
		String workPackages = "";
		
		String forecastedOrders = "";
		String technicalLogBookOrders = "";
		for (int i=0; i<SIZE; i++){	
			if (slotKinds[i].equalsIgnoreCase("Maintenance") || delays[i]>0){
				workPackages += "("+workPackageIDs[i]+","+"'"+executionDates[i]+"'"+","+"'"+executionPlaces[i]+"'"+"),\n";
				
				for (int j=0; j<MAX_WORK_ORDERS; j++){	
					if (workOrder_workOrderKinds[i][j].equalsIgnoreCase("Forecast"))
						forecastedOrders +=  "("+workOrderIDs[i][j]+","+"'"+workOrder_aircraftRegs[i][j]+"'"+","+"'"+workOrder_executionDates[i][j]+"'"+","+"'"+workOrder_executionPlaces[i][j]+"'"+","+workOrder_workPackageIDs[i][j]+","+"'"+workOrder_workOrderKinds[i][j]+"'"+","+"'"+workOrder_deadlines[i][j]+"'"+","+"'"+workOrder_plannedDates[i][j]+"'"+","+workOrder_frequencies[i][j]+","+"'"+workOrder_frequencyUnits[i][j]+"'"+","+workOrder_forecastedManHours[i][j]+"),\n";
					else if (workOrder_workOrderKinds[i][j].equalsIgnoreCase("TechnicalLogBook"))
						technicalLogBookOrders +=  "("+workOrderIDs[i][j]+","+"'"+workOrder_aircraftRegs[i][j]+"'"+","+"'"+workOrder_executionDates[i][j]+"'"+","+"'"+workOrder_executionPlaces[i][j]+"'"+","+workOrder_workPackageIDs[i][j]+","+"'"+workOrder_workOrderKinds[i][j]+"'"+","+"'"+workOrder_reporteurClasses[i][j]+"'"+","+workOrder_reporteurIDs[i][j]+","+"'"+workOrder_dueDates[i][j]+"'"+","+workOrder_deferreds[i][j]+","+"'"+workOrder_MELs[i][j]+"'"+"),\n";
				}
				
			}
		}
		System.out.println();
		System.out.println("WORK PACKAGES");
		System.out.println(workPackages.replaceAll("'null'", "null"));
		
		System.out.println();
		System.out.println("FORECAST ORDERS");		
		System.out.println(forecastedOrders.replaceAll("'null'", "null"));
		
		System.out.println();
		System.out.println("TECHNICAL LOG BOOK ORDERS");		
		System.out.println(technicalLogBookOrders.replaceAll("'null'", "null"));
		
	}
	
	
	
	
	
}
