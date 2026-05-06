package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AlignLeftSimple: ImageVector
    get() {
        if (_alignLeftSimple != null) return _alignLeftSimple!!
        _alignLeftSimple = phosphorThinIcon(
            name = "AlignLeftSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M36 56v144c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-144c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM236 96v64c0 6.627-5.373 12-12 12h-152c-6.627 0-12-5.373-12-12v-64C60 89.373 65.373 84 72 84h152c6.627 0 12 5.373 12 12ZM228 96c0-2.209-1.791-4-4-4h-152c-2.209 0-4 1.791-4 4v64c0 2.209 1.791 4 4 4h152c2.209 0 4-1.791 4-4Z"),
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
        return _alignLeftSimple!!
    }

private var _alignLeftSimple: ImageVector? = null
