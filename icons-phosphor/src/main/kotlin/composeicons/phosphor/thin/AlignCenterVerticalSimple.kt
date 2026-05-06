package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AlignCenterVerticalSimple: ImageVector
    get() {
        if (_alignCenterVerticalSimple != null) return _alignCenterVerticalSimple!!
        _alignCenterVerticalSimple = phosphorThinIcon(
            name = "AlignCenterVerticalSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 124h-36v-76c0-6.627-5.373-12-12-12h-64C89.373 36 84 41.373 84 48v76h-36c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h36v76c0 6.627 5.373 12 12 12h64c6.627 0 12-5.373 12-12v-76h36c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM164 208c0 2.209-1.791 4-4 4h-64c-2.209 0-4-1.791-4-4v-160c0-2.209 1.791-4 4-4h64c2.209 0 4 1.791 4 4Z"),
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
        return _alignCenterVerticalSimple!!
    }

private var _alignCenterVerticalSimple: ImageVector? = null
