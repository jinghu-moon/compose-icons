package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Newspaper: ImageVector
    get() {
        if (_newspaper != null) return _newspaper!!
        _newspaper = phosphorThinIcon(
            name = "Newspaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 112c0 2.209-1.791 4-4 4h-80c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h80c2.209 0 4 1.791 4 4ZM176 140h-80c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h80c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM228 64v120c0 11.046-8.954 20-20 20h-176c-11.015 0-19.956-8.906-20-19.92v-96.08c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v96c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-120C44 57.373 49.373 52 56 52h160c6.627 0 12 5.373 12 12ZM220 64c0-2.209-1.791-4-4-4h-160c-2.209 0-4 1.791-4 4v120c.01 4.329-1.394 8.543-4 12h160c6.627 0 12-5.373 12-12Z"),
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
        return _newspaper!!
    }

private var _newspaper: ImageVector? = null
