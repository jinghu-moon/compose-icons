package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GoogleLogo: ImageVector
    get() {
        if (_googleLogo != null) return _googleLogo!!
        _googleLogo = phosphorThinIcon(
            name = "GoogleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.000 128.000 C 219.979 172.720 187.802 210.948 143.742 218.600 C 99.681 226.252 56.500 201.111 41.402 159.016 C 26.304 116.922 43.663 70.068 82.543 47.971 C 121.423 25.875 170.561 34.938 199.000 69.450 C 200.408 71.154 200.169 73.677 198.465 75.085 C 196.761 76.493 194.238 76.254 192.830 74.550 C 167.102 43.331 122.775 34.885 87.369 54.456 C 51.964 74.027 35.537 116.055 48.288 154.448 C 61.039 192.841 99.344 216.691 139.424 211.193 C 179.503 205.694 209.970 172.408 211.910 132.000 L 128.000 132.000 C 125.791 132.000 124.000 130.209 124.000 128.000 C 124.000 125.791 125.791 124.000 128.000 124.000 L 216.000 124.000 C 218.209 124.000 220.000 125.791 220.000 128.000 Z"),
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
