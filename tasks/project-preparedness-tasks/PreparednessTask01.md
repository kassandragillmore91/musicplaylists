## Preparedness Task 1: Create and Initialize Your DynamoDB Tables

For this project you will need to create two DynamoDB Tables,
`playlists` and `album_tracks`.

You have been provided a Cloudformation template which will
create the two tables for you. You are encouraged to read
through this file inside of the `configurations` directory
within this project. In doing so, you will see the schema for
each table.

Run the following command to create these tables on DynamoDB
```
aws cloudformation create-stack --region us-west-2 --stack-name musicplaylistservice-createtables --template-body file://configurations/tables.template.yml --capabilities CAPABILITY_IAM
```

Once you've verified your tables exist on AWS it is time to 
populate the album_tracks table.
We'll use a JSON file which you should read over first in order
to get an idea of how it works and what it looks like.
When you are ready, run the following command:

```
aws dynamodb batch-write-item --request-items file://configurations/AlbumTracksData.json
```

Verify once again that your album_tracks table on AWS has now been
populated.