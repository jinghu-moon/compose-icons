package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CopySimple: ImageVector
    get() {
        if (_copySimple != null) return _copySimple!!
        _copySimple = phosphorThinIcon(
            name = "CopySimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 68h-144c-2.209 0-4 1.791-4 4v144c0 2.209 1.791 4 4 4h144c2.209 0 4-1.791 4-4v-144c0-2.209-1.791-4-4-4ZM180 212h-136v-136h136ZM220 40v144c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-140h-140c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h144c2.209 0 4 1.791 4 4Z"),
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
        return _copySimple!!
    }

private var _copySimple: ImageVector? = null
