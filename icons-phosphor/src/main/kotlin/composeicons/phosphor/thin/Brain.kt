package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Brain: ImageVector
    get() {
        if (_brain != null) return _brain!!
        _brain = phosphorThinIcon(
            name = "Brain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 124C243.973 103.016 231.36 84.096 212 76v-4C211.986 51.32 197.572 33.441 177.366 29.039 157.16 24.637 136.615 34.9 128 53.7 119.385 34.9 98.84 24.637 78.634 29.039 58.428 33.441 44.014 51.32 44 72v4C24.622 84.074 12 103.008 12 124c0 20.992 12.622 39.926 32 48v4c.014 20.68 14.428 38.559 34.634 42.961 20.206 4.402 40.751-5.861 49.366-24.661 8.615 18.8 29.16 29.063 49.366 24.661C197.572 214.559 211.986 196.68 212 176v-4c19.365-8.089 31.981-27.013 32-48ZM88 212C68.118 212 52 195.882 52 176v-1.41c3.932 .934 7.959 1.407 12 1.41h8c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-8C42.552 168.024 24.211 152.58 20.584 131.441 16.957 110.301 29.1 89.627 49.33 82.5c1.599-.564 2.669-2.074 2.67-3.77v-6.73C52 52.118 68.118 36 88 36c19.882 0 36 16.118 36 36v78.75C115.772 139.008 102.338 132.011 88 132c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36ZM192 168h-8c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h8c4.041-.003 8.068-.476 12-1.41v1.41c0 19.882-16.118 36-36 36-19.882 0-36-16.118-36-36 0-19.882 16.118-36 36-36 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4-14.338 .011-27.772 7.008-36 18.75v-78.75c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36v6.73c.001 1.696 1.071 3.206 2.67 3.77 20.23 7.127 32.373 27.801 28.746 48.941C231.789 152.58 213.448 168.024 192 168ZM204 112c0 2.209-1.791 4-4 4h-4c-17.673 0-32-14.327-32-32v-4c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v4c0 13.255 10.745 24 24 24h4c2.209 0 4 1.791 4 4ZM92 84c0 17.673-14.327 32-32 32h-4c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h4C73.255 108 84 97.255 84 84v-4c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4Z"),
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
        return _brain!!
    }

private var _brain: ImageVector? = null
