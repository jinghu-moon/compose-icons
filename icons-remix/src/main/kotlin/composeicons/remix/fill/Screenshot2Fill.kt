package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Screenshot2Fill: ImageVector
    get() {
        if (_screenshot2Fill != null) return _screenshot2Fill!!
        _screenshot2Fill = remixIcon(
            name = "Screenshot2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 3h2v2h-2v-2ZM7 3h2v2h-2v-2ZM11 3h2v2h-2v-2ZM15 3h2v2h-2v-2ZM19 3h2v2h-2v-2ZM19 7h2v2h-2v-2ZM3 19h2v2h-2v-2ZM3 15h2v2h-2v-2ZM3 11h2v2h-2v-2ZM3 7h2v2h-2v-2ZM10.667 11 11.703 9.445C11.889 9.167 12.201 9 12.535 9h2.93c.334 0 .647 .167 .832 .445L17.333 11h2.667c.552 0 1 .448 1 1v8c0 .552-.448 1-1 1h-12C7.448 21 7 20.552 7 20v-8c0-.552 .448-1 1-1h2.667ZM14 18c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2Z"),
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
        return _screenshot2Fill!!
    }

private var _screenshot2Fill: ImageVector? = null
