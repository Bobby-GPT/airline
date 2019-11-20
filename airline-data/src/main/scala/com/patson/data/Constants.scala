package com.patson.data

import com.typesafe.config.ConfigFactory

object Constants {
  val CYCLE_TABLE = "cycle"
  val CITY_TABLE = "city"
  val AIRPORT_TABLE = "airport"
  val AIRPORT_INDEX_1 = "airport_index_1"
  val AIRPORT_CITY_SHARE_INDEX_1 = "airport_city_index_1"
  val AIRPORT_CITY_SHARE_INDEX_2 = "airport_city_index_2"
  val AIRPORT_CITY_SHARE_TABLE = "airport_city"
  val AIRPORT_FEATURE_TABLE = "airport_feature"
  val AIRPORT_FEATURE_INDEX_1 = "airport_feature_index_1"
  val AIRPORT_PROJECT_TABLE = "airport_project"
  val AIRPORT_PROJECT_INDEX_1 = "airport_project_index_1"
  val AIRPORT_IMAGE_TABLE = "airport_image"
  val COUNTRY_TABLE = "country"
  val COUNTRY_AIRLINE_RELATIONSHIP_TABLE = "country_airline_relationship"
  val COUNTRY_AIRLINE_RELATIONSHIP_INDEX_1 = "country_airline_relationship_index_1"
  val COUNTRY_AIRLINE_RELATIONSHIP_INDEX_2 = "country_airline_relationship_index_2"
  val COUNTRY_MUTUAL_RELATIONSHIP_TABLE = "country_mutual_relationship"
  val COUNTRY_MARKET_SHARE_TABLE = "country_market_share"
  val LINK_TABLE = "link"
  val LINK_INDEX_1 = "link_index_1"
  val LINK_INDEX_2 = "link_index_2"
  val LINK_INDEX_3 = "link_index_3"
  val LINK_INDEX_4 = "link_index_4"
  val LINK_CONSUMPTION_TABLE = "link_consumption"
  val LINK_CONSUMPTION_INDEX_1 = "link_consumption_index_1"
  val LINK_CONSUMPTION_INDEX_2 = "link_consumption_index_2"
  val LINK_CONSUMPTION_INDEX_3 = "link_consumption_index_3"
  val LINK_ASSIGNMENT_TABLE = "link_assignment"
  val LINK_ASSIGNMENT_INDEX_1 = "link_assignment_index_1"
  val LINK_ASSIGNMENT_INDEX_2 = "link_assignment_index_2"
  val LINK_STATISTICS_TABLE = "link_statistics"
  val LINK_STATISTICS_INDEX_1 = "link_statistics_index_1"
  val LINK_STATISTICS_INDEX_2 = "link_statistics_index_2"
  val LINK_STATISTICS_INDEX_3 = "link_statistics_index_3"
  val LINK_STATISTICS_INDEX_4 = "link_statistics_index_4"
  val WATCHED_LINK_TABLE = "watched_link"
  val AIRLINE_TABLE = "airline"
  val AIRLINE_INFO_TABLE = "airline_info"
  val AIRLINE_BASE_TABLE = "airline_base"
  val AIRLINE_BASE_INDEX_1 = "airline_base_index_1"
  val AIRLINE_BASE_INDEX_2 = "airline_base_index_2"
  val AIRLINE_BASE_INDEX_3 = "airline_base_index_3"
  val AIRPORT_LOYALTY_TABLE = "loyalty"
//  val AIRPORT_SLOT_ASSIGNMENT_TABLE = "airport_slot_assignment"
  val AIRLINE_APPEAL_TABLE = "airline_appeal"
  val AIRLINE_APPEAL_INDEX_1 = "airline_appeal_index_1"
  val AIRLINE_APPEAL_INDEX_2 = "airline_appeal_index_2"
  val AIRLINE_TRANSACTION_TABLE = "airline_transaction"
  val AIRLINE_TRANSACTION_INDEX_1 = "airline_transaction_index_1"
  val AIRLINE_TRANSACTION_INDEX_2 = "airline_transaction_index_2"
  val AIRLINE_CASH_FLOW_ITEM_TABLE = "airline_cash_flow_item"
  
  val INCOME_TABLE = "income"
  val CASH_FLOW_TABLE = "cash_flow"
  val AIRLINE_LOGO_TABLE = "airline_logo"
  val ALLIANCE_TABLE = "alliance"
  val ALLIANCE_MEMBER_TABLE = "alliance_member"
  val ALLIANCE_HISTORY_TABLE = "alliance_history"
  val AIRPLANE_RENEWAL_TABLE = "airline_renewal"
  val LINKS_INCOME_TABLE = "links_income"
  val TRANSACTIONS_INCOME_TABLE = "transactions_income"
  val OTHERS_INCOME_TABLE = "others_income"
  val AIRPLANE_MODEL_TABLE = "airplane_model"
  val AIRPLANE_TABLE = "airplane"
  val AIRPLANE_INDEX_1 = "airplane_index_1"
  val AIRPLANE_INDEX_2 = "airplane_index_2"
  val USER_TABLE = "user"
  val USER_SECRET_TABLE = "user_secret"
  val RESET_USER_TABLE = "reset_user"
  val USER_AIRLINE_TABLE = "user_airline"
  val VIP_ROUTE_TABLE = "vip_route"
  val VIP_ROUTE_ENTRY_TABLE = "vip_route_entry"
  val PASSENGER_HISTORY_TABLE = "passenger_history"
  val PASSENGER_HISTORY_INDEX_1 = "passenger_history_index_1"
  val LOAN_TABLE = "loan"
  val LOUNGE_TABLE = "lounge"
  val LOUNGE_CONSUMPTION_TABLE = "lounge_consumption"
  val OIL_CONTRACT_TABLE = "oil_contract"
  val OIL_PRICE_TABLE = "oil_price"
  val OIL_CONSUMPTION_HISTORY_TABLE = "oil_consumption_history"
  val OIL_INVENTORY_POLICY_TABLE = "oil_inventory_policy"
  val LOAN_INTEREST_RATE_TABLE = "loan_interest_rate"
  val LOG_TABLE = "log"
  val LOG_INDEX_1 = "log_index_1"
  val ALERT_TABLE = "alert"
  val ALERT_INDEX_1 = "alert_index_1"

  //Christmas Event
  val SANTA_CLAUS_INFO_TABLE = "santa_claus_info"
  
//  val DATABASE_CONNECTION = "jdbc:sqlite:../airline-data/db/default.db"
//  val DB_DRIVER = "org.sqlite.JDBC"
  val configFactory = ConfigFactory.load()
  val DB_HOST = if (configFactory.hasPath("mysqldb.host")) configFactory.getString("mysqldb.host") else "localhost:3306"
  println("!!!!!!!!!!!!!!!DB HOST IS " + DB_HOST)
  
  val DATABASE_CONNECTION = "jdbc:mysql://" + DB_HOST + "/airline?rewriteBatchedStatements=true&useSSL=false&autoReconnect=true&useUnicode=true&characterEncoding=utf-8"
  val DB_DRIVER = "com.mysql.jdbc.Driver"
  val DATABASE_USER = "sa" 
  val DATABASE_PASSWORD = "admin"
  
}