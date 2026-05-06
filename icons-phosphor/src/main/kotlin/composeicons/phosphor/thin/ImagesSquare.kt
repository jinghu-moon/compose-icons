package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ImagesSquare: ImageVector
    get() {
        if (_imagesSquare != null) return _imagesSquare!!
        _imagesSquare = phosphorThinIcon(
            name = "ImagesSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-128C73.373 36 68 41.373 68 48v20h-20C41.373 68 36 73.373 36 80v128c0 6.627 5.373 12 12 12h128c6.627 0 12-5.373 12-12v-20h20c6.627 0 12-5.373 12-12v-128c0-6.627-5.373-12-12-12ZM76 48c0-2.209 1.791-4 4-4h128c2.209 0 4 1.791 4 4v79L188.49 103.48c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L95 180h-15c-2.209 0-4-1.791-4-4ZM180 208c0 2.209-1.791 4-4 4h-128c-2.209 0-4-1.791-4-4v-128c0-2.209 1.791-4 4-4h20v100c0 6.627 5.373 12 12 12h100ZM208 180h-101.66l70.83-70.83c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173L212 138.34v37.66c0 2.209-1.791 4-4 4ZM120 108c11.046 0 20-8.954 20-20C140 76.954 131.046 68 120 68c-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20ZM120 76c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12Z"),
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
        return _imagesSquare!!
    }

private var _imagesSquare: ImageVector? = null
