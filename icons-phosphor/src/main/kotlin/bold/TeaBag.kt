package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TeaBag: ImageVector
    get() {
        if (_teaBag != null) return _teaBag!!
        _teaBag = phosphorBoldIcon(
            name = "TeaBag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 156.000 C 217.373 156.000 212.000 150.627 212.000 144.000 L 212.000 64.000 C 212.000 30.863 185.137 4.000 152.000 4.000 C 118.863 4.000 92.000 30.863 92.000 64.000 L 92.000 68.000 L 76.530 68.000 C 69.510 68.020 63.009 71.701 59.380 77.710 L 38.850 111.920 C 36.987 115.033 36.002 118.592 36.000 122.220 L 36.000 216.000 C 36.000 227.046 44.954 236.000 56.000 236.000 L 152.000 236.000 C 163.046 236.000 172.000 227.046 172.000 216.000 L 172.000 122.220 C 172.000 118.595 171.015 115.038 169.150 111.930 L 148.620 77.710 C 144.991 71.701 138.490 68.020 131.470 68.000 L 116.000 68.000 L 116.000 64.000 C 116.000 44.118 132.118 28.000 152.000 28.000 C 171.882 28.000 188.000 44.118 188.000 64.000 L 188.000 144.000 C 188.000 163.882 204.118 180.000 224.000 180.000 C 230.627 180.000 236.000 174.627 236.000 168.000 C 236.000 161.373 230.627 156.000 224.000 156.000 ZM 129.210 92.000 L 148.000 123.320 L 148.000 212.000 L 60.000 212.000 L 60.000 123.320 L 78.790 92.000 L 92.000 92.000 L 92.000 136.000 C 92.000 142.627 97.373 148.000 104.000 148.000 C 110.627 148.000 116.000 142.627 116.000 136.000 L 116.000 92.000 Z"),
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
        return _teaBag!!
    }

private var _teaBag: ImageVector? = null
