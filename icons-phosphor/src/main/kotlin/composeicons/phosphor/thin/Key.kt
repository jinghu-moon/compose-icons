package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Key: ImageVector
    get() {
        if (_key != null) return _key!!
        _key = phosphorThinIcon(
            name = "Key",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.74 42.26C188.567 17.062 149.272 12.725 119.211 31.828 89.149 50.932 76.387 88.349 88.51 121.84l-57 57c-2.252 2.243-3.515 5.292-3.51 8.47v28.69c0 6.627 5.373 12 12 12h32c2.209 0 4-1.791 4-4v-20h20c2.209 0 4-1.791 4-4v-20h20c1.061 .001 2.079-.42 2.83-1.17l11.33-11.34c8.285 2.995 17.03 4.521 25.84 4.51h.1c30.721-.04 58.396-18.572 70.134-46.962C241.971 96.648 235.463 63.983 213.74 42.26ZM227.96 98.26c-1.15 36.22-31.6 65.72-67.87 65.77h-.09c-8.635 .017-17.193-1.623-25.21-4.83-1.512-.67-3.281-.34-4.45 .83l-12 12h-22.34c-2.209 0-4 1.791-4 4v20h-20c-2.209 0-4 1.791-4 4v20h-28c-2.209 0-4-1.791-4-4v-28.72c.006-1.06 .426-2.076 1.17-2.83L96 125.66c1.17-1.169 1.5-2.938 .83-4.45C93.611 113.165 91.971 104.575 92 95.91 92 59.64 121.55 29.19 157.77 28c18.812-.628 37.042 6.57 50.351 19.879C221.43 61.188 228.628 79.418 228 98.23ZM188 76c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _key!!
    }

private var _key: ImageVector? = null
