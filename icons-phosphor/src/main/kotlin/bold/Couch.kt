package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Couch: ImageVector
    get() {
        if (_couch != null) return _couch!!
        _couch = phosphorBoldIcon(
            name = "Couch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.000 104.000 L 244.000 72.000 C 244.000 60.954 235.046 52.000 224.000 52.000 L 32.000 52.000 C 20.954 52.000 12.000 60.954 12.000 72.000 L 12.000 104.000 C 6.964 107.777 4.000 113.705 4.000 120.000 L 4.000 168.000 C 4.000 179.046 12.954 188.000 24.000 188.000 L 28.000 188.000 L 28.000 200.000 C 28.000 206.627 33.373 212.000 40.000 212.000 C 46.627 212.000 52.000 206.627 52.000 200.000 L 52.000 188.000 L 204.000 188.000 L 204.000 200.000 C 204.000 206.627 209.373 212.000 216.000 212.000 C 222.627 212.000 228.000 206.627 228.000 200.000 L 228.000 188.000 L 232.000 188.000 C 243.046 188.000 252.000 179.046 252.000 168.000 L 252.000 120.000 C 252.000 113.705 249.036 107.777 244.000 104.000 ZM 220.000 100.000 L 208.000 100.000 C 196.954 100.000 188.000 108.954 188.000 120.000 L 188.000 124.000 L 140.000 124.000 L 140.000 76.000 L 220.000 76.000 ZM 116.000 76.000 L 116.000 124.000 L 68.000 124.000 L 68.000 120.000 C 68.000 108.954 59.046 100.000 48.000 100.000 L 36.000 100.000 L 36.000 76.000 ZM 228.000 164.000 L 28.000 164.000 L 28.000 124.000 L 44.000 124.000 L 44.000 136.000 C 44.000 142.627 49.373 148.000 56.000 148.000 L 200.000 148.000 C 206.627 148.000 212.000 142.627 212.000 136.000 L 212.000 124.000 L 228.000 124.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _couch!!
    }

private var _couch: ImageVector? = null
