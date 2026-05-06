package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ListNumbers: ImageVector
    get() {
        if (_listNumbers != null) return _listNumbers!!
        _listNumbers = phosphorThinIcon(
            name = "ListNumbers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 128c0 2.209-1.791 4-4 4h-112c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h112c2.209 0 4 1.791 4 4ZM104 68h112c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-112c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM216 188h-112c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h112c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM41.79 51.58 52 46.47v57.53c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-64c.001-1.387-.717-2.676-1.896-3.405-1.18-.729-2.653-.796-3.894-.175l-16 8c-1.977 .989-2.779 3.393-1.79 5.37 .989 1.977 3.393 2.779 5.37 1.79ZM72 204h-24L71.85 172.08c3.294-4.182 4.738-9.528 4-14.8-.746-5.332-3.636-10.128-8-13.28-9.04-6.57-21.652-4.841-28.59 3.92-1.274 1.626-2.286 3.441-3 5.38-.535 2.007 .555 4.091 2.51 4.794 1.955 .704 4.123-.206 4.99-2.094 .426-1.158 1.026-2.244 1.78-3.22 4.265-5.366 12.004-6.412 17.54-2.37 2.616 1.882 4.353 4.749 4.81 7.94 .441 3.155-.43 6.354-2.41 8.85L36.8 205.61c-.903 1.212-1.046 2.83-.369 4.181 .677 1.351 2.058 2.206 3.569 2.209h32c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _listNumbers!!
    }

private var _listNumbers: ImageVector? = null
