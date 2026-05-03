package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CloudLine: ImageVector
    get() {
        if (_cloudLine != null) return _cloudLine!!
        _cloudLine = remixIcon(
            name = "CloudLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 15.866 2.000 19.000 5.134 19.000 9.000 C 19.000 9.114 18.997 9.226 18.992 9.339 C 21.326 10.160 23.000 12.385 23.000 15.000 C 23.000 18.314 20.314 21.000 17.000 21.000 L 7.000 21.000 C 3.686 21.000 1.000 18.314 1.000 15.000 C 1.000 12.385 2.673 10.160 5.008 9.339 C 5.003 9.226 5.000 9.114 5.000 9.000 C 5.000 5.134 8.134 2.000 12.000 2.000 ZM 12.000 4.000 C 9.239 4.000 7.000 6.239 7.000 9.000 C 7.000 9.081 7.002 9.163 7.006 9.243 L 7.077 10.731 L 5.672 11.225 C 4.084 11.784 3.000 13.289 3.000 15.000 C 3.000 17.209 4.791 19.000 7.000 19.000 L 17.000 19.000 C 19.209 19.000 21.000 17.209 21.000 15.000 C 21.000 12.790 19.210 11.000 17.000 11.000 C 15.233 11.000 13.734 12.146 13.204 13.735 L 11.306 13.102 C 12.101 10.719 14.350 9.000 17.000 9.000 C 17.000 6.239 14.761 4.000 12.000 4.000 Z"),
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
        return _cloudLine!!
    }

private var _cloudLine: ImageVector? = null
