package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Eyeglass2: ImageVector
    get() {
        if (_eyeglass2 != null) return _eyeglass2!!
        _eyeglass2 = tablerFilledIcon(
            name = "Eyeglass2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 3.000 C 8.552 3.000 9.000 3.448 9.000 4.000 C 9.000 4.552 8.552 5.000 8.000 5.000 L 6.743 5.000 L 4.503 12.467 C 5.657 11.896 7.000 11.846 8.193 12.330 C 9.386 12.814 10.314 13.786 10.743 15.000 L 13.256 15.000 C 13.685 13.786 14.614 12.814 15.807 12.330 C 17.000 11.845 18.343 11.895 19.497 12.466 L 17.256 5.000 L 16.000 5.000 C 15.493 5.000 15.066 4.620 15.007 4.117 L 15.000 4.000 C 15.000 3.448 15.448 3.000 16.000 3.000 L 18.000 3.000 C 18.442 3.000 18.831 3.290 18.958 3.713 L 21.958 13.713 C 21.986 13.806 22.000 13.903 22.000 14.000 L 22.000 16.500 C 21.999 18.888 20.134 20.859 17.750 20.992 C 15.367 21.125 13.294 19.373 13.028 17.000 L 10.972 17.000 C 10.706 19.373 8.633 21.125 6.250 20.992 C 3.866 20.859 2.001 18.888 2.000 16.500 L 2.000 14.000 C 2.000 13.903 2.014 13.806 2.042 13.713 L 5.042 3.713 C 5.169 3.290 5.558 3.000 6.000 3.000 Z"),
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
        return _eyeglass2!!
    }

private var _eyeglass2: ImageVector? = null
