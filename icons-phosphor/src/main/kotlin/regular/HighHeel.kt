package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HighHeel: ImageVector
    get() {
        if (_highHeel != null) return _highHeel!!
        _highHeel = phosphorRegularIcon(
            name = "HighHeel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 231.000 156.190 L 180.000 144.700 L 69.660 34.340 C 68.116 32.796 66.007 31.951 63.824 32.000 C 61.641 32.049 59.573 32.988 58.100 34.600 C 36.110 58.640 24.000 89.000 24.000 120.000 L 24.000 192.000 C 24.000 200.837 31.163 208.000 40.000 208.000 L 72.000 208.000 C 80.837 208.000 88.000 200.837 88.000 192.000 L 88.000 143.060 C 90.490 144.510 92.940 146.060 95.340 147.700 C 113.500 160.163 127.600 177.685 135.890 198.090 C 138.341 204.116 144.215 208.041 150.720 208.000 L 240.000 208.000 C 248.837 208.000 256.000 200.837 256.000 192.000 L 256.000 187.270 C 256.038 172.311 245.619 159.359 231.000 156.190 ZM 72.000 192.000 L 40.000 192.000 L 40.000 128.290 C 50.961 129.065 61.745 131.464 72.000 135.410 ZM 240.000 192.000 L 150.680 192.000 C 141.212 168.732 125.124 148.753 104.410 134.540 C 85.454 121.436 63.288 113.740 40.290 112.280 C 42.094 90.145 50.516 69.065 64.460 51.780 L 170.340 157.660 C 171.412 158.728 172.764 159.470 174.240 159.800 L 227.480 171.800 C 234.797 173.357 240.022 179.829 240.000 187.310 Z"),
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
        return _highHeel!!
    }

private var _highHeel: ImageVector? = null
