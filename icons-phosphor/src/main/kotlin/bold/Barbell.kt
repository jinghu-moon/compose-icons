package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Barbell: ImageVector
    get() {
        if (_barbell != null) return _barbell!!
        _barbell = phosphorBoldIcon(
            name = "Barbell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.000 116.000 L 244.000 88.000 C 244.000 76.954 235.046 68.000 224.000 68.000 L 208.000 68.000 L 208.000 64.000 C 208.000 52.954 199.046 44.000 188.000 44.000 L 164.000 44.000 C 152.954 44.000 144.000 52.954 144.000 64.000 L 144.000 116.000 L 112.000 116.000 L 112.000 64.000 C 112.000 52.954 103.046 44.000 92.000 44.000 L 68.000 44.000 C 56.954 44.000 48.000 52.954 48.000 64.000 L 48.000 68.000 L 32.000 68.000 C 20.954 68.000 12.000 76.954 12.000 88.000 L 12.000 116.000 C 5.373 116.000 0.000 121.373 0.000 128.000 C 0.000 134.627 5.373 140.000 12.000 140.000 L 12.000 168.000 C 12.000 179.046 20.954 188.000 32.000 188.000 L 48.000 188.000 L 48.000 192.000 C 48.000 203.046 56.954 212.000 68.000 212.000 L 92.000 212.000 C 103.046 212.000 112.000 203.046 112.000 192.000 L 112.000 140.000 L 144.000 140.000 L 144.000 192.000 C 144.000 203.046 152.954 212.000 164.000 212.000 L 188.000 212.000 C 199.046 212.000 208.000 203.046 208.000 192.000 L 208.000 188.000 L 224.000 188.000 C 235.046 188.000 244.000 179.046 244.000 168.000 L 244.000 140.000 C 250.627 140.000 256.000 134.627 256.000 128.000 C 256.000 121.373 250.627 116.000 244.000 116.000 ZM 36.000 164.000 L 36.000 92.000 L 48.000 92.000 L 48.000 164.000 ZM 88.000 188.000 L 72.000 188.000 L 72.000 68.000 L 88.000 68.000 ZM 184.000 188.000 L 168.000 188.000 L 168.000 68.000 L 184.000 68.000 ZM 220.000 164.000 L 208.000 164.000 L 208.000 92.000 L 220.000 92.000 Z"),
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
        return _barbell!!
    }

private var _barbell: ImageVector? = null
