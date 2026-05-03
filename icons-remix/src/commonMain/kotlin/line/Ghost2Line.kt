package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Ghost2Line: ImageVector
    get() {
        if (_ghost2Line != null) return _ghost2Line!!
        _ghost2Line = remixIcon(
            name = "Ghost2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 15.500 2.000 18.000 5.000 19.000 8.000 C 22.000 9.000 23.000 11.730 23.000 14.000 L 20.225 14.793 C 19.796 14.915 19.500 15.308 19.500 15.754 L 19.500 17.250 C 19.500 18.216 18.716 19.000 17.750 19.000 L 17.154 19.000 C 16.483 19.000 15.856 19.337 15.486 19.896 C 14.558 21.299 13.396 22.000 12.000 22.000 C 10.604 22.000 9.442 21.299 8.514 19.896 C 8.144 19.337 7.517 19.000 6.846 19.000 L 6.250 19.000 C 5.284 19.000 4.500 18.216 4.500 17.250 L 4.500 15.754 C 4.500 15.308 4.204 14.915 3.775 14.793 L 1.000 14.000 C 1.000 11.734 2.000 9.000 5.000 8.000 C 6.000 5.000 8.500 2.000 12.000 2.000 ZM 12.000 4.000 C 9.891 4.000 7.935 5.788 6.989 8.371 L 6.897 8.632 L 6.581 9.581 L 5.632 9.897 C 4.377 10.316 3.565 11.238 3.208 12.456 L 3.185 12.543 L 4.324 12.870 C 5.554 13.221 6.418 14.309 6.495 15.573 L 6.500 15.754 L 6.500 17.000 L 6.846 17.000 C 8.110 17.000 9.294 17.596 10.046 18.600 L 10.182 18.792 C 10.758 19.663 11.316 20.000 12.000 20.000 C 12.638 20.000 13.167 19.707 13.703 18.960 L 13.818 18.792 C 14.515 17.739 15.666 17.081 16.918 17.007 L 17.154 17.000 L 17.500 17.000 L 17.500 15.754 C 17.500 14.476 18.309 13.345 19.503 12.925 L 19.676 12.870 L 20.815 12.543 L 20.792 12.455 C 20.455 11.305 19.712 10.419 18.573 9.972 L 18.368 9.897 L 17.419 9.581 L 17.103 8.632 C 16.195 5.909 14.180 4.000 12.000 4.000 ZM 12.000 12.000 C 12.828 12.000 13.500 13.119 13.500 14.500 C 13.500 15.881 12.828 17.000 12.000 17.000 C 11.172 17.000 10.500 15.881 10.500 14.500 C 10.500 13.119 11.172 12.000 12.000 12.000 ZM 9.500 8.000 C 10.328 8.000 11.000 8.672 11.000 9.500 C 11.000 10.328 10.328 11.000 9.500 11.000 C 8.672 11.000 8.000 10.328 8.000 9.500 C 8.000 8.672 8.672 8.000 9.500 8.000 ZM 14.500 8.000 C 15.328 8.000 16.000 8.672 16.000 9.500 C 16.000 10.328 15.328 11.000 14.500 11.000 C 13.672 11.000 13.000 10.328 13.000 9.500 C 13.000 8.672 13.672 8.000 14.500 8.000 Z"),
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
        return _ghost2Line!!
    }

private var _ghost2Line: ImageVector? = null
