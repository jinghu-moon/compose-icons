package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Grains: ImageVector
    get() {
        if (_grains != null) return _grains!!
        _grains = phosphorBoldIcon(
            name = "Grains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 52.000 C 197.825 51.996 187.720 53.686 178.100 57.000 C 162.710 28.240 134.700 13.940 133.370 13.280 C 129.990 11.589 126.010 11.589 122.630 13.280 C 121.300 13.940 93.290 28.280 77.890 57.000 C 68.274 53.685 58.172 51.995 48.000 52.000 C 41.373 52.000 36.000 57.373 36.000 64.000 L 36.000 144.000 C 36.000 194.810 77.190 236.000 128.000 236.000 C 178.810 236.000 220.000 194.810 220.000 144.000 L 220.000 64.000 C 220.000 57.373 214.627 52.000 208.000 52.000 ZM 60.000 77.060 C 90.097 82.506 112.879 107.337 115.720 137.790 C 101.130 121.878 81.403 111.611 60.000 108.790 ZM 116.000 210.940 C 83.614 205.084 60.045 176.911 60.000 144.000 L 60.000 133.060 C 92.386 138.916 115.955 167.089 116.000 200.000 ZM 99.370 67.710 C 107.570 52.770 120.690 42.710 128.000 37.940 C 135.320 42.730 148.430 52.770 156.630 67.710 C 144.842 75.676 135.045 86.249 128.000 98.610 C 120.951 86.252 111.156 75.679 99.370 67.710 ZM 196.000 144.000 C 195.955 176.911 172.386 205.084 140.000 210.940 L 140.000 200.000 C 140.045 167.089 163.614 138.916 196.000 133.060 ZM 196.000 108.780 C 174.597 111.601 154.870 121.868 140.280 137.780 C 143.126 107.331 165.907 82.505 196.000 77.060 Z"),
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
        return _grains!!
    }

private var _grains: ImageVector? = null
