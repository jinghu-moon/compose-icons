package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChatTeardropSlash: ImageVector
    get() {
        if (_chatTeardropSlash != null) return _chatTeardropSlash!!
        _chatTeardropSlash = phosphorRegularIcon(
            name = "ChatTeardropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 53.920 34.620 C 52.008 32.465 49.085 31.504 46.267 32.105 C 43.450 32.706 41.173 34.775 40.306 37.522 C 39.439 40.270 40.117 43.271 42.080 45.380 L 55.260 59.880 C 40.186 77.840 31.947 100.552 32.000 124.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 132.000 224.000 C 152.177 223.974 171.878 217.865 188.530 206.470 L 202.080 221.380 C 203.992 223.535 206.915 224.496 209.733 223.895 C 212.550 223.294 214.827 221.225 215.694 218.478 C 216.561 215.730 215.883 212.729 213.920 210.620 ZM 132.000 208.000 L 48.000 208.000 L 48.000 124.000 C 47.958 105.061 54.358 86.670 66.150 71.850 L 177.660 194.510 C 164.084 203.369 148.211 208.059 132.000 208.000 ZM 232.000 124.000 C 232.013 142.203 227.051 160.063 217.650 175.650 C 215.364 179.433 210.443 180.646 206.660 178.360 C 202.877 176.074 201.664 171.153 203.950 167.370 C 223.141 135.571 219.171 94.945 194.187 67.463 C 169.204 39.981 129.138 32.168 95.660 48.250 C 91.678 50.166 86.896 48.492 84.980 44.510 C 83.064 40.528 84.738 35.746 88.720 33.830 C 119.710 18.952 156.169 21.034 185.263 39.344 C 214.357 57.654 232.007 89.624 232.000 124.000 Z"),
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
        return _chatTeardropSlash!!
    }

private var _chatTeardropSlash: ImageVector? = null
