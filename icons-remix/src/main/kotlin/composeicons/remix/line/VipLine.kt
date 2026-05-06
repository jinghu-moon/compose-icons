package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.VipLine: ImageVector
    get() {
        if (_vipLine != null) return _vipLine!!
        _vipLine = remixIcon(
            name = "VipLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.005 19h20v2h-20v-2ZM11.005 8h2v8h-2v-8ZM7.97 8 6.109 13.113 4.248 8h-2.125l2.986 7.964h2L10.095 8h-2.125ZM17.005 14v2h-2v-8h4c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3h-2ZM17.005 10v2h2c.552 0 1-.448 1-1 0-.552-.448-1-1-1h-2ZM2.005 3h20v2h-20v-2Z"),
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
        return _vipLine!!
    }

private var _vipLine: ImageVector? = null
