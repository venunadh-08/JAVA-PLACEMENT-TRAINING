def atm(name):
    balance = 0
    print(f'\t\t\tHello {name}')
    print("\t\t\tWelocme to BSI Bank")
    print("\t\t\t_______MENU_________")
    print("\t\t\t1.Deposit\n\t\t\t2.Withdraw\n\t\t\t3.Balance\n\t\t\t4.Quit")
    o = input().strip()
    match o:
        case '1':
            amount = float(input("Enter Principle Amount : "))
            balance += amount
            print(f"You have Deposited the amount\nBalance : {balance}\nThankyou Visit Again")
        case '2':
            amount = float(input("Enter Principle Amount : "))
            balance -= amount
            print(f"You have deposited {amount} rs/- \nBalance : {balance}\nThankyou Visit Again")
        case '3':
            print(f"Balance : {balance} \nThankyou Visit Again")
        case '4':
            print("Thankyou Visit Again")
atm(input("Enter Your Name : "))

