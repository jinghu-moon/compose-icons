package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MathOperations: ImageVector
    get() {
        if (_mathOperations != null) return _mathOperations!!
        _mathOperations = phosphorBoldIcon(
            name = "MathOperations",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 116.000 72.000 C 116.000 78.627 110.627 84.000 104.000 84.000 L 40.000 84.000 C 33.373 84.000 28.000 78.627 28.000 72.000 C 28.000 65.373 33.373 60.000 40.000 60.000 L 104.000 60.000 C 110.627 60.000 116.000 65.373 116.000 72.000 ZM 104.000 172.000 L 84.000 172.000 L 84.000 152.000 C 84.000 145.373 78.627 140.000 72.000 140.000 C 65.373 140.000 60.000 145.373 60.000 152.000 L 60.000 172.000 L 40.000 172.000 C 33.373 172.000 28.000 177.373 28.000 184.000 C 28.000 190.627 33.373 196.000 40.000 196.000 L 60.000 196.000 L 60.000 216.000 C 60.000 222.627 65.373 228.000 72.000 228.000 C 78.627 228.000 84.000 222.627 84.000 216.000 L 84.000 196.000 L 104.000 196.000 C 110.627 196.000 116.000 190.627 116.000 184.000 C 116.000 177.373 110.627 172.000 104.000 172.000 ZM 152.000 176.000 L 216.000 176.000 C 222.627 176.000 228.000 170.627 228.000 164.000 C 228.000 157.373 222.627 152.000 216.000 152.000 L 152.000 152.000 C 145.373 152.000 140.000 157.373 140.000 164.000 C 140.000 170.627 145.373 176.000 152.000 176.000 ZM 216.000 192.000 L 152.000 192.000 C 145.373 192.000 140.000 197.373 140.000 204.000 C 140.000 210.627 145.373 216.000 152.000 216.000 L 216.000 216.000 C 222.627 216.000 228.000 210.627 228.000 204.000 C 228.000 197.373 222.627 192.000 216.000 192.000 ZM 151.510 104.490 C 153.762 106.749 156.820 108.019 160.010 108.019 C 163.200 108.019 166.258 106.749 168.510 104.490 L 184.000 89.000 L 199.510 104.520 C 204.204 109.214 211.816 109.214 216.510 104.520 C 221.204 99.826 221.204 92.214 216.510 87.520 L 201.000 72.000 L 216.520 56.490 C 221.214 51.796 221.214 44.184 216.520 39.490 C 211.826 34.796 204.214 34.796 199.520 39.490 L 184.000 55.000 L 168.490 39.510 C 163.796 34.816 156.184 34.816 151.490 39.510 C 146.796 44.204 146.796 51.816 151.490 56.510 L 167.000 72.000 L 151.510 87.510 C 149.257 89.761 147.991 92.815 147.991 96.000 C 147.991 99.185 149.257 102.239 151.510 104.490 Z"),
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
        return _mathOperations!!
    }

private var _mathOperations: ImageVector? = null
