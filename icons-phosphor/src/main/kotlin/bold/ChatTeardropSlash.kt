package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatTeardropSlash: ImageVector
    get() {
        if (_chatTeardropSlash != null) return _chatTeardropSlash!!
        _chatTeardropSlash = phosphorBoldIcon(
            name = "ChatTeardropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 56.880 31.930 C 54.012 28.697 49.628 27.256 45.401 28.157 C 41.175 29.058 37.759 32.162 36.459 36.284 C 35.159 40.405 36.175 44.907 39.120 48.070 L 50.000 60.000 C 35.693 78.260 27.944 100.802 28.000 124.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 132.000 228.000 C 151.794 227.974 171.171 222.317 187.870 211.690 L 199.120 224.070 C 203.598 228.880 211.111 229.194 215.974 224.774 C 220.837 220.355 221.241 212.846 216.880 207.930 ZM 132.000 204.000 L 52.000 204.000 L 52.000 124.000 C 51.971 107.587 57.022 91.568 66.460 78.140 L 171.460 193.630 C 159.440 200.479 145.834 204.054 132.000 204.000 ZM 236.000 124.000 C 236.044 139.689 232.501 155.181 225.640 169.290 C 222.752 175.266 215.566 177.768 209.590 174.880 C 203.614 171.992 201.112 164.806 204.000 158.830 C 209.284 147.981 212.020 136.068 212.000 124.000 C 211.967 97.821 199.139 73.312 177.647 58.365 C 156.155 43.418 128.714 39.921 104.160 49.000 C 97.961 51.252 91.107 48.079 88.812 41.896 C 86.518 35.713 89.643 28.837 95.810 26.500 C 127.730 14.687 163.409 19.229 191.351 38.662 C 219.293 58.096 235.967 89.964 236.000 124.000 Z"),
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
        return _chatTeardropSlash!!
    }

private var _chatTeardropSlash: ImageVector? = null
