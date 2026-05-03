package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HighDefinition: ImageVector
    get() {
        if (_highDefinition != null) return _highDefinition!!
        _highDefinition = phosphorBoldIcon(
            name = "HighDefinition",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 180.000 68.000 L 156.000 68.000 C 149.373 68.000 144.000 73.373 144.000 80.000 L 144.000 176.000 C 144.000 182.627 149.373 188.000 156.000 188.000 L 180.000 188.000 C 213.137 188.000 240.000 161.137 240.000 128.000 C 240.000 94.863 213.137 68.000 180.000 68.000 ZM 180.000 164.000 L 168.000 164.000 L 168.000 92.000 L 180.000 92.000 C 199.882 92.000 216.000 108.118 216.000 128.000 C 216.000 147.882 199.882 164.000 180.000 164.000 ZM 104.000 176.000 L 104.000 140.000 L 56.000 140.000 L 56.000 176.000 C 56.000 182.627 50.627 188.000 44.000 188.000 C 37.373 188.000 32.000 182.627 32.000 176.000 L 32.000 80.000 C 32.000 73.373 37.373 68.000 44.000 68.000 C 50.627 68.000 56.000 73.373 56.000 80.000 L 56.000 116.000 L 104.000 116.000 L 104.000 80.000 C 104.000 73.373 109.373 68.000 116.000 68.000 C 122.627 68.000 128.000 73.373 128.000 80.000 L 128.000 176.000 C 128.000 182.627 122.627 188.000 116.000 188.000 C 109.373 188.000 104.000 182.627 104.000 176.000 ZM 20.000 44.000 C 20.000 37.373 25.373 32.000 32.000 32.000 L 224.000 32.000 C 230.627 32.000 236.000 37.373 236.000 44.000 C 236.000 50.627 230.627 56.000 224.000 56.000 L 32.000 56.000 C 25.373 56.000 20.000 50.627 20.000 44.000 ZM 236.000 212.000 C 236.000 218.627 230.627 224.000 224.000 224.000 L 32.000 224.000 C 25.373 224.000 20.000 218.627 20.000 212.000 C 20.000 205.373 25.373 200.000 32.000 200.000 L 224.000 200.000 C 230.627 200.000 236.000 205.373 236.000 212.000 Z"),
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
        return _highDefinition!!
    }

private var _highDefinition: ImageVector? = null
