package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Wind: ImageVector
    get() {
        if (_wind != null) return _wind!!
        _wind = phosphorBoldIcon(
            name = "Wind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M24 104C17.373 104 12 98.627 12 92 12 85.373 17.373 80 24 80h96c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12-3.864 .112-7.537 1.706-10.26 4.45-4.728 4.311-12.007 4.153-16.545-.358C88.658 55.581 88.457 48.304 92.74 43.55 99.976 36.297 109.756 32.154 120 32c19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36ZM208 68c-10.258 .143-20.054 4.288-27.3 11.55-4.283 4.754-4.082 12.031 .455 16.542 4.538 4.511 11.816 4.668 16.545 .358C200.433 93.696 204.122 92.102 208 92c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-176c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h176c19.882 0 36-16.118 36-36C244 84.118 227.882 68 208 68ZM152 152h-112c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h112c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-3.867-.114-7.543-1.707-10.27-4.45-2.964-3.29-7.498-4.68-11.797-3.617-4.298 1.063-7.662 4.407-8.751 8.699-1.088 4.292 .275 8.835 3.547 11.818 7.239 7.255 17.023 11.399 27.27 11.55 19.882 0 36-16.118 36-36 0-19.882-16.118-36-36-36Z"),
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
        return _wind!!
    }

private var _wind: ImageVector? = null
