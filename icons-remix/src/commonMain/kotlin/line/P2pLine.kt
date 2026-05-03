package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.P2pLine: ImageVector
    get() {
        if (_p2pLine != null) return _p2pLine!!
        _p2pLine = remixIcon(
            name = "P2pLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 6.000 C 16.448 6.000 16.000 5.552 16.000 5.000 C 16.000 4.448 16.448 4.000 17.000 4.000 C 17.552 4.000 18.000 4.448 18.000 5.000 C 18.000 5.552 17.552 6.000 17.000 6.000 ZM 17.000 8.000 C 18.657 8.000 20.000 6.657 20.000 5.000 C 20.000 3.343 18.657 2.000 17.000 2.000 C 15.343 2.000 14.000 3.343 14.000 5.000 C 14.000 6.657 15.343 8.000 17.000 8.000 ZM 7.000 3.000 C 4.791 3.000 3.000 4.791 3.000 7.000 L 3.000 9.000 L 5.000 9.000 L 5.000 7.000 C 5.000 5.895 5.895 5.000 7.000 5.000 L 10.000 5.000 L 10.000 3.000 L 7.000 3.000 ZM 17.000 21.000 C 19.209 21.000 21.000 19.209 21.000 17.000 L 21.000 15.000 L 19.000 15.000 L 19.000 17.000 C 19.000 18.105 18.105 19.000 17.000 19.000 L 14.000 19.000 L 14.000 21.000 L 17.000 21.000 ZM 8.000 13.000 C 8.000 12.448 7.552 12.000 7.000 12.000 C 6.448 12.000 6.000 12.448 6.000 13.000 C 6.000 13.552 6.448 14.000 7.000 14.000 C 7.552 14.000 8.000 13.552 8.000 13.000 ZM 10.000 13.000 C 10.000 14.657 8.657 16.000 7.000 16.000 C 5.343 16.000 4.000 14.657 4.000 13.000 C 4.000 11.343 5.343 10.000 7.000 10.000 C 8.657 10.000 10.000 11.343 10.000 13.000 ZM 17.000 11.000 C 15.895 11.000 15.000 11.895 15.000 13.000 L 13.000 13.000 C 13.000 10.791 14.791 9.000 17.000 9.000 C 19.209 9.000 21.000 10.791 21.000 13.000 L 19.000 13.000 C 19.000 11.895 18.105 11.000 17.000 11.000 ZM 5.000 21.000 C 5.000 19.895 5.895 19.000 7.000 19.000 C 8.105 19.000 9.000 19.895 9.000 21.000 L 11.000 21.000 C 11.000 18.791 9.209 17.000 7.000 17.000 C 4.791 17.000 3.000 18.791 3.000 21.000 L 5.000 21.000 Z"),
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
        return _p2pLine!!
    }

private var _p2pLine: ImageVector? = null
