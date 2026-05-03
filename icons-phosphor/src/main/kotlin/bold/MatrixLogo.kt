package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MatrixLogo: ImageVector
    get() {
        if (_matrixLogo != null) return _matrixLogo!!
        _matrixLogo = phosphorBoldIcon(
            name = "MatrixLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 76.000 216.000 C 76.000 222.627 70.627 228.000 64.000 228.000 L 40.000 228.000 C 33.373 228.000 28.000 222.627 28.000 216.000 L 28.000 40.000 C 28.000 33.373 33.373 28.000 40.000 28.000 L 64.000 28.000 C 70.627 28.000 76.000 33.373 76.000 40.000 C 76.000 46.627 70.627 52.000 64.000 52.000 L 52.000 52.000 L 52.000 204.000 L 64.000 204.000 C 70.627 204.000 76.000 209.373 76.000 216.000 ZM 216.000 28.000 L 192.000 28.000 C 185.373 28.000 180.000 33.373 180.000 40.000 C 180.000 46.627 185.373 52.000 192.000 52.000 L 204.000 52.000 L 204.000 204.000 L 192.000 204.000 C 185.373 204.000 180.000 209.373 180.000 216.000 C 180.000 222.627 185.373 228.000 192.000 228.000 L 216.000 228.000 C 222.627 228.000 228.000 222.627 228.000 216.000 L 228.000 40.000 C 228.000 33.373 222.627 28.000 216.000 28.000 ZM 188.000 160.000 L 188.000 120.000 C 187.987 105.809 179.639 92.950 166.682 87.163 C 153.725 81.375 138.577 83.740 128.000 93.200 C 117.192 83.487 101.596 81.245 88.490 87.520 C 85.059 84.085 79.897 83.056 75.411 84.913 C 70.925 86.769 68.000 91.145 68.000 96.000 L 68.000 160.000 C 68.000 166.627 73.373 172.000 80.000 172.000 C 86.627 172.000 92.000 166.627 92.000 160.000 L 92.000 120.000 C 92.000 113.373 97.373 108.000 104.000 108.000 C 110.627 108.000 116.000 113.373 116.000 120.000 L 116.000 160.000 C 116.000 166.627 121.373 172.000 128.000 172.000 C 134.627 172.000 140.000 166.627 140.000 160.000 L 140.000 120.000 C 140.000 113.373 145.373 108.000 152.000 108.000 C 158.627 108.000 164.000 113.373 164.000 120.000 L 164.000 160.000 C 164.000 166.627 169.373 172.000 176.000 172.000 C 182.627 172.000 188.000 166.627 188.000 160.000 Z"),
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
        return _matrixLogo!!
    }

private var _matrixLogo: ImageVector? = null
