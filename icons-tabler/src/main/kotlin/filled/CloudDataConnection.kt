package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CloudDataConnection: ImageVector
    get() {
        if (_cloudDataConnection != null) return _cloudDataConnection!!
        _cloudDataConnection = tablerFilledIcon(
            name = "CloudDataConnection",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.262 4.087 C 16.236 4.855 16.828 5.935 16.940 7.084 L 16.947 7.191 L 17.127 7.216 C 18.711 7.473 19.904 8.797 19.994 10.400 L 20.000 10.588 C 19.996 12.476 18.463 14.003 16.575 14.000 L 13.000 14.000 L 13.001 15.171 C 13.856 15.473 14.528 16.145 14.830 17.000 L 21.000 17.000 C 21.552 17.000 22.000 17.448 22.000 18.000 C 22.000 18.552 21.552 19.000 21.000 19.000 L 14.830 19.000 C 14.407 20.200 13.272 21.002 12.000 21.002 C 10.728 21.002 9.593 20.200 9.170 19.000 L 3.000 19.000 C 2.448 19.000 2.000 18.552 2.000 18.000 C 2.000 17.448 2.448 17.000 3.000 17.000 L 9.171 17.000 C 9.473 16.145 10.145 15.472 11.000 15.170 L 11.000 14.000 L 8.260 14.000 C 5.919 14.000 4.000 12.174 4.000 9.897 C 4.000 7.896 5.481 6.242 7.430 5.871 L 7.516 5.856 L 7.565 5.744 C 8.079 4.620 9.073 3.734 10.321 3.297 L 10.543 3.225 C 12.170 2.735 13.963 3.059 15.263 4.087"),
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
        return _cloudDataConnection!!
    }

private var _cloudDataConnection: ImageVector? = null
