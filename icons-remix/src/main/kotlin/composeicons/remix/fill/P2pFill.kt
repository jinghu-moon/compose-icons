package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.P2pFill: ImageVector
    get() {
        if (_p2pFill != null) return _p2pFill!!
        _p2pFill = remixIcon(
            name = "P2pFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 5c0 1.657-1.343 3-3 3C15.343 8 14 6.657 14 5 14 3.343 15.343 2 17 2c1.657 0 3 1.343 3 3ZM7 3C4.791 3 3 4.791 3 7v2h2v-2C5 5.895 5.895 5 7 5h3v-2h-3ZM17 21c2.209 0 4-1.791 4-4v-2h-2v2c0 1.105-.895 2-2 2h-3v2h3ZM7 16c1.657 0 3-1.343 3-3C10 11.343 8.657 10 7 10 5.343 10 4 11.343 4 13c0 1.657 1.343 3 3 3ZM17 9c-2.209 0-4 1.791-4 4h8C21 10.791 19.209 9 17 9ZM3 21C3 18.791 4.791 17 7 17c2.209 0 4 1.791 4 4h-8Z"),
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
        return _p2pFill!!
    }

private var _p2pFill: ImageVector? = null
