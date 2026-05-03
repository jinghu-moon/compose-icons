package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CubeTransparent: ImageVector
    get() {
        if (_cubeTransparent != null) return _cubeTransparent!!
        _cubeTransparent = phosphorBoldIcon(
            name = "CubeTransparent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.500 95.530 L 224.500 95.530 L 160.500 31.530 C 158.248 29.270 155.190 28.000 152.000 28.000 L 40.000 28.000 C 33.373 28.000 28.000 33.373 28.000 40.000 L 28.000 152.000 C 27.996 154.921 29.064 157.743 31.000 159.930 C 31.150 160.110 31.310 160.290 31.500 160.490 L 95.500 224.490 L 95.500 224.490 C 97.755 226.742 100.813 228.005 104.000 228.000 L 216.000 228.000 C 222.627 228.000 228.000 222.627 228.000 216.000 L 228.000 104.000 C 228.000 100.825 226.741 97.779 224.500 95.530 ZM 164.000 69.000 L 187.000 92.000 L 164.000 92.000 ZM 92.000 187.000 L 69.000 164.000 L 92.000 164.000 ZM 92.000 140.000 L 52.000 140.000 L 52.000 69.000 L 92.000 109.000 ZM 69.000 52.000 L 140.000 52.000 L 140.000 92.000 L 109.000 92.000 ZM 140.000 116.000 L 140.000 140.000 L 116.000 140.000 L 116.000 116.000 ZM 116.000 204.000 L 116.000 164.000 L 147.000 164.000 L 187.000 204.000 ZM 204.000 187.000 L 164.000 147.000 L 164.000 116.000 L 204.000 116.000 Z"),
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
        return _cubeTransparent!!
    }

private var _cubeTransparent: ImageVector? = null
