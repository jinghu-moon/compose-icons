package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SlidersHorizontal: ImageVector
    get() {
        if (_slidersHorizontal != null) return _slidersHorizontal!!
        _slidersHorizontal = phosphorBoldIcon(
            name = "SlidersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M40 92h30.06c5.086 14.382 18.685 23.997 33.94 23.997 15.255 0 28.854-9.615 33.94-23.997h78.06c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-78.06C132.854 53.618 119.255 44.003 104 44.003 88.745 44.003 75.146 53.618 70.06 68h-30.06C33.373 68 28 73.373 28 80c0 6.627 5.373 12 12 12ZM104 68c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12C97.373 92 92 86.627 92 80c0-6.627 5.373-12 12-12ZM216 164h-14.06C196.854 149.618 183.255 140.003 168 140.003c-15.255 0-28.854 9.615-33.94 23.997h-94.06c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h94.06c5.086 14.382 18.685 23.997 33.94 23.997 15.255 0 28.854-9.615 33.94-23.997h14.06c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM168 188c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _slidersHorizontal!!
    }

private var _slidersHorizontal: ImageVector? = null
