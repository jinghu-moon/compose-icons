package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TreasureMapLine: ImageVector
    get() {
        if (_treasureMapLine != null) return _treasureMapLine!!
        _treasureMapLine = remixIcon(
            name = "TreasureMapLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.935 7.204l-6-3L4 6.319v12.648L9.065 16.796l6 3L20 17.681v-12.648L14.935 7.204ZM2 5 9 2l6 3L21.303 2.299c.254-.109 .548 .009 .657 .263 .027 .062 .04 .129 .04 .197v16.242l-7 3L9 19 2.697 21.701c-.254 .109-.548-.009-.657-.263C2.014 21.376 2 21.309 2 21.242v-16.242ZM6 11h2v2h-2v-2ZM10 11h2v2h-2v-2ZM15.998 10.937 17.236 9.7l1.061 1.061-1.237 1.237 1.237 1.237-1.061 1.061L15.998 13.059l-1.237 1.237L13.7 13.236l1.237-1.237L13.7 10.761 14.761 9.7l1.237 1.237Z"),
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
        return _treasureMapLine!!
    }

private var _treasureMapLine: ImageVector? = null
