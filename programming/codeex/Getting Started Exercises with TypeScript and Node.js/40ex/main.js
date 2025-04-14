// Album: Write a function called make_album() that builds a Object describing a music album.
//  The function should take in an artist name and an album title, and it should return a Object containing these two pieces of information
//  . Use the function to make three dictionaries representing different albums. 
//  Print each return value to show that Objects are storing the album information correctly. 
//  Add an optional parameter to make_album() that allows you to store the number of tracks on an album. 
//  If the calling line includes a value for the number of tracks, add that value to the album’s Object.
//   Make at least one new function call that includes the number of tracks on an album
// Define the structure of the album object
// Define the function make_album
function make_album(artist_name, album_title, num_tracks) {
    var album = {
        artist: artist_name,
        title: album_title,
        tracks: num_tracks
    };
    if (num_tracks !== undefined) {
        album.tracks = num_tracks;
    }
    return album;
}
// // Making three different albums
// let album1 = make_album('Artist 1', 'Album 1');
// let album2 = make_album('Artist 2', 'Album 2');
// let album3 = make_album('Artist 3', 'Album 3', 12);
// // Printing album information
// console.log(album1);
// console.log(album2);
// console.log(album3);
// Create album objects using the make_album function
console.log(make_album("talha", "nasha meray khoon men"));
console.log(make_album("ali haider", "sanwali sanoli"));
console.log(make_album("kumar sanu", "meri maa ko mera salam dey"));
console.log(make_album("badshah", "rangeen zindagi", 10)); // Including the number of tracks
