package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Boat: ImageVector
    get() {
        if (_boat != null) return _boat!!
        _boat = phosphorThinIcon(
            name = "Boat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.79 114.38 204 109.12v-53.12c0-6.627-5.373-12-12-12h-60v-20c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v20h-60C57.373 44 52 49.373 52 56v53.12l-15.8 5.26c-4.9 1.636-8.203 6.224-8.2 11.39v26.23c0 24.46 17.32 46.77 50.09 64.52 15.521 8.277 31.929 14.772 48.91 19.36 .637 .159 1.303 .159 1.94 0 16.992-4.586 33.409-11.081 48.94-19.36C210.68 198.77 228 176.46 228 152v-26.23c.002-5.169-3.306-9.758-8.21-11.39ZM60 56c0-2.209 1.791-4 4-4h128c2.209 0 4 1.791 4 4v50.45L129.26 84.21c-.817-.28-1.703-.28-2.52 0L60 106.45ZM220 152c0 49.32-82.08 73.16-92 75.86C118.08 225.16 36 201.32 36 152v-26.23c-.003-1.722 1.097-3.253 2.73-3.8L124 93.55v74.45c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-74.45L217.26 122c1.637 .543 2.742 2.075 2.74 3.8Z"),
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
        return _boat!!
    }

private var _boat: ImageVector? = null
