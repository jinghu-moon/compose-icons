package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PlugLine: ImageVector
    get() {
        if (_plugLine != null) return _plugLine!!
        _plugLine = remixIcon(
            name = "PlugLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 18.000 L 13.000 20.000 L 19.000 20.000 L 19.000 22.000 L 13.000 22.000 C 11.895 22.000 11.000 21.105 11.000 20.000 L 11.000 18.000 L 8.000 18.000 C 5.791 18.000 4.000 16.209 4.000 14.000 L 4.000 7.000 C 4.000 6.448 4.448 6.000 5.000 6.000 L 8.000 6.000 L 8.000 2.000 L 10.000 2.000 L 10.000 6.000 L 14.000 6.000 L 14.000 2.000 L 16.000 2.000 L 16.000 6.000 L 19.000 6.000 C 19.552 6.000 20.000 6.448 20.000 7.000 L 20.000 14.000 C 20.000 16.209 18.209 18.000 16.000 18.000 L 13.000 18.000 ZM 8.000 16.000 L 16.000 16.000 C 17.105 16.000 18.000 15.105 18.000 14.000 L 18.000 11.000 L 6.000 11.000 L 6.000 14.000 C 6.000 15.105 6.895 16.000 8.000 16.000 ZM 18.000 8.000 L 6.000 8.000 L 6.000 9.000 L 18.000 9.000 L 18.000 8.000 ZM 12.000 14.500 C 11.448 14.500 11.000 14.052 11.000 13.500 C 11.000 12.948 11.448 12.500 12.000 12.500 C 12.552 12.500 13.000 12.948 13.000 13.500 C 13.000 14.052 12.552 14.500 12.000 14.500 Z"),
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
        return _plugLine!!
    }

private var _plugLine: ImageVector? = null
