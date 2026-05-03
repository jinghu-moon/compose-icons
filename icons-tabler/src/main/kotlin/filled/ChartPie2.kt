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
                pathData = parseSvgPathData("M 11.000 2.050 L 11.000 12.000 C 11.000 12.552 11.448 13.000 12.000 13.000 L 21.950 13.000 C 21.418 18.302 16.821 22.255 11.499 21.989 C 6.177 21.722 1.999 17.329 2.000 12.000 L 2.005 11.676 C 2.167 6.667 6.013 2.551 11.000 2.050M 17.000 3.340 C 19.786 4.948 21.628 7.799 21.950 11.000 L 13.000 11.000 L 13.000 2.050 C 14.410 2.192 15.773 2.632 17.000 3.340"),
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
