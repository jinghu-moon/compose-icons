package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Crop: ImageVector
    get() {
        if (_crop != null) return _crop!!
        _crop = phosphorThinIcon(
            name = "Crop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 192c0 2.209-1.791 4-4 4h-36v36c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-36h-124c-2.209 0-4-1.791-4-4v-124h-36c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h36v-36c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v164h164c2.209 0 4 1.791 4 4ZM96 68h92v92c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-96c0-2.209-1.791-4-4-4h-96c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4Z"),
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
        return _crop!!
    }

private var _crop: ImageVector? = null
