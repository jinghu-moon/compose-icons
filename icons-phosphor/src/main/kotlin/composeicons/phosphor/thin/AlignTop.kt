package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AlignTop: ImageVector
    get() {
        if (_alignTop != null) return _alignTop!!
        _alignTop = phosphorThinIcon(
            name = "AlignTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 40c0 2.209-1.791 4-4 4h-176c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4ZM204 80v96c0 6.627-5.373 12-12 12h-40c-6.627 0-12-5.373-12-12v-96c0-6.627 5.373-12 12-12h40c6.627 0 12 5.373 12 12ZM196 80c0-2.209-1.791-4-4-4h-40c-2.209 0-4 1.791-4 4v96c0 2.209 1.791 4 4 4h40c2.209 0 4-1.791 4-4ZM116 80v136c0 6.627-5.373 12-12 12h-40c-6.627 0-12-5.373-12-12v-136C52 73.373 57.373 68 64 68h40c6.627 0 12 5.373 12 12ZM108 80c0-2.209-1.791-4-4-4h-40c-2.209 0-4 1.791-4 4v136c0 2.209 1.791 4 4 4h40c2.209 0 4-1.791 4-4Z"),
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
        return _alignTop!!
    }

private var _alignTop: ImageVector? = null
