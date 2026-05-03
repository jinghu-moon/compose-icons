package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GoogleLogo: ImageVector
    get() {
        if (_googleLogo != null) return _googleLogo!!
        _googleLogo = phosphorBoldIcon(
            name = "GoogleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 128.000 C 227.998 176.608 193.042 218.174 145.155 226.513 C 97.268 234.851 50.320 207.547 33.888 161.801 C 17.455 116.055 36.298 65.118 78.546 41.080 C 120.794 17.041 174.208 26.864 205.140 64.360 C 209.359 69.471 208.636 77.036 203.525 81.255 C 198.414 85.474 190.849 84.751 186.630 79.640 C 163.843 52.017 124.865 44.047 93.065 60.509 C 61.264 76.971 45.268 113.398 54.668 147.952 C 64.068 182.505 96.312 205.809 132.070 203.893 C 167.828 201.977 197.397 175.360 203.050 140.000 L 128.000 140.000 C 121.373 140.000 116.000 134.627 116.000 128.000 C 116.000 121.373 121.373 116.000 128.000 116.000 L 216.000 116.000 C 222.627 116.000 228.000 121.373 228.000 128.000 Z"),
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
        return _googleLogo!!
    }

private var _googleLogo: ImageVector? = null
