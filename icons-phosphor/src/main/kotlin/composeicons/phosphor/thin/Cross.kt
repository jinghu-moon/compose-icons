package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cross: ImageVector
    get() {
        if (_cross != null) return _cross!!
        _cross = phosphorThinIcon(
            name = "Cross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 76h-44v-44c0-6.627-5.373-12-12-12h-32c-6.627 0-12 5.373-12 12v44h-44C49.373 76 44 81.373 44 88v32c0 6.627 5.373 12 12 12h44v92c0 6.627 5.373 12 12 12h32c6.627 0 12-5.373 12-12v-92h44c6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12ZM204 120c0 2.209-1.791 4-4 4h-48c-2.209 0-4 1.791-4 4v96c0 2.209-1.791 4-4 4h-32c-2.209 0-4-1.791-4-4v-96c0-2.209-1.791-4-4-4h-48c-2.209 0-4-1.791-4-4v-32c0-2.209 1.791-4 4-4h48c2.209 0 4-1.791 4-4v-48c0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4v48c0 2.209 1.791 4 4 4h48c2.209 0 4 1.791 4 4Z"),
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
        return _cross!!
    }

private var _cross: ImageVector? = null
