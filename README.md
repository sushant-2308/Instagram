# Instagram 👋

## Frameworks and Language used:
 - Spring
 - Spring boot
 - My-Sql
 - Java


 ## Data Flow
 #### Controller
---Admin----
 - toggleBlueTick

 ---Comment----
 - addComment

 ---Post----
 - addPost
 - getAllPosts
 - getLikesForPost
 - updateUser
 - followUser

 ---User----
 - signUp
 - signIn
 - signOut
 - 
 #### Service
  ---Admin----
 - toggleBlueTick

 ---Comment----
 - addComment

 ---Follower----
 - saveFollower

 ---Following----
 - saveFollowing

 #### Repository
 ---Admin----

 IAdminmentRepo

 ---Comment----

 ICommentRepo

 ---Follower----

 IFollowRepo

 ---Following----

 IFollowingRepo

 ---Like----

 ILikeRepo

 ---Post----

 IPostRepo

 ---Token----

 ITokenRepo

 ---User----

 IUserRepo

 #### Model
 ---Admin----
 - adminId
 - firstName
 - lastName
 - email
 
 ---AuthenticationToken----
 - tokenId
 - token
 - tokenCreationDate

 ---InstagramComment----
 - commentId
 - commentBody
 - post
 - user

 ---InstagramFollower----
 - followerTableId
 - user
 - follower

 ---InstagramFollowing----
 - followingTableId
 - user
 - following

 ---Post----
 - postId
 - createdDate
 - postDate
 - postCaption
 - location
 - user
 
 ---PostLike----
 - likeId
 - post
 - user

 ---User----
 - userId
 - firstName
 - lastName
 - instagramName
 - instagramBio
 - password
 - dOB
 - email
 - phoneNumber
 - isBlueTick

#### dto
 ---SignInInput----
 - patientEmail
 - patientPassword
 
 ---SignInOutput----
 - status
 - token

 ---SignUpOutput----
 - status
 - message
 
### Project Summary
Created a simple Instagram application to show the data transfer behind the operations which we use in instagram like:- post,like,comment,bluetick profiles,followers,following etc. Application purpose is to provide an application which shows the relationship between different model of instagram application and how they store and use your data.

### How to use in your system?
 - Just Simply clone this reposit
 - Start your server
 - Perform operations 
