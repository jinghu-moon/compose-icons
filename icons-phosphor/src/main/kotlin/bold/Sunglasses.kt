package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) return _sunglasses!!
        _sunglasses = phosphorBoldIcon(
            name = "Sunglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 36.000 C 193.373 36.000 188.000 41.373 188.000 48.000 C 188.000 54.627 193.373 60.000 200.000 60.000 C 206.627 60.000 212.000 65.373 212.000 72.000 L 212.000 124.000 L 44.000 124.000 L 44.000 72.000 C 44.000 65.373 49.373 60.000 56.000 60.000 C 62.627 60.000 68.000 54.627 68.000 48.000 C 68.000 41.373 62.627 36.000 56.000 36.000 C 36.118 36.000 20.000 52.118 20.000 72.000 L 20.000 164.000 C 20.000 190.510 41.490 212.000 68.000 212.000 C 94.510 212.000 116.000 190.510 116.000 164.000 L 116.000 148.000 L 140.000 148.000 L 140.000 164.000 C 140.000 190.510 161.490 212.000 188.000 212.000 C 214.510 212.000 236.000 190.510 236.000 164.000 L 236.000 72.000 C 236.000 52.118 219.882 36.000 200.000 36.000 ZM 68.000 188.000 C 54.745 188.000 44.000 177.255 44.000 164.000 L 44.000 155.000 L 75.740 186.740 C 73.247 187.583 70.632 188.009 68.000 188.000 ZM 92.000 164.000 C 91.996 165.540 91.849 167.077 91.560 168.590 L 71.000 148.000 L 92.000 148.000 ZM 188.000 188.000 C 174.745 188.000 164.000 177.255 164.000 164.000 L 164.000 155.000 L 195.740 186.740 C 193.247 187.583 190.632 188.009 188.000 188.000 ZM 212.000 164.000 C 211.996 165.540 211.849 167.077 211.560 168.590 L 191.000 148.000 L 212.000 148.000 Z"),
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
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null
