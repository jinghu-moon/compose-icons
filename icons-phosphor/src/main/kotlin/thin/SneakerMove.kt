package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SneakerMove: ImageVector
    get() {
        if (_sneakerMove != null) return _sneakerMove!!
        _sneakerMove = phosphorThinIcon(
            name = "SneakerMove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 229.370 170.210 L 200.750 155.900 C 183.082 147.147 171.930 129.107 172.000 109.390 L 172.000 80.000 C 172.000 77.791 170.209 76.000 168.000 76.000 C 139.295 75.967 116.033 52.705 116.000 24.000 C 116.002 22.479 115.142 21.089 113.780 20.413 C 112.418 19.736 110.791 19.890 109.580 20.810 L 32.580 79.220 L 32.480 79.300 C 29.836 81.439 28.225 84.600 28.045 87.996 C 27.866 91.392 29.136 94.704 31.540 97.110 L 145.230 210.830 C 145.981 211.580 146.999 212.001 148.060 212.000 L 224.000 212.000 C 230.627 212.000 236.000 206.627 236.000 200.000 L 236.000 180.940 C 236.014 176.393 233.443 172.232 229.370 170.210 ZM 228.000 200.000 C 228.000 202.209 226.209 204.000 224.000 204.000 L 149.720 204.000 L 37.170 91.450 C 36.376 90.655 35.953 89.563 36.004 88.440 C 36.056 87.318 36.577 86.269 37.440 85.550 L 53.230 73.550 L 94.490 114.800 C 96.064 116.293 98.541 116.259 100.073 114.724 C 101.606 113.188 101.636 110.711 100.140 109.140 L 59.670 68.700 L 108.490 31.700 C 112.210 60.090 135.434 81.917 164.000 83.870 L 164.000 109.390 C 163.923 132.140 176.788 152.955 197.170 163.060 L 225.790 177.370 C 227.142 178.047 227.997 179.428 228.000 180.940 ZM 70.800 180.000 L 32.000 180.000 C 29.791 180.000 28.000 178.209 28.000 176.000 C 28.000 173.791 29.791 172.000 32.000 172.000 L 70.800 172.000 C 73.009 172.000 74.800 173.791 74.800 176.000 C 74.800 178.209 73.009 180.000 70.800 180.000 ZM 106.800 208.000 C 106.800 210.209 105.009 212.000 102.800 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 C 44.000 205.791 45.791 204.000 48.000 204.000 L 102.800 204.000 C 105.009 204.000 106.800 205.791 106.800 208.000 Z"),
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
        return _sneakerMove!!
    }

private var _sneakerMove: ImageVector? = null
