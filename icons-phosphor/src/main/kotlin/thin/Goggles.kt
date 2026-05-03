package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Goggles: ImageVector
    get() {
        if (_goggles != null) return _goggles!!
        _goggles = phosphorThinIcon(
            name = "Goggles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 252.000 136.000 C 251.961 98.461 221.539 68.039 184.000 68.000 L 72.000 68.000 C 34.461 68.039 4.039 98.461 4.000 136.000 C 4.007 145.633 10.879 153.892 20.350 155.650 C 23.910 174.840 54.810 188.000 72.000 188.000 C 90.332 187.996 105.733 174.218 107.770 156.000 L 148.230 156.000 C 150.267 174.218 165.668 187.996 184.000 188.000 C 201.190 188.000 232.090 174.840 235.650 155.650 C 245.121 153.892 251.993 145.633 252.000 136.000 ZM 28.000 152.000 C 28.000 144.250 35.920 136.750 45.810 131.470 L 88.810 174.420 C 83.962 178.057 78.061 180.016 72.000 180.000 C 55.450 180.000 28.000 166.440 28.000 152.000 ZM 94.420 168.760 L 53.580 127.920 C 60.000 125.460 66.580 124.000 72.000 124.000 C 82.595 124.004 92.280 129.987 97.025 139.460 C 101.770 148.933 100.762 160.273 94.420 168.760 ZM 156.000 152.000 C 156.000 144.000 159.430 136.383 165.420 131.080 L 208.000 173.650 C 200.000 177.560 191.000 180.000 184.000 180.000 C 168.536 180.000 156.000 167.464 156.000 152.000 ZM 215.200 169.550 L 172.250 126.550 C 175.934 124.855 179.944 123.985 184.000 124.000 C 200.550 124.000 228.000 137.560 228.000 152.000 C 228.000 158.390 222.620 164.600 215.200 169.550 ZM 235.460 147.490 C 231.150 128.770 200.930 116.000 184.000 116.000 C 165.668 116.004 150.267 129.782 148.230 148.000 L 107.770 148.000 C 105.733 129.782 90.332 116.004 72.000 116.000 C 55.070 116.000 24.850 128.770 20.540 147.490 C 15.470 145.963 12.000 141.295 12.000 136.000 C 12.039 102.879 38.879 76.039 72.000 76.000 L 184.000 76.000 C 217.121 76.039 243.961 102.879 244.000 136.000 C 244.000 141.295 240.530 145.963 235.460 147.490 Z"),
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
