package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MapLine: ImageVector
    get() {
        if (_mapLine != null) return _mapLine!!
        _mapLine = remixIcon(
            name = "MapLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 5 9 2l6 3L21.303 2.299c.254-.109 .548 .009 .657 .263 .027 .062 .04 .129 .04 .197v16.242l-7 3L9 19 2.697 21.701c-.254 .109-.548-.009-.657-.263C2.014 21.376 2 21.309 2 21.242v-16.242ZM14.935 7.204l-6-3L4 6.319v12.648L9.065 16.796l6 3L20 17.681v-12.648L14.935 7.204Z"),
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
        return _mapLine!!
    }

private var _mapLine: ImageVector? = null
