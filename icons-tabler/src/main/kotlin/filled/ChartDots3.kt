package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartDots3: ImageVector
    get() {
        if (_chartDots3 != null) return _chartDots3!!
        _chartDots3 = tablerFilledIcon(
            name = "ChartDots3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 2.000 C 20.063 2.001 21.788 3.571 21.981 5.625 C 22.175 7.679 20.774 9.544 18.747 9.929 C 16.719 10.315 14.732 9.096 14.157 7.114 L 7.862 7.900 C 7.835 7.987 7.803 8.073 7.768 8.157 L 14.214 12.588 C 15.198 11.860 16.526 11.802 17.569 12.443 C 18.612 13.083 19.162 14.294 18.957 15.501 C 18.752 16.708 17.835 17.669 16.639 17.930 C 15.442 18.191 14.208 17.699 13.519 16.687 L 9.992 17.745 Q 10.000 17.872 10.000 18.000 C 10.000 20.209 8.209 22.000 6.000 22.000 C 3.791 22.000 2.000 20.209 2.000 18.000 L 2.005 17.800 C 2.092 16.062 3.292 14.579 4.974 14.133 C 6.657 13.687 8.434 14.379 9.371 15.846 L 13.011 14.752 L 13.021 14.650 Q 13.044 14.446 13.095 14.250 L 6.407 9.650 C 5.477 10.144 4.356 10.114 3.454 9.571 C 2.552 9.029 2.000 8.053 2.000 7.000 L 2.005 6.824 C 2.087 5.419 3.134 4.260 4.523 4.036 C 5.913 3.813 7.271 4.585 7.789 5.893 L 14.101 5.103 C 14.519 3.287 16.136 2.000 18.000 2.000"),
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
        return _chartDots3!!
    }

private var _chartDots3: ImageVector? = null
