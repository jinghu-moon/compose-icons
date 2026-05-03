package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ClockClockwise: ImageVector
    get() {
        if (_clockClockwise != null) return _clockClockwise!!
        _clockClockwise = phosphorBoldIcon(
            name = "ClockClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 140.000 80.000 L 140.000 121.210 L 174.170 141.710 C 177.931 143.874 180.231 147.899 180.185 152.238 C 180.140 156.576 177.756 160.552 173.950 162.636 C 170.144 164.721 165.510 164.588 161.830 162.290 L 121.830 138.290 C 118.214 136.122 116.001 132.216 116.000 128.000 L 116.000 80.000 C 116.000 73.373 121.373 68.000 128.000 68.000 C 134.627 68.000 140.000 73.373 140.000 80.000 ZM 224.000 52.000 C 217.373 52.000 212.000 57.373 212.000 64.000 L 212.000 71.370 C 207.790 66.700 203.420 62.060 198.710 57.290 C 159.922 18.506 97.131 18.206 57.975 56.618 C 18.818 95.030 17.912 157.815 55.944 197.340 C 93.976 236.866 156.749 238.378 196.640 200.730 C 201.461 196.179 201.681 188.581 197.130 183.760 C 192.579 178.939 184.981 178.719 180.160 183.270 C 149.848 211.876 102.152 210.733 73.246 180.707 C 44.340 150.681 45.009 102.976 74.746 73.773 C 104.483 44.569 152.193 44.765 181.690 74.210 C 187.610 80.200 193.000 86.000 198.230 92.000 L 184.000 92.000 C 177.373 92.000 172.000 97.373 172.000 104.000 C 172.000 110.627 177.373 116.000 184.000 116.000 L 224.000 116.000 C 230.627 116.000 236.000 110.627 236.000 104.000 L 236.000 64.000 C 236.000 57.373 230.627 52.000 224.000 52.000 Z"),
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
        return _clockClockwise!!
    }

private var _clockClockwise: ImageVector? = null
