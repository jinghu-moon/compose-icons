package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TrelloLine: ImageVector
    get() {
        if (_trelloLine != null) return _trelloLine!!
        _trelloLine = remixIcon(
            name = "TrelloLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.001 5.000 L 5.001 19.000 L 19.001 19.000 L 19.001 5.000 L 5.001 5.000 ZM 5.001 3.000 L 19.001 3.000 C 20.105 3.000 21.001 3.895 21.001 5.000 L 21.001 19.000 C 21.001 20.105 20.105 21.000 19.001 21.000 L 5.001 21.000 C 3.896 21.000 3.001 20.105 3.001 19.000 L 3.001 5.000 C 3.001 3.895 3.896 3.000 5.001 3.000 ZM 8.001 7.000 L 10.001 7.000 C 10.553 7.000 11.001 7.448 11.001 8.000 L 11.001 16.000 C 11.001 16.552 10.553 17.000 10.001 17.000 L 8.001 17.000 C 7.449 17.000 7.001 16.552 7.001 16.000 L 7.001 8.000 C 7.001 7.448 7.449 7.000 8.001 7.000 ZM 14.001 7.000 L 16.001 7.000 C 16.553 7.000 17.001 7.448 17.001 8.000 L 17.001 12.000 C 17.001 12.552 16.553 13.000 16.001 13.000 L 14.001 13.000 C 13.449 13.000 13.001 12.552 13.001 12.000 L 13.001 8.000 C 13.001 7.448 13.449 7.000 14.001 7.000 Z"),
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
        return _trelloLine!!
    }

private var _trelloLine: ImageVector? = null
