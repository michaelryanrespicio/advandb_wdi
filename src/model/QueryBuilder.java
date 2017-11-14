package model;

import java.util.ArrayList;

public class QueryBuilder {
	
	public String buildQuery(ArrayList<String> attributes, ArrayList<String> bAttributes, ArrayList<String> tables ){
		String queryAttributes = buildSelectGroupBy(attributes);
		String select = "SELECT ";
		String fromwhere = buildFromWhere(bAttributes, tables);
		String groupby = "";
		
		// if there are selected attributes, add them to select and groupby
		// add measure to select
		if( attributes.size() != 0 )
		{
		//	select += queryAttributes + ", " + measure;
			groupby = "GROUP BY " + queryAttributes;
		}
		else
		{
		//	select += measure;
		}
		
		return select + fromwhere + groupby + ";";
	}
	
	private String buildSelectGroupBy( ArrayList<String> attributes )
	{
		String queryAttr= "";
		
		for( int i = 0; i < attributes.size(); i++ )
		{
			if( i + 1 != attributes.size() )
			{
				queryAttr += attributes.get(i) + ", ";
			}
			else
			{
				queryAttr += attributes.get(i);
			}
		}
		
		return queryAttr;
	}
	
	private String buildFromWhere( ArrayList<String> bAttributes, ArrayList<String> tables )
	{
		String from = "FROM databyyear d ";
		String where = "";
		
		if( tables.size() != 0 )
		{
			from += ", ";
			where = "WHERE ";
		}
		
		for( int i = 0; i < tables.size(); i++ )
		{
			if( i + 1 != tables.size() )
			{
				from += tables.get(i) + ", ";
				where += buildWhereKeyJoin(tables.get(i)) + "AND ";
			}
			else
			{
				from += tables.get(i);
				where += buildWhereKeyJoin(tables.get(i));
			}
		}
		
		for( int i = 0; i < bAttributes.size(); i++ )
		{
			if( i == 0 && tables.size() != 0 )
			{
				where += "AND " + bAttributes.get(i) + " ";
			}
			else if( i == 0 && tables.size() == 0 )
			{
				where += bAttributes.get(i) + " ";
			}
			else
			{
				where += "AND " + bAttributes.get(i) + " ";
			}
		}
		
		return from + " " + where;
	}
	
	private String buildWhereKeyJoin( String table )
	{
		if( table.charAt(table.length()-1) == 'c' ) //country
		{
			return "d.countrycode = c.countrycode ";
		}
		else if( table.charAt(table.length()-1) == 'i' )//country income
		{
			return "d.countrycode = i.countrycode ";
		}
		else if( table.charAt(table.length()-1) == 'r' )//country regioun
		{
			return "d.countrycode = r.countrycode";
		}
		else
		{
			return "";
		}
	}
	
}

