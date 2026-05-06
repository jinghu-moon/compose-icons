package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BarChartBoxAiFill: ImageVector
    get() {
        if (_barChartBoxAiFill != null) return _barChartBoxAiFill!!
        _barChartBoxAiFill = remixIcon(
            name = "BarChartBoxAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.713 8.128l-.247 .566c-.18 .414-.753 .414-.934 0l-.247-.566C18.847 7.119 18.056 6.316 17.068 5.877l-.76-.338c-.411-.183-.411-.78 0-.963l.717-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251ZM22 20v-9.341c-.626 .221-1.299 .341-2 .341-1.093 0-2.118-.292-3-.803v6.803h-2v-7h1.682C15.066 8.925 14 7.087 14 5c0-.701 .12-1.374 .341-2h-11.341C2.448 3 2 3.448 2 4v16c0 .552 .448 1 1 1h18c.552 0 1-.448 1-1ZM7 13h2v4h-2v-4ZM11 7h2v10h-2v-10Z"),
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
        return _barChartBoxAiFill!!
    }

private var _barChartBoxAiFill: ImageVector? = null
