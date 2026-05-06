package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) return _arrowDown!!
        _arrowDown = phosphorFillIcon(
            name = "ArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M205.66 149.66l-72 72c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346l-72-72c-2.291-2.288-2.976-5.731-1.737-8.722C49.842 137.947 52.762 135.997 56 136h64v-96c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v96h64c3.238-.003 6.158 1.947 7.397 4.938 1.239 2.991 .554 6.434-1.737 8.722Z"),
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
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
