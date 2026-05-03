package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FootprintLine: ImageVector
    get() {
        if (_footprintLine != null) return _footprintLine!!
        _footprintLine = remixIcon(
            name = "FootprintLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 18.000 L 9.500 18.000 L 9.500 19.250 C 9.500 20.769 8.269 22.000 6.750 22.000 C 5.231 22.000 4.000 20.769 4.000 19.250 L 4.000 18.000 ZM 8.058 14.000 L 8.103 13.868 C 8.870 11.762 9.000 11.371 9.000 11.000 C 9.000 10.251 8.797 9.357 8.472 8.727 C 8.230 8.258 8.060 8.121 8.000 8.121 C 6.721 8.121 5.500 9.485 5.500 11.000 C 5.500 11.959 5.575 12.773 5.727 13.758 C 5.733 13.798 5.747 13.887 5.765 14.000 L 8.058 14.000 ZM 8.000 6.121 C 10.000 6.121 11.000 9.000 11.000 11.000 C 11.000 12.000 10.500 13.000 10.000 14.500 L 9.500 16.000 L 4.000 16.000 C 4.000 15.000 3.500 13.500 3.500 11.000 C 3.500 8.500 5.498 6.121 8.000 6.121 ZM 20.054 14.098 L 19.837 15.329 C 19.573 16.825 18.147 17.824 16.651 17.560 C 15.155 17.296 14.157 15.870 14.420 14.374 L 14.637 13.143 L 20.054 14.098 ZM 19.004 9.852 C 19.170 9.352 19.305 8.958 19.307 8.952 C 19.509 8.294 19.668 7.649 19.792 6.944 C 20.056 5.452 19.090 3.897 17.830 3.674 C 17.771 3.664 17.580 3.769 17.260 4.189 C 16.830 4.754 16.476 5.598 16.346 6.336 C 16.287 6.667 16.296 6.741 16.616 8.599 C 16.660 8.855 16.697 9.085 16.731 9.316 L 16.752 9.454 L 19.004 9.852 ZM 18.178 1.705 C 20.642 2.139 22.196 4.830 21.762 7.292 C 21.328 9.754 20.575 11.144 20.401 12.129 L 14.985 11.174 L 14.753 9.610 C 14.521 8.046 14.202 6.974 14.376 5.989 C 14.723 4.020 16.208 1.358 18.178 1.705 Z"),
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
        return _footprintLine!!
    }

private var _footprintLine: ImageVector? = null
