package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Backpack: ImageVector
    get() {
        if (_backpack != null) return _backpack!!
        _backpack = phosphorThinIcon(
            name = "Backpack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 44.17v-12.17C164 20.954 155.046 12 144 12h-32C100.954 12 92 20.954 92 32v12.17C64.931 46.283 44.032 68.848 44 96v120c0 6.627 5.373 12 12 12h144c6.627 0 12-5.373 12-12v-120C211.968 68.848 191.069 46.283 164 44.17ZM112 20h32c6.627 0 12 5.373 12 12v12h-56v-12c0-6.627 5.373-12 12-12ZM172 164h-88v-12c0-6.627 5.373-12 12-12h64c6.627 0 12 5.373 12 12ZM84 172h56v12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12h24v48h-88ZM204 216c0 2.209-1.791 4-4 4h-20v-68c0-11.046-8.954-20-20-20h-64c-11.046 0-20 8.954-20 20v68h-20c-2.209 0-4-1.791-4-4v-120C52.028 71.711 71.711 52.028 96 52h64c24.289 .028 43.972 19.711 44 44ZM148 88c0 2.209-1.791 4-4 4h-32c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4Z"),
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
        return _backpack!!
    }

private var _backpack: ImageVector? = null
