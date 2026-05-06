package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Scan: ImageVector
    get() {
        if (_scan != null) return _scan!!
        _scan = phosphorBoldIcon(
            name = "Scan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 40v40c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-28h-28c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h40c6.627 0 12 5.373 12 12ZM80 204h-28v-28c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v40c0 6.627 5.373 12 12 12h40c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM216 164c-6.627 0-12 5.373-12 12v28h-28c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h40c6.627 0 12-5.373 12-12v-40c0-6.627-5.373-12-12-12ZM40 92c6.627 0 12-5.373 12-12v-28h28c6.627 0 12-5.373 12-12C92 33.373 86.627 28 80 28h-40C33.373 28 28 33.373 28 40v40c0 6.627 5.373 12 12 12ZM84 72h88c6.627 0 12 5.373 12 12v88c0 6.627-5.373 12-12 12h-88c-6.627 0-12-5.373-12-12v-88C72 77.373 77.373 72 84 72ZM96 160h64v-64h-64Z"),
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
        return _scan!!
    }

private var _scan: ImageVector? = null
