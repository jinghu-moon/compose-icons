package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.VideoConference: ImageVector
    get() {
        if (_videoConference != null) return _videoConference!!
        _videoConference = phosphorThinIcon(
            name = "VideoConference",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 44h-176C33.373 44 28 49.373 28 56v144c0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12v-144c0-6.627-5.373-12-12-12ZM220 56v68h-56v-72h52c2.209 0 4 1.791 4 4ZM36 200v-144c0-2.209 1.791-4 4-4h116v152h-116c-2.209 0-4-1.791-4-4ZM216 204h-52v-72h56v68c0 2.209-1.791 4-4 4ZM184 88c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM200 168c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM131.87 167c-2.876-10.576-10.388-19.279-20.43-23.67 10.31-6.815 14.933-19.584 11.374-31.42C119.256 100.075 108.359 91.972 96 91.972c-12.359 0-23.256 8.103-26.814 19.939-3.558 11.836 1.064 24.604 11.374 31.42C70.525 147.73 63.016 156.43 60.13 167c-.551 2.137 .734 4.316 2.87 4.87 .326 .087 .662 .13 1 .13 1.823-.001 3.414-1.235 3.87-3C71 157 83.05 148 96 148c12.95 0 25.06 9 28.13 21 .312 1.432 1.383 2.578 2.79 2.988 1.407 .41 2.925 .017 3.957-1.023 1.032-1.04 1.413-2.561 .993-3.965ZM76 120c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C84.954 140 76 131.046 76 120Z"),
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
        return _videoConference!!
    }

private var _videoConference: ImageVector? = null
