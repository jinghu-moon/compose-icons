package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ImageSquare: ImageVector
    get() {
        if (_imageSquare != null) return _imageSquare!!
        _imageSquare = phosphorThinIcon(
            name = "ImageSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-160C41.373 36 36 41.373 36 48v160c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM44 208v-160c0-2.209 1.791-4 4-4h160c2.209 0 4 1.791 4 4v87L180.49 103.48c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L55 212h-7c-2.209 0-4-1.791-4-4ZM208 212h-141.66L169.17 109.17c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173L212 146.34v61.66c0 2.209-1.791 4-4 4ZM96 116c11.046 0 20-8.954 20-20C116 84.954 107.046 76 96 76 84.954 76 76 84.954 76 96c0 11.046 8.954 20 20 20ZM96 84c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12C89.373 108 84 102.627 84 96 84 89.373 89.373 84 96 84Z"),
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
        return _imageSquare!!
    }

private var _imageSquare: ImageVector? = null
