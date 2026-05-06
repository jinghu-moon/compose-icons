package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowUpLeft: ImageVector
    get() {
        if (_arrowUpLeft != null) return _arrowUpLeft!!
        _arrowUpLeft = phosphorFillIcon(
            name = "ArrowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M197.66 197.66c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346L116 127.31 69.66 173.66c-2.288 2.291-5.731 2.976-8.722 1.737C57.947 174.158 55.997 171.238 56 168v-104c0-4.418 3.582-8 8-8h104c3.238-.003 6.158 1.947 7.397 4.938 1.239 2.991 .554 6.434-1.737 8.722L127.31 116l70.35 70.34c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66Z"),
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
        return _arrowUpLeft!!
    }

private var _arrowUpLeft: ImageVector? = null
