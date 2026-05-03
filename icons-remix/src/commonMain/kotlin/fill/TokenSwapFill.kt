package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TokenSwapFill: ImageVector
    get() {
        if (_tokenSwapFill != null) return _tokenSwapFill!!
        _tokenSwapFill = remixIcon(
            name = "TokenSwapFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.500 9.000 C 21.500 11.704 19.849 14.022 17.500 15.002 L 17.500 15.000 C 17.500 10.306 13.694 6.500 9.000 6.500 L 8.998 6.500 C 9.978 4.151 12.296 2.500 15.000 2.500 C 18.590 2.500 21.500 5.410 21.500 9.000 ZM 7.000 3.000 C 4.791 3.000 3.000 4.791 3.000 7.000 L 3.000 8.500 L 5.000 8.500 L 5.000 7.000 C 5.000 5.895 5.895 5.000 7.000 5.000 L 8.500 5.000 L 8.500 3.000 L 7.000 3.000 ZM 19.000 15.500 L 19.000 17.000 C 19.000 18.105 18.105 19.000 17.000 19.000 L 15.500 19.000 L 15.500 21.000 L 17.000 21.000 C 19.209 21.000 21.000 19.209 21.000 17.000 L 21.000 15.500 L 19.000 15.500 ZM 9.000 21.500 C 12.590 21.500 15.500 18.590 15.500 15.000 C 15.500 11.410 12.590 8.500 9.000 8.500 C 5.410 8.500 2.500 11.410 2.500 15.000 C 2.500 18.590 5.410 21.500 9.000 21.500 ZM 9.000 12.500 L 11.500 15.000 L 9.000 17.500 L 6.500 15.000 L 9.000 12.500 Z"),
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
        return _tokenSwapFill!!
    }

private var _tokenSwapFill: ImageVector? = null
