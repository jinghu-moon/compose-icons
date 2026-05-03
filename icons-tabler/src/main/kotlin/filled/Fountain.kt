package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Fountain: ImageVector
    get() {
        if (_fountain != null) return _fountain!!
        _fountain = tablerFilledIcon(
            name = "Fountain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 2.000 C 17.209 2.000 19.000 3.791 19.000 6.000 C 18.999 6.529 18.587 6.966 18.059 6.997 C 17.530 7.028 17.069 6.642 17.007 6.117 L 17.000 6.000 C 17.005 4.921 16.153 4.033 15.075 3.992 C 13.997 3.952 13.081 4.774 13.005 5.850 L 13.000 6.000 L 13.000 15.000 L 14.000 15.000 L 14.000 11.000 C 14.000 9.343 15.343 8.000 17.000 8.000 C 18.657 8.000 20.000 9.343 20.000 11.000 C 19.999 11.529 19.587 11.966 19.059 11.997 C 18.530 12.028 18.069 11.642 18.007 11.117 L 18.000 11.000 C 17.999 10.471 17.587 10.034 17.059 10.003 C 16.530 9.972 16.069 10.358 16.007 10.883 L 16.000 11.000 L 16.000 15.000 L 21.000 15.000 C 21.507 15.000 21.934 15.380 21.993 15.883 L 22.000 16.000 L 22.000 18.000 C 22.000 20.131 20.329 21.888 18.200 21.995 L 18.000 22.000 L 6.000 22.000 C 3.869 22.000 2.112 20.329 2.005 18.200 L 2.000 18.000 L 2.000 16.000 C 2.000 15.493 2.380 15.066 2.883 15.007 L 3.000 15.000 L 8.000 15.000 L 8.000 11.000 C 7.999 10.471 7.587 10.034 7.059 10.003 C 6.530 9.972 6.069 10.358 6.007 10.883 L 6.000 11.000 C 6.000 11.552 5.552 12.000 5.000 12.000 C 4.448 12.000 4.000 11.552 4.000 11.000 C 3.998 9.376 5.289 8.046 6.912 7.998 C 8.535 7.951 9.901 9.203 9.995 10.824 L 10.000 11.000 L 10.000 15.000 L 11.000 15.000 L 11.000 6.000 C 11.000 4.895 10.105 4.000 9.000 4.000 C 7.895 4.000 7.000 4.895 7.000 6.000 C 7.000 6.552 6.552 7.000 6.000 7.000 C 5.448 7.000 5.000 6.552 5.000 6.000 C 5.000 4.336 6.030 2.846 7.586 2.258 C 9.143 1.670 10.901 2.107 12.001 3.355 C 12.759 2.492 13.852 1.998 15.000 2.000 Z"),
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
        return _fountain!!
    }

private var _fountain: ImageVector? = null
