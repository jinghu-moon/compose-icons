package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Filter: ImageVector
    get() {
        if (_filter != null) return _filter!!
        _filter = tablerFilledIcon(
            name = "Filter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 3h-16C3.448 3 3 3.448 3 4v2.227l.008 .223c.05 .668 .322 1.3 .772 1.795L8 12.886v8.114c-0 .321 .154 .623 .415 .811 .261 .188 .596 .239 .901 .138l6-2 .108-.043c.352-.165 .576-.518 .576-.906v-6.586L20.121 8.294c.563-.563 .879-1.327 .879-2.123v-2.171C21 3.448 20.552 3 20 3Z"),
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
        return _filter!!
    }

private var _filter: ImageVector? = null
