package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandTap: ImageVector
    get() {
        if (_handTap != null) return _handTap!!
        _handTap = phosphorBoldIcon(
            name = "HandTap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 156.000 L 228.000 192.000 C 228.000 205.850 226.370 218.520 223.420 227.680 C 222.160 231.829 218.761 234.975 214.527 235.910 C 210.294 236.846 205.885 235.425 202.994 232.194 C 200.104 228.963 199.181 224.424 200.580 220.320 C 202.720 213.670 204.000 203.080 204.000 192.000 L 204.000 156.000 C 204.000 151.582 200.418 148.000 196.000 148.000 C 191.582 148.000 188.000 151.582 188.000 156.000 L 188.000 160.000 C 188.000 166.627 182.627 172.000 176.000 172.000 C 169.373 172.000 164.000 166.627 164.000 160.000 L 164.000 140.000 C 164.000 135.582 160.418 132.000 156.000 132.000 C 151.582 132.000 148.000 135.582 148.000 140.000 L 148.000 152.000 C 148.000 158.627 142.627 164.000 136.000 164.000 C 129.373 164.000 124.000 158.627 124.000 152.000 L 124.000 84.000 C 124.000 79.582 120.418 76.000 116.000 76.000 C 111.582 76.000 108.000 79.582 108.000 84.000 L 108.000 192.000 C 107.994 197.352 104.444 202.053 99.298 203.524 C 94.152 204.995 88.654 202.880 85.820 198.340 L 67.140 168.340 L 66.930 168.000 C 64.743 164.153 59.852 162.808 56.005 164.995 C 52.158 167.182 50.813 172.073 53.000 175.920 L 78.270 217.800 C 81.691 223.477 79.862 230.854 74.185 234.275 C 68.508 237.696 61.131 235.867 57.710 230.190 L 32.400 188.190 L 32.280 187.990 C 24.054 173.749 27.962 155.592 41.317 145.996 C 54.673 136.400 73.128 138.490 84.000 150.830 L 84.000 84.000 C 84.000 66.327 98.327 52.000 116.000 52.000 C 133.673 52.000 148.000 66.327 148.000 84.000 L 148.000 109.000 C 162.743 105.195 178.126 112.305 184.780 126.000 C 194.611 122.319 205.623 123.695 214.247 129.681 C 222.871 135.667 228.010 145.502 228.000 156.000 ZM 56.000 96.000 C 62.627 96.000 68.000 90.627 68.000 84.000 C 68.000 57.490 89.490 36.000 116.000 36.000 C 142.510 36.000 164.000 57.490 164.000 84.000 C 164.000 90.627 169.373 96.000 176.000 96.000 C 182.627 96.000 188.000 90.627 188.000 84.000 C 188.000 44.235 155.764 12.000 116.000 12.000 C 76.235 12.000 44.000 44.235 44.000 84.000 C 44.000 90.627 49.373 96.000 56.000 96.000 Z"),
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
        return _handTap!!
    }

private var _handTap: ImageVector? = null
