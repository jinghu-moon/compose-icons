package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ColumnsPlusLeft: ImageVector
    get() {
        if (_columnsPlusLeft != null) return _columnsPlusLeft!!
        _columnsPlusLeft = phosphorBoldIcon(
            name = "ColumnsPlusLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M124 28h-24C88.954 28 80 36.954 80 48v160c0 11.046 8.954 20 20 20h24c11.046 0 20-8.954 20-20v-160C144 36.954 135.046 28 124 28ZM120 204h-16v-152h16ZM200 28h-24c-11.046 0-20 8.954-20 20v160c0 11.046 8.954 20 20 20h24c11.046 0 20-8.954 20-20v-160C220 36.954 211.046 28 200 28ZM196 204h-16v-152h16ZM68 128c0 6.627-5.373 12-12 12h-8v8c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-8h-8C9.373 140 4 134.627 4 128c0-6.627 5.373-12 12-12h8v-8c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v8h8c6.627 0 12 5.373 12 12Z"),
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
        return _columnsPlusLeft!!
    }

private var _columnsPlusLeft: ImageVector? = null
