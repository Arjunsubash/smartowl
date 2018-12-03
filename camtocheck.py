#My Working Code ti upload file to cloud
#import firebase_admin
#from firebase_admin import credentials, firestore, storage
from google.cloud import storage
#from google.cloud.storage import client


def upload_blob(bucket_name, source_file_name, destination_blob_name):
  #"""Uploads a file to the bucket."""
  print ("staggrt")
  storage_client = storage.Client()
  print('client')
  buckets = list(storage_client.list_buckets())
  print(buckets)
  
  bucket = storage_client.get_bucket(bucket_name) #I tried to add my folder here
  print (bucket)
  blob = bucket.blob(destination_blob_name)
  print (blob )
  blob.upload_from_filename(source_file_name)
  print('File {} uploaded to {}.'.format(  source_file_name,    destination_blob_name))

upload_blob('smartowl-9f61e.appspot.com','raju.jpg','raxxx.jpg')
print ('finish')
