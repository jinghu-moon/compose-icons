package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Map2Fill: ImageVector
    get() {
        if (_map2Fill != null) return _map2Fill!!
        _map2Fill = remixIcon(
            name = "Map2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 5 9 2l6 3L21.303 2.299c.254-.109 .548 .009 .657 .263 .027 .062 .04 .129 .04 .197v16.242l-7 3L9 19 2.697 21.701c-.254 .109-.548-.009-.657-.263C2.014 21.376 2 21.309 2 21.242v-16.242ZM15 19.764v-12.588l-.065 .028L9 4.236v12.588l.065-.028L15 19.764Z"),
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
        return _map2Fill!!
    }

private var _map2Fill: ImageVector? = null
