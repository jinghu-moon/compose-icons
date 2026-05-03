package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Rollercoaster: ImageVector
    get() {
        if (_rollercoaster != null) return _rollercoaster!!
        _rollercoaster = tablerFilledIcon(
            name = "Rollercoaster",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 8.000 C 21.552 8.000 22.000 8.448 22.000 9.000 C 22.000 9.552 21.552 10.000 21.000 10.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 C 19.448 22.000 19.000 21.552 19.000 21.000 L 19.000 10.000 L 17.325 10.000 Q 17.162 10.000 17.000 10.007 L 17.000 21.000 C 17.000 21.552 16.552 22.000 16.000 22.000 C 15.448 22.000 15.000 21.552 15.000 21.000 L 15.000 10.355 C 14.291 10.578 13.618 10.901 13.000 11.314 L 13.000 21.000 C 13.000 21.552 12.552 22.000 12.000 22.000 C 11.448 22.000 11.000 21.552 11.000 21.000 L 11.000 13.252 C 10.549 13.884 10.195 14.580 9.949 15.316 L 9.214 17.521 C 9.151 17.708 9.080 17.893 9.001 18.074 L 9.000 21.000 C 9.000 21.552 8.552 22.000 8.000 22.000 C 7.448 22.000 7.000 21.552 7.000 21.000 L 7.001 20.636 C 5.855 21.521 4.448 22.001 3.000 22.000 C 2.448 22.000 2.000 21.552 2.000 21.000 C 2.000 20.448 2.448 20.000 3.000 20.000 C 4.958 20.000 6.697 18.747 7.316 16.889 L 8.051 14.684 C 9.382 10.692 13.117 8.000 17.325 8.000 ZM 10.780 4.375 L 12.780 6.875 C 12.949 7.086 13.026 7.357 12.992 7.626 C 12.958 7.894 12.816 8.137 12.600 8.300 L 8.600 11.300 C 8.352 11.486 8.031 11.547 7.732 11.464 L 5.932 10.964 C 5.535 10.853 5.246 10.510 5.205 10.100 L 5.005 8.100 C 4.970 7.752 5.120 7.410 5.400 7.200 L 9.400 4.200 C 9.832 3.876 10.443 3.954 10.780 4.375M 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 6.000 C 21.000 6.552 20.552 7.000 20.000 7.000 L 15.000 7.000 C 14.448 7.000 14.000 6.552 14.000 6.000 L 14.000 3.000 C 14.000 2.448 14.448 2.000 15.000 2.000 Z"),
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
        return _rollercoaster!!
    }

private var _rollercoaster: ImageVector? = null
