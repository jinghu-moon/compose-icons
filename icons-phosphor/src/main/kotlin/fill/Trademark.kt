package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Trademark: ImageVector
    get() {
        if (_trademark != null) return _trademark!!
        _trademark = phosphorFillIcon(
            name = "Trademark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 104.000 112.000 L 96.000 112.000 L 96.000 152.000 C 96.000 156.418 92.418 160.000 88.000 160.000 C 83.582 160.000 80.000 156.418 80.000 152.000 L 80.000 112.000 L 72.000 112.000 C 67.582 112.000 64.000 108.418 64.000 104.000 C 64.000 99.582 67.582 96.000 72.000 96.000 L 104.000 96.000 C 108.418 96.000 112.000 99.582 112.000 104.000 C 112.000 108.418 108.418 112.000 104.000 112.000 ZM 192.000 152.000 C 192.000 156.418 188.418 160.000 184.000 160.000 C 179.582 160.000 176.000 156.418 176.000 152.000 L 176.000 125.290 L 162.000 141.290 C 160.481 143.012 158.296 143.999 156.000 143.999 C 153.704 143.999 151.519 143.012 150.000 141.290 L 136.000 125.290 L 136.000 152.000 C 136.000 156.418 132.418 160.000 128.000 160.000 C 123.582 160.000 120.000 156.418 120.000 152.000 L 120.000 104.000 C 120.009 100.677 122.071 97.705 125.182 96.534 C 128.292 95.364 131.802 96.238 134.000 98.730 L 156.000 123.850 L 178.000 98.730 C 180.198 96.238 183.708 95.364 186.818 96.534 C 189.929 97.705 191.991 100.677 192.000 104.000 Z"),
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
        return _trademark!!
    }

private var _trademark: ImageVector? = null
