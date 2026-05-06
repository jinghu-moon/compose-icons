package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Chats: ImageVector
    get() {
        if (_chats != null) return _chats!!
        _chats = phosphorBoldIcon(
            name = "Chats",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 76h-28v-28C188 36.954 179.046 28 168 28h-128C28.954 28 20 36.954 20 48v128c.002 4.622 2.658 8.832 6.829 10.824 4.171 1.992 9.115 1.411 12.711-1.494L68 162.33v21.67c0 11.046 8.954 20 20 20h92.17l36.29 29.33c3.596 2.904 8.54 3.485 12.711 1.494 4.171-1.992 6.827-6.202 6.829-10.824v-128C236 84.954 227.046 76 216 76ZM44 150.87v-98.87h120v80h-92.42c-2.758-.008-5.435 .935-7.58 2.67ZM212 198.87 192 182.67c-2.134-1.726-4.795-2.668-7.54-2.67h-92.46v-24h76c11.046 0 20-8.954 20-20v-36h24Z"),
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
        return _chats!!
    }

private var _chats: ImageVector? = null
