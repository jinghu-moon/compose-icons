package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MoonStars: ImageVector
    get() {
        if (_moonStars != null) return _moonStars!!
        _moonStars = phosphorBoldIcon(
            name = "MoonStars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 96c0 6.627-5.373 12-12 12h-12v12c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-12h-12c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h12v-12c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v12h12c6.627 0 12 5.373 12 12ZM144 60h4v4c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-4h4c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-4v-4c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v4h-4c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM219.81 150.38c2.83 3.286 3.667 7.843 2.19 11.92-15.926 43.465-59.602 70.318-105.576 64.911C70.45 221.804 34.196 185.55 28.789 139.576 23.382 93.602 50.235 49.926 93.7 34c4.071-1.487 8.628-.664 11.921 2.154 3.293 2.818 4.81 7.194 3.969 11.445C108.531 53.002 107.998 58.495 108 64c.05 46.371 37.629 83.95 84 84 5.495-.001 10.977-.533 16.37-1.59 4.25-.839 8.623 .679 11.44 3.97ZM190 172C131.934 170.867 85.133 124.066 84 66 59.421 83.519 47.539 113.922 53.725 143.465c6.186 29.542 29.268 52.624 58.81 58.81C142.078 208.461 172.481 196.579 190 172Z"),
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
        return _moonStars!!
    }

private var _moonStars: ImageVector? = null
