package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NuclearPlant: ImageVector
    get() {
        if (_nuclearPlant != null) return _nuclearPlant!!
        _nuclearPlant = phosphorThinIcon(
            name = "NuclearPlant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.000 36.000 L 176.000 36.000 C 182.627 36.000 188.000 30.627 188.000 24.000 C 188.000 21.791 189.791 20.000 192.000 20.000 C 194.209 20.000 196.000 21.791 196.000 24.000 C 196.000 35.046 187.046 44.000 176.000 44.000 L 152.000 44.000 C 145.373 44.000 140.000 49.373 140.000 56.000 C 140.000 58.209 138.209 60.000 136.000 60.000 C 133.791 60.000 132.000 58.209 132.000 56.000 C 132.000 44.954 140.954 36.000 152.000 36.000 ZM 104.000 60.000 C 106.209 60.000 108.000 58.209 108.000 56.000 C 108.028 31.711 127.711 12.028 152.000 12.000 L 160.000 12.000 C 162.209 12.000 164.000 10.209 164.000 8.000 C 164.000 5.791 162.209 4.000 160.000 4.000 L 152.000 4.000 C 123.295 4.033 100.033 27.295 100.000 56.000 C 100.000 58.209 101.791 60.000 104.000 60.000 ZM 244.000 216.000 C 244.000 218.209 242.209 220.000 240.000 220.000 L 16.000 220.000 C 13.791 220.000 12.000 218.209 12.000 216.000 C 12.000 213.791 13.791 212.000 16.000 212.000 L 35.210 212.000 C 49.420 183.790 66.150 141.350 67.860 95.490 C 68.098 89.050 73.406 83.963 79.850 84.000 L 168.180 84.000 C 174.602 83.993 179.891 89.044 180.180 95.460 C 182.390 145.800 205.890 192.460 217.180 212.000 L 240.000 212.000 C 242.209 212.000 244.000 213.791 244.000 216.000 ZM 171.850 212.000 C 157.710 183.120 141.850 141.150 140.150 95.790 C 140.038 93.663 138.280 91.997 136.150 92.000 L 79.850 92.000 C 77.720 91.997 75.962 93.663 75.850 95.790 C 74.160 141.150 58.290 183.120 44.150 212.000 ZM 207.940 212.000 C 195.770 190.000 174.320 144.700 172.170 95.810 C 172.068 93.675 170.307 91.998 168.170 92.000 L 147.490 92.000 C 147.881 93.124 148.100 94.301 148.140 95.490 C 149.850 141.350 166.580 183.790 180.790 212.000 Z"),
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
        return _nuclearPlant!!
    }

private var _nuclearPlant: ImageVector? = null
