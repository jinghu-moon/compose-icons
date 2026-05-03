package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartFunnel: ImageVector
    get() {
        if (_chartFunnel != null) return _chartFunnel!!
        _chartFunnel = tablerFilledIcon(
            name = "ChartFunnel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.720 16.000 L 16.405 19.948 C 15.997 21.174 14.850 22.000 13.558 22.000 L 10.442 22.000 C 9.150 22.000 8.003 21.174 7.595 19.948 L 6.280 16.000 ZM 19.720 10.000 L 18.387 14.000 L 5.613 14.000 L 4.280 10.000 ZM 19.614 2.000 C 20.257 2.000 20.860 2.310 21.235 2.831 C 21.611 3.352 21.713 4.022 21.510 4.632 L 20.387 8.000 L 3.613 8.000 L 2.490 4.632 C 2.297 4.052 2.380 3.415 2.715 2.904 C 3.050 2.392 3.601 2.062 4.210 2.008 L 4.387 2.000 Z"),
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
        return _chartFunnel!!
    }

private var _chartFunnel: ImageVector? = null
