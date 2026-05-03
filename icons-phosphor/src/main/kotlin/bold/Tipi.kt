package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tipi: ImageVector
    get() {
        if (_tipi != null) return _tipi!!
        _tipi = phosphorBoldIcon(
            name = "Tipi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 242.110 209.530 L 142.250 53.530 L 162.110 22.530 C 165.700 16.946 164.084 9.510 158.500 5.920 C 152.916 2.330 145.480 3.946 141.890 9.530 L 128.000 31.240 L 114.110 9.530 C 110.537 3.946 103.114 2.317 97.530 5.890 C 91.946 9.463 90.317 16.886 93.890 22.470 L 113.750 53.470 L 13.890 209.470 C 11.492 213.167 11.313 217.880 13.424 221.747 C 15.534 225.615 19.594 228.016 24.000 228.000 L 232.000 228.000 C 236.386 228.001 240.424 225.609 242.530 221.762 C 244.636 217.914 244.475 213.224 242.110 209.530 ZM 96.170 204.000 L 128.000 154.260 L 159.830 204.000 ZM 188.330 204.000 L 138.110 125.530 C 135.905 122.081 132.094 119.994 128.000 119.994 C 123.906 119.994 120.095 122.081 117.890 125.530 L 67.670 204.000 L 45.930 204.000 L 128.000 75.760 L 210.070 204.000 Z"),
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
        return _tipi!!
    }

private var _tipi: ImageVector? = null
