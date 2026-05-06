package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Resize: ImageVector
    get() {
        if (_resize != null) return _resize!!
        _resize = phosphorBoldIcon(
            name = "Resize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 108h-88c-6.627 0-12 5.373-12 12v88c0 6.627 5.373 12 12 12h88c6.627 0 12-5.373 12-12v-88c0-6.627-5.373-12-12-12ZM124 196h-64v-64h64ZM220 188v12c0 11.046-8.954 20-20 20h-20c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h16v-8c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM220 116v24c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-24c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM220 56v16c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-12h-12c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h16c11.046 0 20 8.954 20 20ZM152 48c0 6.627-5.373 12-12 12h-24c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h24c6.627 0 12 5.373 12 12ZM36 76v-20C36 44.954 44.954 36 56 36h12c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-8v16c0 6.627-5.373 12-12 12C41.373 88 36 82.627 36 76Z"),
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
        return _resize!!
    }

private var _resize: ImageVector? = null
