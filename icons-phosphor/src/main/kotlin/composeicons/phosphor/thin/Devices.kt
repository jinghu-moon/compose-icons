package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Devices: ImageVector
    get() {
        if (_devices != null) return _devices!!
        _devices = phosphorThinIcon(
            name = "Devices",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 76h-20v-12C204 52.954 195.046 44 184 44h-144C28.954 44 20 52.954 20 64v96c0 11.046 8.954 20 20 20h116v12c0 11.046 8.954 20 20 20h48c11.046 0 20-8.954 20-20v-96C244 84.954 235.046 76 224 76ZM40 172c-6.627 0-12-5.373-12-12v-96C28 57.373 33.373 52 40 52h144c6.627 0 12 5.373 12 12v12h-20c-11.046 0-20 8.954-20 20v76ZM236 192c0 6.627-5.373 12-12 12h-48c-6.627 0-12-5.373-12-12v-96c0-6.627 5.373-12 12-12h48c6.627 0 12 5.373 12 12ZM132 208c0 2.209-1.791 4-4 4h-40c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h40c2.209 0 4 1.791 4 4ZM212 112c0 2.209-1.791 4-4 4h-16c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h16c2.209 0 4 1.791 4 4Z"),
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
        return _devices!!
    }

private var _devices: ImageVector? = null
