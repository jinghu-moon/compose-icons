package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClockHour11: ImageVector
    get() {
        if (_clockHour11 != null) return _clockHour11!!
        _clockHour11 = tablerFilledIcon(
            name = "ClockHour11",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340M 12.048 12.999 L 12.117 12.993 L 12.213 12.977 L 12.302 12.954 L 12.401 12.916 L 12.483 12.876 L 12.596 12.803 L 12.669 12.743 L 12.743 12.669 L 12.818 12.575 L 12.870 12.495 L 12.905 12.425 L 12.956 12.293 L 12.987 12.158 L 12.997 12.076 L 13.000 12.000 L 13.000 7.000 C 13.000 6.448 12.552 6.000 12.000 6.000 C 11.448 6.000 11.000 6.448 11.000 7.000 L 11.000 8.697 L 10.832 8.445 C 10.551 8.023 9.998 7.879 9.546 8.109 L 9.446 8.168 C 9.225 8.315 9.072 8.544 9.020 8.804 C 8.967 9.064 9.021 9.334 9.168 9.555 L 11.186 12.582 L 11.256 12.669 L 11.331 12.743 L 11.425 12.818 L 11.505 12.870 L 11.575 12.905 L 11.707 12.956 L 11.842 12.987 L 11.924 12.997 Z"),
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
        return _clockHour11!!
    }

private var _clockHour11: ImageVector? = null
