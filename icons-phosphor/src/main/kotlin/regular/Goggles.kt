package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Goggles: ImageVector
    get() {
        if (_goggles != null) return _goggles!!
        _goggles = phosphorRegularIcon(
            name = "Goggles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 256.000 136.000 C 255.956 96.254 223.746 64.044 184.000 64.000 L 72.000 64.000 C 32.254 64.044 0.044 96.254 0.000 136.000 C 0.000 146.568 6.897 155.899 17.000 159.000 C 23.060 179.370 54.630 192.000 72.000 192.000 C 91.001 191.977 107.373 178.612 111.200 160.000 L 144.800 160.000 C 148.627 178.612 164.999 191.977 184.000 192.000 C 201.330 192.000 232.900 179.340 239.000 159.000 C 249.103 155.899 256.000 146.568 256.000 136.000 ZM 45.450 167.740 C 37.000 162.760 32.000 156.880 32.000 152.000 C 32.000 147.120 36.910 141.390 45.130 136.450 L 82.340 173.650 C 79.115 175.203 75.580 176.006 72.000 176.000 C 64.470 176.000 53.800 172.680 45.450 167.740 ZM 93.650 162.340 L 61.000 129.700 C 64.577 128.655 68.275 128.084 72.000 128.000 C 85.255 128.000 96.000 138.745 96.000 152.000 C 96.006 155.580 95.203 159.115 93.650 162.340 ZM 160.000 152.000 C 159.995 146.446 161.925 141.064 165.460 136.780 L 201.000 172.320 C 195.000 174.620 188.850 176.000 184.000 176.000 C 170.745 176.000 160.000 165.255 160.000 152.000 ZM 215.630 164.310 L 179.710 128.390 C 181.126 128.133 182.561 128.002 184.000 128.000 C 191.530 128.000 202.200 131.320 210.550 136.260 C 218.900 141.200 224.000 147.120 224.000 152.000 C 224.000 155.790 221.000 160.200 215.630 164.310 ZM 237.680 141.620 C 229.340 123.250 200.340 112.000 184.000 112.000 C 164.999 112.023 148.627 125.388 144.800 144.000 L 111.200 144.000 C 107.373 125.388 91.001 112.023 72.000 112.000 C 55.660 112.000 26.660 123.250 18.320 141.620 C 16.837 140.125 16.004 138.106 16.000 136.000 C 16.033 105.086 41.086 80.033 72.000 80.000 L 184.000 80.000 C 214.914 80.033 239.967 105.086 240.000 136.000 C 239.996 138.106 239.163 140.125 237.680 141.620 Z"),
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
        return _goggles!!
    }

private var _goggles: ImageVector? = null
