package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CactusLine: ImageVector
    get() {
        if (_cactusLine != null) return _cactusLine!!
        _cactusLine = remixIcon(
            name = "CactusLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.998 2.000 C 14.207 2.000 15.998 3.791 15.998 6.000 L 15.998 15.000 L 16.998 15.000 C 17.548 15.000 17.998 14.550 17.998 14.000 L 17.998 8.000 C 17.998 7.448 18.446 7.000 18.998 7.000 C 19.550 7.000 19.998 7.448 19.998 8.000 L 19.998 14.000 C 19.998 15.660 18.658 17.000 16.998 17.000 L 15.998 17.000 L 15.998 20.000 L 17.998 20.000 L 17.998 22.000 L 5.998 22.000 L 5.998 20.000 L 7.998 20.000 L 7.998 14.000 L 6.998 14.000 C 5.341 14.000 3.998 12.657 3.998 11.000 L 3.998 9.000 C 3.998 8.448 4.446 8.000 4.998 8.000 C 5.550 8.000 5.998 8.448 5.998 9.000 L 5.998 11.000 C 5.998 11.550 6.448 12.000 6.998 12.000 L 7.998 12.000 L 7.998 6.000 C 7.998 3.791 9.789 2.000 11.998 2.000 ZM 11.998 4.000 C 10.894 4.000 9.998 4.895 9.998 6.000 L 9.998 20.000 L 13.998 20.000 L 13.998 6.000 C 13.998 4.895 13.103 4.000 11.998 4.000 Z"),
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
        return _cactusLine!!
    }

private var _cactusLine: ImageVector? = null
