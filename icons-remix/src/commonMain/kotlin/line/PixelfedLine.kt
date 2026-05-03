package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PixelfedLine: ImageVector
    get() {
        if (_pixelfedLine != null) return _pixelfedLine!!
        _pixelfedLine = remixIcon(
            name = "PixelfedLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.001 2.000 C 17.524 2.000 22.001 6.477 22.001 12.000 C 22.001 17.523 17.524 22.000 12.001 22.000 C 6.478 22.000 2.001 17.523 2.001 12.000 C 2.001 6.477 6.478 2.000 12.001 2.000 ZM 12.001 4.000 C 7.583 4.000 4.001 7.582 4.001 12.000 C 4.001 16.418 7.583 20.000 12.001 20.000 C 16.419 20.000 20.001 16.418 20.001 12.000 C 20.001 7.582 16.419 4.000 12.001 4.000 ZM 13.032 8.099 C 14.745 8.099 16.133 9.444 16.133 11.104 C 16.133 12.764 14.745 14.109 13.032 14.109 L 11.214 14.109 L 8.619 16.580 L 8.619 9.832 C 8.619 8.875 9.420 8.099 10.408 8.099 L 13.032 8.099 Z"),
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
        return _pixelfedLine!!
    }

private var _pixelfedLine: ImageVector? = null
