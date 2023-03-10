USE [tracuucayduoclieu_v2]
GO
ALTER TABLE [TENGOIKHAC] DROP CONSTRAINT [FK__TENGOIKHA__IDCAY__4D5F7D71]
GO
ALTER TABLE [HINH] DROP CONSTRAINT [FK__HINH__IDCAYDUOCL__6E01572D]
GO
ALTER TABLE [CAUHOI] DROP CONSTRAINT [FK__CAUHOI__idhinh__607251E5]
GO
ALTER TABLE [BAOCAO] DROP CONSTRAINT [FK__BAOCAO__idcautra__0697FACD]
GO
ALTER TABLE [BAIVIET] DROP CONSTRAINT [FK__BAIVIET__idhinh__2739D489]
GO
ALTER TABLE [CAUHOI] DROP CONSTRAINT [DF__CAUHOI__trangtha__14270015]
GO
ALTER TABLE [BAIVIET] DROP CONSTRAINT [DF__BAIVIET__TRAGNGT__73852659]
GO
ALTER TABLE [TRALOI] DROP CONSTRAINT [PK_TRALOI]
GO
ALTER TABLE [TINHVI] DROP CONSTRAINT [PK_TINHVI]
GO
ALTER TABLE [THANHPHANHOAHOC] DROP CONSTRAINT [PK_THANHPHANHOAHOC]
GO
ALTER TABLE [TENGOIKHAC] DROP CONSTRAINT [PK_TENGOIKHAC]
GO
ALTER TABLE [QUYKINH] DROP CONSTRAINT [PK_QUYKINH]
GO
ALTER TABLE [NOIPHANBO] DROP CONSTRAINT [PK_NOIPHANBO]
GO
ALTER TABLE [NGUOIDUNG] DROP CONSTRAINT [UQ__NGUOIDUN__8C5E61046AC14552]
GO
ALTER TABLE [NGUOIDUNG] DROP CONSTRAINT [PK_NGUOIDUNG]
GO
ALTER TABLE [LOAITAIKHOAN] DROP CONSTRAINT [PK_LOAITAIKHOAN]
GO
ALTER TABLE [HODUOCLIEU] DROP CONSTRAINT [PK_HODUOCLIEU]
GO
ALTER TABLE [HINH] DROP CONSTRAINT [PK_HINH]
GO
ALTER TABLE [DUOCLIEU_TINHVI] DROP CONSTRAINT [PK_DUOCLIEU_TINHVI]
GO
ALTER TABLE [DUOCLIEU_THANHPHAN] DROP CONSTRAINT [PK_DUOCLIEU_THANHPHAN]
GO
ALTER TABLE [DUOCLIEU_QUYKINH] DROP CONSTRAINT [PK_DUOCLIEU_QUYKINH]
GO
ALTER TABLE [DUOCLIEU_PHANBO] DROP CONSTRAINT [PK_DUOCLIEU_PHANBO]
GO
ALTER TABLE [DUOCLIEU_CONGDUNG] DROP CONSTRAINT [PK_DUOCLIEU_CONGDUNG]
GO
ALTER TABLE [DUOCLIEU_BOPHANSUDUNG] DROP CONSTRAINT [PK_DUOCLIEU_BOPHANSUDUNG]
GO
ALTER TABLE [DUOCLIEU_BENH] DROP CONSTRAINT [PK_DUOCLIEU_BENH]
GO
ALTER TABLE [CONGDUNG] DROP CONSTRAINT [PK_CONGDUNG]
GO
ALTER TABLE [CHUDE] DROP CONSTRAINT [PK_CHUDE]
GO
ALTER TABLE [CAYDUOCLIEU] DROP CONSTRAINT [PK_CAYDUOCLIEU]
GO
ALTER TABLE [CAUHOI] DROP CONSTRAINT [PK_CAUHOI]
GO
ALTER TABLE [BOPHANSUDUNG] DROP CONSTRAINT [PK_BOPHANSUDUNG]
GO
ALTER TABLE [BINHLUAN] DROP CONSTRAINT [PK_BINHLUAN]
GO
ALTER TABLE [BENH] DROP CONSTRAINT [PK_BENH]
GO
ALTER TABLE [BAIVIET] DROP CONSTRAINT [PK_BAIVIET]
GO
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[TRALOI]') AND type in (N'U'))
DROP TABLE [TRALOI]
GO
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[TINHVI]') AND type in (N'U'))
DROP TABLE [TINHVI]
GO
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[THANHPHANHOAHOC]') AND type in (N'U'))
DROP TABLE [THANHPHANHOAHOC]
GO
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[TENGOIKHAC]') AND type in (N'U'))
DROP TABLE [TENGOIKHAC]
GO
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[QUYKINH]') AND type in (N'U'))
DROP TABLE [QUYKINH]
GO
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[NOIPHANBO]') AND type in (N'U'))
DROP TABLE [NOIPHANBO]
GO
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[NGUOIDUNG]') AND type in (N'U'))
DROP TABLE [NGUOIDUNG]
GO
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[LOAITAIKHOAN]') AND type in (N'U'))
DROP TABLE [LOAITAIKHOAN]
GO
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[HODUOCLIEU]') AND type in (N'U'))
DROP TABLE [HODUOCLIEU]
GO
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[HINH]') AND type in (N'U'))
DROP TABLE [HINH]
GO
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[DUOCLIEU_TINHVI]') AND type in (N'U'))
DROP TABLE [DUOCLIEU_TINHVI]
GO
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[DUOCLIEU_THANHPHAN]') AND type in (N'U'))
DROP TABLE [DUOCLIEU_THANHPHAN]
GO
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[DUOCLIEU_QUYKINH]') AND type in (N'U'))
DROP TABLE [DUOCLIEU_QUYKINH]
GO
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[DUOCLIEU_PHANBO]') AND type in (N'U'))
DROP TABLE [DUOCLIEU_PHANBO]
GO
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[DUOCLIEU_CONGDUNG]') AND type in (N'U'))
DROP TABLE [DUOCLIEU_CONGDUNG]
GO
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[DUOCLIEU_BOPHANSUDUNG]') AND type in (N'U'))
DROP TABLE [DUOCLIEU_BOPHANSUDUNG]
GO
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[DUOCLIEU_BENH]') AND type in (N'U'))
DROP TABLE [DUOCLIEU_BENH]
GO
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[CONGDUNG]') AND type in (N'U'))
DROP TABLE [CONGDUNG]
GO
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[CHUDE]') AND type in (N'U'))
DROP TABLE [CHUDE]
GO
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[CAYDUOCLIEU]') AND type in (N'U'))
DROP TABLE [CAYDUOCLIEU]
GO
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[CAUHOI]') AND type in (N'U'))
DROP TABLE [CAUHOI]
GO
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[BOPHANSUDUNG]') AND type in (N'U'))
DROP TABLE [BOPHANSUDUNG]
GO
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[BINHLUAN]') AND type in (N'U'))
DROP TABLE [BINHLUAN]
GO
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[BENH]') AND type in (N'U'))
DROP TABLE [BENH]
GO
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[BAOCAO]') AND type in (N'U'))
DROP TABLE [BAOCAO]
GO
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[BAIVIET]') AND type in (N'U'))
DROP TABLE [BAIVIET]
GO
USE [master]
GO
DROP DATABASE [tracuucayduoclieu_v2]
GO
CREATE DATABASE [tracuucayduoclieu_v2]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'tracuucayduoclieu_v2', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\tracuucayduoclieu_v2.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'tracuucayduoclieu_v2_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\tracuucayduoclieu_v2_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [tracuucayduoclieu_v2].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET ARITHABORT OFF 
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET  ENABLE_BROKER 
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET  MULTI_USER 
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET DB_CHAINING OFF 
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET DELAYED_DURABILITY = DISABLED 
GO
USE [tracuucayduoclieu_v2]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [BAIVIET](
	[IDBAIVIET] [int] IDENTITY(1,1) NOT NULL,
	[IDCHUDE] [int] NOT NULL,
	[SDT] [char](15) NOT NULL,
	[TENBAIVIET] [nvarchar](1000) NULL,
	[NOIDUNG] [ntext] NULL,
	[THOIGIANDANGBAIVIET] [datetime] NOT NULL,
	[idhinh] [int] NULL,
	[TRAGNGTHAI] [bit] NOT NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [BAOCAO](
	[idbaocao] [int] IDENTITY(1,1) NOT NULL,
	[noidungbaocao] [ntext] NULL,
	[idcautraloi] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[idbaocao] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [BENH](
	[IDBENH] [int] IDENTITY(1,1) NOT NULL,
	[TENBENH] [nvarchar](100) NULL
) ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [BINHLUAN](
	[IDBINHLUAN] [int] IDENTITY(1,1) NOT NULL,
	[SDT] [char](15) NOT NULL,
	[IDCAYDUOCLIEU] [int] NULL,
	[IDBAIVIET] [int] NOT NULL,
	[NOIDUNGBINHLUAN] [text] NOT NULL,
	[THOIGIANDANGBINHLUAN] [datetime] NOT NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [BOPHANSUDUNG](
	[IDBOPHAN] [int] IDENTITY(1,1) NOT NULL,
	[TENBOPHAN] [nvarchar](100) NULL
) ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [CAUHOI](
	[IDCAUHOI] [int] IDENTITY(1,1) NOT NULL,
	[SDT] [char](15) NULL,
	[TENCAUHOI] [nvarchar](1000) NULL,
	[NOIDUNGCAUHOI] [ntext] NULL,
	[NGAYDANG] [datetime] NOT NULL,
	[trangthai] [bit] NULL,
	[idhinh] [int] NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [CAYDUOCLIEU](
	[IDCAYDUOCLIEU] [int] IDENTITY(1,1) NOT NULL,
	[IDHO] [int] NOT NULL,
	[TENDUOCLIEU] [nvarchar](100) NULL,
	[TENKHOAHOC] [varchar](100) NOT NULL,
	[MOTA] [ntext] NULL,
	[TACDUNGDUOCLY] [ntext] NULL,
	[LUUY] [ntext] NULL,
	[lieudungvacachdung] [ntext] NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [CHUDE](
	[IDCHUDE] [int] IDENTITY(1,1) NOT NULL,
	[TENCHUDE] [nvarchar](100) NULL
) ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [CONGDUNG](
	[IDCONGDUNG] [int] IDENTITY(1,1) NOT NULL,
	[TENCONGDUNG] [nvarchar](100) NULL
) ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [DUOCLIEU_BENH](
	[IDBENH] [int] NOT NULL,
	[IDCAYDUOCLIEU] [int] NOT NULL
) ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [DUOCLIEU_BOPHANSUDUNG](
	[IDBOPHAN] [int] NOT NULL,
	[IDCAYDUOCLIEU] [int] NOT NULL
) ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [DUOCLIEU_CONGDUNG](
	[IDCONGDUNG] [int] NOT NULL,
	[IDCAYDUOCLIEU] [int] NOT NULL
) ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [DUOCLIEU_PHANBO](
	[IDNOIPHANBO] [int] NOT NULL,
	[IDCAYDUOCLIEU] [int] NOT NULL
) ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [DUOCLIEU_QUYKINH](
	[IDQUYKINH] [int] NOT NULL,
	[IDCAYDUOCLIEU] [int] NOT NULL
) ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [DUOCLIEU_THANHPHAN](
	[IDTHANHPHAN] [int] NOT NULL,
	[IDCAYDUOCLIEU] [int] NOT NULL
) ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [DUOCLIEU_TINHVI](
	[IDTINHVI] [int] NOT NULL,
	[IDCAYDUOCLIEU] [int] NOT NULL
) ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [HINH](
	[IDHINH] [int] IDENTITY(1,1) NOT NULL,
	[IDCAYDUOCLIEU] [int] NULL,
	[TENHINH] [varchar](30) NOT NULL
) ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [HODUOCLIEU](
	[IDHO] [int] IDENTITY(1,1) NOT NULL,
	[TENHO] [nvarchar](100) NULL
) ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [LOAITAIKHOAN](
	[IDLOAI] [int] IDENTITY(1,1) NOT NULL,
	[TENLOAI] [varchar](100) NOT NULL
) ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [NGUOIDUNG](
	[SDT] [char](15) NOT NULL,
	[IDLOAI] [int] NOT NULL,
	[HOVATEN] [varchar](100) NOT NULL,
	[GIOITINH] [bit] NULL,
	[NGAYSINH] [datetime] NULL,
	[TAIKHOAN] [varchar](20) NOT NULL,
	[MATKHAU] [varchar](250) NULL,
	[EMAIL] [varchar](100) NOT NULL
) ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [NOIPHANBO](
	[IDNOIPHANBO] [int] IDENTITY(1,1) NOT NULL,
	[TENNOIPHANBO] [nvarchar](100) NULL
) ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [QUYKINH](
	[IDQUYKINH] [int] IDENTITY(1,1) NOT NULL,
	[TENQUYKINH] [nvarchar](100) NULL
) ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [TENGOIKHAC](
	[IDTEN] [int] IDENTITY(1,1) NOT NULL,
	[IDCAYDUOCLIEU] [int] NULL,
	[TENGOI] [nvarchar](100) NULL
) ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [THANHPHANHOAHOC](
	[IDTHANHPHAN] [int] IDENTITY(1,1) NOT NULL,
	[TENTHANHPHAN] [varchar](100) NOT NULL
) ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [TINHVI](
	[IDTINHVI] [int] IDENTITY(1,1) NOT NULL,
	[TENTINHVI] [nvarchar](100) NULL
) ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [TRALOI](
	[IDCAUTRALOI] [int] IDENTITY(1,1) NOT NULL,
	[IDCAUHOI] [int] NULL,
	[SDT] [char](15) NULL,
	[NOIDUNGCAUTRALOI] [ntext] NULL,
	[THOIGIANTRALOI] [datetime] NOT NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [BAIVIET] ON 

INSERT [BAIVIET] ([IDBAIVIET], [IDCHUDE], [SDT], [TENBAIVIET], [NOIDUNG], [THOIGIANDANGBAIVIET], [idhinh], [TRAGNGTHAI]) VALUES (7, 1, N'0704932121     ', N'5 Loại Cây Bị Coi Là “Cỏ Dại” Nhưng Thực Tế Lại Là Vị Thuốc Nam Cực Hữu Ích', N'<p>Thuốc Nam từ l&acirc;u đ&atilde; được coi l&agrave; những&nbsp;<strong>b&agrave;i thuốc d&acirc;n gian</strong>&nbsp;vừa dễ t&igrave;m, hữu &iacute;ch lại rất phổ biến trong tự nhi&ecirc;n. Tuy nhi&ecirc;n, rất nhiều người nhầm lẫn&nbsp;<strong>c&aacute;c c&acirc;y thuốc Nam quanh ta</strong>&nbsp;với c&aacute;c c&acirc;y cỏ dại kh&ocirc;ng c&oacute; t&aacute;c dụng. B&agrave;i viết dưới đ&acirc;y sẽ phổ biến cho bạn 5 loại cỏ nh&igrave;n tưởng chừng như cỏ dại nhưng thực tế lại l&agrave; những&nbsp;<strong>vị thuốc Nam cực kỳ hữu &iacute;ch</strong>&nbsp;d&ugrave;ng để chữa bệnh trong d&acirc;n gian.&nbsp;</p>

<p><a href="http://vmcvietnam.vn/wp-content/uploads/2021/10/cac-cay-thuoc-nam-quanh-ta-1.jpg"><img alt="Các cây thuốc nam quanh ta - cỏ lưỡi rắn hoa trắng" src="http://vmcvietnam.vn/wp-content/uploads/2021/10/cac-cay-thuoc-nam-quanh-ta-1.jpg" style="height:400px; width:600px" /></a></p>

<p>C&acirc;y cỏ lưỡi rắn hoa trắng</p>

<h2>Cỏ lưỡi rắn hoa trắng</h2>

<p>Cỏ lưỡi rắn hoa trắng hay c&ograve;n gọi l&agrave; Bạch hoa x&agrave; thiệt thảo. Đ&acirc;y l&agrave; một loại cỏ rất phổ biến trong đồng ruộng trũng tại miền Bắc Việt Nam. Khi bị rắn cắn, c&ocirc;n tr&ugrave;ng đốt chỉ cần lấy c&acirc;y tươi, d&atilde; n&aacute;t v&agrave; đắp tại chỗ sẽ khiến vết thương dịu v&agrave; nhanh l&agrave;nh. Đồng thời đ&acirc;y cũng l&agrave; một trong những c&acirc;y thuốc Nam quanh ta c&oacute; t&aacute;c dụng thanh nhiệt, giải độc rất tốt. C&oacute; thể phơi kh&ocirc; v&agrave; sắc l&agrave;m nước uống h&agrave;ng ng&agrave;y.&nbsp;</p>

<h2>Cỏ mần trầu &ndash; một trong những c&acirc;y thuốc Nam quanh ta mọc rất nhiều trong tự nhi&ecirc;n</h2>

<p>Tại c&aacute;c v&ugrave;ng đồng bằng, c&acirc;y cỏ mần trầu mọc rất nhiều ở c&aacute;c bờ, ruộng v&agrave; l&agrave; nguồn thức ăn cho tr&acirc;u b&ograve; của người n&ocirc;ng d&acirc;n. Tuy nhi&ecirc;n đ&acirc;y đồng thời cũng l&agrave; vị thuốc Nam chữa cảm nắng, hạ sốt v&agrave; đặc biệt lợi tiểu. C&aacute;ch d&ugrave;ng tốt nhất l&agrave; phơi kh&ocirc; nấu l&agrave;m nước uống h&agrave;ng ng&agrave;y.&nbsp;</p>

<p>&nbsp;</p>

<h2>Cỏ nhọ nồi</h2>

<p>Ngay cả những đứa trẻ l&ecirc;n 5 tại c&aacute;c v&ugrave;ng n&ocirc;ng th&ocirc;n cũng được dạy rằng: Chảy m&aacute;u đứt tay đắp cỏ nhọ nồi hết ngay. Loại cỏ n&agrave;y hay c&ograve;n được biết đến với c&aacute;i t&ecirc;n Hạn li&ecirc;n thảo l&agrave;&nbsp;<strong>c&acirc;y thuốc Nam</strong>&nbsp;<strong>phổ biến</strong>&nbsp;trong tự nhi&ecirc;n c&oacute; t&aacute;c dụng cầm m&aacute;u vết thương hoặc chữa băng huyết, rong kinh. C&oacute; thể sử dụng bằng c&aacute;ch gi&atilde; nhỏ hoặc v&ograve; n&aacute;t c&acirc;y tươi đắp l&ecirc;n vết thương ngay tại chỗ. B&ecirc;n cạnh đ&oacute;, để chữa băng huyết, rong kinh cho phụ nữ th&igrave; cần cắt th&acirc;n tr&ecirc;n, phơi kh&ocirc; v&agrave; sắc uống với liều lượng 10 &ndash; 20g mỗi ng&agrave;y.&nbsp;</p>

<h2>C&acirc;y cứt lợn</h2>

<p>Hay c&ograve;n được biết đến với c&aacute;i t&ecirc;n tao nh&atilde;: Hy thi&ecirc;m, loại cỏ n&agrave;y l&agrave; cứu c&aacute;nh cho những người bị chứng đau lưng, đau khớp v&agrave; ch&acirc;n tay t&ecirc; buốt. B&ecirc;n cạnh đ&oacute; khi bị mụn nhọt, sử dụng loại cỏ n&agrave;y đắp l&ecirc;n sẽ gi&uacute;p nhanh ch&oacute;ng ti&ecirc;u vi&ecirc;m, giảm đau.&nbsp;</p>

<p>Loại c&acirc;y n&agrave;y xuất hiện rất nhiều tại c&aacute;c ruộng đồng ở miền n&ocirc;ng th&ocirc;n Việt Nam. C&aacute;ch sử dụng chủ yếu l&agrave; phơi kh&ocirc;, sắc uống. Kết hợp uống vị thuốc Nam hữu &iacute;ch n&agrave;y v&agrave; liệu ph&aacute;p xoa b&oacute;p bấm huyệt sẽ hỗ trợ rất tốt trong việc điều trị chứng đau lưng. Bạn c&oacute; thể tham khảo th&ecirc;m về&nbsp;<a href="http://vmcvietnam.vn/courses/tri-lieu-vung-lung-va-phong-chong-thoai-hoa-thoat-vi-dia-dem"><strong>c&aacute;ch xoa b&oacute;p bấm huyệt trị liệu v&ugrave;ng lưng</strong></a>&nbsp;để kết hợp chữa hiệu quả v&agrave; nhanh dứt bệnh.&nbsp;</p>

<p><a href="http://vmcvietnam.vn/wp-content/uploads/2021/10/cac-cay-thuoc-nam-quanh-ta-3.jpg"><img alt="Các cây thuốc nam quanh ta - Cây chó đẻ" src="http://vmcvietnam.vn/wp-content/uploads/2021/10/cac-cay-thuoc-nam-quanh-ta-3.jpg" style="height:400px; width:600px" /></a></p>

<p>C&acirc;y ch&oacute; đẻ</p>

<h2>C&acirc;y ch&oacute; đẻ răng cưa</h2>

<p>Lo&agrave;i c&acirc;y thuộc&nbsp;<a href="https://vi.wikipedia.org/wiki/H%E1%BB%8D_%C4%90%E1%BA%A1i_k%C3%ADch#:~:text=H%E1%BB%8D%20%C4%90%E1%BA%A1i%20k%C3%ADch%20hay%20h%E1%BB%8D,b%E1%BB%A5i%20ho%E1%BA%B7c%20c%C3%A2y%20th%C3%A2n%20g%E1%BB%97."><strong>họ thầu dầu</strong></a>&nbsp;n&agrave;y mọc hầu hết ở khắp nơi từ vườn nh&agrave; đến đồng ruộng. Dễ sống, mọc nhanh v&agrave; rất dễ d&agrave;ng t&igrave;m kiếm l&agrave; điểm ưu việt của lo&agrave;i c&acirc;y vừa l&agrave; c&acirc;y dại nhưng đồng thời cũng l&agrave; một trong&nbsp;<strong>c&aacute;c c&acirc;y thuốc Nam quanh ta</strong>&nbsp;cực hữu &iacute;ch n&agrave;y. Lo&agrave;i c&acirc;y n&agrave;y c&oacute; t&aacute;c dụng với nhiều bệnh thường gặp trong đời sống. Từ những người bị vi&ecirc;m gan, vi&ecirc;m thận, sỏi tiết niệu đến c&aacute;c b&agrave; bầu bị tắc tia sữa đều c&oacute; thể sử dụng loại c&acirc;y n&agrave;y sắc uống để chấm dứt chứng bệnh. C&aacute;ch sử dụng l&agrave; cắt th&acirc;n tr&ecirc;n, phơi kh&ocirc; v&agrave; sắc uống. Liều lượng sử dụng mỗi ng&agrave;y từ 8 &ndash; 20g l&agrave; hợp l&yacute;.&nbsp;</p>

<p><strong>C&aacute;c c&acirc;y thuốc Nam quanh ta</strong>&nbsp;từ l&acirc;u đ&atilde; được coi l&agrave; cứu c&aacute;nh cho những vết thương/chứng bệnh tức thời của người Việt Nam.&nbsp; Chữa bệnh bằng thuốc Nam v&agrave;&nbsp;<strong>Xoa b&oacute;p bấm huyệt trong y học cổ truyền</strong>&nbsp;được coi l&agrave; liệu ph&aacute;p điều trị an to&agrave;n v&agrave; l&agrave;nh mạnh. Tuy nhi&ecirc;n, để đảm bảo hiệu quả bạn cần nắm r&otilde; c&aacute;ch sử dụng v&agrave; t&aacute;c dụng của từng vị thuốc v&agrave; từng liệu ph&aacute;p điều trị. Những th&ocirc;ng tin tr&ecirc;n đ&acirc;y phần n&agrave;o c&oacute; thể gi&uacute;p bạn nhận thức được&nbsp;<strong>c&aacute;c c&acirc;y thuốc Nam trong tự nhi&ecirc;n</strong>, t&aacute;c dụng cũng như c&aacute;ch sử dụng ch&uacute;ng. Tuy nhi&ecirc;n để đảm bảo an to&agrave;n, bạn n&ecirc;n tham khảo &yacute; kiến của b&aacute;c sĩ hoặc c&aacute;c chuy&ecirc;n gia về y dược học cổ truyền.&nbsp;</p>
', CAST(N'2022-11-26T11:08:12.493' AS DateTime), 45, 1)
INSERT [BAIVIET] ([IDBAIVIET], [IDCHUDE], [SDT], [TENBAIVIET], [NOIDUNG], [THOIGIANDANGBAIVIET], [idhinh], [TRAGNGTHAI]) VALUES (8, 1, N'0704932121     ', N'6 Loại Cây Bị Coi Là “Cỏ Dại” Nhưng Thực Tế Lại Là Vị Thuốc Nam Cực Hữu Ích', N'<p>Thuốc Nam từ l&acirc;u đ&atilde; được coi l&agrave; những&nbsp;<strong>b&agrave;i thuốc d&acirc;n gian</strong>&nbsp;vừa dễ t&igrave;m, hữu &iacute;ch lại rất phổ biến trong tự nhi&ecirc;n. Tuy nhi&ecirc;n, rất nhiều người nhầm lẫn&nbsp;<strong>c&aacute;c c&acirc;y thuốc Nam quanh ta</strong>&nbsp;với c&aacute;c c&acirc;y cỏ dại kh&ocirc;ng c&oacute; t&aacute;c dụng. B&agrave;i viết dưới đ&acirc;y sẽ phổ biến cho bạn 5 loại cỏ nh&igrave;n tưởng chừng như cỏ dại nhưng thực tế lại l&agrave; những&nbsp;<strong>vị thuốc Nam cực kỳ hữu &iacute;ch</strong>&nbsp;d&ugrave;ng để chữa bệnh trong d&acirc;n gian.&nbsp;</p>

<p><a href="http://vmcvietnam.vn/wp-content/uploads/2021/10/cac-cay-thuoc-nam-quanh-ta-1.jpg"><img alt="Các cây thuốc nam quanh ta - cỏ lưỡi rắn hoa trắng" src="http://vmcvietnam.vn/wp-content/uploads/2021/10/cac-cay-thuoc-nam-quanh-ta-1.jpg" style="height:400px; width:600px" /></a></p>

<p>C&acirc;y cỏ lưỡi rắn hoa trắng</p>

<h2>Cỏ lưỡi rắn hoa trắng</h2>

<p>Cỏ lưỡi rắn hoa trắng hay c&ograve;n gọi l&agrave; Bạch hoa x&agrave; thiệt thảo. Đ&acirc;y l&agrave; một loại cỏ rất phổ biến trong đồng ruộng trũng tại miền Bắc Việt Nam. Khi bị rắn cắn, c&ocirc;n tr&ugrave;ng đốt chỉ cần lấy c&acirc;y tươi, d&atilde; n&aacute;t v&agrave; đắp tại chỗ sẽ khiến vết thương dịu v&agrave; nhanh l&agrave;nh. Đồng thời đ&acirc;y cũng l&agrave; một trong những c&acirc;y thuốc Nam quanh ta c&oacute; t&aacute;c dụng thanh nhiệt, giải độc rất tốt. C&oacute; thể phơi kh&ocirc; v&agrave; sắc l&agrave;m nước uống h&agrave;ng ng&agrave;y.&nbsp;</p>

<h2>Cỏ mần trầu &ndash; một trong những c&acirc;y thuốc Nam quanh ta mọc rất nhiều trong tự nhi&ecirc;n</h2>

<p>Tại c&aacute;c v&ugrave;ng đồng bằng, c&acirc;y cỏ mần trầu mọc rất nhiều ở c&aacute;c bờ, ruộng v&agrave; l&agrave; nguồn thức ăn cho tr&acirc;u b&ograve; của người n&ocirc;ng d&acirc;n. Tuy nhi&ecirc;n đ&acirc;y đồng thời cũng l&agrave; vị thuốc Nam chữa cảm nắng, hạ sốt v&agrave; đặc biệt lợi tiểu. C&aacute;ch d&ugrave;ng tốt nhất l&agrave; phơi kh&ocirc; nấu l&agrave;m nước uống h&agrave;ng ng&agrave;y.&nbsp;</p>

<p>&nbsp;</p>

<h2>Cỏ nhọ nồi</h2>

<p>Ngay cả những đứa trẻ l&ecirc;n 5 tại c&aacute;c v&ugrave;ng n&ocirc;ng th&ocirc;n cũng được dạy rằng: Chảy m&aacute;u đứt tay đắp cỏ nhọ nồi hết ngay. Loại cỏ n&agrave;y hay c&ograve;n được biết đến với c&aacute;i t&ecirc;n Hạn li&ecirc;n thảo l&agrave;&nbsp;<strong>c&acirc;y thuốc Nam</strong>&nbsp;<strong>phổ biến</strong>&nbsp;trong tự nhi&ecirc;n c&oacute; t&aacute;c dụng cầm m&aacute;u vết thương hoặc chữa băng huyết, rong kinh. C&oacute; thể sử dụng bằng c&aacute;ch gi&atilde; nhỏ hoặc v&ograve; n&aacute;t c&acirc;y tươi đắp l&ecirc;n vết thương ngay tại chỗ. B&ecirc;n cạnh đ&oacute;, để chữa băng huyết, rong kinh cho phụ nữ th&igrave; cần cắt th&acirc;n tr&ecirc;n, phơi kh&ocirc; v&agrave; sắc uống với liều lượng 10 &ndash; 20g mỗi ng&agrave;y.&nbsp;</p>

<h2>C&acirc;y cứt lợn</h2>

<p>Hay c&ograve;n được biết đến với c&aacute;i t&ecirc;n tao nh&atilde;: Hy thi&ecirc;m, loại cỏ n&agrave;y l&agrave; cứu c&aacute;nh cho những người bị chứng đau lưng, đau khớp v&agrave; ch&acirc;n tay t&ecirc; buốt. B&ecirc;n cạnh đ&oacute; khi bị mụn nhọt, sử dụng loại cỏ n&agrave;y đắp l&ecirc;n sẽ gi&uacute;p nhanh ch&oacute;ng ti&ecirc;u vi&ecirc;m, giảm đau.&nbsp;</p>

<p>Loại c&acirc;y n&agrave;y xuất hiện rất nhiều tại c&aacute;c ruộng đồng ở miền n&ocirc;ng th&ocirc;n Việt Nam. C&aacute;ch sử dụng chủ yếu l&agrave; phơi kh&ocirc;, sắc uống. Kết hợp uống vị thuốc Nam hữu &iacute;ch n&agrave;y v&agrave; liệu ph&aacute;p xoa b&oacute;p bấm huyệt sẽ hỗ trợ rất tốt trong việc điều trị chứng đau lưng. Bạn c&oacute; thể tham khảo th&ecirc;m về&nbsp;<a href="http://vmcvietnam.vn/courses/tri-lieu-vung-lung-va-phong-chong-thoai-hoa-thoat-vi-dia-dem"><strong>c&aacute;ch xoa b&oacute;p bấm huyệt trị liệu v&ugrave;ng lưng</strong></a>&nbsp;để kết hợp chữa hiệu quả v&agrave; nhanh dứt bệnh.&nbsp;</p>

<p><a href="http://vmcvietnam.vn/wp-content/uploads/2021/10/cac-cay-thuoc-nam-quanh-ta-3.jpg"><img alt="Các cây thuốc nam quanh ta - Cây chó đẻ" src="http://vmcvietnam.vn/wp-content/uploads/2021/10/cac-cay-thuoc-nam-quanh-ta-3.jpg" style="height:400px; width:600px" /></a></p>

<p>C&acirc;y ch&oacute; đẻ</p>

<h2>C&acirc;y ch&oacute; đẻ răng cưa</h2>

<p>Lo&agrave;i c&acirc;y thuộc&nbsp;<a href="https://vi.wikipedia.org/wiki/H%E1%BB%8D_%C4%90%E1%BA%A1i_k%C3%ADch#:~:text=H%E1%BB%8D%20%C4%90%E1%BA%A1i%20k%C3%ADch%20hay%20h%E1%BB%8D,b%E1%BB%A5i%20ho%E1%BA%B7c%20c%C3%A2y%20th%C3%A2n%20g%E1%BB%97."><strong>họ thầu dầu</strong></a>&nbsp;n&agrave;y mọc hầu hết ở khắp nơi từ vườn nh&agrave; đến đồng ruộng. Dễ sống, mọc nhanh v&agrave; rất dễ d&agrave;ng t&igrave;m kiếm l&agrave; điểm ưu việt của lo&agrave;i c&acirc;y vừa l&agrave; c&acirc;y dại nhưng đồng thời cũng l&agrave; một trong&nbsp;<strong>c&aacute;c c&acirc;y thuốc Nam quanh ta</strong>&nbsp;cực hữu &iacute;ch n&agrave;y. Lo&agrave;i c&acirc;y n&agrave;y c&oacute; t&aacute;c dụng với nhiều bệnh thường gặp trong đời sống. Từ những người bị vi&ecirc;m gan, vi&ecirc;m thận, sỏi tiết niệu đến c&aacute;c b&agrave; bầu bị tắc tia sữa đều c&oacute; thể sử dụng loại c&acirc;y n&agrave;y sắc uống để chấm dứt chứng bệnh. C&aacute;ch sử dụng l&agrave; cắt th&acirc;n tr&ecirc;n, phơi kh&ocirc; v&agrave; sắc uống. Liều lượng sử dụng mỗi ng&agrave;y từ 8 &ndash; 20g l&agrave; hợp l&yacute;.&nbsp;</p>

<p><strong>C&aacute;c c&acirc;y thuốc Nam quanh ta</strong>&nbsp;từ l&acirc;u đ&atilde; được coi l&agrave; cứu c&aacute;nh cho những vết thương/chứng bệnh tức thời của người Việt Nam.&nbsp; Chữa bệnh bằng thuốc Nam v&agrave;&nbsp;<strong>Xoa b&oacute;p bấm huyệt trong y học cổ truyền</strong>&nbsp;được coi l&agrave; liệu ph&aacute;p điều trị an to&agrave;n v&agrave; l&agrave;nh mạnh. Tuy nhi&ecirc;n, để đảm bảo hiệu quả bạn cần nắm r&otilde; c&aacute;ch sử dụng v&agrave; t&aacute;c dụng của từng vị thuốc v&agrave; từng liệu ph&aacute;p điều trị. Những th&ocirc;ng tin tr&ecirc;n đ&acirc;y phần n&agrave;o c&oacute; thể gi&uacute;p bạn nhận thức được&nbsp;<strong>c&aacute;c c&acirc;y thuốc Nam trong tự nhi&ecirc;n</strong>, t&aacute;c dụng cũng như c&aacute;ch sử dụng ch&uacute;ng. Tuy nhi&ecirc;n để đảm bảo an to&agrave;n, bạn n&ecirc;n tham khảo &yacute; kiến của b&aacute;c sĩ hoặc c&aacute;c chuy&ecirc;n gia về y dược học cổ truyền.&nbsp;</p>
', CAST(N'2022-11-26T13:03:53.870' AS DateTime), 45, 1)
INSERT [BAIVIET] ([IDBAIVIET], [IDCHUDE], [SDT], [TENBAIVIET], [NOIDUNG], [THOIGIANDANGBAIVIET], [idhinh], [TRAGNGTHAI]) VALUES (9, 1, N'0704932121     ', N'Những cây thuốc nam thông dụng để chữa bệnh', N'<h2><strong>Tam thất</strong></h2>

<p>Từ xa xưa, tam thất l&agrave; vị thuốc y học cổ truyền qu&yacute;, được sử dụng nhiều từ xưa đến n&agrave;y. Theo Đ&ocirc;ng y, tam thất &nbsp;vị đắng hơi ngọt, t&iacute;nh &acirc;m, nằm trong nh&oacute;m hoạt huyết h&oacute;a ứ, c&oacute; t&aacute;c dụng h&agrave;nh ứ, chỉ huyết, ti&ecirc;u thũng. D&ugrave;ng để chữa những chứng bệnh xuất huyết do huyết ứ, thủy thũng, ho ra m&aacute;u&hellip;</p>

<p>Tam thất thường d&ugrave;ng cho phụ nữ sau khi sinh, người mới ốm dậy, người gi&agrave; yếu. Gần đ&acirc;y người ta ph&aacute;t hiện ra tam thất cũng c&oacute; t&aacute;c dụng ngăn chặn sự ph&aacute;t triển của c&aacute;c khối u. Người ta thường sử dụng tam thất trong c&aacute;c m&oacute;n ăn để tăng sự bổ dưỡng v&agrave; c&oacute; t&aacute;c dụng hoạt huyết, l&agrave;m tan ứ huyết, chữa sưng tấy, thiếu m&aacute;u, người mệt mỏi, hoa mắt.</p>

<p><img alt="Tam thất 1" src="https://tracuuduoclieu.vn/wp-content/uploads/2018/05/tam-that28129.jpg" /></p>

<p><em>Tam thất d&ugrave;ng để chữa bệnh cũng như bồi bổ sức khỏe</em></p>

<p><em><strong>Xem th&ecirc;m:<a href="https://tracuuduoclieu.vn/tam-that.html">&nbsp;C&acirc;y tam thất&nbsp;</a>&nbsp;</strong></em></p>

<h2><strong>C&acirc;y đinh lăng</strong></h2>

<p>Đinh lăng kh&ocirc;ng chỉ l&agrave; c&acirc;y cảnh m&agrave; c&ograve;n l&agrave; vị thuốc c&oacute; gi&aacute; trị. Theo y học cổ truyền, rễ đinh lăng c&oacute; vị ngọt, hơi đắng, t&iacute;nh m&aacute;t c&oacute; t&aacute;c dụng th&ocirc;ng huyết mạch, bồi bổ kh&iacute; huyết, l&aacute; c&oacute; vị đắng, t&iacute;nh m&aacute;t ch&iacute;nh v&igrave; vậy đinh lăng c&oacute; những t&aacute;c dụng qu&yacute; b&aacute;u sau:</p>

<ul>
	<li>Th&ocirc;ng huyết mạch, bồi bổ kh&iacute; huyết,</li>
	<li>L&aacute; c&oacute; vị đắng, t&iacute;nh m&aacute;t c&oacute; t&aacute;c dụng giải độc thức ăn, chống dị ứng,</li>
	<li>Chữa ho ra m&aacute;u, kiết lỵ</li>
	<li>L&aacute; đinh lăng c&oacute; thể hỗ trợ điều trị nhiều bệnh như cao huyết &aacute;p, co giật ở trẻ em, dị ứng v&agrave; c&oacute; nhiều t&aacute;c dụng như hoạt huyết dưỡng n&atilde;o, lợi tiểu&hellip;</li>
	<li>Rễ l&agrave;m thuốc bổ, lợi tiểu, cơ thể suy nhược gầy yếu.</li>
	<li>L&aacute; chữa cảm sốt, gi&atilde; n&aacute;t đắp chữa mụn nhọt, sưng tấy. ễ đinh lăng chứa rất nhiều chất saponin giống như ở nh&acirc;n s&acirc;m, c&aacute;c vitamin B1, B2, B6, C v&agrave; 20 acid amin cần thiết cho cơ thể.</li>
</ul>

<h2><strong>C&acirc;y m&atilde; đề</strong></h2>

<ol>
	<li>C&acirc;y m&atilde; đề thường được sử dụng trong nấu ăn, kh&ocirc;ng chỉ vậy, c&acirc;y m&atilde; đề c&ograve;n l&agrave; một vị thảo dược v&ocirc; c&ugrave;ng tuyệt vời, gi&uacute;p con người chữa l&agrave;nh vết thương bằng cơ chế h&uacute;t thải độc v&agrave; rất tốt cho hệ h&ocirc; hấp, ti&ecirc;u h&oacute;a</li>
	<li>L&aacute; v&agrave; hạt c&acirc;y m&atilde; đề đều c&oacute; t&aacute;c dụng chữa l&agrave;nh c&aacute;c tổn thương v&agrave; giảm sưng, vi&ecirc;m trong hệ ti&ecirc;u h&oacute;a. Đặc biệt, hạt m&atilde; đề l&agrave; một vị thuốc hữu &iacute;ch gi&uacute;p bạn duy tr&igrave; một hệ ti&ecirc;u h&oacute;a sạch sẽ bởi khả năng hoạt động giống như chất xơ psyllium, gi&uacute;p hấp thụ c&aacute;c chất độc hại c&ograve;n t&iacute;ch tụ.</li>
	<li>Kh&ocirc;ng chỉ trong đ&ocirc;ng y m&agrave; ngay cả nền y học hiện đại cũng đ&atilde; thừa nhận rằng c&acirc;y m&atilde; đề l&agrave; một vị thuốc tự nhi&ecirc;n c&oacute; t&aacute;c dụng l&agrave;m long đờm, giảm đau, ho, vi&ecirc;m mũi, vi&ecirc;m phế quản nhẹ v&agrave; nhiều thể bệnh đường h&ocirc; hấp kh&aacute;c rất hiệu quả. Sở dĩ như vậy l&agrave; v&igrave; lo&agrave;i c&acirc;y n&agrave;y chứa kh&aacute; nhiều kho&aacute;ng chất silica c&oacute; khả năng ti&ecirc;u sạch chất nhầy, từ đ&oacute; l&agrave;m giảm sự tắc nghẽn b&ecirc;n trong đường h&ocirc; hấp</li>
	<li>Kh&ocirc;ng chỉ chữa l&agrave;nh c&aacute;c vết thương hiệu quả, đặc t&iacute;nh l&agrave;m se của c&acirc;y m&atilde; đề c&ograve;n được sử dụng trong việc xoa dịu cảm gi&aacute;c đau v&agrave; chữa l&agrave;nh bệnh trĩ, ngăn ngừa chảy m&aacute;u do trĩ v&agrave; bệnh vi&ecirc;m b&agrave;ng quang.</li>
</ol>

<p><img alt="Cây mã đề 1" src="https://tracuuduoclieu.vn/wp-content/uploads/2018/05/cay-ma-de28229.jpg" /></p>

<p><em>C&acirc;y m&atilde; đề</em></p>

<h2><strong>C&acirc;y bạc h&agrave;</strong></h2>

<p>C&acirc;y bạc h&agrave; l&agrave; một vị thuốc rất phổ th&ocirc;ng ở nước ta d&ugrave;ng cả trong đ&ocirc;ng y v&agrave; t&acirc;y y. T&iacute;nh chất của bạc h&agrave; theo c&aacute;c t&agrave;i liệu cổ ghi như sau: Vị cay, m&aacute;t kh&ocirc;ng độc, v&agrave;o 2 kinh phế v&agrave; can, c&oacute; t&aacute;c dụng t&aacute;n phong nhiệt, ra mồ h&ocirc;i, giảm uất, l&agrave;m thuốc thanh lương d&ugrave;ng chữa cảm nắng (tr&uacute;ng thử), đau bụng, bụng đầy, chứng ăn kh&ocirc;ng ti&ecirc;u</p>

<p><strong>T&aacute;c dụng của c&acirc;y bạc h&agrave;</strong></p>

<p>Bạc h&agrave; l&agrave; một vị thuốc thơm, d&ugrave;ng l&agrave;m cho thuốc thơm dễ uống c&oacute; t&aacute;c dụng:</p>

<ul>
	<li>L&agrave;m ra mồ h&ocirc;i,</li>
	<li>Hạ sốt d&ugrave;ng chữa cảm sốt, cảm mạo, mũi ngạt, đầu nhức, c</li>
	<li>Gi&uacute;p cho sự ti&ecirc;u ho&aacute;,</li>
	<li>Chữa k&eacute;m ăn, ăn uống kh&ocirc;ng ti&ecirc;u, đau bụng đi ngo&agrave;i.</li>
	<li>Tinh dầu bạc h&agrave; v&agrave; mentola d&ugrave;ng l&agrave;m thuốc s&aacute;t tr&ugrave;ng, xoa b&oacute;p nơi sưng đau, như khớp xương, th&aacute;i dương khi đầu nhức.</li>
	<li>Theo Lesieur v&agrave; J. Meyer bạc h&agrave; l&agrave; một vị thuốc chữa lo&eacute;t dạ d&agrave;y, l&agrave;m giảm b&agrave;i tiết dịch vị v&agrave; giảm đau.</li>
</ul>

<h2><strong>C&acirc;y địa liền</strong></h2>

<p>C&acirc;y địa liền&nbsp; l&agrave; loại c&acirc;y dễ sống, mọc hoang v&agrave; được trồng ở khắp nơi. Nh&acirc;n d&acirc;n biết đến c&acirc;y địa liền với rất nhiều t&aacute;c dụng kh&aacute;c nhau, v&agrave; đ&acirc;y cũng l&agrave; 1 giống c&acirc;y thuốc gi&uacute;p người d&acirc;n l&agrave;m kinh tế rất tốt như ở x&atilde; nam Sơn( Ba Chẽ)&nbsp; đ&atilde; đem lại hiệu quả kinh tế cao, cải thiện đời sống cho người d&acirc;n.</p>

<p>Theo t&agrave;i liệu cổ địa liền c&oacute; vị c&acirc;y, t&iacute;nh &ocirc;n, v&agrave;o 2 kinh tỳ v&agrave; vị, c&oacute; t&aacute;c dụng &ocirc;n trung t&aacute;n h&agrave;n, trừ thấp, tịch uế. chữa ngực bụng đau lạnh, đau răng. Thường được d&ugrave;ng l&agrave;m thuốc gi&uacute;p sự ti&ecirc;u ho&aacute;, l&agrave;m cho ăn ngon, ch&oacute;ng ti&ecirc;u v&agrave; c&ograve;n d&ugrave;ng l&agrave;m thuốc x&ocirc;ng. Ng&acirc;m rượu d&ugrave;ng xoa b&oacute;p chữa ph&ugrave; t&ecirc;, t&ecirc; thấp nhức đầu, đau nhức.</p>

<h2><strong>C&acirc;y cứt lợn</strong></h2>

<p>C&acirc;y cứt lợn l&agrave; loại c&acirc;y mọc hoang dại ở nhiều nơi, lo&agrave;i c&acirc;y n&agrave;y c&ograve;n c&oacute; t&ecirc;n như: c&acirc;y hoa ngũ sắc, c&acirc;y hoa ngũ vị, cỏ h&ocirc;i, người ta h&aacute;i to&agrave;n c&acirc;y cắt bỏ rễ, d&ugrave;ng tươi hay kh&ocirc;. Thường hay d&ugrave;ng c&acirc;y hơn</p>

<p>Năm 1965, y sĩ Điều Ngọc Thực ở Ph&uacute; Thọ đ&atilde; ph&aacute;t hiện thấy trong nh&acirc;n d&acirc;n d&ugrave;ng c&acirc;y cứt lợn chữa vi&ecirc;m xoang mũi dị ứng, đ&atilde; &aacute;p dụng tr&ecirc;n bản th&acirc;n v&agrave; một số người kh&aacute;c thấy t&aacute;c dụng tốt, nhiều th&iacute; nghiệm thấy c&oacute; t&aacute;c dụng chống vi&ecirc;m, chống ph&ugrave; nề, chống dị ứng ph&ugrave; hợp với những kết quả thu được tr&ecirc;n thực tế l&acirc;m s&agrave;ng điều trị vi&ecirc;m mũi cấp v&agrave; mạn. Nh&acirc;n d&acirc;n thường d&ugrave;ng c&acirc;y c&uacute;t lợn l&agrave;m thuốc chữa kinh nguyệt kh&ocirc;ng đều, rối loạn kinh nguyệt, rong huyết sau khi sinh nở.</p>

<h2><strong>Actiso</strong></h2>

<p>Actiso l&agrave; lo&agrave;i c&acirc;y được di thực v&agrave;o trồng nước ta, nhiều nhất ở Đ&agrave; Lạt, Sapa, Tam đảo. C&oacute; thể trồng được ở v&ugrave;ng đồng bằng. L&aacute; h&aacute;i v&agrave;o l&uacute;c c&acirc;y sắp hoặc đang ra hoa, rọc bỏ sống l&aacute;, phơi hay sấy kh&ocirc;.</p>

<p>Ngo&agrave;i việc d&ugrave;ng đế hoa v&agrave; l&aacute; bắc để ăn, actiso d&ugrave;ng l&agrave;m thuốc th&ocirc;ng tiểu tiện, th&ocirc;ng mật, c&aacute;c bệnh yếu gan, thận, vi&ecirc;m thận cấp t&iacute;nh v&agrave; kinh ni&ecirc;n, sưng khớp xương, nhuận v&agrave; tẩy m&aacute;u nhẹ đối với trẻ em. L&aacute; tươi v&agrave; kh&ocirc; d&ugrave;ng dưới h&igrave;nh thức thuốc sắc &nbsp;hoặc cao lỏng. C&oacute; khi chế th&agrave;nh cao mềm hay kh&ocirc; để chế thuốc vi&ecirc;n, thuốc ti&ecirc;m dưới da hay mạch m&aacute;u. Tại miền nam ở c&aacute;c chợ người ta c&ograve;n b&aacute;n cả th&acirc;n v&agrave; rễ actiso th&aacute;i m&ograve;ng phơi kh&ocirc; với c&ocirc;ng dụng như l&aacute;.</p>

<p><img alt="Actiso 1" src="https://tracuuduoclieu.vn/wp-content/uploads/2018/05/actiso28229.jpg" /></p>
', CAST(N'2022-12-14T22:09:51.217' AS DateTime), 70, 0)
INSERT [BAIVIET] ([IDBAIVIET], [IDCHUDE], [SDT], [TENBAIVIET], [NOIDUNG], [THOIGIANDANGBAIVIET], [idhinh], [TRAGNGTHAI]) VALUES (10, 1, N'0704932121     ', N'Những cây thuốc nam thông dụng để chữa bệnh', N'<h2><strong>Tam thất</strong></h2>

<p>Từ xa xưa, tam thất l&agrave; vị thuốc y học cổ truyền qu&yacute;, được sử dụng nhiều từ xưa đến n&agrave;y. Theo Đ&ocirc;ng y, tam thất &nbsp;vị đắng hơi ngọt, t&iacute;nh &acirc;m, nằm trong nh&oacute;m hoạt huyết h&oacute;a ứ, c&oacute; t&aacute;c dụng h&agrave;nh ứ, chỉ huyết, ti&ecirc;u thũng. D&ugrave;ng để chữa những chứng bệnh xuất huyết do huyết ứ, thủy thũng, ho ra m&aacute;u&hellip;</p>

<p>Tam thất thường d&ugrave;ng cho phụ nữ sau khi sinh, người mới ốm dậy, người gi&agrave; yếu. Gần đ&acirc;y người ta ph&aacute;t hiện ra tam thất cũng c&oacute; t&aacute;c dụng ngăn chặn sự ph&aacute;t triển của c&aacute;c khối u. Người ta thường sử dụng tam thất trong c&aacute;c m&oacute;n ăn để tăng sự bổ dưỡng v&agrave; c&oacute; t&aacute;c dụng hoạt huyết, l&agrave;m tan ứ huyết, chữa sưng tấy, thiếu m&aacute;u, người mệt mỏi, hoa mắt.</p>

<p><img alt="Tam thất 1" src="https://tracuuduoclieu.vn/wp-content/uploads/2018/05/tam-that28129.jpg" /></p>

<p><em>Tam thất d&ugrave;ng để chữa bệnh cũng như bồi bổ sức khỏe</em></p>

<p><em><strong>Xem th&ecirc;m:<a href="https://tracuuduoclieu.vn/tam-that.html">&nbsp;C&acirc;y tam thất&nbsp;</a>&nbsp;</strong></em></p>

<h2><strong>C&acirc;y đinh lăng</strong></h2>

<p>Đinh lăng kh&ocirc;ng chỉ l&agrave; c&acirc;y cảnh m&agrave; c&ograve;n l&agrave; vị thuốc c&oacute; gi&aacute; trị. Theo y học cổ truyền, rễ đinh lăng c&oacute; vị ngọt, hơi đắng, t&iacute;nh m&aacute;t c&oacute; t&aacute;c dụng th&ocirc;ng huyết mạch, bồi bổ kh&iacute; huyết, l&aacute; c&oacute; vị đắng, t&iacute;nh m&aacute;t ch&iacute;nh v&igrave; vậy đinh lăng c&oacute; những t&aacute;c dụng qu&yacute; b&aacute;u sau:</p>

<ul>
	<li>Th&ocirc;ng huyết mạch, bồi bổ kh&iacute; huyết,</li>
	<li>L&aacute; c&oacute; vị đắng, t&iacute;nh m&aacute;t c&oacute; t&aacute;c dụng giải độc thức ăn, chống dị ứng,</li>
	<li>Chữa ho ra m&aacute;u, kiết lỵ</li>
	<li>L&aacute; đinh lăng c&oacute; thể hỗ trợ điều trị nhiều bệnh như cao huyết &aacute;p, co giật ở trẻ em, dị ứng v&agrave; c&oacute; nhiều t&aacute;c dụng như hoạt huyết dưỡng n&atilde;o, lợi tiểu&hellip;</li>
	<li>Rễ l&agrave;m thuốc bổ, lợi tiểu, cơ thể suy nhược gầy yếu.</li>
	<li>L&aacute; chữa cảm sốt, gi&atilde; n&aacute;t đắp chữa mụn nhọt, sưng tấy. ễ đinh lăng chứa rất nhiều chất saponin giống như ở nh&acirc;n s&acirc;m, c&aacute;c vitamin B1, B2, B6, C v&agrave; 20 acid amin cần thiết cho cơ thể.</li>
</ul>

<h2><strong>C&acirc;y m&atilde; đề</strong></h2>

<ol>
	<li>C&acirc;y m&atilde; đề thường được sử dụng trong nấu ăn, kh&ocirc;ng chỉ vậy, c&acirc;y m&atilde; đề c&ograve;n l&agrave; một vị thảo dược v&ocirc; c&ugrave;ng tuyệt vời, gi&uacute;p con người chữa l&agrave;nh vết thương bằng cơ chế h&uacute;t thải độc v&agrave; rất tốt cho hệ h&ocirc; hấp, ti&ecirc;u h&oacute;a</li>
	<li>L&aacute; v&agrave; hạt c&acirc;y m&atilde; đề đều c&oacute; t&aacute;c dụng chữa l&agrave;nh c&aacute;c tổn thương v&agrave; giảm sưng, vi&ecirc;m trong hệ ti&ecirc;u h&oacute;a. Đặc biệt, hạt m&atilde; đề l&agrave; một vị thuốc hữu &iacute;ch gi&uacute;p bạn duy tr&igrave; một hệ ti&ecirc;u h&oacute;a sạch sẽ bởi khả năng hoạt động giống như chất xơ psyllium, gi&uacute;p hấp thụ c&aacute;c chất độc hại c&ograve;n t&iacute;ch tụ.</li>
	<li>Kh&ocirc;ng chỉ trong đ&ocirc;ng y m&agrave; ngay cả nền y học hiện đại cũng đ&atilde; thừa nhận rằng c&acirc;y m&atilde; đề l&agrave; một vị thuốc tự nhi&ecirc;n c&oacute; t&aacute;c dụng l&agrave;m long đờm, giảm đau, ho, vi&ecirc;m mũi, vi&ecirc;m phế quản nhẹ v&agrave; nhiều thể bệnh đường h&ocirc; hấp kh&aacute;c rất hiệu quả. Sở dĩ như vậy l&agrave; v&igrave; lo&agrave;i c&acirc;y n&agrave;y chứa kh&aacute; nhiều kho&aacute;ng chất silica c&oacute; khả năng ti&ecirc;u sạch chất nhầy, từ đ&oacute; l&agrave;m giảm sự tắc nghẽn b&ecirc;n trong đường h&ocirc; hấp</li>
	<li>Kh&ocirc;ng chỉ chữa l&agrave;nh c&aacute;c vết thương hiệu quả, đặc t&iacute;nh l&agrave;m se của c&acirc;y m&atilde; đề c&ograve;n được sử dụng trong việc xoa dịu cảm gi&aacute;c đau v&agrave; chữa l&agrave;nh bệnh trĩ, ngăn ngừa chảy m&aacute;u do trĩ v&agrave; bệnh vi&ecirc;m b&agrave;ng quang.</li>
</ol>

<p><img alt="Cây mã đề 1" src="https://tracuuduoclieu.vn/wp-content/uploads/2018/05/cay-ma-de28229.jpg" /></p>

<p><em>C&acirc;y m&atilde; đề</em></p>

<h2><strong>C&acirc;y bạc h&agrave;</strong></h2>

<p>C&acirc;y bạc h&agrave; l&agrave; một vị thuốc rất phổ th&ocirc;ng ở nước ta d&ugrave;ng cả trong đ&ocirc;ng y v&agrave; t&acirc;y y. T&iacute;nh chất của bạc h&agrave; theo c&aacute;c t&agrave;i liệu cổ ghi như sau: Vị cay, m&aacute;t kh&ocirc;ng độc, v&agrave;o 2 kinh phế v&agrave; can, c&oacute; t&aacute;c dụng t&aacute;n phong nhiệt, ra mồ h&ocirc;i, giảm uất, l&agrave;m thuốc thanh lương d&ugrave;ng chữa cảm nắng (tr&uacute;ng thử), đau bụng, bụng đầy, chứng ăn kh&ocirc;ng ti&ecirc;u</p>

<p><strong>T&aacute;c dụng của c&acirc;y bạc h&agrave;</strong></p>

<p>Bạc h&agrave; l&agrave; một vị thuốc thơm, d&ugrave;ng l&agrave;m cho thuốc thơm dễ uống c&oacute; t&aacute;c dụng:</p>

<ul>
	<li>L&agrave;m ra mồ h&ocirc;i,</li>
	<li>Hạ sốt d&ugrave;ng chữa cảm sốt, cảm mạo, mũi ngạt, đầu nhức, c</li>
	<li>Gi&uacute;p cho sự ti&ecirc;u ho&aacute;,</li>
	<li>Chữa k&eacute;m ăn, ăn uống kh&ocirc;ng ti&ecirc;u, đau bụng đi ngo&agrave;i.</li>
	<li>Tinh dầu bạc h&agrave; v&agrave; mentola d&ugrave;ng l&agrave;m thuốc s&aacute;t tr&ugrave;ng, xoa b&oacute;p nơi sưng đau, như khớp xương, th&aacute;i dương khi đầu nhức.</li>
	<li>Theo Lesieur v&agrave; J. Meyer bạc h&agrave; l&agrave; một vị thuốc chữa lo&eacute;t dạ d&agrave;y, l&agrave;m giảm b&agrave;i tiết dịch vị v&agrave; giảm đau.</li>
</ul>

<h2><strong>C&acirc;y địa liền</strong></h2>

<p>C&acirc;y địa liền&nbsp; l&agrave; loại c&acirc;y dễ sống, mọc hoang v&agrave; được trồng ở khắp nơi. Nh&acirc;n d&acirc;n biết đến c&acirc;y địa liền với rất nhiều t&aacute;c dụng kh&aacute;c nhau, v&agrave; đ&acirc;y cũng l&agrave; 1 giống c&acirc;y thuốc gi&uacute;p người d&acirc;n l&agrave;m kinh tế rất tốt như ở x&atilde; nam Sơn( Ba Chẽ)&nbsp; đ&atilde; đem lại hiệu quả kinh tế cao, cải thiện đời sống cho người d&acirc;n.</p>

<p>Theo t&agrave;i liệu cổ địa liền c&oacute; vị c&acirc;y, t&iacute;nh &ocirc;n, v&agrave;o 2 kinh tỳ v&agrave; vị, c&oacute; t&aacute;c dụng &ocirc;n trung t&aacute;n h&agrave;n, trừ thấp, tịch uế. chữa ngực bụng đau lạnh, đau răng. Thường được d&ugrave;ng l&agrave;m thuốc gi&uacute;p sự ti&ecirc;u ho&aacute;, l&agrave;m cho ăn ngon, ch&oacute;ng ti&ecirc;u v&agrave; c&ograve;n d&ugrave;ng l&agrave;m thuốc x&ocirc;ng. Ng&acirc;m rượu d&ugrave;ng xoa b&oacute;p chữa ph&ugrave; t&ecirc;, t&ecirc; thấp nhức đầu, đau nhức.</p>

<h2><strong>C&acirc;y cứt lợn</strong></h2>

<p>C&acirc;y cứt lợn l&agrave; loại c&acirc;y mọc hoang dại ở nhiều nơi, lo&agrave;i c&acirc;y n&agrave;y c&ograve;n c&oacute; t&ecirc;n như: c&acirc;y hoa ngũ sắc, c&acirc;y hoa ngũ vị, cỏ h&ocirc;i, người ta h&aacute;i to&agrave;n c&acirc;y cắt bỏ rễ, d&ugrave;ng tươi hay kh&ocirc;. Thường hay d&ugrave;ng c&acirc;y hơn</p>

<p>Năm 1965, y sĩ Điều Ngọc Thực ở Ph&uacute; Thọ đ&atilde; ph&aacute;t hiện thấy trong nh&acirc;n d&acirc;n d&ugrave;ng c&acirc;y cứt lợn chữa vi&ecirc;m xoang mũi dị ứng, đ&atilde; &aacute;p dụng tr&ecirc;n bản th&acirc;n v&agrave; một số người kh&aacute;c thấy t&aacute;c dụng tốt, nhiều th&iacute; nghiệm thấy c&oacute; t&aacute;c dụng chống vi&ecirc;m, chống ph&ugrave; nề, chống dị ứng ph&ugrave; hợp với những kết quả thu được tr&ecirc;n thực tế l&acirc;m s&agrave;ng điều trị vi&ecirc;m mũi cấp v&agrave; mạn. Nh&acirc;n d&acirc;n thường d&ugrave;ng c&acirc;y c&uacute;t lợn l&agrave;m thuốc chữa kinh nguyệt kh&ocirc;ng đều, rối loạn kinh nguyệt, rong huyết sau khi sinh nở.</p>

<h2><strong>Actiso</strong></h2>

<p>Actiso l&agrave; lo&agrave;i c&acirc;y được di thực v&agrave;o trồng nước ta, nhiều nhất ở Đ&agrave; Lạt, Sapa, Tam đảo. C&oacute; thể trồng được ở v&ugrave;ng đồng bằng. L&aacute; h&aacute;i v&agrave;o l&uacute;c c&acirc;y sắp hoặc đang ra hoa, rọc bỏ sống l&aacute;, phơi hay sấy kh&ocirc;.</p>

<p>Ngo&agrave;i việc d&ugrave;ng đế hoa v&agrave; l&aacute; bắc để ăn, actiso d&ugrave;ng l&agrave;m thuốc th&ocirc;ng tiểu tiện, th&ocirc;ng mật, c&aacute;c bệnh yếu gan, thận, vi&ecirc;m thận cấp t&iacute;nh v&agrave; kinh ni&ecirc;n, sưng khớp xương, nhuận v&agrave; tẩy m&aacute;u nhẹ đối với trẻ em. L&aacute; tươi v&agrave; kh&ocirc; d&ugrave;ng dưới h&igrave;nh thức thuốc sắc &nbsp;hoặc cao lỏng. C&oacute; khi chế th&agrave;nh cao mềm hay kh&ocirc; để chế thuốc vi&ecirc;n, thuốc ti&ecirc;m dưới da hay mạch m&aacute;u. Tại miền nam ở c&aacute;c chợ người ta c&ograve;n b&aacute;n cả th&acirc;n v&agrave; rễ actiso th&aacute;i m&ograve;ng phơi kh&ocirc; với c&ocirc;ng dụng như l&aacute;.</p>

<p><img alt="Actiso 1" src="https://tracuuduoclieu.vn/wp-content/uploads/2018/05/actiso28229.jpg" /></p>
', CAST(N'2022-12-14T22:11:04.577' AS DateTime), 71, 0)
INSERT [BAIVIET] ([IDBAIVIET], [IDCHUDE], [SDT], [TENBAIVIET], [NOIDUNG], [THOIGIANDANGBAIVIET], [idhinh], [TRAGNGTHAI]) VALUES (11, 3, N'0123456789     ', N'Y dược cổ truyền trong phòng và điều trị Covid-19, hậu Covid-19', N'<p>Buổi hội thảo c&oacute; sự tham dự của hơn 300 đại biểu đến từ Ủy ban Khoa học C&ocirc;ng nghệ v&agrave; M&ocirc;i trường-Quốc hội, Bộ Khoa học v&agrave; C&ocirc;ng nghệ; c&aacute;c đơn vị trực thuộc Bộ Y tế; Sở Y tế, Bệnh viện y học cổ truyền v&agrave; khoa y học cổ truyền thuộc bệnh viện đa khoa...</p>

<p>Tại hội thảo đ&atilde; c&oacute; 15 b&agrave;i b&aacute;o c&aacute;o khoa học được tr&igrave;nh b&agrave;y, qua đ&oacute; khẳng định vai tr&ograve; tham gia t&iacute;ch cực của y dược cổ truyền trong c&ocirc;ng t&aacute;c ph&ograve;ng, điều trị Covid-19, hậu Covid-19 trong thời gian qua. Đồng thời, đẩy mạnh c&ocirc;ng t&aacute;c nghi&ecirc;n cứu, đ&aacute;nh gi&aacute; t&aacute;c động của c&aacute;c b&agrave;i thuốc, phương ph&aacute;p điều trị mới. Qua đ&oacute;, ph&aacute;t huy thế mạnh của y dược cổ truyền, từng bước khẳng định được vị thế của y dược cổ truyền trong việc tham gia ph&ograve;ng, chống c&aacute;c dịch, bệnh mới, cấp t&iacute;nh.</p>

<p>Hội thảo cũng đ&atilde; ghi nhận những &yacute; kiến đ&oacute;ng g&oacute;p, thảo luận c&aacute;c giải ph&aacute;p nhằm th&uacute;c đẩy c&ocirc;ng t&aacute;c nghi&ecirc;n cứu khoa học, nghi&ecirc;n cứu ứng dụng c&aacute;c th&agrave;nh tựu y dược cổ truyền. Hội thảo đ&atilde; tạo m&ocirc;i trường cho c&aacute;c nh&agrave; khoa học trong lĩnh vực y dược cổ truyền chia sẻ, trao đổi học thuật, kinh nghiệm về ứng dụng y dược cổ truyền trong ph&ograve;ng, điều trị Covid-19, hậu Covid-19, đ&aacute;p ứng tốt nhu cầu sử dụng y dược cổ truyền trong sự nghiệp chăm s&oacute;c v&agrave; bảo vệ sức khỏe nh&acirc;n d&acirc;n.</p>
', CAST(N'2022-12-15T04:49:11.797' AS DateTime), 73, 1)
SET IDENTITY_INSERT [BAIVIET] OFF
GO
SET IDENTITY_INSERT [BAOCAO] ON 

INSERT [BAOCAO] ([idbaocao], [noidungbaocao], [idcautraloi]) VALUES (6, N'.', 20)
INSERT [BAOCAO] ([idbaocao], [noidungbaocao], [idcautraloi]) VALUES (7, N'hi', 14)
INSERT [BAOCAO] ([idbaocao], [noidungbaocao], [idcautraloi]) VALUES (8, N'Nói chuyện ko liên quan', 21)
INSERT [BAOCAO] ([idbaocao], [noidungbaocao], [idcautraloi]) VALUES (9, N'.', 21)
INSERT [BAOCAO] ([idbaocao], [noidungbaocao], [idcautraloi]) VALUES (10, N'.', 21)
INSERT [BAOCAO] ([idbaocao], [noidungbaocao], [idcautraloi]) VALUES (11, N'Ngôn ngữ không phù hợp', 23)
INSERT [BAOCAO] ([idbaocao], [noidungbaocao], [idcautraloi]) VALUES (13, N'Nội dung bạo lực', 26)
SET IDENTITY_INSERT [BAOCAO] OFF
GO
SET IDENTITY_INSERT [BENH] ON 

INSERT [BENH] ([IDBENH], [TENBENH]) VALUES (12, N'Ho')
INSERT [BENH] ([IDBENH], [TENBENH]) VALUES (13, N'Giun Sán')
INSERT [BENH] ([IDBENH], [TENBENH]) VALUES (14, N'Kinh Nguyệt Không Đều')
INSERT [BENH] ([IDBENH], [TENBENH]) VALUES (15, N'Sốt')
INSERT [BENH] ([IDBENH], [TENBENH]) VALUES (24, N'Tiêu Chảy')
INSERT [BENH] ([IDBENH], [TENBENH]) VALUES (25, N'Đầy Hơi')
INSERT [BENH] ([IDBENH], [TENBENH]) VALUES (26, N'Khó Tiêu')
INSERT [BENH] ([IDBENH], [TENBENH]) VALUES (17, N'Viêm Phế Quản')
INSERT [BENH] ([IDBENH], [TENBENH]) VALUES (18, N'Hen Suyễn')
INSERT [BENH] ([IDBENH], [TENBENH]) VALUES (19, N'Trầm Cảm')
INSERT [BENH] ([IDBENH], [TENBENH]) VALUES (20, N'Lao Phổi')
SET IDENTITY_INSERT [BENH] OFF
GO
SET IDENTITY_INSERT [BOPHANSUDUNG] ON 

INSERT [BOPHANSUDUNG] ([IDBOPHAN], [TENBOPHAN]) VALUES (12, N'Lá Cây')
INSERT [BOPHANSUDUNG] ([IDBOPHAN], [TENBOPHAN]) VALUES (14, N'Vỏ Cây')
INSERT [BOPHANSUDUNG] ([IDBOPHAN], [TENBOPHAN]) VALUES (10, N'Rễ')
SET IDENTITY_INSERT [BOPHANSUDUNG] OFF
GO
SET IDENTITY_INSERT [CAUHOI] ON 

INSERT [CAUHOI] ([IDCAUHOI], [SDT], [TENCAUHOI], [NOIDUNGCAUHOI], [NGAYDANG], [trangthai], [idhinh]) VALUES (27, N'0123456789     ', N'Viêm đám rối thần kinh cánh tay', N'<p>Xin hỏi c&oacute; b&agrave;i thuốc n&agrave;o chữa được bệnh n&agrave;y kh&ocirc;ng ạ</p>', CAST(N'2022-12-15T04:47:08.487' AS DateTime), 1, 72)
INSERT [CAUHOI] ([IDCAUHOI], [SDT], [TENCAUHOI], [NOIDUNGCAUHOI], [NGAYDANG], [trangthai], [idhinh]) VALUES (22, N'0704932121     ', N'D? giao d?ng là cây gì ?', N'<p>Xin hỏi nh&agrave; thuốc dạ giao đằng l&agrave; c&acirc;y g&igrave; ?. T&ocirc;i xem một số b&agrave;i thuốc thấy c&oacute; vị dạ giao đằng, nhưng tra từ điển lại kh&ocirc;ng thấy th&ocirc;ng tin về vị thuốc n&agrave;y. Rất mong sớm nhận được th&ocirc;ng tin từ nh&agrave; thuốc. Cảm ơn.</p>', CAST(N'2022-12-13T09:11:22.137' AS DateTime), 0, NULL)
INSERT [CAUHOI] ([IDCAUHOI], [SDT], [TENCAUHOI], [NOIDUNGCAUHOI], [NGAYDANG], [trangthai], [idhinh]) VALUES (28, N'0123456789     ', N'Đây có phải Cây xạ đen không', N'<p>Nh&agrave; m&igrave;nh c&oacute; trồng giống n&agrave;y cho m&igrave;nh hỏi c&oacute; phải xạ đen kh&ocirc;ng ạ hay loại kh&aacute;c ạ..Đ&acirc;y l&agrave; ảnh th&acirc;n c&acirc;y v&agrave; l&aacute; m&igrave;nh h&aacute;i xuống v&igrave; trồng c&ugrave;ng c&acirc;y kh&aacute;c n&ecirc;n kh&ocirc;ng chụp r&otilde; to&agrave;n c&acirc;y ạ.</p>', CAST(N'2022-12-15T07:24:41.473' AS DateTime), 1, 77)
INSERT [CAUHOI] ([IDCAUHOI], [SDT], [TENCAUHOI], [NOIDUNGCAUHOI], [NGAYDANG], [trangthai], [idhinh]) VALUES (23, N'0704932121     ', N'D? giao d?ng là cây gì ?', N'<p>Xin hỏi nh&agrave; thuốc dạ giao đằng l&agrave; c&acirc;y g&igrave; ?. T&ocirc;i xem một số b&agrave;i thuốc thấy c&oacute; vị dạ giao đằng, nhưng tra từ điển lại kh&ocirc;ng thấy th&ocirc;ng tin về vị thuốc n&agrave;y. Rất mong sớm nhận được th&ocirc;ng tin từ nh&agrave; thuốc. Cảm ơn.</p>', CAST(N'2022-12-13T09:50:40.287' AS DateTime), 0, 66)
INSERT [CAUHOI] ([IDCAUHOI], [SDT], [TENCAUHOI], [NOIDUNGCAUHOI], [NGAYDANG], [trangthai], [idhinh]) VALUES (24, N'0704932121     ', N'Mú từn và amakong', N'<p>Dạ xin cho em hỏi c&acirc;y m&uacute;c từn v&agrave; amakong c&oacute; ng&acirc;m chung được kh&ocirc;ng ạ?<br />Dạ em cảm ơn ạ</p>', CAST(N'2022-12-13T14:50:29.157' AS DateTime), 1, 67)
INSERT [CAUHOI] ([IDCAUHOI], [SDT], [TENCAUHOI], [NOIDUNGCAUHOI], [NGAYDANG], [trangthai], [idhinh]) VALUES (25, N'0704932121     ', N'Giãn tĩnh mạch thừng tinh có bài thuốc nào chữa được không', N'<p>T&ocirc;i bị gi&atilde;n tĩnh mạch thừng tinh xin hỏi admin c&oacute; b&agrave;i thuốc n&agrave;o chữa được kh&ocirc;ng. T&ocirc;i cảm ơn.</p>', CAST(N'2022-12-13T17:30:53.637' AS DateTime), 1, 68)
INSERT [CAUHOI] ([IDCAUHOI], [SDT], [TENCAUHOI], [NOIDUNGCAUHOI], [NGAYDANG], [trangthai], [idhinh]) VALUES (9, N'0704932121     ', N'Cây này là gì ?', N'<p>C&acirc;y g&igrave; đ&acirc;y ạ</p>
', CAST(N'2022-11-15T21:56:33.713' AS DateTime), 1, NULL)
INSERT [CAUHOI] ([IDCAUHOI], [SDT], [TENCAUHOI], [NOIDUNGCAUHOI], [NGAYDANG], [trangthai], [idhinh]) VALUES (11, N'0704932121     ', N'lo', N'<p>12345</p>
', CAST(N'2022-11-18T13:31:00.177' AS DateTime), 0, NULL)
INSERT [CAUHOI] ([IDCAUHOI], [SDT], [TENCAUHOI], [NOIDUNGCAUHOI], [NGAYDANG], [trangthai], [idhinh]) VALUES (12, N'0704932121     ', N'lodfd', N'<p>123</p>
', CAST(N'2022-11-18T13:51:46.967' AS DateTime), 0, NULL)
INSERT [CAUHOI] ([IDCAUHOI], [SDT], [TENCAUHOI], [NOIDUNGCAUHOI], [NGAYDANG], [trangthai], [idhinh]) VALUES (19, N'0704932121     ', N'hi', N'<p>hi bro</p>
', CAST(N'2022-11-19T10:02:14.867' AS DateTime), 0, NULL)
INSERT [CAUHOI] ([IDCAUHOI], [SDT], [TENCAUHOI], [NOIDUNGCAUHOI], [NGAYDANG], [trangthai], [idhinh]) VALUES (26, N'0704932121     ', N'Thạch sùng', N'<p>Gần s&aacute;ng ch&aacute;u tỉnh giấc thấy c&oacute; một &iacute;t nước gần miệng v&agrave; ở tr&ecirc;n chăn. Ch&aacute;u ngửi thử th&igrave; thấy kh&ocirc;ng c&oacute; m&ugrave;i h&ocirc;i của nước d&atilde;i, kh&ocirc;ng c&oacute; m&ugrave;i g&igrave; đặc biệt cả. Cho ch&aacute;u hỏi liệu đ&oacute; c&oacute; phải nước tiểu thạch s&ugrave;ng kh&ocirc;ng ạ? Nếu phải th&igrave; n&oacute; c&oacute; độc kh&ocirc;ng ạ?</p>', CAST(N'2022-12-13T21:30:32.323' AS DateTime), 0, 69)
INSERT [CAUHOI] ([IDCAUHOI], [SDT], [TENCAUHOI], [NOIDUNGCAUHOI], [NGAYDANG], [trangthai], [idhinh]) VALUES (8, N'0704932121     ', N'qq', N'', CAST(N'2022-11-14T22:31:12.487' AS DateTime), 1, NULL)
SET IDENTITY_INSERT [CAUHOI] OFF
GO
SET IDENTITY_INSERT [CAYDUOCLIEU] ON 

INSERT [CAYDUOCLIEU] ([IDCAYDUOCLIEU], [IDHO], [TENDUOCLIEU], [TENKHOAHOC], [MOTA], [TACDUNGDUOCLY], [LUUY], [lieudungvacachdung]) VALUES (17, 3, N'Diệp Hạ Châu', N'Phyllanthus urinaria', N'Diệp hạ châu là cây gì? Tên gọi khác: Cây chó đẻ răng cưa, cây chó đẻ, Diệp hạ châu đắng, cây cau trời… Tên Hán Việt khác: Trân châu thảo, Nhật khai dạ bế, Diệp hậu châu. Từ xa xưa, dân gian ta đã sử dụng dược liệu này trong giải độc và bảo vệ gan.', N'Tại Việt Nam cũng có nhiều công trình nghiên cứu về tác dụng của cây diệp hạ châu đối với sức khỏe. Cụ thể như nghiên cứu của tác giả Lê Võ Định Tường (Học Viện Quân Y – 1990 – 1996) đã thành công với chế phẩm Hepamarin chiết xuất từ thành phần phyllanthus amarus có trong cây diệp hạ châu. Ngoài ra, nghiên cứu bột Phyllanthi từ cây diệp hạ châu vào năm 2001 của nhóm tác giả Trần Danh và Nguyễn Thượng Dong cũng chỉ ra, hoạt chất này có tác dụng hỗ trợ điều trị gan.', N'Diệp hạ châu có thể gây khó chịu cho dạ dày hoặc tiêu chảy.
Không nên dùng dược liệu diệp hạ châu đối với phụ nữ có thai và trẻ em dưới 2 tuổi.
Dược liệu này có thể tương tác với một số thuốc, thực phẩm chức năng hay dược liệu khác mà bạn đang sử dụng.', N'Diệp hạ châu có thể gây khó chịu cho dạ dày hoặc tiêu chảy.
Không nên dùng dược liệu diệp hạ châu đối với phụ nữ có thai và trẻ em dưới 2 tuổi.
Dược liệu này có thể tương tác với một số thuốc, thực phẩm chức năng hay dược liệu khác mà bạn đang sử dụng.')
INSERT [CAYDUOCLIEU] ([IDCAYDUOCLIEU], [IDHO], [TENDUOCLIEU], [TENKHOAHOC], [MOTA], [TACDUNGDUOCLY], [LUUY], [lieudungvacachdung]) VALUES (2, 1, N'1', N'1', N'1', N'1', N'1', N'1')
INSERT [CAYDUOCLIEU] ([IDCAYDUOCLIEU], [IDHO], [TENDUOCLIEU], [TENKHOAHOC], [MOTA], [TACDUNGDUOCLY], [LUUY], [lieudungvacachdung]) VALUES (3, 1, N'1', N'1', N'1', N'1', N'1', N'1')
INSERT [CAYDUOCLIEU] ([IDCAYDUOCLIEU], [IDHO], [TENDUOCLIEU], [TENKHOAHOC], [MOTA], [TACDUNGDUOCLY], [LUUY], [lieudungvacachdung]) VALUES (16, 1, N'Cây Bạc Hà', N'1', N'1', N'dược lý', N'lưu ý', N'lưu ý')
INSERT [CAYDUOCLIEU] ([IDCAYDUOCLIEU], [IDHO], [TENDUOCLIEU], [TENKHOAHOC], [MOTA], [TACDUNGDUOCLY], [LUUY], [lieudungvacachdung]) VALUES (10, 4, N'Bạch Đồng Nữ', N'Clerodendrum Canescens Wall', N'Cây nhỏ, cao khoảng 1m. Thân vuông có lông màu vàng nhạt. Lá mọc đối, gốc tròn hoặc hình tim, đầu nhọn dài khoảng 10-20 cm, rộng 8-15 cm, mép nguyên hoặc có răng cưa rất nhỏ, có ít lông cứng và ở mặt dưới thường có tuyến nhỏ tròn; gân lá nổi rõ, gân phụ đan thành mạng lưới, vỏ lá thấy có mùi hăng đặc biệt; cuống lá phủ nhiều lông.
Cụm hoa mọc ở ngọn thân thành chùy hoặc xim hai ngả, phủ đầy lông màu hung; lá bắc dạng lá hình trái xoan – mũi mác, rụng sớm, lá bắc con hình mũi mác; hoa màu trắng hoặc ngà vàng; đài nhỏ, nhẵn; tràng có ống hình trụ mảnh; nhị và vòi nhụy mọc thò dài; bầu nhẵn.
Quả hạch, hình cầu, màu đen bóng, có đài tồn tại màu đỏ.
Mùa hoa: tháng 5-8; mùa quả: tháng 9-11.', N'Bạch đồng nữ có những tác dụng dược lý trong thực nghiệm trên động vật như sau:

Tác dụng chống viêm cấp tính rõ rệt trong mô hình gây viêm tai thỏ với phenol và gây phù chân chuột cống trắng với kaolin.
Tác đụng chống viêm mạn tính tương đối yếu trong mô hình gây u hạt thực nghiệm với amian ở chuột cống trắng
Không có tác dụng gây thu teo tuyến ức chuột cống non. Tác dụng này là một trong những đặc điểm của những thuốc ức chế miễn dịch.
Tác dụng kháng nguyên sinh động vật trong thí nghiệm với Entamoeba histolytica.', N'Trước khi sử dụng một loại thuốc nào đó, người bệnh cần đến khám tại các cơ sở y tế để được bác sĩ tư vấn kỹ. Bệnh nhân cần tham khảo ý kiến bác sĩ trước khi sử dụng cây bạch đồng nữ trong điều trị bệnh. Bởi vì, khi sử dụng loại cây này có thể dẫn đến những tác dụng phụ như nôn mửa, khô cổ.', N'Trước khi sử dụng một loại thuốc nào đó, người bệnh cần đến khám tại các cơ sở y tế để được bác sĩ tư vấn kỹ. Bệnh nhân cần tham khảo ý kiến bác sĩ trước khi sử dụng cây bạch đồng nữ trong điều trị bệnh. Bởi vì, khi sử dụng loại cây này có thể dẫn đến những tác dụng phụ như nôn mửa, khô cổ.')
INSERT [CAYDUOCLIEU] ([IDCAYDUOCLIEU], [IDHO], [TENDUOCLIEU], [TENKHOAHOC], [MOTA], [TACDUNGDUOCLY], [LUUY], [lieudungvacachdung]) VALUES (9, 3, N'Bách Bộ', N'Stemona Tuberosa Lour', N'Dây leo bằng thân quấn, dài 4 – 6 m, hoặc hơn. Rễ củ chùm, gồm 30 – 100 củ; hình thuôn nhọn 2 đầu, màu trắng ngà, dài 15 – 30 cm. Thân khí sinh hình trụ hơi có cạnh, nhẵn, hơi phình lên ở những mấu, màu lục nhạt. Lá mọc đối, hoặc so le, hình trứng hoặc bầu dục dài 9 – 15 cm, rộng 6 – 12 cm, gốc hình tim, đầu thuôn nhọn; gân chính 7 – 13, hình cung, chạy từ cuống lá đến đầu lá, gân nhỏ nằm ngang, sít nhau rất đặc sắc, hai mặt nhẵn, gần như cùng màu; cuống dài 3 – 7 cm.
Cụm hoa mọc ở kẽ lá, cuống dài 2 – 4 cm, mang 1 - 2 hoa màu vàng lục; lá bắc hẹp; bao hoa gồm 4 mảnh giống nhau, hẹp ngang, dài khoảng 4 cm, mặt trong màu đỏ tía, có mùi hôi khó chịu; nhị 4 bằng nhau, chỉ nhị ngắn, đính ở gốc; bầu hình tháp.
Quả nang, hình trứng thuôn, dài 3.5 cm. Hạt 5 – 8, nhỏ, màu nâu.', N'+Theo y học cổ truyền
  Theo Tuệ tĩnh toàn tập, bách bộ có vị ngọt đắng, tính hơi ấm, không độc, mát phổi, chữa ho lâu ngày, lao và bệnh cổ độc.

+Theo y học hiện đại
Theo Đỗ Tất Lợi, dân gian dùng bách bộ để trị ho, trị giun sán và diệt sâu bọ.

+Tác dụng chữa ho
Bách bộ có chứa hoạt chất stemonin có tác dụng ức chế trung tâm hô hấp, do đó ức chế phản xạ ho.
Theo kết quả nghiên cứu của bác sĩ Diệp Đình Thiện (Trung Quốc) cho thấy dùng Bách bộ chữa bệnh lao hạch có hiệu quả tốt.

+Tác dụng sát trùng và chữa giun
Dung dịch stemonin 0,15% sẽ làm giun tê liệt sau 5 – 10 phút.
Đem dung dịch bách bộ 10% trong rượu 70% ngâm hoặc phun vào rận sẽ làm chết rận.
Trong thời gian kháng chiến, cao nước bách bộ được uống để tẩy giun (uống 3 thìa cà phê mỗi lần).

+Tác dụng kháng sinh
Đã có bằng chứng cho thấy bách bộ có tác dụng sát khuẩn với các loại vi khuẩn trong ruột già, diệt được khuẩn lỵ và phó thương hàn.', N'Người bệnh có tỳ vị hư yếu không dùng.', N'Người bệnh có tỳ vị hư yếu không dùng.')
INSERT [CAYDUOCLIEU] ([IDCAYDUOCLIEU], [IDHO], [TENDUOCLIEU], [TENKHOAHOC], [MOTA], [TACDUNGDUOCLY], [LUUY], [lieudungvacachdung]) VALUES (11, 5, N'Bách Hoa Xà Thiệt Thảo', N'Hedyotis diffusa ', N'Cây thân thảo, dài 20 – 25 cm, thân vuông màu nâu nhạt. Lá mọc đối, hình mác thuôn, dài 1 – 3,5 cm, rộng 1 – 3 mm, gốc và đầu nhọn, gân giữa lá rõ và nổi gồ; lá kèm có răng nhỏ ở đầu. Hoa màu trắng, có cuống, mọc đơn độc hoặc đôi một ở kẽ lá. Tràng hoa 4 cánh, 4 nhị dính ở họng ống tràng. Cây có quả quanh năm.

', N'Ước sắc đặc của bạch hoa xà thiệt thảo có tác dụng ức chế sự phát triển trực khuẩn mủ xanh, trực khuẩn thương hàn và một số loại vi khuẩn khác, ngoài ra còn có tác dụng tăng cường khả năng miễn dịch của cơ thể và chức năng của vỏ tuyến thượng thận.
', N'Bạch hoa xà dù có tốt đến đâu cũng chỉ được coi là một dược phẩm hỗ trợ giảm nhẹ và điều trị các bệnh ban đầu. Nó không phải là một phương thuốc đặc trị nên không thể lạm dụng hay sử dụng tùy tiện.', N'Bạch hoa xà dù có tốt đến đâu cũng chỉ được coi là một dược phẩm hỗ trợ giảm nhẹ và điều trị các bệnh ban đầu. Nó không phải là một phương thuốc đặc trị nên không thể lạm dụng hay sử dụng tùy tiện.')
INSERT [CAYDUOCLIEU] ([IDCAYDUOCLIEU], [IDHO], [TENDUOCLIEU], [TENKHOAHOC], [MOTA], [TACDUNGDUOCLY], [LUUY], [lieudungvacachdung]) VALUES (13, 7, N'Bố Chính Sâm', N'Abelmoschus Sagittifolius (Kurz) Merr', N'Sâm bố chính là một loại cây thân thảo sống dai, mọc đứng, thân khá yếu ớt, có khi dựa vào các cây xung quanh, cao từ 0,3m đến 1m. Rễ mầm màu trắng nhạt hay vàng nhạt, có đường kính 1,5 - 2cm, nhiều rễ có hình người trông rất giống Nhân sâm, có lẽ vì thế nên trong dân gian đã sử dụng và thấy loại thảo dược này có dược tính tốt như các loại cây sâm khác.', N'Bằng đường uống và tiêm phúc mạc, cao cồn sâm Bố Chính có tác dụng gây giảm hoạt động tự nhiên của chuột nhắt trắng, đối kháng với tác dụng tằng hoạt động của amphetamin, kéo dài thời gian gây ngủ bởi thuốc ngủ barbituric, và chống co giật gây bởi pentetrazol. Điều đó chứng tỏ sâm Bố Chính có tác dụng ức chế thần kinh trung ương, an thần.', N'Khi muốn sử dụng Sâm bố chính để chữa bệnh, bạn cần tham khảo ý kiến bác sĩ chuyên khoa y học cổ truyền để được tư vấn và kê toa phù hợp.
Thể trạng hư hàn phải tẩm nước gừng, sao kỹ.', N'Khi muốn sử dụng Sâm bố chính để chữa bệnh, bạn cần tham khảo ý kiến bác sĩ chuyên khoa y học cổ truyền để được tư vấn và kê toa phù hợp.
Thể trạng hư hàn phải tẩm nước gừng, sao kỹ.')
INSERT [CAYDUOCLIEU] ([IDCAYDUOCLIEU], [IDHO], [TENDUOCLIEU], [TENKHOAHOC], [MOTA], [TACDUNGDUOCLY], [LUUY], [lieudungvacachdung]) VALUES (12, 6, N'Bán Hạ Nam', N'Typhonium trilobatum Schott', N'Bán hạ nam là loại thân thảo, sống lâu năm, cao khoảng 20 – 30 cm. Củ hình tròn cầu hoặc tròn dẹt.
Lá mọc từ củ, có cuống dài, về mùa xuân cây mọc 1 – 2 lá, dài 3 – 33 cm, lá đơn chia làm 3 thùy, tùy theo tuổi cây mà lá mọc có khác nhau về hình dạng, cuống lá dài, lá màu xanh, nhẵn bóng không có lông, lúc cây còn nhỏ lá đơn, hình trứng hay hình tim, đuôi nhọn mép lá nguyên hoặc hơi có làn sóng, gốc lá hình mũi tên, cây 2 – 3 năm tuổi lá có 3 thùy, hình bầu dục hay hình kim phình giữa, hai đầu nhọn.
Cây 2 – 3 năm tuổi mới có hoa, hoa hình bông nở vào đầu mùa hạ, hoa có bao lớn, bao màu xanh, hoa cái mọc ở phía dưới, màu xanh nhạt, hoa đực mọc ở bên trên, màu trắng, đài nhỏ.
Quả mọng hình bầu dục, dạng trứng.', N'Báo Trung Hoa y học tạp chí (1954, 5: 325-330) đã đăng tải một nghiên cứu về tác dụng chữa ho của cây bán hạ nam ở mèo. Sau khi cho mèo dùng 1 ml cồn iot 1% đã gây triệu chứng ho và dùng nước sắc bán hạ nam 20% để điều trị bệnh. Kết quả cho thấy với liều dùng 0,6 gram bán hạ nam trên 1 kg thể trọng đã có tác dụng chữa rõ hiệu quả. Bên cạnh đó, một nghiên cứu khác tại Nhật Bản năm 1931 (Linh Mộc Đạt) cũng chỉ ra, hoạt chất ancaloit và ancol chứa trong cây bán hạ có tác dụng ức chế trung khu và mạt tiểu thần kinh, giúp giảm ho.', N'Những người âm hư, ho khan hay khạc ra máu cũng dễ bị kích ứng với thành phần trong bán hạ, do bán hạ có tính cay nóng mạnh, nên các chứng âm hư ho táo, miệng khát tổn thương tân dịch, huyết chứng, đàm nhiệt… kiêng dùng hoặc dùng thận trọng.', N'Những người âm hư, ho khan hay khạc ra máu cũng dễ bị kích ứng với thành phần trong bán hạ, do bán hạ có tính cay nóng mạnh, nên các chứng âm hư ho táo, miệng khát tổn thương tân dịch, huyết chứng, đàm nhiệt… kiêng dùng hoặc dùng thận trọng.')
SET IDENTITY_INSERT [CAYDUOCLIEU] OFF
GO
SET IDENTITY_INSERT [CHUDE] ON 

INSERT [CHUDE] ([IDCHUDE], [TENCHUDE]) VALUES (1, N'Bài Thuốc Nhân Gian')
INSERT [CHUDE] ([IDCHUDE], [TENCHUDE]) VALUES (2, N'Cây Thuốc Nam')
INSERT [CHUDE] ([IDCHUDE], [TENCHUDE]) VALUES (3, N'Y Học Cổ Truyền')
SET IDENTITY_INSERT [CHUDE] OFF
GO
SET IDENTITY_INSERT [CONGDUNG] ON 

INSERT [CONGDUNG] ([IDCONGDUNG], [TENCONGDUNG]) VALUES (7, N'Giảm Đau')
INSERT [CONGDUNG] ([IDCONGDUNG], [TENCONGDUNG]) VALUES (3, N'Tiêu Hóa')
INSERT [CONGDUNG] ([IDCONGDUNG], [TENCONGDUNG]) VALUES (4, N'Kích Thích Tiết Mật')
INSERT [CONGDUNG] ([IDCONGDUNG], [TENCONGDUNG]) VALUES (5, N'Nhuận Phế')
INSERT [CONGDUNG] ([IDCONGDUNG], [TENCONGDUNG]) VALUES (6, N'Chỉ Khái')
INSERT [CONGDUNG] ([IDCONGDUNG], [TENCONGDUNG]) VALUES (8, N'Hạ Huyết Áp')
INSERT [CONGDUNG] ([IDCONGDUNG], [TENCONGDUNG]) VALUES (13, N'Chỉ Ho')
INSERT [CONGDUNG] ([IDCONGDUNG], [TENCONGDUNG]) VALUES (14, N'Trừ Đờm')
INSERT [CONGDUNG] ([IDCONGDUNG], [TENCONGDUNG]) VALUES (15, N'Chống Nôn')
INSERT [CONGDUNG] ([IDCONGDUNG], [TENCONGDUNG]) VALUES (16, N'Bổ Tùy Vị')
INSERT [CONGDUNG] ([IDCONGDUNG], [TENCONGDUNG]) VALUES (17, N'Dưỡng Ẩm')
INSERT [CONGDUNG] ([IDCONGDUNG], [TENCONGDUNG]) VALUES (18, N'Bổ Máu')
INSERT [CONGDUNG] ([IDCONGDUNG], [TENCONGDUNG]) VALUES (19, N'Trợ Tiêu Hóa')
INSERT [CONGDUNG] ([IDCONGDUNG], [TENCONGDUNG]) VALUES (9, N'Lợi Tiểu')
INSERT [CONGDUNG] ([IDCONGDUNG], [TENCONGDUNG]) VALUES (10, N'Làm giãn các mạch máu ngoại vi')
INSERT [CONGDUNG] ([IDCONGDUNG], [TENCONGDUNG]) VALUES (11, N'Thanh Nhiệt')
INSERT [CONGDUNG] ([IDCONGDUNG], [TENCONGDUNG]) VALUES (12, N'Giải độc')
SET IDENTITY_INSERT [CONGDUNG] OFF
GO
INSERT [DUOCLIEU_BENH] ([IDBENH], [IDCAYDUOCLIEU]) VALUES (1, 2)
INSERT [DUOCLIEU_BENH] ([IDBENH], [IDCAYDUOCLIEU]) VALUES (1, 3)
INSERT [DUOCLIEU_BENH] ([IDBENH], [IDCAYDUOCLIEU]) VALUES (3, 2)
INSERT [DUOCLIEU_BENH] ([IDBENH], [IDCAYDUOCLIEU]) VALUES (3, 3)
INSERT [DUOCLIEU_BENH] ([IDBENH], [IDCAYDUOCLIEU]) VALUES (12, 9)
INSERT [DUOCLIEU_BENH] ([IDBENH], [IDCAYDUOCLIEU]) VALUES (12, 11)
INSERT [DUOCLIEU_BENH] ([IDBENH], [IDCAYDUOCLIEU]) VALUES (13, 9)
INSERT [DUOCLIEU_BENH] ([IDBENH], [IDCAYDUOCLIEU]) VALUES (13, 16)
INSERT [DUOCLIEU_BENH] ([IDBENH], [IDCAYDUOCLIEU]) VALUES (14, 10)
INSERT [DUOCLIEU_BENH] ([IDBENH], [IDCAYDUOCLIEU]) VALUES (14, 13)
INSERT [DUOCLIEU_BENH] ([IDBENH], [IDCAYDUOCLIEU]) VALUES (14, 17)
INSERT [DUOCLIEU_BENH] ([IDBENH], [IDCAYDUOCLIEU]) VALUES (15, 11)
INSERT [DUOCLIEU_BENH] ([IDBENH], [IDCAYDUOCLIEU]) VALUES (17, 12)
INSERT [DUOCLIEU_BENH] ([IDBENH], [IDCAYDUOCLIEU]) VALUES (18, 13)
INSERT [DUOCLIEU_BENH] ([IDBENH], [IDCAYDUOCLIEU]) VALUES (19, 13)
INSERT [DUOCLIEU_BENH] ([IDBENH], [IDCAYDUOCLIEU]) VALUES (20, 13)
GO
INSERT [DUOCLIEU_BOPHANSUDUNG] ([IDBOPHAN], [IDCAYDUOCLIEU]) VALUES (2, 2)
INSERT [DUOCLIEU_BOPHANSUDUNG] ([IDBOPHAN], [IDCAYDUOCLIEU]) VALUES (2, 3)
INSERT [DUOCLIEU_BOPHANSUDUNG] ([IDBOPHAN], [IDCAYDUOCLIEU]) VALUES (2, 10)
INSERT [DUOCLIEU_BOPHANSUDUNG] ([IDBOPHAN], [IDCAYDUOCLIEU]) VALUES (3, 2)
INSERT [DUOCLIEU_BOPHANSUDUNG] ([IDBOPHAN], [IDCAYDUOCLIEU]) VALUES (3, 3)
INSERT [DUOCLIEU_BOPHANSUDUNG] ([IDBOPHAN], [IDCAYDUOCLIEU]) VALUES (10, 9)
INSERT [DUOCLIEU_BOPHANSUDUNG] ([IDBOPHAN], [IDCAYDUOCLIEU]) VALUES (10, 10)
INSERT [DUOCLIEU_BOPHANSUDUNG] ([IDBOPHAN], [IDCAYDUOCLIEU]) VALUES (10, 12)
INSERT [DUOCLIEU_BOPHANSUDUNG] ([IDBOPHAN], [IDCAYDUOCLIEU]) VALUES (10, 13)
INSERT [DUOCLIEU_BOPHANSUDUNG] ([IDBOPHAN], [IDCAYDUOCLIEU]) VALUES (10, 17)
INSERT [DUOCLIEU_BOPHANSUDUNG] ([IDBOPHAN], [IDCAYDUOCLIEU]) VALUES (11, 11)
INSERT [DUOCLIEU_BOPHANSUDUNG] ([IDBOPHAN], [IDCAYDUOCLIEU]) VALUES (12, 17)
INSERT [DUOCLIEU_BOPHANSUDUNG] ([IDBOPHAN], [IDCAYDUOCLIEU]) VALUES (14, 16)
INSERT [DUOCLIEU_BOPHANSUDUNG] ([IDBOPHAN], [IDCAYDUOCLIEU]) VALUES (14, 17)
GO
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (1, 2)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (1, 3)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (1, 9)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (2, 2)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (2, 3)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (3, 2)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (3, 3)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (3, 16)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (4, 2)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (4, 3)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (4, 13)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (4, 17)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (5, 9)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (5, 13)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (5, 17)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (6, 9)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (7, 17)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (8, 10)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (10, 10)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (11, 11)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (11, 13)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (12, 11)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (13, 12)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (14, 12)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (15, 12)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (16, 13)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (17, 13)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (18, 13)
INSERT [DUOCLIEU_CONGDUNG] ([IDCONGDUNG], [IDCAYDUOCLIEU]) VALUES (19, 13)
GO
INSERT [DUOCLIEU_PHANBO] ([IDNOIPHANBO], [IDCAYDUOCLIEU]) VALUES (1, 2)
INSERT [DUOCLIEU_PHANBO] ([IDNOIPHANBO], [IDCAYDUOCLIEU]) VALUES (1, 3)
INSERT [DUOCLIEU_PHANBO] ([IDNOIPHANBO], [IDCAYDUOCLIEU]) VALUES (2, 2)
INSERT [DUOCLIEU_PHANBO] ([IDNOIPHANBO], [IDCAYDUOCLIEU]) VALUES (2, 3)
INSERT [DUOCLIEU_PHANBO] ([IDNOIPHANBO], [IDCAYDUOCLIEU]) VALUES (2, 17)
INSERT [DUOCLIEU_PHANBO] ([IDNOIPHANBO], [IDCAYDUOCLIEU]) VALUES (3, 9)
INSERT [DUOCLIEU_PHANBO] ([IDNOIPHANBO], [IDCAYDUOCLIEU]) VALUES (3, 17)
INSERT [DUOCLIEU_PHANBO] ([IDNOIPHANBO], [IDCAYDUOCLIEU]) VALUES (4, 9)
INSERT [DUOCLIEU_PHANBO] ([IDNOIPHANBO], [IDCAYDUOCLIEU]) VALUES (4, 16)
INSERT [DUOCLIEU_PHANBO] ([IDNOIPHANBO], [IDCAYDUOCLIEU]) VALUES (4, 17)
INSERT [DUOCLIEU_PHANBO] ([IDNOIPHANBO], [IDCAYDUOCLIEU]) VALUES (5, 9)
INSERT [DUOCLIEU_PHANBO] ([IDNOIPHANBO], [IDCAYDUOCLIEU]) VALUES (5, 13)
INSERT [DUOCLIEU_PHANBO] ([IDNOIPHANBO], [IDCAYDUOCLIEU]) VALUES (6, 9)
INSERT [DUOCLIEU_PHANBO] ([IDNOIPHANBO], [IDCAYDUOCLIEU]) VALUES (7, 9)
INSERT [DUOCLIEU_PHANBO] ([IDNOIPHANBO], [IDCAYDUOCLIEU]) VALUES (12, 9)
INSERT [DUOCLIEU_PHANBO] ([IDNOIPHANBO], [IDCAYDUOCLIEU]) VALUES (13, 10)
INSERT [DUOCLIEU_PHANBO] ([IDNOIPHANBO], [IDCAYDUOCLIEU]) VALUES (14, 10)
INSERT [DUOCLIEU_PHANBO] ([IDNOIPHANBO], [IDCAYDUOCLIEU]) VALUES (15, 11)
INSERT [DUOCLIEU_PHANBO] ([IDNOIPHANBO], [IDCAYDUOCLIEU]) VALUES (16, 11)
INSERT [DUOCLIEU_PHANBO] ([IDNOIPHANBO], [IDCAYDUOCLIEU]) VALUES (17, 12)
INSERT [DUOCLIEU_PHANBO] ([IDNOIPHANBO], [IDCAYDUOCLIEU]) VALUES (18, 13)
INSERT [DUOCLIEU_PHANBO] ([IDNOIPHANBO], [IDCAYDUOCLIEU]) VALUES (19, 13)
INSERT [DUOCLIEU_PHANBO] ([IDNOIPHANBO], [IDCAYDUOCLIEU]) VALUES (20, 13)
GO
INSERT [DUOCLIEU_QUYKINH] ([IDQUYKINH], [IDCAYDUOCLIEU]) VALUES (5, 2)
INSERT [DUOCLIEU_QUYKINH] ([IDQUYKINH], [IDCAYDUOCLIEU]) VALUES (5, 3)
INSERT [DUOCLIEU_QUYKINH] ([IDQUYKINH], [IDCAYDUOCLIEU]) VALUES (5, 10)
INSERT [DUOCLIEU_QUYKINH] ([IDQUYKINH], [IDCAYDUOCLIEU]) VALUES (5, 17)
INSERT [DUOCLIEU_QUYKINH] ([IDQUYKINH], [IDCAYDUOCLIEU]) VALUES (7, 2)
INSERT [DUOCLIEU_QUYKINH] ([IDQUYKINH], [IDCAYDUOCLIEU]) VALUES (7, 3)
INSERT [DUOCLIEU_QUYKINH] ([IDQUYKINH], [IDCAYDUOCLIEU]) VALUES (7, 9)
INSERT [DUOCLIEU_QUYKINH] ([IDQUYKINH], [IDCAYDUOCLIEU]) VALUES (7, 13)
INSERT [DUOCLIEU_QUYKINH] ([IDQUYKINH], [IDCAYDUOCLIEU]) VALUES (8, 2)
INSERT [DUOCLIEU_QUYKINH] ([IDQUYKINH], [IDCAYDUOCLIEU]) VALUES (8, 3)
INSERT [DUOCLIEU_QUYKINH] ([IDQUYKINH], [IDCAYDUOCLIEU]) VALUES (8, 16)
INSERT [DUOCLIEU_QUYKINH] ([IDQUYKINH], [IDCAYDUOCLIEU]) VALUES (9, 2)
INSERT [DUOCLIEU_QUYKINH] ([IDQUYKINH], [IDCAYDUOCLIEU]) VALUES (9, 3)
INSERT [DUOCLIEU_QUYKINH] ([IDQUYKINH], [IDCAYDUOCLIEU]) VALUES (10, 10)
INSERT [DUOCLIEU_QUYKINH] ([IDQUYKINH], [IDCAYDUOCLIEU]) VALUES (10, 12)
INSERT [DUOCLIEU_QUYKINH] ([IDQUYKINH], [IDCAYDUOCLIEU]) VALUES (10, 13)
INSERT [DUOCLIEU_QUYKINH] ([IDQUYKINH], [IDCAYDUOCLIEU]) VALUES (11, 11)
INSERT [DUOCLIEU_QUYKINH] ([IDQUYKINH], [IDCAYDUOCLIEU]) VALUES (11, 12)
GO
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (1, 2)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (1, 3)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (1, 17)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (2, 2)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (2, 3)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (2, 16)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (2, 17)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (3, 2)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (3, 3)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (3, 17)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (4, 2)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (4, 3)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (5, 9)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (6, 9)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (7, 9)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (9, 10)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (10, 10)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (11, 10)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (12, 11)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (13, 11)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (14, 11)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (15, 12)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (16, 12)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (18, 12)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (19, 12)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (20, 13)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (21, 13)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (22, 13)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (24, 13)
INSERT [DUOCLIEU_THANHPHAN] ([IDTHANHPHAN], [IDCAYDUOCLIEU]) VALUES (25, 13)
GO
INSERT [DUOCLIEU_TINHVI] ([IDTINHVI], [IDCAYDUOCLIEU]) VALUES (1, 2)
INSERT [DUOCLIEU_TINHVI] ([IDTINHVI], [IDCAYDUOCLIEU]) VALUES (1, 3)
INSERT [DUOCLIEU_TINHVI] ([IDTINHVI], [IDCAYDUOCLIEU]) VALUES (1, 12)
INSERT [DUOCLIEU_TINHVI] ([IDTINHVI], [IDCAYDUOCLIEU]) VALUES (1, 17)
INSERT [DUOCLIEU_TINHVI] ([IDTINHVI], [IDCAYDUOCLIEU]) VALUES (2, 3)
INSERT [DUOCLIEU_TINHVI] ([IDTINHVI], [IDCAYDUOCLIEU]) VALUES (2, 9)
INSERT [DUOCLIEU_TINHVI] ([IDTINHVI], [IDCAYDUOCLIEU]) VALUES (2, 17)
INSERT [DUOCLIEU_TINHVI] ([IDTINHVI], [IDCAYDUOCLIEU]) VALUES (3, 9)
INSERT [DUOCLIEU_TINHVI] ([IDTINHVI], [IDCAYDUOCLIEU]) VALUES (3, 11)
INSERT [DUOCLIEU_TINHVI] ([IDTINHVI], [IDCAYDUOCLIEU]) VALUES (3, 13)
INSERT [DUOCLIEU_TINHVI] ([IDTINHVI], [IDCAYDUOCLIEU]) VALUES (3, 17)
INSERT [DUOCLIEU_TINHVI] ([IDTINHVI], [IDCAYDUOCLIEU]) VALUES (5, 10)
INSERT [DUOCLIEU_TINHVI] ([IDTINHVI], [IDCAYDUOCLIEU]) VALUES (5, 13)
INSERT [DUOCLIEU_TINHVI] ([IDTINHVI], [IDCAYDUOCLIEU]) VALUES (5, 16)
INSERT [DUOCLIEU_TINHVI] ([IDTINHVI], [IDCAYDUOCLIEU]) VALUES (6, 10)
INSERT [DUOCLIEU_TINHVI] ([IDTINHVI], [IDCAYDUOCLIEU]) VALUES (7, 11)
INSERT [DUOCLIEU_TINHVI] ([IDTINHVI], [IDCAYDUOCLIEU]) VALUES (8, 12)
GO
SET IDENTITY_INSERT [HINH] ON 

INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (1, NULL, N'1.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (2, NULL, N'2.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (3, NULL, N'3.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (63, 16, N'16_1.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (64, 16, N'16_2.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (65, 16, N'16_3.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (66, NULL, N'23.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (67, NULL, N'24.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (68, NULL, N'25.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (16, NULL, N'16.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (17, NULL, N'17.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (18, NULL, N'18.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (19, NULL, N'19.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (20, NULL, N'20.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (21, NULL, N'21.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (22, NULL, N'22.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (23, NULL, N'23.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (24, NULL, N'24.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (25, NULL, N'25.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (32, NULL, N'32.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (33, 10, N'10_1.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (50, NULL, N'50.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (29, 9, N'9_1.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (30, 9, N'9_2.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (31, 9, N'9_3.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (51, NULL, N'51.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (52, NULL, N'52.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (53, 13, N'13_1.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (54, 13, N'13_2.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (55, 13, N'13_3.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (56, NULL, N'56.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (69, NULL, N'26.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (70, NULL, N'70.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (71, NULL, N'71.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (72, NULL, N'27.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (73, NULL, N'73.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (74, 17, N'17_1.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (75, 17, N'17_2.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (77, NULL, N'28.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (34, 10, N'10_2.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (35, 10, N'10_3.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (36, NULL, N'36.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (37, 11, N'11_1.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (38, 11, N'11_2.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (39, 11, N'11_3.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (45, NULL, N'45.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (46, NULL, N'46.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (47, 12, N'12_1.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (48, 12, N'12_2.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (49, 12, N'12_3.png')
INSERT [HINH] ([IDHINH], [IDCAYDUOCLIEU], [TENHINH]) VALUES (76, 17, N'17_3.png')
SET IDENTITY_INSERT [HINH] OFF
GO
SET IDENTITY_INSERT [HODUOCLIEU] ON 

INSERT [HODUOCLIEU] ([IDHO], [TENHO]) VALUES (1, N'Hoa Môi ( Lamiaceae )')
INSERT [HODUOCLIEU] ([IDHO], [TENHO]) VALUES (3, N'Bách bộ (Stemonaceae)')
INSERT [HODUOCLIEU] ([IDHO], [TENHO]) VALUES (4, N'Cỏ Roi Ngựa')
INSERT [HODUOCLIEU] ([IDHO], [TENHO]) VALUES (5, N'Họ cà phê (Rubiaceae) ')
INSERT [HODUOCLIEU] ([IDHO], [TENHO]) VALUES (6, N'Ráy (Araceae)')
INSERT [HODUOCLIEU] ([IDHO], [TENHO]) VALUES (7, N'Họ Cẩm quỳ (Malvaceae)')
SET IDENTITY_INSERT [HODUOCLIEU] OFF
GO
SET IDENTITY_INSERT [LOAITAIKHOAN] ON 

INSERT [LOAITAIKHOAN] ([IDLOAI], [TENLOAI]) VALUES (1, N'ADMIN')
INSERT [LOAITAIKHOAN] ([IDLOAI], [TENLOAI]) VALUES (2, N'CLIENT')
INSERT [LOAITAIKHOAN] ([IDLOAI], [TENLOAI]) VALUES (3, N'Qu?n Tr? Viên')
INSERT [LOAITAIKHOAN] ([IDLOAI], [TENLOAI]) VALUES (4, N'Qu?n Tr? Viên')
INSERT [LOAITAIKHOAN] ([IDLOAI], [TENLOAI]) VALUES (5, N'Qu?n Tr? Viên')
INSERT [LOAITAIKHOAN] ([IDLOAI], [TENLOAI]) VALUES (6, N'Qu?n Tr? Viên')
INSERT [LOAITAIKHOAN] ([IDLOAI], [TENLOAI]) VALUES (7, N'Qu?n Tr? Viên')
INSERT [LOAITAIKHOAN] ([IDLOAI], [TENLOAI]) VALUES (8, N'Qu?n Tr? Viên')
SET IDENTITY_INSERT [LOAITAIKHOAN] OFF
GO
INSERT [NGUOIDUNG] ([SDT], [IDLOAI], [HOVATEN], [GIOITINH], [NGAYSINH], [TAIKHOAN], [MATKHAU], [EMAIL]) VALUES (N'0377327721     ', 2, N'kenz', 1, CAST(N'2000-12-02T00:00:00.000' AS DateTime), N'ken123', N'$2a$10$cP7q.QwZPOWrXM3REe5JNejKcWrX479V0T3kgtDYii38eFggGNzbC', N'kenz@gmail.com')
INSERT [NGUOIDUNG] ([SDT], [IDLOAI], [HOVATEN], [GIOITINH], [NGAYSINH], [TAIKHOAN], [MATKHAU], [EMAIL]) VALUES (N'0704932121     ', 1, N'VinhChi', 1, CAST(N'2000-04-13T00:00:00.000' AS DateTime), N'VinhZ', N'$2y$10$mLvLCWFSxvZPdQMvenVXSuMHWh3TakyeJ84XncQRI3U0iqGj7EkHW', N'vinh@gmail.com')
INSERT [NGUOIDUNG] ([SDT], [IDLOAI], [HOVATEN], [GIOITINH], [NGAYSINH], [TAIKHOAN], [MATKHAU], [EMAIL]) VALUES (N'0704938812     ', 2, N'VinhClient', 1, CAST(N'2000-12-12T00:00:00.000' AS DateTime), N'VinhClient123', N'$2a$10$W/rsmp5BwoOBAoG719k6Oe7eGz65KET91x.xLXdDuG8R79u8s3Gau', N'hochivinh0@gmail.com')
INSERT [NGUOIDUNG] ([SDT], [IDLOAI], [HOVATEN], [GIOITINH], [NGAYSINH], [TAIKHOAN], [MATKHAU], [EMAIL]) VALUES (N'0123456789     ', 2, N'Vinh Chí H?', 1, CAST(N'2000-12-09T00:00:00.000' AS DateTime), N'vinhct', N'$2a$10$x.LBszbnED/rc/eBuQuzauIwpItMS.azdEgd1QkIP6OB7//xS3vgO', N'vinhchiho@gmail.com')
GO
SET IDENTITY_INSERT [NOIPHANBO] ON 

INSERT [NOIPHANBO] ([IDNOIPHANBO], [TENNOIPHANBO]) VALUES (1, N'Vùng Núi Cao')
INSERT [NOIPHANBO] ([IDNOIPHANBO], [TENNOIPHANBO]) VALUES (2, N'Châu Á')
INSERT [NOIPHANBO] ([IDNOIPHANBO], [TENNOIPHANBO]) VALUES (3, N'Tuyên Quang')
INSERT [NOIPHANBO] ([IDNOIPHANBO], [TENNOIPHANBO]) VALUES (4, N'Yên Bái')
INSERT [NOIPHANBO] ([IDNOIPHANBO], [TENNOIPHANBO]) VALUES (5, N'Hòa Bình')
INSERT [NOIPHANBO] ([IDNOIPHANBO], [TENNOIPHANBO]) VALUES (6, N'Thái Nguyên')
INSERT [NOIPHANBO] ([IDNOIPHANBO], [TENNOIPHANBO]) VALUES (7, N'Thanh Hóa')
INSERT [NOIPHANBO] ([IDNOIPHANBO], [TENNOIPHANBO]) VALUES (13, N'Miền Nam')
INSERT [NOIPHANBO] ([IDNOIPHANBO], [TENNOIPHANBO]) VALUES (14, N'Miền Bắc')
INSERT [NOIPHANBO] ([IDNOIPHANBO], [TENNOIPHANBO]) VALUES (17, N'Hưng Yên')
INSERT [NOIPHANBO] ([IDNOIPHANBO], [TENNOIPHANBO]) VALUES (18, N'Nam Đàn')
INSERT [NOIPHANBO] ([IDNOIPHANBO], [TENNOIPHANBO]) VALUES (12, N'Phú Yên')
INSERT [NOIPHANBO] ([IDNOIPHANBO], [TENNOIPHANBO]) VALUES (19, N'Thanh Chương')
INSERT [NOIPHANBO] ([IDNOIPHANBO], [TENNOIPHANBO]) VALUES (23, N'Hậu Giang')
INSERT [NOIPHANBO] ([IDNOIPHANBO], [TENNOIPHANBO]) VALUES (15, N'Miền Trung')
INSERT [NOIPHANBO] ([IDNOIPHANBO], [TENNOIPHANBO]) VALUES (16, N'Bắc Bộ')
SET IDENTITY_INSERT [NOIPHANBO] OFF
GO
SET IDENTITY_INSERT [QUYKINH] ON 

INSERT [QUYKINH] ([IDQUYKINH], [TENQUYKINH]) VALUES (5, N'Tâm')
INSERT [QUYKINH] ([IDQUYKINH], [TENQUYKINH]) VALUES (10, N'Tỳ')
INSERT [QUYKINH] ([IDQUYKINH], [TENQUYKINH]) VALUES (11, N'Vị')
INSERT [QUYKINH] ([IDQUYKINH], [TENQUYKINH]) VALUES (7, N'Phế')
INSERT [QUYKINH] ([IDQUYKINH], [TENQUYKINH]) VALUES (8, N'Can')
INSERT [QUYKINH] ([IDQUYKINH], [TENQUYKINH]) VALUES (9, N'Đởm')
SET IDENTITY_INSERT [QUYKINH] OFF
GO
SET IDENTITY_INSERT [TENGOIKHAC] ON 

INSERT [TENGOIKHAC] ([IDTEN], [IDCAYDUOCLIEU], [TENGOI]) VALUES (19, 17, N'Cây Móc Dâu')
INSERT [TENGOIKHAC] ([IDTEN], [IDCAYDUOCLIEU], [TENGOI]) VALUES (20, NULL, N'Cây Gỏi Cá')
INSERT [TENGOIKHAC] ([IDTEN], [IDCAYDUOCLIEU], [TENGOI]) VALUES (4, 16, N'Bạc Hà Nam')
INSERT [TENGOIKHAC] ([IDTEN], [IDCAYDUOCLIEU], [TENGOI]) VALUES (5, NULL, N'Nhân Đơn Thảo')
INSERT [TENGOIKHAC] ([IDTEN], [IDCAYDUOCLIEU], [TENGOI]) VALUES (6, 9, N'Củ Ba Mươi')
INSERT [TENGOIKHAC] ([IDTEN], [IDCAYDUOCLIEU], [TENGOI]) VALUES (8, 9, N'Củ Rận Trâu')
INSERT [TENGOIKHAC] ([IDTEN], [IDCAYDUOCLIEU], [TENGOI]) VALUES (9, NULL, N'Cây Mò Trắng')
INSERT [TENGOIKHAC] ([IDTEN], [IDCAYDUOCLIEU], [TENGOI]) VALUES (10, NULL, N'Cây Bấn Trắng')
INSERT [TENGOIKHAC] ([IDTEN], [IDCAYDUOCLIEU], [TENGOI]) VALUES (12, NULL, N'Cây Lữ đồng')
INSERT [TENGOIKHAC] ([IDTEN], [IDCAYDUOCLIEU], [TENGOI]) VALUES (13, NULL, N'Giáp mãnh thảo ')
SET IDENTITY_INSERT [TENGOIKHAC] OFF
GO
SET IDENTITY_INSERT [THANHPHANHOAHOC] ON 

INSERT [THANHPHANHOAHOC] ([IDTHANHPHAN], [TENTHANHPHAN]) VALUES (1, N'Methon')
INSERT [THANHPHANHOAHOC] ([IDTHANHPHAN], [TENTHANHPHAN]) VALUES (2, N'Menthol')
INSERT [THANHPHANHOAHOC] ([IDTHANHPHAN], [TENTHANHPHAN]) VALUES (3, N'camphen')
INSERT [THANHPHANHOAHOC] ([IDTHANHPHAN], [TENTHANHPHAN]) VALUES (4, N'limonen')
INSERT [THANHPHANHOAHOC] ([IDTHANHPHAN], [TENTHANHPHAN]) VALUES (5, N'Gluxit')
INSERT [THANHPHANHOAHOC] ([IDTHANHPHAN], [TENTHANHPHAN]) VALUES (6, N'Lipit')
INSERT [THANHPHANHOAHOC] ([IDTHANHPHAN], [TENTHANHPHAN]) VALUES (7, N'Ancaloit')
INSERT [THANHPHANHOAHOC] ([IDTHANHPHAN], [TENTHANHPHAN]) VALUES (8, N'Flavonoid')
INSERT [THANHPHANHOAHOC] ([IDTHANHPHAN], [TENTHANHPHAN]) VALUES (9, N'Cumarin')
INSERT [THANHPHANHOAHOC] ([IDTHANHPHAN], [TENTHANHPHAN]) VALUES (11, N'Aldehyd')
INSERT [THANHPHANHOAHOC] ([IDTHANHPHAN], [TENTHANHPHAN]) VALUES (12, N'Acid urolic')
INSERT [THANHPHANHOAHOC] ([IDTHANHPHAN], [TENTHANHPHAN]) VALUES (13, N'B-sitosterol')
INSERT [THANHPHANHOAHOC] ([IDTHANHPHAN], [TENTHANHPHAN]) VALUES (14, N'Stigmasterol')
INSERT [THANHPHANHOAHOC] ([IDTHANHPHAN], [TENTHANHPHAN]) VALUES (15, N'Saponin')
INSERT [THANHPHANHOAHOC] ([IDTHANHPHAN], [TENTHANHPHAN]) VALUES (16, N'Coumarin')
INSERT [THANHPHANHOAHOC] ([IDTHANHPHAN], [TENTHANHPHAN]) VALUES (17, N'Saponin')
INSERT [THANHPHANHOAHOC] ([IDTHANHPHAN], [TENTHANHPHAN]) VALUES (18, N'Axit h?u co')
INSERT [THANHPHANHOAHOC] ([IDTHANHPHAN], [TENTHANHPHAN]) VALUES (19, N'Axit amin')
INSERT [THANHPHANHOAHOC] ([IDTHANHPHAN], [TENTHANHPHAN]) VALUES (20, N'Acid myristic')
INSERT [THANHPHANHOAHOC] ([IDTHANHPHAN], [TENTHANHPHAN]) VALUES (21, N'Acid stearic')
INSERT [THANHPHANHOAHOC] ([IDTHANHPHAN], [TENTHANHPHAN]) VALUES (22, N'Acid palmitic')
INSERT [THANHPHANHOAHOC] ([IDTHANHPHAN], [TENTHANHPHAN]) VALUES (23, N'Acid oleic')
INSERT [THANHPHANHOAHOC] ([IDTHANHPHAN], [TENTHANHPHAN]) VALUES (24, N'Na')
INSERT [THANHPHANHOAHOC] ([IDTHANHPHAN], [TENTHANHPHAN]) VALUES (25, N'Ca')
SET IDENTITY_INSERT [THANHPHANHOAHOC] OFF
GO
SET IDENTITY_INSERT [TINHVI] ON 

INSERT [TINHVI] ([IDTINHVI], [TENTINHVI]) VALUES (1, N'Vị Cay')
INSERT [TINHVI] ([IDTINHVI], [TENTINHVI]) VALUES (2, N'Tính Đắng')
INSERT [TINHVI] ([IDTINHVI], [TENTINHVI]) VALUES (3, N'Vị Ngọt Đắng')
INSERT [TINHVI] ([IDTINHVI], [TENTINHVI]) VALUES (4, N'Tính Cay')
INSERT [TINHVI] ([IDTINHVI], [TENTINHVI]) VALUES (5, N'Tính Mát')
INSERT [TINHVI] ([IDTINHVI], [TENTINHVI]) VALUES (6, N'Vị Đắng')
INSERT [TINHVI] ([IDTINHVI], [TENTINHVI]) VALUES (7, N'Tính Hàn')
INSERT [TINHVI] ([IDTINHVI], [TENTINHVI]) VALUES (8, N'Tính Ôn')
SET IDENTITY_INSERT [TINHVI] OFF
GO
SET IDENTITY_INSERT [TRALOI] ON 

INSERT [TRALOI] ([IDCAUTRALOI], [IDCAUHOI], [SDT], [NOIDUNGCAUTRALOI], [THOIGIANTRALOI]) VALUES (5, 9, NULL, N'<p>1</p>
', CAST(N'2022-11-18T13:07:29.607' AS DateTime))
INSERT [TRALOI] ([IDCAUTRALOI], [IDCAUHOI], [SDT], [NOIDUNGCAUTRALOI], [THOIGIANTRALOI]) VALUES (25, 27, N'0123456789     ', N'<p>M&igrave;nh ko c&oacute; biết</p>', CAST(N'2022-12-15T07:04:16.777' AS DateTime))
INSERT [TRALOI] ([IDCAUTRALOI], [IDCAUHOI], [SDT], [NOIDUNGCAUTRALOI], [THOIGIANTRALOI]) VALUES (26, 28, N'0704932121     ', N'<p>M&igrave;nh ko biết</p>', CAST(N'2022-12-15T07:26:48.643' AS DateTime))
INSERT [TRALOI] ([IDCAUTRALOI], [IDCAUHOI], [SDT], [NOIDUNGCAUTRALOI], [THOIGIANTRALOI]) VALUES (8, 12, N'0704932121     ', N'<p>12345</p>
', CAST(N'2022-11-18T13:52:14.110' AS DateTime))
INSERT [TRALOI] ([IDCAUTRALOI], [IDCAUHOI], [SDT], [NOIDUNGCAUTRALOI], [THOIGIANTRALOI]) VALUES (9, 12, N'0704932121     ', N'<p>Khum c&oacute; bi?t</p>
', CAST(N'2022-11-18T13:52:25.400' AS DateTime))
INSERT [TRALOI] ([IDCAUTRALOI], [IDCAUHOI], [SDT], [NOIDUNGCAUTRALOI], [THOIGIANTRALOI]) VALUES (11, 12, N'0704932121     ', N'<p>123</p>
', CAST(N'2022-11-21T14:36:42.820' AS DateTime))
INSERT [TRALOI] ([IDCAUTRALOI], [IDCAUHOI], [SDT], [NOIDUNGCAUTRALOI], [THOIGIANTRALOI]) VALUES (12, 12, N'0704932121     ', N'<p>123</p>
', CAST(N'2022-11-21T14:37:00.207' AS DateTime))
INSERT [TRALOI] ([IDCAUTRALOI], [IDCAUHOI], [SDT], [NOIDUNGCAUTRALOI], [THOIGIANTRALOI]) VALUES (13, 19, N'0704938812     ', N'<p>hi g&igrave; b&agrave;</p>
', CAST(N'2022-11-21T14:40:04.013' AS DateTime))
INSERT [TRALOI] ([IDCAUTRALOI], [IDCAUHOI], [SDT], [NOIDUNGCAUTRALOI], [THOIGIANTRALOI]) VALUES (14, 24, N'0704932121     ', N'<p>Kh&ocirc;ng Bi?t n?a</p>', CAST(N'2022-12-13T17:05:59.353' AS DateTime))
INSERT [TRALOI] ([IDCAUTRALOI], [IDCAUHOI], [SDT], [NOIDUNGCAUTRALOI], [THOIGIANTRALOI]) VALUES (15, 24, N'0704932121     ', N'<p>Tra google xem</p>', CAST(N'2022-12-13T17:15:52.257' AS DateTime))
INSERT [TRALOI] ([IDCAUTRALOI], [IDCAUHOI], [SDT], [NOIDUNGCAUTRALOI], [THOIGIANTRALOI]) VALUES (27, 28, N'0123456789     ', N'<p>sdsd</p>', CAST(N'2022-12-16T17:36:37.730' AS DateTime))
INSERT [TRALOI] ([IDCAUTRALOI], [IDCAUHOI], [SDT], [NOIDUNGCAUTRALOI], [THOIGIANTRALOI]) VALUES (17, 25, N'0704932121     ', N'<p>Xin h?i th&ecirc;m l&agrave; b&agrave;i thu?c n?m ng?c c?u, h&agrave; th? &ocirc;, rau m&aacute; th&igrave; n&ecirc;n s?c u?ng hay ng&acirc;m ru?u v&agrave; t? l? nhu th? n&agrave;o.</p>', CAST(N'2022-12-13T17:31:32.657' AS DateTime))
INSERT [TRALOI] ([IDCAUTRALOI], [IDCAUHOI], [SDT], [NOIDUNGCAUTRALOI], [THOIGIANTRALOI]) VALUES (19, 25, N'0704932121     ', N'<p>Bạn n&ecirc;n đi kh&aacute;m b&aacute;c sĩ cho chắc nh&eacute;</p>', CAST(N'2022-12-13T21:27:09.597' AS DateTime))
INSERT [TRALOI] ([IDCAUTRALOI], [IDCAUHOI], [SDT], [NOIDUNGCAUTRALOI], [THOIGIANTRALOI]) VALUES (20, 24, N'0704932121     ', N'<p>Hỏi chuy&ecirc;n gia cho chắc nhe bạn</p>', CAST(N'2022-12-13T21:27:51.993' AS DateTime))
INSERT [TRALOI] ([IDCAUTRALOI], [IDCAUHOI], [SDT], [NOIDUNGCAUTRALOI], [THOIGIANTRALOI]) VALUES (21, 26, N'0704932121     ', N'<p>Khum c&oacute; biết</p>', CAST(N'2022-12-13T21:31:02.517' AS DateTime))
INSERT [TRALOI] ([IDCAUTRALOI], [IDCAUHOI], [SDT], [NOIDUNGCAUTRALOI], [THOIGIANTRALOI]) VALUES (22, 26, N'0704932121     ', N'<p>.</p>', CAST(N'2022-12-13T21:36:26.947' AS DateTime))
INSERT [TRALOI] ([IDCAUTRALOI], [IDCAUHOI], [SDT], [NOIDUNGCAUTRALOI], [THOIGIANTRALOI]) VALUES (23, 26, N'0704932121     ', N'<p>.</p>', CAST(N'2022-12-13T21:36:57.327' AS DateTime))
INSERT [TRALOI] ([IDCAUTRALOI], [IDCAUHOI], [SDT], [NOIDUNGCAUTRALOI], [THOIGIANTRALOI]) VALUES (10, 12, N'0704932121     ', N'<p>H?i ngu?i kh&aacute;c di</p>
', CAST(N'2022-11-18T13:52:50.133' AS DateTime))
SET IDENTITY_INSERT [TRALOI] OFF
GO
ALTER TABLE [BAIVIET] ADD  CONSTRAINT [PK_BAIVIET] PRIMARY KEY NONCLUSTERED 
(
	[IDBAIVIET] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [BENH] ADD  CONSTRAINT [PK_BENH] PRIMARY KEY NONCLUSTERED 
(
	[IDBENH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [BINHLUAN] ADD  CONSTRAINT [PK_BINHLUAN] PRIMARY KEY NONCLUSTERED 
(
	[IDBINHLUAN] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [BOPHANSUDUNG] ADD  CONSTRAINT [PK_BOPHANSUDUNG] PRIMARY KEY NONCLUSTERED 
(
	[IDBOPHAN] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [CAUHOI] ADD  CONSTRAINT [PK_CAUHOI] PRIMARY KEY NONCLUSTERED 
(
	[IDCAUHOI] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [CAYDUOCLIEU] ADD  CONSTRAINT [PK_CAYDUOCLIEU] PRIMARY KEY NONCLUSTERED 
(
	[IDCAYDUOCLIEU] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [CHUDE] ADD  CONSTRAINT [PK_CHUDE] PRIMARY KEY NONCLUSTERED 
(
	[IDCHUDE] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [CONGDUNG] ADD  CONSTRAINT [PK_CONGDUNG] PRIMARY KEY NONCLUSTERED 
(
	[IDCONGDUNG] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [DUOCLIEU_BENH] ADD  CONSTRAINT [PK_DUOCLIEU_BENH] PRIMARY KEY NONCLUSTERED 
(
	[IDBENH] ASC,
	[IDCAYDUOCLIEU] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [DUOCLIEU_BOPHANSUDUNG] ADD  CONSTRAINT [PK_DUOCLIEU_BOPHANSUDUNG] PRIMARY KEY NONCLUSTERED 
(
	[IDBOPHAN] ASC,
	[IDCAYDUOCLIEU] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [DUOCLIEU_CONGDUNG] ADD  CONSTRAINT [PK_DUOCLIEU_CONGDUNG] PRIMARY KEY NONCLUSTERED 
(
	[IDCONGDUNG] ASC,
	[IDCAYDUOCLIEU] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [DUOCLIEU_PHANBO] ADD  CONSTRAINT [PK_DUOCLIEU_PHANBO] PRIMARY KEY NONCLUSTERED 
(
	[IDNOIPHANBO] ASC,
	[IDCAYDUOCLIEU] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [DUOCLIEU_QUYKINH] ADD  CONSTRAINT [PK_DUOCLIEU_QUYKINH] PRIMARY KEY NONCLUSTERED 
(
	[IDQUYKINH] ASC,
	[IDCAYDUOCLIEU] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [DUOCLIEU_THANHPHAN] ADD  CONSTRAINT [PK_DUOCLIEU_THANHPHAN] PRIMARY KEY NONCLUSTERED 
(
	[IDTHANHPHAN] ASC,
	[IDCAYDUOCLIEU] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [DUOCLIEU_TINHVI] ADD  CONSTRAINT [PK_DUOCLIEU_TINHVI] PRIMARY KEY NONCLUSTERED 
(
	[IDTINHVI] ASC,
	[IDCAYDUOCLIEU] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [HINH] ADD  CONSTRAINT [PK_HINH] PRIMARY KEY NONCLUSTERED 
(
	[IDHINH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [HODUOCLIEU] ADD  CONSTRAINT [PK_HODUOCLIEU] PRIMARY KEY NONCLUSTERED 
(
	[IDHO] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [LOAITAIKHOAN] ADD  CONSTRAINT [PK_LOAITAIKHOAN] PRIMARY KEY NONCLUSTERED 
(
	[IDLOAI] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
ALTER TABLE [NGUOIDUNG] ADD  CONSTRAINT [PK_NGUOIDUNG] PRIMARY KEY NONCLUSTERED 
(
	[SDT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
ALTER TABLE [NGUOIDUNG] ADD UNIQUE NONCLUSTERED 
(
	[TAIKHOAN] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [NOIPHANBO] ADD  CONSTRAINT [PK_NOIPHANBO] PRIMARY KEY NONCLUSTERED 
(
	[IDNOIPHANBO] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [QUYKINH] ADD  CONSTRAINT [PK_QUYKINH] PRIMARY KEY NONCLUSTERED 
(
	[IDQUYKINH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [TENGOIKHAC] ADD  CONSTRAINT [PK_TENGOIKHAC] PRIMARY KEY NONCLUSTERED 
(
	[IDTEN] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [THANHPHANHOAHOC] ADD  CONSTRAINT [PK_THANHPHANHOAHOC] PRIMARY KEY NONCLUSTERED 
(
	[IDTHANHPHAN] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [TINHVI] ADD  CONSTRAINT [PK_TINHVI] PRIMARY KEY NONCLUSTERED 
(
	[IDTINHVI] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [TRALOI] ADD  CONSTRAINT [PK_TRALOI] PRIMARY KEY NONCLUSTERED 
(
	[IDCAUTRALOI] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [BAIVIET] ADD  DEFAULT ((0)) FOR [TRAGNGTHAI]
GO
ALTER TABLE [CAUHOI] ADD  DEFAULT ((0)) FOR [trangthai]
GO
ALTER TABLE [BAIVIET]  WITH CHECK ADD FOREIGN KEY([idhinh])
REFERENCES [HINH] ([IDHINH])
GO
ALTER TABLE [BAOCAO]  WITH CHECK ADD FOREIGN KEY([idcautraloi])
REFERENCES [TRALOI] ([IDCAUTRALOI])
ON DELETE CASCADE
GO
ALTER TABLE [CAUHOI]  WITH CHECK ADD FOREIGN KEY([idhinh])
REFERENCES [HINH] ([IDHINH])
GO
ALTER TABLE [HINH]  WITH CHECK ADD FOREIGN KEY([IDCAYDUOCLIEU])
REFERENCES [CAYDUOCLIEU] ([IDCAYDUOCLIEU])
ON DELETE CASCADE
GO
ALTER TABLE [TENGOIKHAC]  WITH CHECK ADD FOREIGN KEY([IDCAYDUOCLIEU])
REFERENCES [CAYDUOCLIEU] ([IDCAYDUOCLIEU])
ON DELETE CASCADE
GO
USE [master]
GO
ALTER DATABASE [tracuucayduoclieu_v2] SET  READ_WRITE 
GO
