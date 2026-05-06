package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) return _thumbsUp!!
        _thumbsUp = phosphorThinIcon(
            name = "ThumbsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M231 82.76C227.201 78.459 221.738 75.997 216 76h-60v-20C156 36.118 139.882 20 120 20c-1.516-.001-2.902 .855-3.58 2.21L77.53 100h-45.53c-6.627 0-12 5.373-12 12v88c0 6.627 5.373 12 12 12h172c10.088 .002 18.599-7.509 19.85-17.52l12-96C236.563 92.787 234.797 87.062 231 82.76ZM76 204h-44c-2.209 0-4-1.791-4-4v-88c0-2.209 1.791-4 4-4h44ZM227.91 97.49l-12 96c-.752 6.006-5.858 10.511-11.91 10.51h-120v-99.06L122.42 28.1C136.893 29.356 148.002 41.472 148 56v24c0 2.209 1.791 4 4 4h64c3.443-.001 6.72 1.477 8.999 4.058 2.279 2.581 3.339 6.016 2.911 9.432Z"),
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
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
