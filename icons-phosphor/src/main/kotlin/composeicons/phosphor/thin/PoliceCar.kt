package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PoliceCar: ImageVector
    get() {
        if (_policeCar != null) return _policeCar!!
        _policeCar = phosphorThinIcon(
            name = "PoliceCar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 108h-13.68L197.78 58.05c-2.149-3.721-6.123-6.01-10.42-6h-118.72c-4.297-.01-8.271 2.279-10.42 6L29.68 108h-13.68c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h12v84c0 6.627 5.373 12 12 12h24c6.627 0 12-5.373 12-12v-20h104v20c0 6.627 5.373 12 12 12h24c6.627 0 12-5.373 12-12v-84h12c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM65.17 62c.716-1.239 2.039-2.002 3.47-2h118.72c1.431-.002 2.754 .761 3.47 2l26.28 46h-178.22ZM68 200c0 2.209-1.791 4-4 4h-24c-2.209 0-4-1.791-4-4v-20h32ZM216 204h-24c-2.209 0-4-1.791-4-4v-20h32v20c0 2.209-1.791 4-4 4ZM220 172h-184v-56h184ZM60 144c0-2.209 1.791-4 4-4h16c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-16c-2.209 0-4-1.791-4-4ZM172 144c0-2.209 1.791-4 4-4h16c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-16c-2.209 0-4-1.791-4-4ZM100 24c0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4Z"),
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
        return _policeCar!!
    }

private var _policeCar: ImageVector? = null
