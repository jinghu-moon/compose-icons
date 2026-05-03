package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonSimpleSki: ImageVector
    get() {
        if (_personSimpleSki != null) return _personSimpleSki!!
        _personSimpleSki = phosphorLightIcon(
            name = "PersonSimpleSki",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 172.000 86.000 C 186.359 86.000 198.000 74.359 198.000 60.000 C 198.000 45.641 186.359 34.000 172.000 34.000 C 157.641 34.000 146.000 45.641 146.000 60.000 C 146.000 74.359 157.641 86.000 172.000 86.000 ZM 172.000 46.000 C 179.732 46.000 186.000 52.268 186.000 60.000 C 186.000 67.732 179.732 74.000 172.000 74.000 C 164.268 74.000 158.000 67.732 158.000 60.000 C 158.000 52.268 164.268 46.000 172.000 46.000 ZM 38.320 85.760 L 149.790 118.270 L 155.790 124.270 C 156.912 125.377 158.424 125.999 160.000 126.000 L 200.000 126.000 C 203.314 126.000 206.000 123.314 206.000 120.000 C 206.000 116.686 203.314 114.000 200.000 114.000 L 162.490 114.000 L 132.240 83.750 C 129.897 81.410 126.103 81.410 123.760 83.750 L 112.590 94.920 L 41.680 74.240 C 38.499 73.312 35.168 75.139 34.240 78.320 C 33.312 81.501 35.139 84.832 38.320 85.760 ZM 128.000 96.480 L 132.140 100.620 L 125.730 98.750 ZM 235.330 202.580 C 218.647 213.724 197.885 216.906 178.630 211.270 L 22.320 165.750 C 19.139 164.822 17.312 161.491 18.240 158.310 C 19.168 155.129 22.499 153.302 25.680 154.230 L 102.810 176.690 L 132.550 147.000 L 86.350 133.800 C 83.163 132.889 81.319 129.567 82.230 126.380 C 83.141 123.193 86.463 121.349 89.650 122.260 L 145.650 138.260 C 147.689 138.847 149.266 140.467 149.798 142.521 C 150.329 144.575 149.737 146.757 148.240 148.260 L 116.000 180.520 L 182.000 199.750 C 197.851 204.394 214.946 201.776 228.680 192.600 C 231.441 190.761 235.171 191.509 237.010 194.270 C 238.849 197.031 238.101 200.761 235.340 202.600 Z"),
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
        return _personSimpleSki!!
    }

private var _personSimpleSki: ImageVector? = null
