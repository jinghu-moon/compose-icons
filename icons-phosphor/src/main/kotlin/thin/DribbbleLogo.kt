package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DribbbleLogo: ImageVector
    get() {
        if (_dribbbleLogo != null) return _dribbbleLogo!!
        _dribbbleLogo = phosphorThinIcon(
            name = "DribbbleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 219.920 124.430 C 216.000 124.150 212.000 124.000 208.000 124.000 C 192.240 124.004 176.563 126.274 161.450 130.740 C 157.791 118.970 152.813 107.651 146.610 97.000 C 146.120 96.180 145.610 95.360 145.110 94.540 C 161.526 85.198 176.206 73.090 188.500 58.750 C 207.579 75.377 218.948 99.142 219.920 124.430 ZM 182.250 53.750 C 170.499 67.416 156.472 78.947 140.790 87.830 C 128.523 69.743 112.785 54.274 94.490 42.320 C 123.771 30.858 156.881 35.170 182.250 53.750 ZM 85.780 46.280 C 104.777 57.831 121.104 73.286 133.680 91.620 C 112.041 102.418 88.184 108.027 64.000 108.000 C 55.517 108.017 47.046 107.348 38.670 106.000 C 45.065 80.250 62.227 58.495 85.780 46.280 ZM 36.000 128.000 C 36.001 123.245 36.368 118.498 37.100 113.800 C 45.992 115.264 54.988 116.000 64.000 116.000 C 89.725 116.030 115.095 109.994 138.050 98.380 C 138.600 99.280 139.160 100.170 139.690 101.080 C 145.602 111.214 150.346 121.986 153.830 133.190 C 144.261 136.525 135.024 140.747 126.240 145.800 C 103.497 158.922 84.216 177.285 70.000 199.360 C 48.486 181.917 35.993 155.697 36.000 128.000 ZM 76.440 204.160 C 89.994 182.954 108.446 165.316 130.240 152.730 C 138.445 148.006 147.068 144.049 156.000 140.910 C 159.249 153.581 160.896 166.609 160.900 179.690 C 160.900 191.705 159.521 203.680 156.790 215.380 C 129.710 224.305 100.021 220.160 76.420 204.160 ZM 165.740 211.900 C 167.852 201.293 168.917 190.505 168.920 179.690 C 168.916 165.768 167.141 151.904 163.640 138.430 C 178.041 134.168 192.981 132.003 208.000 132.000 C 212.000 132.000 215.940 132.150 219.880 132.450 C 218.169 166.994 197.264 197.672 165.740 211.900 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _dribbbleLogo!!
    }

private var _dribbbleLogo: ImageVector? = null
