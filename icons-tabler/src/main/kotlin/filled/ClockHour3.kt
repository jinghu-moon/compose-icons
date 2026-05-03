package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClockHour3: ImageVector
    get() {
        if (_clockHour3 != null) return _clockHour3!!
        _clockHour3 = tablerFilledIcon(
            name = "ClockHour3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340M 12.000 6.000 C 11.448 6.000 11.000 6.448 11.000 7.000 L 11.000 12.000 C 11.000 12.552 11.448 13.000 12.000 13.000 L 15.500 13.000 C 16.052 13.000 16.500 12.552 16.500 12.000 C 16.500 11.448 16.052 11.000 15.500 11.000 L 13.000 11.000 L 13.000 7.000 C 13.000 6.493 12.620 6.066 12.117 6.007 Z"),
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
        return _clockHour3!!
    }

private var _clockHour3: ImageVector? = null
