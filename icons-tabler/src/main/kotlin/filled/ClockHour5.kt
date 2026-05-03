package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClockHour5: ImageVector
    get() {
        if (_clockHour5 != null) return _clockHour5!!
        _clockHour5 = tablerFilledIcon(
            name = "ClockHour5",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340M 11.000 7.000 L 11.000 12.022 L 11.003 12.076 L 11.023 12.211 L 11.028 12.236 C 11.042 12.293 11.061 12.348 11.084 12.401 L 11.124 12.483 L 11.164 12.548 L 13.168 15.555 C 13.475 16.015 14.095 16.139 14.555 15.832 C 15.015 15.525 15.139 14.905 14.832 14.445 L 13.000 11.697 L 13.000 7.000 C 13.000 6.493 12.620 6.066 12.117 6.007 L 12.000 6.000 C 11.448 6.000 11.000 6.448 11.000 7.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _clockHour5!!
    }

private var _clockHour5: ImageVector? = null
