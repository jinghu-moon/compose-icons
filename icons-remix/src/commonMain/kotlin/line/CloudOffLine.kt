package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CloudOffLine: ImageVector
    get() {
        if (_cloudOffLine != null) return _cloudOffLine!!
        _cloudOffLine = remixIcon(
            name = "CloudOffLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.515 2.101 L 22.607 21.192 L 21.192 22.607 L 19.178 20.592 C 18.503 20.856 17.768 21.000 17.000 21.000 L 7.000 21.000 C 3.686 21.000 1.000 18.314 1.000 15.000 C 1.000 12.385 2.673 10.160 5.008 9.339 C 5.003 9.226 5.000 9.114 5.000 9.000 C 5.000 8.222 5.127 7.474 5.361 6.775 L 2.101 3.515 L 3.515 2.101 ZM 7.000 9.000 C 7.000 9.081 7.002 9.163 7.006 9.243 L 7.077 10.731 L 5.672 11.225 C 4.084 11.784 3.000 13.289 3.000 15.000 C 3.000 17.209 4.791 19.000 7.000 19.000 L 17.000 19.000 C 17.186 19.000 17.369 18.987 17.548 18.963 L 7.030 8.445 C 7.010 8.627 7.000 8.812 7.000 9.000 ZM 12.000 2.000 C 15.866 2.000 19.000 5.134 19.000 9.000 C 19.000 9.114 18.997 9.226 18.992 9.339 C 21.326 10.160 23.000 12.385 23.000 15.000 C 23.000 16.088 22.710 17.109 22.204 17.989 L 20.711 16.496 C 20.897 16.034 21.000 15.529 21.000 15.000 C 21.000 12.790 19.210 11.000 17.000 11.000 C 16.471 11.000 15.966 11.103 15.504 11.289 L 14.011 9.796 C 14.891 9.290 15.912 9.000 17.000 9.000 C 17.000 6.239 14.761 4.000 12.000 4.000 C 10.929 4.000 9.938 4.336 9.124 4.909 L 7.694 3.481 C 8.882 2.553 10.376 2.000 12.000 2.000 Z"),
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
        return _cloudOffLine!!
    }

private var _cloudOffLine: ImageVector? = null
