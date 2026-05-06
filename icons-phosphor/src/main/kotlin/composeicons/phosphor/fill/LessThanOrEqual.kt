package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LessThanOrEqual: ImageVector
    get() {
        if (_lessThanOrEqual != null) return _lessThanOrEqual!!
        _lessThanOrEqual = phosphorFillIcon(
            name = "LessThanOrEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM176 184h-104c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h104c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM178.35 128.35c4.225 1.298 6.598 5.775 5.3 10-1.298 4.225-5.775 6.598-10 5.3L69.65 111.65C66.287 110.621 63.99 107.517 63.99 104c0-3.517 2.297-6.621 5.66-7.65l104-32c4.225-1.298 8.702 1.075 10 5.3 1.298 4.225-1.075 8.702-5.3 10L99.2 104Z"),
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
        return _lessThanOrEqual!!
    }

private var _lessThanOrEqual: ImageVector? = null
