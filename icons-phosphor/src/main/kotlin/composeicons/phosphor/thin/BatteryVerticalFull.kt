package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BatteryVerticalFull: ImageVector
    get() {
        if (_batteryVerticalFull != null) return _batteryVerticalFull!!
        _batteryVerticalFull = phosphorThinIcon(
            name = "BatteryVerticalFull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 8C92 5.791 93.791 4 96 4h64c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-64C93.791 12 92 10.209 92 8ZM196 56v168c0 11.046-8.954 20-20 20h-96C68.954 244 60 235.046 60 224v-168C60 44.954 68.954 36 80 36h96c11.046 0 20 8.954 20 20ZM188 56c0-6.627-5.373-12-12-12h-96C73.373 44 68 49.373 68 56v168c0 6.627 5.373 12 12 12h96c6.627 0 12-5.373 12-12ZM160 76h-64c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h64c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM160 116h-64c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h64c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM160 156h-64c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h64c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM160 196h-64c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h64c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _batteryVerticalFull!!
    }

private var _batteryVerticalFull: ImageVector? = null
