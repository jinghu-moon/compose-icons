package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Stack: ImageVector
    get() {
        if (_stack != null) return _stack!!
        _stack = tablerFilledIcon(
            name = "Stack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.894 13.553 C 21.141 14.047 20.941 14.647 20.447 14.894 L 12.447 18.894 C 12.166 19.035 11.834 19.035 11.553 18.894 L 3.553 14.894 C 3.077 14.638 2.892 14.050 3.133 13.567 C 3.375 13.083 3.957 12.879 4.447 13.106 L 12.000 16.880 L 19.554 13.105 C 20.048 12.858 20.648 13.058 20.895 13.552M 12.008 5.000 Q 12.064 5.000 12.119 5.007 L 12.230 5.027 L 12.316 5.051 L 12.328 5.057 L 12.340 5.059 L 12.369 5.073 L 12.419 5.092 L 12.435 5.101 L 12.447 5.106 L 20.447 9.106 C 20.785 9.276 20.999 9.622 20.999 10.000 C 20.999 10.378 20.785 10.724 20.447 10.894 L 12.447 14.894 C 12.166 15.035 11.834 15.035 11.553 14.894 L 3.553 10.894 C 3.215 10.724 3.001 10.378 3.001 10.000 C 3.001 9.622 3.215 9.276 3.553 9.106 L 11.553 5.106 L 11.564 5.101 L 11.582 5.091 L 11.660 5.059 L 11.671 5.057 L 11.684 5.051 L 11.770 5.027 L 11.880 5.007 L 11.936 5.002 Z"),
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
        return _stack!!
    }

private var _stack: ImageVector? = null
