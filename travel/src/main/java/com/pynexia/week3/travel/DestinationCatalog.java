package com.pynexia.week3.travel;

import java.util.Arrays;
import java.util.List;
public final class DestinationCatalog {
 private DestinationCatalog(){}
 public static List<Destination> all(){return Arrays.asList(
  new Destination("Kyoto","Japan","Culture","Temples, tea houses and quiet lanes","Kyoto","https://images.unsplash.com/photo-1493976040374-85c8e12f0c0e?w=1000"),
  new Destination("Paris","France","Culture","Art, architecture and riverside walks","Paris","https://images.unsplash.com/photo-1502602898657-3e91760cbb34?w=1000"),
  new Destination("Rome","Italy","History","Ancient landmarks around every corner","Rome","https://images.unsplash.com/photo-1552832230-c0197dd311b5?w=1000"),
  new Destination("Machu Picchu","Peru","Nature","A high mountain citadel in the Andes","Machu Picchu","https://images.unsplash.com/photo-1526392060635-9d6019884377?w=1000"),
  new Destination("Santorini","Greece","Coast","Whitewashed villages above the Aegean","Santorini","https://images.unsplash.com/photo-1533105079780-92b9be482077?w=1000"),
  new Destination("Marrakesh","Morocco","Culture","Markets, gardens and historic medina","Marrakesh","https://images.unsplash.com/photo-1539020140153-e479b8c22e70?w=1000"),
  new Destination("Banff National Park","Canada","Nature","Turquoise lakes beneath the Rockies","Banff National Park","https://images.unsplash.com/photo-1503614472-8c93d56cdcc7?w=1000"),
  new Destination("Istanbul","Türkiye","History","A meeting of continents and empires","Istanbul","https://images.unsplash.com/photo-1524231757912-21f4fe3a7200?w=1000"),
  new Destination("Bali","Indonesia","Coast","Island temples and green rice terraces","Bali","https://images.unsplash.com/photo-1537996194471-e657df975ab4?w=1000"),
  new Destination("New York City","United States","City","Neighborhoods, museums and skyline views","New York City","https://images.unsplash.com/photo-1496588152823-86ff7695e68f?w=1000"));}
 public static String offlineGuide(String name){switch(name){
  case "Kyoto":return "Kyoto served as Japan’s capital for more than a thousand years. The city is known for historic temples, traditional wooden districts, gardens and seasonal cultural events. Explore Higashiyama and the old lanes on foot, and check local opening times before visiting.";
  case "Paris":return "Paris is the capital of France on the River Seine. Its museums, historic neighborhoods, architecture, gardens and food markets reward exploring one district at a time. Public transit connects major sights; check current attraction hours and reservations.";
  case "Rome":return "Rome is Italy’s capital, with archaeological landmarks, churches, piazzas and neighborhoods built across many centuries. The Colosseum and Roman Forum sit near the historic center. Wear comfortable shoes and confirm ticket requirements in advance.";
  case "Machu Picchu":return "Machu Picchu is a fifteenth-century Inca citadel in Peru’s Andes, set above the Urubamba Valley. Access is managed by timed entry and visitor routes. Plan transport and tickets ahead, allow time for altitude, and follow conservation guidance.";
  case "Santorini":return "Santorini is a Greek island in the Cyclades, shaped by a volcanic caldera and known for cliffside villages and Aegean views. Fira and Oia are popular bases. Summer crowds are heavy, so consider shoulder-season travel and local transport.";
  case "Marrakesh":return "Marrakesh is a major city in Morocco, known for its medina, souks, gardens and historic architecture. Jemaa el-Fnaa is a central public square; the old city is best explored on foot. Dress respectfully and agree prices before buying or hiring services.";
  case "Banff National Park":return "Banff National Park in Alberta protects mountain landscapes, lakes and wildlife in the Canadian Rockies. Trails and road conditions vary by season. Check park advisories, carry water and food, and keep a safe distance from wildlife.";
  case "Istanbul":return "Istanbul spans Europe and Asia along the Bosporus and carries layers of Byzantine and Ottoman history. Historic mosques, markets and waterfront neighborhoods are linked by ferries and transit. Check entry rules and opening times at religious sites.";
  case "Bali":return "Bali is an Indonesian island with volcanic terrain, rice terraces, beaches and Hindu temples. Travel times can be slow beyond central hubs. Respect temple customs, use marked trails, and check local conditions for surf and volcanic activity.";
  default:return "New York City is a large United States city of five boroughs, with museums, parks, neighborhoods and a broad public transit network. Plan by area to reduce travel time. Check attraction schedules and current transit advisories.";
 }}
}
