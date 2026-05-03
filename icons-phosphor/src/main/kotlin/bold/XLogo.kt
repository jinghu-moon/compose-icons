package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.XLogo: ImageVector
    get() {
        if (_xLogo != null) return _xLogo!!
        _xLogo = phosphorBoldIcon(
            name = "XLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 218.120 209.560 L 157.120 113.760 L 216.840 48.070 C 221.201 43.154 220.797 35.645 215.934 31.226 C 211.071 26.806 203.558 27.120 199.080 31.930 L 143.810 92.770 L 106.120 33.560 C 103.919 30.099 100.102 28.002 96.000 28.000 L 48.000 28.000 C 43.622 28.002 39.592 30.388 37.486 34.227 C 35.379 38.065 35.530 42.746 37.880 46.440 L 98.880 142.240 L 39.120 207.930 C 36.175 211.093 35.159 215.595 36.459 219.716 C 37.759 223.838 41.175 226.942 45.401 227.843 C 49.628 228.744 54.012 227.303 56.880 224.070 L 112.190 163.230 L 149.880 222.440 C 152.081 225.901 155.898 227.998 160.000 228.000 L 208.000 228.000 C 212.378 227.998 216.408 225.612 218.514 221.773 C 220.621 217.935 220.470 213.254 218.120 209.560 ZM 166.590 204.000 L 69.860 52.000 L 89.410 52.000 L 186.140 204.000 Z"),
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
        return _xLogo!!
    }

private var _xLogo: ImageVector? = null
