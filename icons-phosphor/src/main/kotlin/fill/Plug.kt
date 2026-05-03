package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Plug: ImageVector
    get() {
        if (_plug != null) return _plug!!
        _plug = phosphorFillIcon(
            name = "Plug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 237.660 77.660 L 203.310 112.000 L 229.660 138.340 C 232.786 141.466 232.786 146.534 229.660 149.660 C 226.534 152.786 221.466 152.786 218.340 149.660 L 212.000 143.310 L 159.000 196.310 C 151.498 203.812 141.324 208.026 130.715 208.026 C 120.106 208.026 109.932 203.812 102.430 196.310 L 86.750 180.570 L 37.660 229.660 C 34.534 232.786 29.466 232.786 26.340 229.660 C 23.214 226.534 23.214 221.466 26.340 218.340 L 75.430 169.250 L 59.720 153.540 C 52.218 146.038 48.004 135.864 48.004 125.255 C 48.004 114.646 52.218 104.472 59.720 96.970 L 112.720 43.970 L 106.370 37.630 C 103.244 34.504 103.244 29.436 106.370 26.310 C 109.496 23.184 114.564 23.184 117.690 26.310 L 144.000 52.690 L 178.340 18.340 C 181.466 15.214 186.534 15.214 189.660 18.340 C 192.786 21.466 192.786 26.534 189.660 29.660 L 155.310 64.000 L 192.000 100.690 L 226.340 66.340 C 229.466 63.214 234.534 63.214 237.660 66.340 C 240.786 69.466 240.786 74.534 237.660 77.660 Z"),
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
        return _plug!!
    }

private var _plug: ImageVector? = null
