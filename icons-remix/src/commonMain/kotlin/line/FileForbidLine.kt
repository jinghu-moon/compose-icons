package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileForbidLine: ImageVector
    get() {
        if (_fileForbidLine != null) return _fileForbidLine!!
        _fileForbidLine = remixIcon(
            name = "FileForbidLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.290 20.000 C 11.505 20.722 11.833 21.396 12.255 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.545 3.000 21.008 L 3.000 2.992 C 3.000 2.444 3.447 2.000 3.999 2.000 L 16.000 2.000 L 21.000 7.000 L 21.000 11.674 C 20.378 11.378 19.706 11.172 19.000 11.071 L 19.000 8.000 L 15.000 8.000 L 15.000 4.000 L 5.000 4.000 L 5.000 20.000 L 11.290 20.000 ZM 18.000 23.000 C 15.239 23.000 13.000 20.761 13.000 18.000 C 13.000 15.239 15.239 13.000 18.000 13.000 C 20.761 13.000 23.000 15.239 23.000 18.000 C 23.000 20.761 20.761 23.000 18.000 23.000 ZM 16.707 20.708 C 17.098 20.895 17.537 21.000 18.000 21.000 C 19.657 21.000 21.000 19.657 21.000 18.000 C 21.000 17.537 20.895 17.098 20.708 16.707 L 16.707 20.708 ZM 15.292 19.293 L 19.293 15.292 C 18.902 15.105 18.463 15.000 18.000 15.000 C 16.343 15.000 15.000 16.343 15.000 18.000 C 15.000 18.463 15.105 18.902 15.292 19.293 Z"),
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
        return _fileForbidLine!!
    }

private var _fileForbidLine: ImageVector? = null
