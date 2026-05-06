package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SneakerMove: ImageVector
    get() {
        if (_sneakerMove != null) return _sneakerMove!!
        _sneakerMove = phosphorThinIcon(
            name = "SneakerMove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.37 170.21 200.75 155.9C183.082 147.147 171.93 129.107 172 109.39v-29.39c0-2.209-1.791-4-4-4C139.295 75.967 116.033 52.705 116 24c.002-1.521-.858-2.911-2.22-3.587-1.362-.677-2.989-.523-4.2 .397l-77 58.41-.1 .08c-2.644 2.139-4.255 5.3-4.435 8.696-.179 3.396 1.091 6.709 3.495 9.114L145.23 210.83c.751 .75 1.769 1.171 2.83 1.17h75.94c6.627 0 12-5.373 12-12v-19.06c.014-4.547-2.557-8.708-6.63-10.73ZM228 200c0 2.209-1.791 4-4 4h-74.28L37.17 91.45c-.794-.795-1.217-1.887-1.166-3.01 .051-1.122 .572-2.171 1.436-2.89l15.79-12 41.26 41.25c1.574 1.493 4.051 1.459 5.583-.076 1.533-1.535 1.562-4.012 .067-5.584L59.67 68.7 108.49 31.7c3.72 28.39 26.944 50.217 55.51 52.17v25.52c-.077 22.75 12.788 43.565 33.17 53.67l28.62 14.31c1.352 .677 2.207 2.058 2.21 3.57ZM70.8 180h-38.8c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h38.8c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4ZM106.8 208c0 2.209-1.791 4-4 4h-54.8c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h54.8c2.209 0 4 1.791 4 4Z"),
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
        return _sneakerMove!!
    }

private var _sneakerMove: ImageVector? = null
