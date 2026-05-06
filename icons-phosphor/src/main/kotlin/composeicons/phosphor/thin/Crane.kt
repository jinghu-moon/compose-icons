package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Crane: ImageVector
    get() {
        if (_crane != null) return _crane!!
        _crane = phosphorThinIcon(
            name = "Crane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M226.06 20.57c-1.205-.723-2.7-.761-3.94-.1L103 84h-71C25.373 84 20 89.373 20 96v104c0 6.627 5.373 12 12 12h88c6.627 0 12-5.373 12-12v-32c-.001-.39-.058-.777-.17-1.15L108.77 90 220 30.67v129.33c0 2.209-1.791 4-4 4h-16c-2.209 0-4-1.791-4-4v-8c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v8c0 6.627 5.373 12 12 12h16c6.627 0 12-5.373 12-12v-136c0-1.405-.736-2.707-1.94-3.43ZM101 92l21.6 72h-62.6v-72ZM32 92h20v72h-24v-68c0-2.209 1.791-4 4-4ZM120 204h-88c-2.209 0-4-1.791-4-4v-28h96v28c0 2.209-1.791 4-4 4Z"),
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
        return _crane!!
    }

private var _crane: ImageVector? = null
