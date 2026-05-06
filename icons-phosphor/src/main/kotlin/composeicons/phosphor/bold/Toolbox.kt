package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Toolbox: ImageVector
    get() {
        if (_toolbox != null) return _toolbox!!
        _toolbox = phosphorBoldIcon(
            name = "Toolbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 64h-44v-8C180 40.536 167.464 28 152 28h-48C88.536 28 76 40.536 76 56v8h-44C20.954 64 12 72.954 12 84v108c0 11.046 8.954 20 20 20h192c11.046 0 20-8.954 20-20v-108C244 72.954 235.046 64 224 64ZM100 56c0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4v8h-56ZM220 88v32h-24v-4c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v4h-88v-4c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v4h-24v-32ZM36 188v-44h24v4c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-4h88v4c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-4h24v44Z"),
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
        return _toolbox!!
    }

private var _toolbox: ImageVector? = null
