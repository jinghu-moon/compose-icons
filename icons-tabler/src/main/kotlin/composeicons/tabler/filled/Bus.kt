package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bus: ImageVector
    get() {
        if (_bus != null) return _bus!!
        _bus = tablerFilledIcon(
            name = "Bus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 4c3.4 0 6 3.64 6 8v5c0 .552-.448 1-1 1h-1.171c-.424 1.198-1.558 2-2.829 2-1.271 0-2.405-.801-2.829-2h-6.342C8.405 19.198 7.271 20 6 20 4.729 20 3.595 19.198 3.171 18h-1.171C1.448 18 1 17.552 1 17v-11C1 4.895 1.895 4 3 4ZM6 16c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1C7 16.448 6.552 16 6 16M18 16c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1M17.24 6.011 18.308 11h2.636C20.631 8.244 19.049 6.18 17.24 6.011M6 6h-3v3h3ZM11 6h-3v3h3ZM15.191 6h-2.191v3h2.834Z"),
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
        return _bus!!
    }

private var _bus: ImageVector? = null
