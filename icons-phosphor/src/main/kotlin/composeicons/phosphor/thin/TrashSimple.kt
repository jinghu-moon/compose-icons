package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TrashSimple: ImageVector
    get() {
        if (_trashSimple != null) return _trashSimple!!
        _trashSimple = phosphorThinIcon(
            name = "TrashSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 52h-176c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h12v148c0 6.627 5.373 12 12 12h128c6.627 0 12-5.373 12-12v-148h12c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM196 208c0 2.209-1.791 4-4 4h-128c-2.209 0-4-1.791-4-4v-148h136ZM84 24c0-2.209 1.791-4 4-4h80c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-80c-2.209 0-4-1.791-4-4Z"),
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
        return _trashSimple!!
    }

private var _trashSimple: ImageVector? = null
