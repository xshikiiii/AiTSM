USE [AITSM]
GO
/****** Object:  Table [dbo].[attentions]    Script Date: 13/07/2018 3:18:10 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[attentions](
	[attentionID] [int] IDENTITY(1,1) NOT NULL,
	[studentID] [nvarchar](50) NOT NULL,
	[classID] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_attentions] PRIMARY KEY CLUSTERED 
(
	[attentionID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[class]    Script Date: 13/07/2018 3:18:10 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[class](
	[classID] [nvarchar](50) NOT NULL,
	[className] [nvarchar](50) NOT NULL,
	[courseID] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_class] PRIMARY KEY CLUSTERED 
(
	[classID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[courses]    Script Date: 13/07/2018 3:18:10 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[courses](
	[courseID] [nvarchar](50) NOT NULL,
	[courseName] [nvarchar](50) NOT NULL,
	[slotID] [int] NOT NULL,
 CONSTRAINT [PK_courses] PRIMARY KEY CLUSTERED 
(
	[courseID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[roles]    Script Date: 13/07/2018 3:18:10 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[roles](
	[roleid] [int] NOT NULL,
	[nameRole] [nvarchar](50) NOT NULL,
	[description] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_roles] PRIMARY KEY CLUSTERED 
(
	[roleid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[slots]    Script Date: 13/07/2018 3:18:10 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[slots](
	[slotID] [int] NOT NULL,
	[startTime] [time](7) NOT NULL,
	[endTime] [time](7) NOT NULL,
	[subjectID] [int] NOT NULL,
 CONSTRAINT [PK_slots] PRIMARY KEY CLUSTERED 
(
	[slotID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[staff]    Script Date: 13/07/2018 3:18:10 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[staff](
	[staffID] [nvarchar](50) NOT NULL,
	[staffName] [nvarchar](50) NOT NULL,
	[username] [nvarchar](50) NOT NULL,
	[staffBirthdate] [datetime] NOT NULL,
	[staffSex] [int] NOT NULL,
	[staffEmail] [nvarchar](50) NOT NULL,
	[staffAddress] [nchar](10) NOT NULL,
	[staffPhonenumber] [nvarchar](20) NOT NULL,
 CONSTRAINT [PK_staff] PRIMARY KEY CLUSTERED 
(
	[staffID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[staffSubject]    Script Date: 13/07/2018 3:18:10 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[staffSubject](
	[staffSubjectID] [int] IDENTITY(1,1) NOT NULL,
	[staffID] [nvarchar](50) NOT NULL,
	[subjectID] [int] NOT NULL,
 CONSTRAINT [PK_staffSubject] PRIMARY KEY CLUSTERED 
(
	[staffSubjectID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[student]    Script Date: 13/07/2018 3:18:10 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[student](
	[studentID] [nvarchar](50) NOT NULL,
	[firstName] [nvarchar](50) NOT NULL,
	[lastName] [nvarchar](50) NOT NULL,
	[sex] [char](1) NOT NULL,
	[email] [nvarchar](50) NOT NULL,
	[phoneNumber] [nvarchar](50) NOT NULL,
	[address] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_student] PRIMARY KEY CLUSTERED 
(
	[studentID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[subjects]    Script Date: 13/07/2018 3:18:10 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[subjects](
	[subjectID] [int] NOT NULL,
	[subjectName] [nvarchar](50) NOT NULL,
	[total] [int] NOT NULL,
	[classID] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_subjects] PRIMARY KEY CLUSTERED 
(
	[subjectID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[users]    Script Date: 13/07/2018 3:18:10 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[users](
	[username] [nvarchar](50) NOT NULL,
	[password] [nvarchar](50) NOT NULL,
	[roleid] [int] NOT NULL,
 CONSTRAINT [PK_users] PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
ALTER TABLE [dbo].[attentions]  WITH CHECK ADD  CONSTRAINT [FK_attentions_class1] FOREIGN KEY([classID])
REFERENCES [dbo].[class] ([classID])
GO
ALTER TABLE [dbo].[attentions] CHECK CONSTRAINT [FK_attentions_class1]
GO
ALTER TABLE [dbo].[attentions]  WITH CHECK ADD  CONSTRAINT [FK_attentions_student] FOREIGN KEY([studentID])
REFERENCES [dbo].[student] ([studentID])
GO
ALTER TABLE [dbo].[attentions] CHECK CONSTRAINT [FK_attentions_student]
GO
ALTER TABLE [dbo].[class]  WITH CHECK ADD  CONSTRAINT [FK_class_courses] FOREIGN KEY([courseID])
REFERENCES [dbo].[courses] ([courseID])
GO
ALTER TABLE [dbo].[class] CHECK CONSTRAINT [FK_class_courses]
GO
ALTER TABLE [dbo].[courses]  WITH CHECK ADD  CONSTRAINT [FK_courses_slots] FOREIGN KEY([slotID])
REFERENCES [dbo].[slots] ([slotID])
GO
ALTER TABLE [dbo].[courses] CHECK CONSTRAINT [FK_courses_slots]
GO
ALTER TABLE [dbo].[staff]  WITH CHECK ADD  CONSTRAINT [FK_staff_users] FOREIGN KEY([username])
REFERENCES [dbo].[users] ([username])
GO
ALTER TABLE [dbo].[staff] CHECK CONSTRAINT [FK_staff_users]
GO
ALTER TABLE [dbo].[staffSubject]  WITH CHECK ADD  CONSTRAINT [FK_staffSubject_staff] FOREIGN KEY([staffID])
REFERENCES [dbo].[staff] ([staffID])
GO
ALTER TABLE [dbo].[staffSubject] CHECK CONSTRAINT [FK_staffSubject_staff]
GO
ALTER TABLE [dbo].[staffSubject]  WITH CHECK ADD  CONSTRAINT [FK_staffSubject_subjects] FOREIGN KEY([subjectID])
REFERENCES [dbo].[subjects] ([subjectID])
GO
ALTER TABLE [dbo].[staffSubject] CHECK CONSTRAINT [FK_staffSubject_subjects]
GO
ALTER TABLE [dbo].[subjects]  WITH CHECK ADD  CONSTRAINT [FK_subjects_class] FOREIGN KEY([classID])
REFERENCES [dbo].[class] ([classID])
GO
ALTER TABLE [dbo].[subjects] CHECK CONSTRAINT [FK_subjects_class]
GO
ALTER TABLE [dbo].[users]  WITH CHECK ADD  CONSTRAINT [FK_users_roles] FOREIGN KEY([roleid])
REFERENCES [dbo].[roles] ([roleid])
GO
ALTER TABLE [dbo].[users] CHECK CONSTRAINT [FK_users_roles]
GO
