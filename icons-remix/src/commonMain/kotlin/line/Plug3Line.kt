package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Plug3Line: ImageVector
    get() {
        if (_plug3Line != null) return _plug3Line!!
        _plug3Line = remixIcon(
            name = "Plug3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 22.000 L 7.000 22.000 L 7.000 20.000 L 17.000 20.000 L 17.000 22.000 ZM 10.000 5.000 L 14.000 5.000 L 14.000 2.000 L 16.000 2.000 L 16.000 5.000 L 20.000 5.000 C 20.552 5.000 21.000 5.448 21.000 6.000 L 21.000 15.000 C 21.000 17.209 19.209 19.000 17.000 19.000 L 7.000 19.000 C 4.791 19.000 3.000 17.209 3.000 15.000 L 3.000 6.000 C 3.000 5.448 3.448 5.000 4.000 5.000 L 8.000 5.000 L 8.000 2.000 L 10.000 2.000 L 10.000 5.000 ZM 5.000 15.000 C 5.000 16.105 5.895 17.000 7.000 17.000 L 17.000 17.000 C 18.105 17.000 19.000 16.105 19.000 15.000 L 19.000 7.000 L 5.000 7.000 L 5.000 15.000 Z"),
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
        return _plug3Line!!
    }

private var _plug3Line: ImageVector? = null
