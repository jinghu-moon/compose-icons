package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SimCard2Fill: ImageVector
    get() {
        if (_simCard2Fill != null) return _simCard2Fill!!
        _simCard2Fill = remixIcon(
            name = "SimCard2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 2h10l4.707 4.707c.188 .188 .293 .442 .293 .707v13.586c0 .552-.448 1-1 1h-14C4.448 22 4 21.552 4 21v-18C4 2.448 4.448 2 5 2ZM13 18v-8h-5v2h3v6h2ZM8 13v2h2v-2h-2ZM14 13v2h2v-2h-2ZM14 10v2h2v-2h-2ZM8 16v2h2v-2h-2ZM14 16v2h2v-2h-2Z"),
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
        return _simCard2Fill!!
    }

private var _simCard2Fill: ImageVector? = null
