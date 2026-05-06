package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Map2Line: ImageVector
    get() {
        if (_map2Line != null) return _map2Line!!
        _map2Line = remixIcon(
            name = "Map2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 5 9 2l6 3L21.303 2.299c.254-.109 .548 .009 .657 .263 .027 .062 .04 .129 .04 .197v16.242l-7 3L9 19 2.697 21.701c-.254 .109-.548-.009-.657-.263C2.014 21.376 2 21.309 2 21.242v-16.242ZM16 19.396l4-1.714v-12.648L16 6.747v12.648ZM14 19.264v-12.528l-4-2v12.528l4 2ZM8 17.253v-12.648L4 6.319v12.648L8 17.253Z"),
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
        return _map2Line!!
    }

private var _map2Line: ImageVector? = null
