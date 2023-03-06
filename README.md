#### please do project->maven->updateproject

#H2DB->  http://localhost:8080/h2-console/ 

###API 

##POST
*(AddData or Update ->http://localhost:8080/save)

##PUT
*(softDelete->http://localhost:8080/delete)
{
    "id": "S123",
    "by": "shamm",
    "comment": ["122334,12333,877655,0999888776,67"],
    "descendants": "100",
    "score": "2000",
    "title": "robin",
    "type": "story",
    "url": "rat.com"
    
}


##GET
*(GetLast15mindata->http://localhost:8080/top-stories)
*(GETAllDATA->http://localhost:8080/past-stories)
*(getNondeletedData->http://localhost:8080/view)


###  SAMPLE TEST DATA
{
    "id": "S123",
    "by": "shamm",
    "comment": ["122334,12333,877655,0999888776,67"],
    "descendants": "100",
    "score": "2000",
    "title": "robin",
    "type": "story",
    "url": "rat.com"
    
}
{
    "id": "S124",
    "by": "Rob",
    "comment": ["122334,12333,877655,0999888776,67"],
    "descendants": "101",
    "score": "2001",
    "title": "Luffy",
    "type": "story",
    "url": "rat.com"
    
}
{
    "id": "S125",
    "by": "Zoro",
    "comment": ["122334,12333,877655,0999888776,67"],
    "descendants": "1001",
    "score": "2002",
    "title": "HarryPotter",
    "type": "story",
    "url": "rat.com"
    
}
{
    "id": "S126",
    "by": "Ravi",
    "comment": ["122334,12333,877655,0999888776,67"],
    "descendants": "100",
    "score": "400",
    "title": "DSA",
    "type": "story",
    "url": "rat.com"
    
}
