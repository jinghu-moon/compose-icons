package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) return _thumbsUp!!
        _thumbsUp = phosphorThinIcon(
            name = "ThumbsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 231.000 82.760 C 227.201 78.459 221.738 75.997 216.000 76.000 L 156.000 76.000 L 156.000 56.000 C 156.000 36.118 139.882 20.000 120.000 20.000 C 118.484 19.999 117.098 20.855 116.420 22.210 L 77.530 100.000 L 32.000 100.000 C 25.373 100.000 20.000 105.373 20.000 112.000 L 20.000 200.000 C 20.000 206.627 25.373 212.000 32.000 212.000 L 204.000 212.000 C 214.088 212.002 222.599 204.491 223.850 194.480 L 235.850 98.480 C 236.563 92.787 234.797 87.062 231.000 82.760 ZM 76.000 204.000 L 32.000 204.000 C 29.791 204.000 28.000 202.209 28.000 200.000 L 28.000 112.000 C 28.000 109.791 29.791 108.000 32.000 108.000 L 76.000 108.000 ZM 227.910 97.490 L 215.910 193.490 C 215.158 199.496 210.052 204.001 204.000 204.000 L 84.000 204.000 L 84.000 104.940 L 122.420 28.100 C 136.893 29.356 148.002 41.472 148.000 56.000 L 148.000 80.000 C 148.000 82.209 149.791 84.000 152.000 84.000 L 216.000 84.000 C 219.443 83.999 222.720 85.477 224.999 88.058 C 227.277 90.639 228.337 94.074 227.910 97.490 Z"),
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
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
