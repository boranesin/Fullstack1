#burada n değişkenine 1000 değerine atayıp ikinci satırda n değerini kullanacak
#formülü çalıştırdık.

n <- 1000
n*(n+1)/2


# Compute log to the base 10 (log10) of the sqrt of 100.

sqrt(log10(100))

# Load package and data

library(dslabs)
data(murders)

# see the structure of the data - overview

str(murders)

# Use the function names to extract the variable names 
names(murders)

# Use the accessor to extract state abbreviations and assign it to a
a <- murders$abb

# Determine the class of a
class (a)

# We extract the population like this:
p <- murders$population

# This is how we do the same with the square brackets:
o <- murders[["population"]] 

#burada kareli parantezi iki kere kullanarak o değerine murders data setindeki
#population değerlerini atadık  

# We can confirm these two are the same
identical(o, p)

# We can see the class of the region variable using class
class(murders$region)

# Determine the number of regions included in this variable 
length(levels(murders$region))

# Write one line of code to show the number of states per region
table(murders$region)

#Northeast        South     North Central     West 
#9                17        12                13 


# Create a numeric vector to store the temperatures listed in the instructions 
# into a vector named temp
# Make sure to follow the same order in the instructions

temp <- c(35,88,42,84,81,30)

#Create a character vector called city to store the city names
# Make sure to follow the same order as in the instructions

city <- c( "Beijing", "Lagos", "Paris", "Rio de Janeiro", "San Juan", "Toronto")

# Associate the temperature values with its corresponding city

names(temp) <- city

#burada temp değerlerine city değerlerini isim olarak atıyoruz.

# Create a vector x of integers that starts at 12 and ends at 73.
x <- 12:73
# Determine the length of object x.
length(x)

# temperatures of the first three cities in the list:
temp[1:3]

# Define temp
temp <- c(35, 88, 42, 84, 81, 30)
city <- c("Beijing", "Lagos", "Paris", "Rio de Janeiro", "San Juan", "Toronto")
names(temp) <- city

# Access the temperatures of Paris and San Juan
temp[c(3,5)]

# Create a vector containing all the positive odd numbers smaller than 100.
# The numbers should be in ascending order
seq(1,99,2)

#ilk alan başlangıç değeri(dahil), ikinci alan bitiş değeri (dahil), üçüncü 
#alan artış değeri -- seq(başlangıç, bitiş, artış)

# Create a sequence of numbers from 6 to 55, with 4/7 increments and determine 
#its length
length(seq(6,55,(4/7)))

# Store the sequence in the object a
a <- seq( 1, 10, length.out = 100)

# Determine the class of a
class(a)
#numeric


# Store the sequence in the object a
a <- seq(1, 10)

# Determine the class of a
class(a)
#integer


# Define the vector x
x <- c(1, 3, 5,"a")

# Note that the x is character vector
x

# Redefine `x` to typecast it to get an integer vector using `as.numeric`.
# You will get a warning but that is okay
x <- as.numeric(x)

#burada x vectoründeki tüm değerleri sayı değeri atadık ya da n/a değerine çevirdik


# Access the `state` variable and store it in an object 
states <- murders$state 

# Sort the object alphabetically and redefine the object 
states <- sort(states) 

# Report the first alphabetical value  
states[1]

# Access population values from the dataset and store it in pop
pop <- murders$population
# Sort the object and save it in the same object 
pop <- sort(pop)
# Report the smallest population size 
pop[1]



# Access population from the dataset and store it in pop
pop <- murders$population
# Use the command order to find the vector of indexes that order pop and store 
# in object ord
ord <- order(pop)
# Find the index number of the entry with the smallest population size
ord[1]


# Find the index of the smallest value for variable total 
which.min(murders$total)

# Find the index of the smallest value for population
which.min(murders$population)

murders$population[which.min(murders$population)]
#populasyonun en düşük değerli elemanının indexinin populasyon değeri



# Define the variable i to be the index of the smallest state
i <- which.min(murders$population)

# Use the index you just defined to find the state with the smallest population
states[i]




# Store temperatures in an object 
temp <- c(35, 88, 42, 84, 81, 30)

# Store city names in an object 
city <- c("Beijing", "Lagos", "Paris", "Rio de Janeiro", "San Juan", "Toronto")

# Create data frame with city names and temperature 
city_temps <- data.frame(name = city, temperature = temp)


# Define a variable ranks to determine the population size ranks 
ranks <- rank(murders$population)

# Create a data frame my_df with the state name and its rank
my_df <- data.frame( state = states, rank = ranks)



# Define a variable ranks to determine the population size ranks 
ranks <- rank(murders$population)

