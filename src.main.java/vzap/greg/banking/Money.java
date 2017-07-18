package vzap.greg.banking;

import java.io.Serializable;

public final class Money implements Serializable
{
	private static final long serialVersionUID = 1L;
	private int rands;
	private int cents;

	public Money(int notes, int cents)
	{
		this.rands = notes;
		this.cents = cents;
	}

	public int getRands()
	{
		return rands;
	}

	public int getCents()
	{
		return cents;
	}
	public static Money addMoney(Money m1, Money m2)
	{
		int m1m2Cents = m1.getCents() + m2.getCents();
		int m1m2Notes = m1.getRands() + m2.getRands();
		if(m1m2Cents > 99)
		{
			m1m2Notes = m1m2Notes + 1;
			m1m2Cents = m1m2Cents - 100;
		}
		return new Money(m1m2Notes, m1m2Cents);
	}
	
	public static Money subtractMoney(Money m1, Money m2)
	{
		int m1m2Cents = m1.getCents() - m2.getCents();
		int m1m2Notes = m1.getRands() - m2.getRands();
		if(m1m2Cents < 0)
		{
			m1m2Notes = m1m2Notes - 1;
			m1m2Cents = m1m2Cents + 100;
		}
		return new Money(m1m2Notes, m1m2Cents);
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + cents;
		result = prime * result + rands;
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (getClass() != obj.getClass())
		{
			return false;
		}
		Money other = (Money) obj;
		if (cents != other.cents)
		{
			return false;
		}
		if (rands != other.rands)
		{
			return false;
		}
		return true;
	}

	@Override
	public String toString()
	{
		return "Money [rands = " + rands + ", cents = " + cents + "]";
	}

}
