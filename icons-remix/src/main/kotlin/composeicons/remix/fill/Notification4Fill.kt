package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Notification4Fill: ImageVector
    get() {
        if (_notification4Fill != null) return _notification4Fill!!
        _notification4Fill = remixIcon(
            name = "Notification4Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 18.667l.4 .533c.166 .221 .121 .534-.1 .7C20.213 19.965 20.108 20 20 20h-16c-.276 0-.5-.224-.5-.5 0-.108 .035-.213 .1-.3L4 18.667v-8.667C4 5.582 7.582 2 12 2c4.418 0 8 3.582 8 8v8.667ZM9.5 21h5c0 1.381-1.119 2.5-2.5 2.5C10.619 23.5 9.5 22.381 9.5 21Z"),
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
        return _notification4Fill!!
    }

private var _notification4Fill: ImageVector? = null