# Define a variable ind to store the indexes needed to order the population values

ind <- order(murders$population)

# Create a data frame my_df with the state name and its rank and ordered from least populous to most 

my_df <- data.frame(name = states[ind], rank = ranks[ind] )

#burada states değişkeni yaratıp indexine murders$state index değerlerini atadık 
#sonrasında ranks değişkeni yaratıp indexine populasyon büyüklüğüne göre sıralanmış indeks
# değerlerini atadık

#my_df data framini kurarken name başlığının indexine  states değerlerini 
#rank başlığına da ranks değerlerini tanımladığımız ind değişkenine 




# Using new dataset 
library(dslabs)
data(na_example)

# Checking the structure 
str(na_example)

# Find out the mean of the entire dataset 
mean(na_example)

# Use is.na to create a logical index ind that tells which entries are NA
ind <- is.na(na_example)
# Determine how many NA ind has using the sum function
sum(ind)





# Note what we can do with the ! operator
x <- c(1, 2, 3)
ind <- c(FALSE, TRUE, FALSE)
x[!ind]

# Create the ind vector
library(dslabs)
data(na_example)
ind <- is.na(na_example)

# We saw that this gives an NA
mean(na_example)

# Compute the average, for entries of na_example that are not NA 
mean(na_example[!ind ])





# Assign city names to `city` 
city <- c("Beijing", "Lagos", "Paris", "Rio de Janeiro", "San Juan", "Toronto")

# Store temperature values in `temp`
temp <- c(35, 88, 42, 84, 81, 30)

# Convert temperature into Celsius and overwrite the original values of 'temp' with these Celsius values
temp <- 5/9*(temp -32)
# Create a data frame `city_temps` 
city_temps <- data.frame( names = city , temperature = temp)

##burada yarattığımız vektörlerin her değerini değiştirecek tek bir denklemin tüm
##vektör index değerlerine uygulanarak data frame oluşturlmasını gördük.



# Define an object `x` with the numbers 1 through 100
x <- seq(1:100)
# Compute the sum 
sum(1/x^2)



##What is the sum of the following equation: 1 + 1/2^2 + 1/3^2 + ... + 1/100^2? 
##Thanks to Euler we know it should be close to (Pi Number)^2/6


# Store the per 100,000 murder rate for each state in murder_rate
murder_rate <- (murders$total/murders$population)*100000
# Calculate the average murder rate in the US 
mean(murder_rate)






## Store the murder rate per 100,000 for each state, in `murder_rate`
murder_rate <- murders$total / murders$population * 100000

# Store the `murder_rate < 1` in `low` 

low <- murder_rate < 1

# burada low logical sınıfından true false sonuç veren bir index oldu





## Store the murder rate per 100,000 for each state, in murder_rate
murder_rate <- murders$total/murders$population*100000

# Store the murder_rate < 1 in low 
low <- murder_rate < 1

# Get the indices of entries that are below 1

which(low)








## Store the murder rate per 100,000 for each state, in murder_rate
murder_rate <- murders$total/murders$population*100000

# Store the murder_rate < 1 in low 
low <- murder_rate < 1

# Names of states with murder rates lower than 1
murders$state[low]






# Store the murder rate per 100,000 for each state, in `murder_rate`
murder_rate <- murders$total/murders$population*100000

# Store the `murder_rate < 1` in `low` 
low <- murder_rate < 1

# States in the Northeast with murder rates lower than 1; store in 'ind'
ind <- low & murders$region=="Northeast"

# Names of states in `ind`
murders$state[ind]







# Store the murder rate per 100,000 for each state, in murder_rate
murder_rate <- murders$total/murders$population*100000


# Compute the average murder rate using `mean` and store it in object named `avg`
avg <- mean(murder_rate)

# How many states have murder rates below avg ? Check using sum 

sum(murder_rate < avg)







# Store the 3 abbreviations in a vector called `abbs` (remember that they are 
#character vectors and need quotes)
abbs <- c("AK", "MI", "IA")

# Match the abbs to the murders$abb and store in `ind`
ind <- match(abbs , murders$abb)

# Print state names from `ind`
murders$state[ind]


## match fonksiyonunda match(x,y) dersek x fonksiyonunun değerlerini alıp y de arar
## ve eşleşme sağladığı indeks numarasını x'in değeri olarak atar.
## eğer x y yerine y x şeklinde yazarsek y nin bütün değerlerinde sadece x'in eşleştiği
## değerleri x'in indeksi ile işler diğerlerini N/A atar !!!!!!!!




# Store the 5 abbreviations in `abbs`. (remember that they are character vectors)
abbs <- c("MA","ME","MI","MO","MU")

