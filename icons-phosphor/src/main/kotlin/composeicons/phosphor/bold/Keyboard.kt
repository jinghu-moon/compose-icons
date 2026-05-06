package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Keyboard: ImageVector
    get() {
        if (_keyboard != null) return _keyboard!!
        _keyboard = phosphorBoldIcon(
            name = "Keyboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 44h-192C20.954 44 12 52.954 12 64v128c0 11.046 8.954 20 20 20h192c11.046 0 20-8.954 20-20v-128C244 52.954 235.046 44 224 44ZM220 188h-184v-120h184ZM52 128c0-6.627 5.373-12 12-12h128c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-128c-6.627 0-12-5.373-12-12ZM52 92C52 85.373 57.373 80 64 80h128c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-128C57.373 104 52 98.627 52 92ZM52 164c0-6.627 5.373-12 12-12h8c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-8c-6.627 0-12-5.373-12-12ZM160 164c0 6.627-5.373 12-12 12h-40c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h40c6.627 0 12 5.373 12 12ZM204 164c0 6.627-5.373 12-12 12h-8c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h8c6.627 0 12 5.373 12 12Z"),
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
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
