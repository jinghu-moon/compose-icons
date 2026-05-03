package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Beanie: ImageVector
    get() {
        if (_beanie != null) return _beanie!!
        _beanie = phosphorBoldIcon(
            name = "Beanie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 160.000 L 228.000 144.000 C 227.947 100.144 199.371 61.421 157.480 48.440 C 163.108 35.050 159.012 19.549 147.504 10.687 C 135.997 1.825 119.963 1.825 108.456 10.687 C 96.948 19.549 92.852 35.050 98.480 48.440 C 56.605 61.436 28.048 100.155 28.000 144.000 L 28.000 160.000 C 22.964 163.777 20.000 169.705 20.000 176.000 L 20.000 208.000 C 20.000 219.046 28.954 228.000 40.000 228.000 L 216.000 228.000 C 227.046 228.000 236.000 219.046 236.000 208.000 L 236.000 176.000 C 236.000 169.705 233.036 163.777 228.000 160.000 ZM 120.000 36.000 C 120.000 31.582 123.582 28.000 128.000 28.000 C 132.418 28.000 136.000 31.582 136.000 36.000 C 136.000 40.418 132.418 44.000 128.000 44.000 C 123.582 44.000 120.000 40.418 120.000 36.000 ZM 128.000 68.000 C 169.955 68.044 203.956 102.045 204.000 144.000 L 204.000 156.000 L 52.000 156.000 L 52.000 144.000 C 52.044 102.045 86.045 68.044 128.000 68.000 ZM 116.000 180.000 L 116.000 204.000 L 84.000 204.000 L 84.000 180.000 ZM 140.000 180.000 L 172.000 180.000 L 172.000 204.000 L 140.000 204.000 ZM 44.000 180.000 L 60.000 180.000 L 60.000 204.000 L 44.000 204.000 ZM 212.000 204.000 L 196.000 204.000 L 196.000 180.000 L 212.000 180.000 Z"),
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
        return _beanie!!
    }

private var _beanie: ImageVector? = null
