package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.JarLabel: ImageVector
    get() {
        if (_jarLabel != null) return _jarLabel!!
        _jarLabel = phosphorBoldIcon(
            name = "JarLabel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 188.000 49.680 L 188.000 32.000 C 188.000 20.954 179.046 12.000 168.000 12.000 L 88.000 12.000 C 76.954 12.000 68.000 20.954 68.000 32.000 L 68.000 49.680 C 49.083 55.063 36.026 72.332 36.000 92.000 L 36.000 200.000 C 36.028 224.289 55.711 243.972 80.000 244.000 L 176.000 244.000 C 200.289 243.972 219.972 224.289 220.000 200.000 L 220.000 92.000 C 219.974 72.332 206.917 55.063 188.000 49.680 ZM 60.000 120.000 L 196.000 120.000 L 196.000 168.000 L 60.000 168.000 ZM 164.000 48.000 L 140.000 48.000 L 140.000 36.000 L 164.000 36.000 ZM 116.000 36.000 L 116.000 48.000 L 92.000 48.000 L 92.000 36.000 ZM 80.000 72.000 L 176.000 72.000 C 187.046 72.000 196.000 80.954 196.000 92.000 L 196.000 96.000 L 60.000 96.000 L 60.000 92.000 C 60.000 80.954 68.954 72.000 80.000 72.000 ZM 176.000 220.000 L 80.000 220.000 C 68.954 220.000 60.000 211.046 60.000 200.000 L 60.000 192.000 L 196.000 192.000 L 196.000 200.000 C 196.000 211.046 187.046 220.000 176.000 220.000 Z"),
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
        return _jarLabel!!
    }

private var _jarLabel: ImageVector? = null
