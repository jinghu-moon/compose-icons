package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartPie2: ImageVector
    get() {
        if (_chartPie2 != null) return _chartPie2!!
        _chartPie2 = tablerFilledIcon(
            name = "ChartPie2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 2.05v9.95c0 .552 .448 1 1 1h9.95c-.532 5.302-5.129 9.255-10.451 8.989C6.177 21.722 1.999 17.329 2 12l.005-.324C2.167 6.667 6.013 2.551 11 2.05M17 3.34c2.786 1.608 4.628 4.459 4.95 7.66h-8.95v-8.95c1.41 .142 2.773 .582 4 1.29"),
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
        return _chartPie2!!
    }

private var _chartPie2: ImageVector? = null
