package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Elevator: ImageVector
    get() {
        if (_elevator != null) return _elevator!!
        _elevator = phosphorBoldIcon(
            name = "Elevator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 164.000 128.000 L 164.000 204.000 L 140.000 204.000 L 140.000 128.000 ZM 116.000 204.000 L 92.000 204.000 L 92.000 128.000 L 116.000 128.000 ZM 204.000 204.000 L 188.000 204.000 L 188.000 116.000 C 188.000 109.373 182.627 104.000 176.000 104.000 L 80.000 104.000 C 73.373 104.000 68.000 109.373 68.000 116.000 L 68.000 204.000 L 52.000 204.000 L 52.000 52.000 L 204.000 52.000 ZM 100.000 76.000 C 100.000 69.373 105.373 64.000 112.000 64.000 L 144.000 64.000 C 150.627 64.000 156.000 69.373 156.000 76.000 C 156.000 82.627 150.627 88.000 144.000 88.000 L 112.000 88.000 C 105.373 88.000 100.000 82.627 100.000 76.000 Z"),
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
        return _elevator!!
    }

private var _elevator: ImageVector? = null
