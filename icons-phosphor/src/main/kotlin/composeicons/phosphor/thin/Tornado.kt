package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tornado: ImageVector
    get() {
        if (_tornado != null) return _tornado!!
        _tornado = phosphorThinIcon(
            name = "Tornado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 40c0 2.209-1.791 4-4 4h-168c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h168c2.209 0 4 1.791 4 4ZM180 72c0-2.209-1.791-4-4-4h-144c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h144c2.209 0 4-1.791 4-4ZM164 104c0-2.209-1.791-4-4-4h-104c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h104c2.209 0 4-1.791 4-4ZM180 136c0-2.209-1.791-4-4-4h-88c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h88c2.209 0 4-1.791 4-4ZM184 164h-64c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h64c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM160 196h-32c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h32c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM128 228h-16c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h16c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _tornado!!
    }

private var _tornado: ImageVector? = null
