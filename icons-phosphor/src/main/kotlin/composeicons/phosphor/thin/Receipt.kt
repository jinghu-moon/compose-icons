package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Receipt: ImageVector
    get() {
        if (_receipt != null) return _receipt!!
        _receipt = phosphorThinIcon(
            name = "Receipt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 104c0 2.209-1.791 4-4 4h-96c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h96c2.209 0 4 1.791 4 4ZM176 132h-96c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h96c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM228 56v152c0 2.209-1.791 4-4 4-.621-.001-1.233-.145-1.79-.42L192 196.47l-30.21 15.11c-1.127 .564-2.453 .564-3.58 0L128 196.47 97.79 211.58c-1.127 .564-2.453 .564-3.58 0L64 196.47 33.79 211.58c-1.24 .621-2.714 .555-3.894-.175C28.717 210.676 27.999 209.387 28 208v-152C28 49.373 33.373 44 40 44h176c6.627 0 12 5.373 12 12ZM220 56c0-2.209-1.791-4-4-4h-176c-2.209 0-4 1.791-4 4v145.53L62.21 188.42c1.127-.564 2.453-.564 3.58 0L96 203.53l30.21-15.11c1.127-.564 2.453-.564 3.58 0L160 203.53l30.21-15.11c1.127-.564 2.453-.564 3.58 0L220 201.53Z"),
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
        return _receipt!!
    }

private var _receipt: ImageVector? = null
