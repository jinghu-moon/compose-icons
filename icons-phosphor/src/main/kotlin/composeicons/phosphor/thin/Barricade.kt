package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Barricade: ImageVector
    get() {
        if (_barricade != null) return _barricade!!
        _barricade = phosphorThinIcon(
            name = "Barricade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 68h-192C25.373 68 20 73.373 20 80v72c0 6.627 5.373 12 12 12h28v36c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-36h120v36c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-36h28c6.627 0 12-5.373 12-12v-72c0-6.627-5.373-12-12-12ZM228 80v58.34L165.66 76h58.34c2.209 0 4 1.791 4 4ZM32 76h50.34l80 80h-60.68L28 82.34v-2.34c0-2.209 1.791-4 4-4ZM28 152v-58.34L90.34 156h-58.34c-2.209 0-4-1.791-4-4ZM224 156h-50.34l-80-80h60.68L228 149.66v2.34c0 2.209-1.791 4-4 4Z"),
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
        return _barricade!!
    }

private var _barricade: ImageVector? = null
