package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CrownCross: ImageVector
    get() {
        if (_crownCross != null) return _crownCross!!
        _crownCross = phosphorBoldIcon(
            name = "CrownCross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 180.000 56.000 C 164.600 56.000 150.810 60.610 140.000 68.500 L 140.000 44.000 L 152.000 44.000 C 158.627 44.000 164.000 38.627 164.000 32.000 C 164.000 25.373 158.627 20.000 152.000 20.000 L 140.000 20.000 L 140.000 12.000 C 140.000 5.373 134.627 0.000 128.000 0.000 C 121.373 0.000 116.000 5.373 116.000 12.000 L 116.000 20.000 L 104.000 20.000 C 97.373 20.000 92.000 25.373 92.000 32.000 C 92.000 38.627 97.373 44.000 104.000 44.000 L 116.000 44.000 L 116.000 68.500 C 105.190 60.610 91.400 56.000 76.000 56.000 C 40.670 56.039 12.039 84.670 12.000 120.000 C 12.000 151.660 27.530 170.600 40.550 180.910 C 46.495 185.599 53.036 189.479 60.000 192.450 L 60.000 208.000 C 60.000 219.046 68.954 228.000 80.000 228.000 L 176.000 228.000 C 187.046 228.000 196.000 219.046 196.000 208.000 L 196.000 192.450 C 202.964 189.479 209.505 185.599 215.450 180.910 C 228.470 170.600 244.000 151.660 244.000 120.000 C 243.961 84.670 215.330 56.039 180.000 56.000 ZM 181.090 172.360 C 175.748 173.695 172.001 178.494 172.000 184.000 L 172.000 204.000 L 84.000 204.000 L 84.000 184.000 C 83.999 178.494 80.252 173.695 74.910 172.360 C 67.840 170.178 61.240 166.695 55.450 162.090 C 42.540 151.870 36.000 137.710 36.000 120.000 C 36.000 97.909 53.909 80.000 76.000 80.000 C 99.180 80.000 116.000 95.140 116.000 116.000 L 116.000 176.000 C 116.000 182.627 121.373 188.000 128.000 188.000 C 134.627 188.000 140.000 182.627 140.000 176.000 L 140.000 116.000 C 140.000 95.140 156.820 80.000 180.000 80.000 C 202.091 80.000 220.000 97.909 220.000 120.000 C 220.000 161.680 182.620 172.000 181.090 172.360 Z"),
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
        return _crownCross!!
    }

private var _crownCross: ImageVector? = null
