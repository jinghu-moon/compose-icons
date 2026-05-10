package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Hand: ImageVector
    get() {
        if (_hand != null) return _hand!!
        _hand = phosphorFillIcon(
            name = "Hand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 64v90.93c0 46.2-36.85 84.55-83 85.06-22.63 .305-44.419-8.566-60.4-24.59C50.79 192.33 26.15 136 26.15 136c-2.19-3.791-2.732-8.313-1.498-12.514 1.234-4.201 4.135-7.712 8.028-9.716 7.66-4 17.1-.84 21.4 6.62l21 36.44c1.194 2.145 3.56 3.364 6 3.09h.12c3.97-.683 6.853-4.152 6.8-8.18v-103.74c-.005-4.38 1.786-8.571 4.955-11.595 3.169-3.024 7.44-4.616 11.815-4.405 8.61 .4 15.23 7.82 15.23 16.43v63.57c-.005 2.217 .91 4.336 2.527 5.853 1.617 1.517 3.791 2.294 6.003 2.147 4.268-.367 7.528-3.967 7.47-8.25v-79.75c-.005-4.38 1.786-8.571 4.955-11.595 3.169-3.024 7.44-4.616 11.815-4.405 8.61 .4 15.23 7.82 15.23 16.43v87.57c-.005 2.217 .91 4.336 2.527 5.853 1.617 1.517 3.791 2.294 6.003 2.147 4.268-.367 7.528-3.967 7.47-8.25v-55.3c0-8.61 6.62-16 15.23-16.43 4.372-.211 8.639 1.379 11.808 4.398 3.169 3.019 4.962 7.205 4.962 11.582Z"),
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
        return _hand!!
    }

private var _hand: ImageVector? = null
