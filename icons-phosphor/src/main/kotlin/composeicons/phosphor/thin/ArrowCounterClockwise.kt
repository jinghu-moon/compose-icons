package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowCounterClockwise: ImageVector
    get() {
        if (_arrowCounterClockwise != null) return _arrowCounterClockwise!!
        _arrowCounterClockwise = phosphorThinIcon(
            name = "ArrowCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 128c.005 50.334-40.441 91.327-90.77 92h-1.23c-23.485 .048-46.089-8.939-63.13-25.1-1.607-1.519-1.679-4.053-.16-5.66 1.519-1.607 4.053-1.679 5.66-.16 33.519 31.607 86.243 30.318 118.177-2.891 31.934-33.209 31.159-85.942-1.736-118.199C153.915 35.733 101.177 35.992 68.6 68.57l-.13 .12L34.3 100h37.7c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4v-48c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v38.89l35-32C89.324 36.609 128.884 28.766 163.243 43.016 197.603 57.265 220.001 90.803 220 128Z"),
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
        return _arrowCounterClockwise!!
    }

private var _arrowCounterClockwise: ImageVector? = null
