package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SuitcaseRolling: ImageVector
    get() {
        if (_suitcaseRolling != null) return _suitcaseRolling!!
        _suitcaseRolling = phosphorThinIcon(
            name = "SuitcaseRolling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 88v96c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-96c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM128 84c-2.209 0-4 1.791-4 4v96c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-96c0-2.209-1.791-4-4-4ZM160 84c-2.209 0-4 1.791-4 4v96c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-96c0-2.209-1.791-4-4-4ZM204 64v144c0 6.627-5.373 12-12 12h-20v20c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-72v20c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-20c-6.627 0-12-5.373-12-12v-144C52 57.373 57.373 52 64 52h28v-28C92 12.954 100.954 4 112 4h32c11.046 0 20 8.954 20 20v28h28c6.627 0 12 5.373 12 12ZM100 52h56v-28c0-6.627-5.373-12-12-12h-32c-6.627 0-12 5.373-12 12ZM196 64c0-2.209-1.791-4-4-4h-128c-2.209 0-4 1.791-4 4v144c0 2.209 1.791 4 4 4h128c2.209 0 4-1.791 4-4Z"),
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
        return _suitcaseRolling!!
    }

private var _suitcaseRolling: ImageVector? = null
