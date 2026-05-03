package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.StandardDefinition: ImageVector
    get() {
        if (_standardDefinition != null) return _standardDefinition!!
        _standardDefinition = phosphorThinIcon(
            name = "StandardDefinition",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 144.000 76.000 C 141.791 76.000 140.000 77.791 140.000 80.000 L 140.000 176.000 C 140.000 178.209 141.791 180.000 144.000 180.000 L 168.000 180.000 C 196.719 180.000 220.000 156.719 220.000 128.000 C 220.000 99.281 196.719 76.000 168.000 76.000 ZM 212.000 128.000 C 211.972 152.289 192.289 171.972 168.000 172.000 L 148.000 172.000 L 148.000 84.000 L 168.000 84.000 C 192.289 84.028 211.972 103.711 212.000 128.000 ZM 28.000 48.000 C 28.000 45.791 29.791 44.000 32.000 44.000 L 224.000 44.000 C 226.209 44.000 228.000 45.791 228.000 48.000 C 228.000 50.209 226.209 52.000 224.000 52.000 L 32.000 52.000 C 29.791 52.000 28.000 50.209 28.000 48.000 ZM 228.000 208.000 C 228.000 210.209 226.209 212.000 224.000 212.000 L 32.000 212.000 C 29.791 212.000 28.000 210.209 28.000 208.000 C 28.000 205.791 29.791 204.000 32.000 204.000 L 224.000 204.000 C 226.209 204.000 228.000 205.791 228.000 208.000 ZM 108.000 152.000 C 108.000 139.420 96.210 135.080 78.220 129.890 C 63.000 125.510 45.780 120.540 45.780 104.000 C 45.780 88.000 60.490 76.000 80.000 76.000 C 94.210 76.000 106.300 82.460 111.550 92.850 C 112.274 94.132 112.235 95.708 111.448 96.953 C 110.662 98.198 109.256 98.910 107.787 98.807 C 106.318 98.704 105.025 97.802 104.420 96.460 C 100.530 88.780 91.170 84.000 80.000 84.000 C 65.000 84.000 53.780 92.600 53.780 104.000 C 53.780 113.810 63.850 117.430 80.440 122.210 C 97.030 126.990 116.000 132.460 116.000 152.000 C 116.000 167.440 99.850 180.000 80.000 180.000 C 60.150 180.000 44.000 167.440 44.000 152.000 C 44.000 149.791 45.791 148.000 48.000 148.000 C 50.209 148.000 52.000 149.791 52.000 152.000 C 52.000 163.000 64.560 172.000 80.000 172.000 C 95.440 172.000 108.000 163.000 108.000 152.000 Z"),
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
        return _standardDefinition!!
    }

private var _standardDefinition: ImageVector? = null
