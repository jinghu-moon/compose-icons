package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartPie4: ImageVector
    get() {
        if (_chartPie4 != null) return _chartPie4!!
        _chartPie4 = tablerFilledIcon(
            name = "ChartPie4",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.844 13.570 L 16.687 20.834 C 13.131 22.721 8.789 22.292 5.672 19.744 ZM 18.351 19.724 L 13.870 13.000 L 21.951 13.000 C 21.698 15.516 20.502 17.842 18.603 19.511 ZM 11.001 2.050 L 11.001 11.584 L 4.257 18.328 C 2.797 16.542 2.000 14.307 2.000 12.000 L 2.005 11.676 C 2.167 6.667 6.013 2.551 11.000 2.050M 17.000 3.340 C 19.786 4.948 21.628 7.799 21.950 11.000 L 13.000 11.000 L 13.000 2.050 C 14.410 2.192 15.773 2.632 17.000 3.340"),
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
        return _chartPie4!!
    }

private var _chartPie4: ImageVector? = null
