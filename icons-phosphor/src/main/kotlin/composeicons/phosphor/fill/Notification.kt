package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Notification: ImageVector
    get() {
        if (_notification != null) return _notification!!
        _notification = phosphorFillIcon(
            name = "Notification",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 128v80c0 8.837-7.163 16-16 16h-152c-8.837 0-16-7.163-16-16v-152C32 47.163 39.163 40 48 40h80c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-80v152h152v-80c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM196 24c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36C232 40.118 215.882 24 196 24Z"),
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
        return _notification!!
    }

private var _notification: ImageVector? = null
