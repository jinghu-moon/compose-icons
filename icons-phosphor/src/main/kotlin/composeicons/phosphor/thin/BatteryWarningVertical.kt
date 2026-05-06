package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BatteryWarningVertical: ImageVector
    get() {
        if (_batteryWarningVertical != null) return _batteryWarningVertical!!
        _batteryWarningVertical = phosphorThinIcon(
            name = "BatteryWarningVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M124 136v-40c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v40c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4ZM128 164c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM96 12h64c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-64C93.791 4 92 5.791 92 8c0 2.209 1.791 4 4 4ZM196 56v168c0 11.046-8.954 20-20 20h-96C68.954 244 60 235.046 60 224v-168C60 44.954 68.954 36 80 36h96c11.046 0 20 8.954 20 20ZM188 56c0-6.627-5.373-12-12-12h-96C73.373 44 68 49.373 68 56v168c0 6.627 5.373 12 12 12h96c6.627 0 12-5.373 12-12Z"),
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
        return _batteryWarningVertical!!
    }

private var _batteryWarningVertical: ImageVector? = null
