package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowLineDownLeft: ImageVector
    get() {
        if (_arrowLineDownLeft != null) return _arrowLineDownLeft!!
        _arrowLineDownLeft = phosphorRegularIcon(
            name = "ArrowLineDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 48c0 4.418-3.582 8-8 8h-176c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h176c4.418 0 8 3.582 8 8ZM178.34 90.34 80 188.69v-76.69c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v96c0 4.418 3.582 8 8 8h96c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-76.69l98.35-98.34c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0Z"),
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
        return _arrowLineDownLeft!!
    }

private var _arrowLineDownLeft: ImageVector? = null
