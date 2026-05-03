package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Stack3: ImageVector
    get() {
        if (_stack3 != null) return _stack3!!
        _stack3 = tablerFilledIcon(
            name = "Stack3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.894 17.553 C 21.141 18.047 20.941 18.647 20.447 18.894 L 12.447 22.894 C 12.166 23.035 11.834 23.035 11.553 22.894 L 3.553 18.894 C 3.077 18.638 2.892 18.050 3.133 17.567 C 3.375 17.083 3.957 16.879 4.447 17.106 L 12.000 20.880 L 19.554 17.105 C 20.048 16.858 20.648 17.058 20.895 17.552M 20.895 13.552 C 21.142 14.046 20.942 14.646 20.448 14.893 L 12.448 18.893 C 12.167 19.034 11.835 19.034 11.554 18.893 L 3.554 14.893 C 3.078 14.637 2.893 14.049 3.134 13.566 C 3.376 13.082 3.958 12.878 4.448 13.105 L 12.000 16.880 L 19.554 13.105 C 20.048 12.858 20.648 13.058 20.895 13.552M 20.895 9.552 C 21.142 10.046 20.942 10.646 20.448 10.893 L 12.448 14.893 C 12.167 15.034 11.835 15.034 11.554 14.893 L 3.554 10.893 C 3.078 10.637 2.893 10.049 3.134 9.566 C 3.376 9.082 3.958 8.878 4.448 9.105 L 12.000 12.880 L 19.554 9.105 C 20.048 8.858 20.648 9.058 20.895 9.552M 12.008 1.000 Q 12.064 1.000 12.119 1.007 L 12.230 1.027 L 12.316 1.051 L 12.328 1.057 L 12.340 1.059 L 12.369 1.073 L 12.419 1.092 L 12.435 1.101 L 12.447 1.106 L 20.447 5.106 C 20.785 5.276 20.999 5.622 20.999 6.000 C 20.999 6.378 20.785 6.724 20.447 6.894 L 12.447 10.894 C 12.166 11.035 11.834 11.035 11.553 10.894 L 3.553 6.894 C 3.215 6.724 3.001 6.378 3.001 6.000 C 3.001 5.622 3.215 5.276 3.553 5.106 L 11.553 1.106 L 11.564 1.101 L 11.582 1.091 L 11.660 1.059 L 11.671 1.057 L 11.684 1.051 L 11.770 1.027 L 11.880 1.007 L 11.936 1.002 Z"),
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
        return _stack3!!
    }

private var _stack3: ImageVector? = null
