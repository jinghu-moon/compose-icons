package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RoadMapFill: ImageVector
    get() {
        if (_roadMapFill != null) return _roadMapFill!!
        _roadMapFill = remixIcon(
            name = "RoadMapFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.95 11.95c1.785-1.785 2.405-4.294 1.858-6.582L21.303 4.299c.254-.109 .548 .009 .657 .263 .027 .062 .04 .129 .04 .197v14.242l-7 3L9 19 2.697 21.701c-.254 .109-.548-.009-.657-.263C2.014 21.376 2 21.309 2 21.242v-14.242L5.129 5.659c-.429 2.207 .212 4.581 1.921 6.291L12 16.899l4.95-4.95ZM15.535 10.535 12 14.071 8.464 10.535C6.512 8.583 6.512 5.417 8.464 3.464c1.953-1.953 5.118-1.953 7.071 0 1.953 1.953 1.953 5.118 0 7.071Z"),
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
        return _roadMapFill!!
    }

private var _roadMapFill: ImageVector? = null
