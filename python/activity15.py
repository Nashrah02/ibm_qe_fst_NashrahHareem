def error():
    try:
        print(x)
    except NameError:
        print("x hasn't been defined yet.")
error()