package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatCircleSlash: ImageVector
    get() {
        if (_chatCircleSlash != null) return _chatCircleSlash!!
        _chatCircleSlash = phosphorBoldIcon(
            name = "ChatCircleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 56.880 31.930 C 54.012 28.697 49.628 27.256 45.401 28.157 C 41.175 29.058 37.759 32.162 36.459 36.284 C 35.159 40.405 36.175 44.907 39.120 48.070 L 46.930 56.660 C 17.627 89.943 11.647 137.755 31.850 177.230 L 21.000 209.660 C 18.573 216.861 20.437 224.816 25.810 230.190 C 31.184 235.563 39.139 237.427 46.340 235.000 L 78.770 224.190 C 114.934 242.681 158.411 239.336 191.320 215.530 L 199.120 224.110 C 203.598 228.920 211.111 229.234 215.974 224.814 C 220.837 220.395 221.241 212.886 216.880 207.970 ZM 128.000 212.000 C 113.253 211.999 98.766 208.112 86.000 200.730 C 83.022 199.004 79.445 198.639 76.180 199.730 L 46.390 209.660 L 56.320 179.870 C 57.411 176.605 57.046 173.028 55.320 170.050 C 37.773 139.684 40.938 101.611 63.260 74.560 L 175.100 197.560 C 161.201 206.982 144.792 212.013 128.000 212.000 ZM 236.000 128.000 C 236.028 142.574 233.085 157.001 227.350 170.400 C 224.626 176.282 217.723 178.938 211.759 176.398 C 205.795 173.857 202.926 167.040 205.280 161.000 C 218.108 130.784 212.177 95.866 190.091 71.581 C 168.004 47.297 133.804 38.088 102.510 48.000 C 96.229 49.901 89.585 46.404 87.597 40.150 C 85.609 33.896 89.014 27.204 95.240 25.130 C 128.065 14.717 163.888 20.571 191.692 40.890 C 219.496 61.210 235.952 93.563 236.000 128.000 Z"),
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
        return _chatCircleSlash!!
    }

private var _chatCircleSlash: ImageVector? = null