# Use the %in% command to check if the entries of abbs are abbreviations in the the murders data frame

abbs%in%murders$abb


# Store the 5 abbreviations in `abbs`. (remember that they are character vectors)
abbs <- c("MA", "ME", "MI", "MO", "MU") 

# Use the `which` command and `!` operator to find out which index abbreviations are not actually part of the dataset and store in 'ind' 
ind <- which(!abbs%in%murders$abb)

# Names of abbreviations in `ind`
abbs[ind]

## burada yaptığımı öncelikle ind değerine murders%abb indexinde yer almayan abbs değerini atamak oldu
## sonrasında abbs indekxinde ilgili değerin karşılığı olan veriyi çektik
##!!!!!!! burayı tekrar etmem lazım. 



# Loading data
library(dslabs)
data(murders)

# Loading dplyr
library(dplyr)

# Redefine murders so that it includes a column named rate with the per 100,000 murder rates
murders <- mutate(murders, rate =  total / population * 100000)

# r dilinde mutate fonksiyonunu kullanmak istediğinizde parantez içinde 
# mutate(hangi data, eklenecek alanın adı = hangi verilere ne yapılacak ) 
# şeklinde bir fonksiyon yazmamız gerekiyor 




# Note that if you want ranks from highest to lowest you can take the negative and ten compute the ranks 
x <- c(88, 100, 83, 92, 94)
rank(-x)

# Defining rate
rate <-  murders$total/ murders$population * 100000

# Redefine murders to include a column named rank
# with the ranks of rate from highest to lowest
murders <- mutate(murders, rank = rank(-rate))

## burada rate vektörünün index değerlerini büyükten küçüğe sıralıyoruz.






# Load dplyr
library(dplyr)

# Use select to only show state names and abbreviations from murders
select(murders, state, abb)





# Add the necessary columns
murders <- mutate(murders, rate = total/population * 100000, rank = rank(-rate))

# Filter to show the top 5 states with the highest murder rates
filter(murders, rank <= 5)


# Use filter to create a new data frame no_south
no_south <- filter(murders, region != "South")
# Use nrow() to calculate the number of rows
nrow(no_south)


#### Filter mutate gibi fonksiyonları data frame ya da data setler ile kullanabiliyoruz





# Create a new data frame called murders_nw with only the states from the northeast and the west
murders_nw <- filter(murders, region %in% c("Northeast", "West"))

# Number of states (rows) in this category
nrow(murders_nw)

##burada yeni data frame i kurarken tekerleği tekrardan icat etmeye gerek yok, murders data frame'inin
##içerisinde region kısmında %in% c(x,y) şeklinde bir iltre çalıştırarak yeni data.frami oluşturuyoruz.





# add the rate column
murders <- mutate(murders, rate =  total / population * 100000, rank = rank(-rate))

# Create a table, call it my_states, that satisfies both the conditions 
my_states <- filter( murders, region %in% c("Northeast","West"), rate < 1)
# Use select to show only the state name, the murder rate and the rank
select( my_states, state, rate, rank)



## burada dikkat etmemiz gereken şey filter ve select fonksiyonunda önce işlemin yapılacağı
## data frame seçilmeli, sonra ilgili data framde ki vektör'ün başlığı ve yapılacak işlemin 
##tanımı yapılmalı
## !!!!!! %in% kullanıyorsak vektördeki hangi değeri seçeceksek c("x","y") şeklinde değerleri belirtmeli ya da 
## indeks numaralarını tanımlamalıyız. 

#eğer pipeline özelliğini kullanacaksak 
#o zaman ilk sefer data frame i tanımlıyoruz ve sonraki işlemlerde aynı data fram üzerinde devam edebiliyor.



# Loading the libraries
library(dplyr)
data(murders)

# Create new data frame called my_states (with specifications in the instructions)
my_states <-  murders %>% 
              mutate (rate = total/population*100000, rank = rank(-rate)) %>%
              filter(region %in% c("Northeast","West") , rate<1 ) %>%
              select(state,rate,rank)

## burada pipe fonksiyonu ile işlemleri birbirine bağlayabiliyoruz
## pipe fonksiyonunda çalışacağımız data frame i baştan tanımladığımız için
## sıralı fonksiyonlarda sadece argumanı belirttiğimizde başta tanımlı data frame
## icerisinde işlemi yapıyor


##!!!!!!!! YENİ BİR DEĞİŞKEN TANIMLAYACAKSAK TEK "=" EŞİTTİR
##!!!!!!!! BİR FONKSİYON İLE VERİLERİ EŞLEŞTİRMEK İSTİYORSAK İKİ "==" EŞİTTİR



  


