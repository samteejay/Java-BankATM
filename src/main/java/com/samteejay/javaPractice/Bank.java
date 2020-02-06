package main.java.com.samteejay.javaPractice;

import main.java.com.samteejay.javaPractice.SavingsAccount;
import java.util.HashMap;
import java.util.Map;

public class Bank {

    private Map<String, SavingsAccount> accounts = new HashMap<>();


    public Bank() {
		/*Creates a new dictionary to hold the accounts.
		If a filename is provided, loads the accounts from
		a file of pickled accounts*/

        this.accounts = accounts;
		/*this.fileName = fileName
		if fileName != None:
			fileObj = open(fileName, 'r')
			while True:
				try:
					account = cPickle.load(fileObj)
					this.add(account)
				except EOFError:
					fileObj.close()
					break */

	}

	/*public str() {
		Return the string rep of the entire bank
		return '\n'.join(map(str, this.accounts.values())) */

	public void add( SavingsAccount account){
        /*Inserts an account using its PIN as a key*/
        this.accounts.put(account.getPin(), account);
	}

    public SavingsAccount remove( Integer pin){
        return this.accounts.remove(pin);

	}

    public SavingsAccount get( Integer pin){
        return this.accounts.get(pin);
	}

    public double computeInterest() {
        /*Computes interest for each account and
        returns the total*/
        double total = 0.0;

        for (SavingsAccount account : accounts.values()) {
            total += account.computeInterest();

        }
        return total;
	}

    /*public save(fileName = null) {
        Saves pickled accounts to a file.  The parameter
        allows the user to change filenames
        if (fileName != null) {
            this.fileName = fileName;
        } else if (this.fileName == null) {
            return;
        }

        fileObj = open(this.fileName, 'w');
        for (account in this.accounts.values()) {
            cPickle.dump(account, fileObj);
        }
        fileObj.close();
	} */


}