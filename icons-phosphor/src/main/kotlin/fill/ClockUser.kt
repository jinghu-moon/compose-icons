package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ClockUser: ImageVector
    get() {
        if (_clockUser != null) return _clockUser!!
        _clockUser = phosphorFillIcon(
            name = "ClockUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 136.000 72.000 L 136.000 115.060 L 172.420 96.840 C 176.374 94.863 181.183 96.466 183.160 100.420 C 185.137 104.374 183.534 109.183 179.580 111.160 L 131.580 135.160 C 129.099 136.401 126.152 136.269 123.793 134.810 C 121.433 133.351 119.998 130.774 120.000 128.000 L 120.000 72.000 C 120.000 67.582 123.582 64.000 128.000 64.000 C 132.418 64.000 136.000 67.582 136.000 72.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 216.000 132.418 219.582 136.000 224.000 136.000 C 228.418 136.000 232.000 132.418 232.000 128.000 C 232.000 70.562 185.438 24.000 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 132.418 232.000 136.000 228.418 136.000 224.000 C 136.000 219.582 132.418 216.000 128.000 216.000 ZM 214.620 198.620 C 223.776 189.470 226.518 175.704 221.566 163.744 C 216.614 151.784 204.945 143.985 192.000 143.985 C 179.055 143.985 167.386 151.784 162.434 163.744 C 157.482 175.704 160.224 189.470 169.380 198.620 C 160.956 204.002 154.851 212.342 152.270 222.000 C 151.652 224.393 152.175 226.937 153.687 228.893 C 155.198 230.848 157.529 231.995 160.000 232.000 L 224.000 232.000 C 226.485 232.000 228.829 230.845 230.343 228.874 C 231.858 226.904 232.370 224.341 231.730 221.940 C 229.135 212.305 223.032 203.987 214.620 198.620 Z"),
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
        return _clockUser!!
    }

private var _clockUser: ImageVector? = null
