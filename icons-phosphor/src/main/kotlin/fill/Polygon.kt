package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Polygon: ImageVector
    get() {
        if (_polygon != null) return _polygon!!
        _polygon = phosphorFillIcon(
            name = "Polygon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 227.810 52.190 C 222.559 46.938 215.437 43.988 208.010 43.988 C 200.583 43.988 193.461 46.938 188.210 52.190 L 188.210 52.190 C 186.691 53.699 185.349 55.377 184.210 57.190 L 148.000 47.330 C 147.740 36.124 140.822 26.153 130.416 21.987 C 120.010 17.820 108.122 20.261 100.200 28.190 L 100.200 28.190 C 91.824 36.563 89.621 49.301 94.700 60.000 L 54.580 96.100 C 43.545 89.363 29.332 91.057 20.190 100.200 L 20.190 100.200 C 9.793 110.609 9.225 127.289 18.890 138.381 C 28.555 149.473 45.156 151.194 56.890 142.320 L 133.640 198.600 C 128.978 211.667 134.587 226.178 146.827 232.711 C 159.067 239.244 174.245 235.828 182.507 224.682 C 190.768 213.536 189.621 198.020 179.810 188.210 C 178.777 187.177 177.663 186.227 176.480 185.370 L 206.630 100.000 Q 207.320 100.000 208.010 100.000 C 219.331 99.997 229.536 93.176 233.870 82.717 C 238.203 72.258 235.812 60.219 227.810 52.210 ZM 161.390 180.050 C 154.820 179.723 148.345 181.720 143.100 185.690 L 66.360 129.410 C 68.841 122.412 68.456 114.716 65.290 108.000 L 105.410 71.890 C 118.535 79.901 135.664 75.830 143.780 62.770 L 180.000 72.660 C 180.153 79.852 183.081 86.706 188.170 91.790 C 189.202 92.823 190.312 93.776 191.490 94.640 Z"),
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
        return _polygon!!
    }

private var _polygon: ImageVector? = null
