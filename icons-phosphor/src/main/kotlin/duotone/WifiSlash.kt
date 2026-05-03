package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WifiSlash: ImageVector
    get() {
        if (_wifiSlash != null) return _wifiSlash!!
        _wifiSlash = phosphorDuotoneIcon(
            name = "WifiSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 238.200 87.690 L 134.200 213.120 C 132.680 214.947 130.427 216.004 128.050 216.004 C 125.673 216.004 123.420 214.947 121.900 213.120 L 17.800 87.690 C 16.436 86.050 15.804 83.923 16.052 81.804 C 16.299 79.686 17.405 77.761 19.110 76.480 C 83.555 27.839 172.445 27.839 236.890 76.480 C 238.595 77.761 239.701 79.686 239.948 81.804 C 240.196 83.923 239.564 86.050 238.200 87.690 Z"),
                    pathFillType = PathFillType.NonZero,
                    fill = SolidColor(Color(0xFF000000)),
                    fillAlpha = 1f,
                    stroke = null,
                    strokeAlpha = 1f,
                    strokeLineWidth = 0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                )
            }
            addPath(
                pathData = parseSvgPathData("M 53.920 34.620 C 52.008 32.465 49.085 31.504 46.267 32.105 C 43.450 32.706 41.173 34.775 40.306 37.522 C 39.439 40.270 40.117 43.271 42.080 45.380 L 46.630 50.380 C 35.210 55.847 24.372 62.454 14.280 70.100 C 10.842 72.717 8.616 76.619 8.110 80.910 C 7.602 85.192 8.882 89.494 11.650 92.800 L 115.650 218.230 C 118.694 221.906 123.227 224.024 128.000 224.000 L 128.000 224.000 C 132.759 224.012 137.275 221.896 140.310 218.230 L 168.410 184.350 L 202.080 221.350 C 203.992 223.505 206.915 224.466 209.733 223.865 C 212.550 223.264 214.827 221.195 215.694 218.448 C 216.561 215.700 215.883 212.699 213.920 210.590 ZM 128.000 208.000 L 24.090 82.740 C 34.562 74.817 45.910 68.123 57.910 62.790 L 157.540 172.390 ZM 244.350 92.800 L 194.930 152.380 C 192.111 155.782 187.067 156.254 183.665 153.435 C 180.263 150.616 179.791 145.572 182.610 142.170 L 231.910 82.740 C 202.029 60.061 165.512 47.852 128.000 48.000 C 117.134 47.993 106.290 48.997 95.610 51.000 C 91.269 51.828 87.078 48.981 86.250 44.640 C 85.422 40.299 88.269 36.108 92.610 35.280 C 104.279 33.087 116.127 31.989 128.000 32.000 C 169.066 31.846 209.036 45.237 241.720 70.100 C 245.158 72.717 247.384 76.619 247.890 80.910 C 248.398 85.192 247.118 89.494 244.350 92.800 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _wifiSlash!!
    }

private var _wifiSlash: ImageVector? = null
