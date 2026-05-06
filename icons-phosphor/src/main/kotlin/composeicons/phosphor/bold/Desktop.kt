package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Desktop: ImageVector
    get() {
        if (_desktop != null) return _desktop!!
        _desktop = phosphorBoldIcon(
            name = "Desktop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-160C32.536 36 20 48.536 20 64v108c0 15.464 12.536 28 28 28h68v12h-20c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h64c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-20v-12h68c15.464 0 28-12.536 28-28v-108C236 48.536 223.464 36 208 36ZM48 60h160c2.209 0 4 1.791 4 4v72h-168v-72c0-2.209 1.791-4 4-4ZM208 176h-160c-2.209 0-4-1.791-4-4v-12h168v12c0 2.209-1.791 4-4 4Z"),
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
        return _desktop!!
    }

private var _desktop: ImageVector? = null
