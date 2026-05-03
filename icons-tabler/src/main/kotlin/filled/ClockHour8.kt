package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClockHour8: ImageVector
    get() {
        if (_clockHour8 != null) return _clockHour8!!
        _clockHour8 = tablerFilledIcon(
            name = "ClockHour8",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340M 12.000 6.000 C 11.448 6.000 11.000 6.448 11.000 7.000 L 11.000 11.464 L 8.445 13.168 C 8.023 13.449 7.879 14.002 8.109 14.454 L 8.168 14.554 C 8.315 14.775 8.544 14.928 8.804 14.980 C 9.064 15.033 9.334 14.979 9.555 14.832 L 12.582 12.814 L 12.669 12.744 L 12.743 12.669 L 12.818 12.575 L 12.870 12.495 L 12.905 12.425 L 12.956 12.293 L 12.987 12.158 L 12.997 12.076 L 13.000 12.000 L 13.000 7.000 C 13.000 6.448 12.552 6.000 12.000 6.000"),
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
        return _clockHour8!!
    }

private var _clockHour8: ImageVector? = null
