package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Mountains: ImageVector
    get() {
        if (_mountains != null) return _mountains!!
        _mountains = phosphorRegularIcon(
            name = "Mountains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 164.000 80.000 C 179.464 80.000 192.000 67.464 192.000 52.000 C 192.000 36.536 179.464 24.000 164.000 24.000 C 148.536 24.000 136.000 36.536 136.000 52.000 C 136.000 67.464 148.536 80.000 164.000 80.000 ZM 164.000 40.000 C 170.627 40.000 176.000 45.373 176.000 52.000 C 176.000 58.627 170.627 64.000 164.000 64.000 C 157.373 64.000 152.000 58.627 152.000 52.000 C 152.000 45.373 157.373 40.000 164.000 40.000 ZM 254.880 195.920 L 200.320 103.840 C 197.456 98.958 192.210 95.971 186.550 96.000 L 186.550 96.000 C 180.893 95.970 175.649 98.958 172.790 103.840 L 146.630 148.000 L 101.790 71.900 C 98.915 67.014 93.669 64.014 88.000 64.014 C 82.331 64.014 77.085 67.014 74.210 71.900 L 1.110 195.940 C -0.347 198.413 -0.367 201.477 1.057 203.968 C 2.481 206.460 5.130 207.999 8.000 208.000 L 248.000 208.000 C 250.874 207.999 253.528 206.457 254.950 203.959 C 256.373 201.461 256.346 198.393 254.880 195.920 ZM 88.000 80.000 L 111.570 120.000 L 64.430 120.000 ZM 22.000 192.000 L 55.000 136.000 L 121.000 136.000 L 139.740 167.800 L 139.740 167.800 L 154.000 192.000 ZM 172.570 192.000 L 155.910 163.720 L 186.550 112.000 L 234.000 192.000 Z"),
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
        return _mountains!!
    }

private var _mountains: ImageVector? = null
