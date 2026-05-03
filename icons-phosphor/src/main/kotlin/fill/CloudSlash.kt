package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CloudSlash: ImageVector
    get() {
        if (_cloudSlash != null) return _cloudSlash!!
        _cloudSlash = phosphorFillIcon(
            name = "CloudSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 128.720 C 247.828 151.710 238.639 173.715 222.410 190.000 C 221.634 190.765 220.580 191.180 219.491 191.150 C 218.402 191.120 217.372 190.647 216.640 189.840 L 103.780 65.670 C 103.046 64.864 102.673 63.794 102.747 62.707 C 102.820 61.620 103.334 60.610 104.170 59.910 C 120.141 46.812 140.217 39.762 160.870 40.000 C 209.150 40.470 248.380 80.430 248.000 128.720 ZM 53.920 34.620 C 52.008 32.465 49.085 31.504 46.267 32.105 C 43.450 32.706 41.173 34.775 40.306 37.522 C 39.439 40.270 40.117 43.271 42.080 45.380 L 81.330 88.560 L 81.270 88.670 C 62.699 85.949 43.871 91.517 29.767 103.900 C 15.662 116.283 7.705 134.234 8.000 153.000 C 8.530 188.120 37.840 216.000 73.000 216.000 L 160.000 216.000 C 170.871 216.005 181.647 213.987 191.780 210.050 L 202.080 221.380 C 203.511 222.956 205.511 223.897 207.637 223.995 C 209.763 224.092 211.841 223.339 213.410 221.900 C 216.581 218.759 216.709 213.676 213.700 210.380 Z"),
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
        return _cloudSlash!!
    }

private var _cloudSlash: ImageVector? = null
