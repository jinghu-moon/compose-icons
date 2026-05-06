package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandPointing: ImageVector
    get() {
        if (_handPointing != null) return _handPointing!!
        _handPointing = phosphorFillIcon(
            name = "HandPointing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 104v50.93c0 46.2-36.85 84.55-83 85.06-22.63 .305-44.419-8.566-60.4-24.59C58.79 192.33 34.15 136 34.15 136c-2.19-3.791-2.732-8.313-1.498-12.514 1.234-4.201 4.135-7.712 8.028-9.716 7.66-4 17.1-.84 21.4 6.62l21 36.44c1.194 2.145 3.56 3.364 6 3.09h.12c3.97-.683 6.853-4.152 6.8-8.18v-119.74c-.005-4.38 1.786-8.571 4.955-11.595 3.169-3.024 7.44-4.616 11.815-4.405 8.61 .4 15.23 7.82 15.23 16.43v71.57c-.005 2.217 .91 4.336 2.527 5.853 1.617 1.517 3.791 2.294 6.003 2.147 4.268-.367 7.528-3.967 7.47-8.25v-15.75c-.005-4.38 1.786-8.571 4.955-11.595 3.169-3.024 7.44-4.616 11.815-4.405 8.61 .4 15.23 7.82 15.23 16.43v23.57c-.005 2.217 .91 4.336 2.527 5.853 1.617 1.517 3.791 2.294 6.003 2.147 4.268-.367 7.528-3.967 7.47-8.25v-7.28c0-8.61 6.62-16 15.23-16.43 4.368-.21 8.632 1.376 11.8 4.391 3.168 3.015 4.964 7.195 4.97 11.569Z"),
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
        return _handPointing!!
    }

private var _handPointing: ImageVector? = null
