package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextHFive: ImageVector
    get() {
        if (_textHFive != null) return _textHFive!!
        _textHFive = phosphorFillIcon(
            name = "TextHFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 128.000 160.000 C 128.000 164.418 124.418 168.000 120.000 168.000 C 115.582 168.000 112.000 164.418 112.000 160.000 L 112.000 128.000 L 72.000 128.000 L 72.000 160.000 C 72.000 164.418 68.418 168.000 64.000 168.000 C 59.582 168.000 56.000 164.418 56.000 160.000 L 56.000 80.000 C 56.000 75.582 59.582 72.000 64.000 72.000 C 68.418 72.000 72.000 75.582 72.000 80.000 L 72.000 112.000 L 112.000 112.000 L 112.000 80.000 C 112.000 75.582 115.582 72.000 120.000 72.000 C 124.418 72.000 128.000 75.582 128.000 80.000 ZM 168.000 120.000 C 182.263 120.002 194.802 129.443 198.747 143.150 C 202.691 156.856 197.089 171.518 185.010 179.102 C 172.930 186.685 157.290 185.359 146.660 175.850 C 143.452 172.885 143.215 167.894 146.129 164.639 C 149.043 161.384 154.029 161.068 157.330 163.930 C 163.762 169.603 173.524 169.195 179.461 163.005 C 185.397 156.815 185.397 147.045 179.461 140.855 C 173.524 134.665 163.762 134.257 157.330 139.930 C 154.753 142.242 150.982 142.635 147.984 140.903 C 144.987 139.171 143.443 135.707 144.160 132.320 L 152.160 94.320 C 152.953 90.626 156.222 87.991 160.000 88.000 L 192.000 88.000 C 196.418 88.000 200.000 91.582 200.000 96.000 C 200.000 100.418 196.418 104.000 192.000 104.000 L 166.490 104.000 L 163.000 120.370 C 164.655 120.124 166.327 120.000 168.000 120.000 Z"),
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
        return _textHFive!!
    }

private var _textHFive: ImageVector? = null
