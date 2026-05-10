package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Focus3Fill: ImageVector
    get() {
        if (_focus3Fill != null) return _focus3Fill!!
        _focus3Fill = remixIcon(
            name = "Focus3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 1l.001 3.062c3.618 .452 6.486 3.32 6.937 6.938h3.062v2l-3.062 .001c-.452 3.618-3.319 6.485-6.937 6.937L13 23h-2v-3.062C7.382 19.487 4.514 16.619 4.062 13.001L1 13v-2h3.062C4.513 7.381 7.381 4.513 11 4.062v-3.062h2ZM12 10c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2Z"),
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
        return _focus3Fill!!
    }

private var _focus3Fill: ImageVector? = null
