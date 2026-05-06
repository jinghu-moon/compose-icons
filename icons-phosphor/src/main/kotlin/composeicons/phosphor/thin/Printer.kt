package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Printer: ImageVector
    get() {
        if (_printer != null) return _printer!!
        _printer = phosphorThinIcon(
            name = "Printer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214.67 76h-18.67v-36c0-2.209-1.791-4-4-4h-128c-2.209 0-4 1.791-4 4v36h-18.67C29.57 76 20 85 20 96v80c0 2.209 1.791 4 4 4h36v36c0 2.209 1.791 4 4 4h128c2.209 0 4-1.791 4-4v-36h36c2.209 0 4-1.791 4-4v-80C236 85 226.43 76 214.67 76ZM68 44h120v32h-120ZM188 212h-120v-56h120ZM228 172h-32v-20c0-2.209-1.791-4-4-4h-128c-2.209 0-4 1.791-4 4v20h-32v-76C28 89.38 34 84 41.33 84h173.34C222 84 228 89.38 228 96ZM196 116c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _printer!!
    }

private var _printer: ImageVector? = null
