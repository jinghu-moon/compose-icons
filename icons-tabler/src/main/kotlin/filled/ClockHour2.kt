package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClockHour2: ImageVector
    get() {
        if (_clockHour2 != null) return _clockHour2!!
        _clockHour2 = tablerFilledIcon(
            name = "ClockHour2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340M 11.000 7.000 L 11.000 12.022 L 11.003 12.076 L 11.023 12.211 L 11.028 12.236 C 11.042 12.293 11.061 12.348 11.084 12.401 L 11.124 12.483 L 11.186 12.582 L 11.256 12.669 L 11.331 12.743 L 11.425 12.818 L 11.505 12.870 L 11.575 12.905 L 11.707 12.956 L 11.842 12.987 L 11.924 12.997 L 12.048 12.999 L 12.161 12.987 L 12.269 12.963 L 12.375 12.927 L 12.483 12.876 L 12.548 12.836 L 15.555 10.832 C 16.015 10.525 16.139 9.905 15.832 9.445 C 15.525 8.985 14.905 8.861 14.445 9.168 L 13.000 10.130 L 13.000 7.000 C 13.000 6.493 12.620 6.066 12.117 6.007 L 12.000 6.000 C 11.448 6.000 11.000 6.448 11.000 7.000"),
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
        return _clockHour2!!
    }

private var _clockHour2: ImageVector? = null
