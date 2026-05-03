package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NuclearPlant: ImageVector
    get() {
        if (_nuclearPlant != null) return _nuclearPlant!!
        _nuclearPlant = phosphorLightIcon(
            name = "NuclearPlant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 152.000 34.000 L 176.000 34.000 C 181.523 34.000 186.000 29.523 186.000 24.000 C 186.000 20.686 188.686 18.000 192.000 18.000 C 195.314 18.000 198.000 20.686 198.000 24.000 C 198.000 36.150 188.150 46.000 176.000 46.000 L 152.000 46.000 C 146.477 46.000 142.000 50.477 142.000 56.000 C 142.000 59.314 139.314 62.000 136.000 62.000 C 132.686 62.000 130.000 59.314 130.000 56.000 C 130.000 43.850 139.850 34.000 152.000 34.000 ZM 104.000 62.000 C 107.314 62.000 110.000 59.314 110.000 56.000 C 110.000 32.804 128.804 14.000 152.000 14.000 L 160.000 14.000 C 163.314 14.000 166.000 11.314 166.000 8.000 C 166.000 4.686 163.314 2.000 160.000 2.000 L 152.000 2.000 C 122.190 2.033 98.033 26.190 98.000 56.000 C 98.000 59.314 100.686 62.000 104.000 62.000 ZM 246.000 216.000 C 246.000 219.314 243.314 222.000 240.000 222.000 L 16.000 222.000 C 12.686 222.000 10.000 219.314 10.000 216.000 C 10.000 212.686 12.686 210.000 16.000 210.000 L 34.000 210.000 C 48.000 182.000 64.200 140.320 65.880 95.410 C 66.155 87.903 72.338 81.968 79.850 82.000 L 168.180 82.000 C 175.672 81.992 181.843 87.885 182.180 95.370 C 184.320 144.450 206.920 190.000 218.280 210.000 L 240.000 210.000 C 243.314 210.000 246.000 212.686 246.000 216.000 ZM 168.180 94.000 L 150.000 94.000 C 150.060 94.460 150.100 94.940 150.120 95.410 C 151.820 140.320 168.000 182.000 182.000 210.000 L 204.550 210.000 C 192.110 186.900 172.230 143.100 170.150 95.890 C 170.092 94.840 169.231 94.014 168.180 94.000 ZM 47.340 210.000 L 168.660 210.000 C 154.800 181.060 139.800 140.080 138.150 95.860 C 138.076 94.810 137.202 93.997 136.150 94.000 L 79.850 94.000 C 78.798 93.997 77.924 94.810 77.850 95.860 C 76.200 140.080 61.200 181.060 47.340 210.000 Z"),
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
        return _nuclearPlant!!
    }

private var _nuclearPlant: ImageVector? = null
