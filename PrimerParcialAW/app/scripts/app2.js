 document.addEventListener("DOMContentLoaded", function () {

  // Create popcorn instance from the YouTube video and insert it into the .video div
  var pop = Popcorn.vimeo(
         '#video',
         'https://vimeo.com/16540325');
   pop.footnote({
           start: 2,
           end: 6,
           text: "Pop!",
           target: "footnotediv"
         });
         // play the video right away
         pop.play();
      }, false);