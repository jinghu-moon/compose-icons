package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CookieMan: ImageVector
    get() {
        if (_cookieMan != null) return _cookieMan!!
        _cookieMan = tablerFilledIcon(
            name = "CookieMan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.007 1.000 L 12.245 1.005 C 14.688 1.105 16.826 2.677 17.650 4.979 L 17.728 5.212 C 18.146 6.551 18.082 7.995 17.546 9.292 L 17.453 9.502 L 17.503 9.500 C 18.595 9.475 19.611 10.057 20.141 11.011 L 20.222 11.169 C 20.872 12.553 20.331 14.203 18.988 14.933 L 18.798 15.029 L 17.000 15.850 L 17.000 16.813 L 18.166 17.979 L 18.306 18.133 C 19.298 19.309 19.224 21.048 18.136 22.135 C 17.049 23.223 15.309 23.296 14.106 22.279 L 13.946 22.133 L 12.000 20.185 L 10.054 22.132 C 8.987 23.204 7.284 23.299 6.104 22.352 L 5.954 22.224 C 4.784 21.151 4.670 19.345 5.720 18.104 L 5.866 17.946 L 7.000 16.812 L 7.000 15.850 L 5.166 15.010 L 4.985 14.917 C 3.658 14.180 3.130 12.539 3.780 11.167 C 4.269 10.150 5.298 9.504 6.426 9.506 L 6.556 9.509 L 6.526 9.445 C 6.250 8.822 6.079 8.157 6.023 7.477 L 6.006 7.217 L 6.006 7.000 C 6.006 3.774 8.557 1.125 11.781 1.004 L 12.005 1.000 ZM 12.010 16.000 L 12.000 16.000 C 11.448 16.000 11.000 16.448 11.000 17.000 C 11.000 17.552 11.448 18.000 12.000 18.000 L 12.010 18.000 C 12.562 18.000 13.010 17.552 13.010 17.000 C 13.010 16.448 12.562 16.000 12.010 16.000M 12.010 13.000 L 12.000 13.000 C 11.448 13.000 11.000 13.448 11.000 14.000 C 11.000 14.552 11.448 15.000 12.000 15.000 L 12.010 15.000 C 12.562 15.000 13.010 14.552 13.010 14.000 C 13.010 13.448 12.562 13.000 12.010 13.000M 12.010 8.000 L 12.000 8.000 C 11.448 8.000 11.000 8.448 11.000 9.000 C 11.000 9.552 11.448 10.000 12.000 10.000 L 12.010 10.000 C 12.562 10.000 13.010 9.552 13.010 9.000 C 13.010 8.448 12.562 8.000 12.010 8.000M 10.010 5.000 L 10.000 5.000 C 9.448 5.000 9.000 5.448 9.000 6.000 C 9.000 6.552 9.448 7.000 10.000 7.000 L 10.010 7.000 C 10.562 7.000 11.010 6.552 11.010 6.000 C 11.010 5.448 10.562 5.000 10.010 5.000M 14.010 5.000 L 14.000 5.000 C 13.448 5.000 13.000 5.448 13.000 6.000 C 13.000 6.552 13.448 7.000 14.000 7.000 L 14.010 7.000 C 14.562 7.000 15.010 6.552 15.010 6.000 C 15.010 5.448 14.562 5.000 14.010 5.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _cookieMan!!
    }

private var _cookieMan: ImageVector? = null
