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
                pathData = parseSvgPathData("M 20.000 3.000 L 4.000 3.000 C 3.448 3.000 3.000 3.448 3.000 4.000 L 3.000 6.227 L 3.008 6.450 C 3.058 7.118 3.330 7.750 3.780 8.245 L 8.000 12.886 L 8.000 21.000 C 8.000 21.321 8.154 21.623 8.415 21.811 C 8.676 21.999 9.011 22.051 9.316 21.949 L 15.316 19.949 L 15.424 19.906 C 15.776 19.741 16.000 19.388 16.000 19.000 L 16.000 12.414 L 20.121 8.294 C 20.684 7.731 21.000 6.967 21.000 6.171 L 21.000 4.000 C 21.000 3.448 20.552 3.000 20.000 3.000 Z"),
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
