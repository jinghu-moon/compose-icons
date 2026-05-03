package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Stack2: ImageVector
    get() {
        if (_stack2 != null) return _stack2!!
        _stack2 = tablerFilledIcon(
            name = "Stack2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.894 15.553 C 21.141 16.047 20.941 16.647 20.447 16.894 L 12.447 20.894 C 12.166 21.035 11.834 21.035 11.553 20.894 L 3.553 16.894 C 3.077 16.638 2.892 16.050 3.133 15.567 C 3.375 15.083 3.957 14.879 4.447 15.106 L 12.000 18.880 L 19.554 15.105 C 20.048 14.858 20.648 15.058 20.895 15.552M 20.895 11.552 C 21.142 12.046 20.942 12.646 20.448 12.893 L 12.448 16.893 C 12.167 17.034 11.835 17.034 11.554 16.893 L 3.554 12.893 C 3.078 12.637 2.893 12.049 3.134 11.566 C 3.376 11.082 3.958 10.878 4.448 11.105 L 12.000 14.880 L 19.554 11.105 C 20.048 10.858 20.648 11.058 20.895 11.552M 12.008 3.000 Q 12.064 3.000 12.119 3.007 L 12.230 3.027 L 12.316 3.051 L 12.328 3.057 L 12.340 3.059 L 12.369 3.073 L 12.419 3.092 L 12.435 3.101 L 12.447 3.106 L 20.447 7.106 C 20.785 7.276 20.999 7.622 20.999 8.000 C 20.999 8.378 20.785 8.724 20.447 8.894 L 12.447 12.894 C 12.166 13.035 11.834 13.035 11.553 12.894 L 3.553 8.894 C 3.215 8.724 3.001 8.378 3.001 8.000 C 3.001 7.622 3.215 7.276 3.553 7.106 L 11.553 3.106 L 11.564 3.101 L 11.582 3.091 L 11.660 3.059 L 11.671 3.057 L 11.684 3.051 L 11.770 3.027 L 11.880 3.007 L 11.936 3.002 Z"),
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
        return _stack2!!
    }

private var _stack2: ImageVector? = null
