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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 12.5 6.5 15 9 17.5 11.5 15 9 12.5ZM15 2.5c-3.428 0-6.236 2.653-6.482 6.018C5.153 8.764 2.5 11.572 2.5 15c0 3.59 2.91 6.5 6.5 6.5 3.428 0 6.236-2.653 6.482-6.018C18.847 15.236 21.5 12.428 21.5 9 21.5 5.41 18.59 2.5 15 2.5ZM15.323 13.489C14.757 11.113 12.887 9.242 10.511 8.677 10.677 6.342 12.623 4.5 15 4.5c2.485 0 4.5 2.015 4.5 4.5 0 2.377-1.842 4.323-4.177 4.489ZM13.5 15c0 2.485-2.015 4.5-4.5 4.5C6.515 19.5 4.5 17.485 4.5 15 4.5 12.515 6.515 10.5 9 10.5c2.485 0 4.5 2.015 4.5 4.5ZM3 7C3 4.791 4.791 3 7 3h1.5v2h-1.5C5.895 5 5 5.895 5 7v1.5h-2v-1.5ZM19 17v-1.5h2v1.5c0 2.209-1.791 4-4 4h-1.5v-2h1.5c1.105 0 2-.895 2-2Z"),
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
        return _tokenSwapLine!!
    }

private var _tokenSwapLine: ImageVector? = null
