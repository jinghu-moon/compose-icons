package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClockHour4: ImageVector
    get() {
        if (_clockHour4 != null) return _clockHour4!!
        _clockHour4 = tablerFilledIcon(
            name = "ClockHour4",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340M 12.000 6.000 C 11.448 6.000 11.000 6.448 11.000 7.000 L 11.000 12.026 L 11.009 12.131 L 11.029 12.238 L 11.069 12.367 L 11.117 12.469 L 11.163 12.547 L 11.205 12.607 L 11.274 12.687 L 11.362 12.770 L 11.445 12.832 L 14.445 14.832 C 14.905 15.139 15.525 15.015 15.832 14.555 C 16.139 14.095 16.015 13.475 15.555 13.168 L 13.000 11.464 L 13.000 7.000 C 13.000 6.493 12.620 6.066 12.117 6.007 Z"),
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
        return _clockHour4!!
    }

private var _clockHour4: ImageVector? = null
