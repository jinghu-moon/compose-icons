package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.RectangleDashed: ImageVector
    get() {
        if (_rectangleDashed != null) return _rectangleDashed!!
        _rectangleDashed = phosphorBoldIcon(
            name = "RectangleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M84 48c0 6.627-5.373 12-12 12h-28v12c0 6.627-5.373 12-12 12C25.373 84 20 78.627 20 72v-16C20 44.954 28.954 36 40 36h32c6.627 0 12 5.373 12 12ZM32 156c6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v32c0 6.627 5.373 12 12 12ZM72 196h-28v-12c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v16c0 11.046 8.954 20 20 20h32c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM144 196h-32c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h32c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM224 172c-6.627 0-12 5.373-12 12v12h-28c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h32c11.046 0 20-8.954 20-20v-16c0-6.627-5.373-12-12-12ZM224 100c-6.627 0-12 5.373-12 12v32c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12ZM216 36h-32c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h28v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-16C236 44.954 227.046 36 216 36ZM144 36h-32c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h32c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _rectangleDashed!!
    }

private var _rectangleDashed: ImageVector? = null
