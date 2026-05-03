package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TokenSwapLine: ImageVector
    get() {
        if (_tokenSwapLine != null) return _tokenSwapLine!!
        _tokenSwapLine = remixIcon(
            name = "TokenSwapLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 12.500 L 6.500 15.000 L 9.000 17.500 L 11.500 15.000 L 9.000 12.500 ZM 15.000 2.500 C 11.572 2.500 8.764 5.153 8.518 8.518 C 5.153 8.764 2.500 11.572 2.500 15.000 C 2.500 18.590 5.410 21.500 9.000 21.500 C 12.428 21.500 15.236 18.847 15.482 15.482 C 18.847 15.236 21.500 12.428 21.500 9.000 C 21.500 5.410 18.590 2.500 15.000 2.500 ZM 15.323 13.489 C 14.757 11.113 12.887 9.242 10.511 8.677 C 10.677 6.342 12.623 4.500 15.000 4.500 C 17.485 4.500 19.500 6.515 19.500 9.000 C 19.500 11.377 17.658 13.323 15.323 13.489 ZM 13.500 15.000 C 13.500 17.485 11.485 19.500 9.000 19.500 C 6.515 19.500 4.500 17.485 4.500 15.000 C 4.500 12.515 6.515 10.500 9.000 10.500 C 11.485 10.500 13.500 12.515 13.500 15.000 ZM 3.000 7.000 C 3.000 4.791 4.791 3.000 7.000 3.000 L 8.500 3.000 L 8.500 5.000 L 7.000 5.000 C 5.895 5.000 5.000 5.895 5.000 7.000 L 5.000 8.500 L 3.000 8.500 L 3.000 7.000 ZM 19.000 17.000 L 19.000 15.500 L 21.000 15.500 L 21.000 17.000 C 21.000 19.209 19.209 21.000 17.000 21.000 L 15.500 21.000 L 15.500 19.000 L 17.000 19.000 C 18.105 19.000 19.000 18.105 19.000 17.000 Z"),
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
        return _tokenSwapLine!!
    }

private var _tokenSwapLine: ImageVector? = null
