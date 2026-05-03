package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pentagram: ImageVector
    get() {
        if (_pentagram != null) return _pentagram!!
        _pentagram = phosphorBoldIcon(
            name = "Pentagram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 243.000 89.830 C 240.345 81.581 232.666 75.992 224.000 76.000 L 165.850 76.000 L 147.050 18.050 C 144.463 9.723 136.763 4.044 128.043 4.032 C 119.324 4.021 111.609 9.680 109.000 18.000 L 90.150 76.000 L 32.000 76.000 C 23.323 76.000 15.636 81.596 12.969 89.852 C 10.302 98.109 13.263 107.144 20.300 112.220 L 67.400 146.110 L 49.330 201.810 C 46.653 210.043 49.577 219.063 56.575 224.160 C 63.573 229.257 73.055 229.273 80.070 224.200 L 128.000 189.710 L 175.890 224.160 C 182.898 229.251 192.387 229.253 199.397 224.163 C 206.406 219.073 209.342 210.050 206.670 201.810 L 188.600 146.110 L 235.750 112.190 C 242.754 107.093 245.680 98.067 243.000 89.830 ZM 128.000 37.110 L 140.620 76.000 L 115.380 76.000 ZM 44.420 100.000 L 82.360 100.000 L 75.180 122.130 ZM 75.930 197.600 L 87.860 160.820 L 107.450 174.920 ZM 95.640 136.850 L 107.640 100.000 L 148.460 100.000 L 160.460 136.850 L 128.000 160.140 ZM 148.550 174.920 L 168.140 160.820 L 180.070 197.600 ZM 180.820 122.130 L 173.640 100.000 L 211.580 100.000 Z"),
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
        return _pentagram!!
    }

private var _pentagram: ImageVector? = null
