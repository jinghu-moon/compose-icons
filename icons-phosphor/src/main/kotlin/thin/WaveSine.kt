package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WaveSine: ImageVector
    get() {
        if (_waveSine != null) return _waveSine!!
        _waveSine = phosphorThinIcon(
            name = "WaveSine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 235.620 129.700 C 214.400 174.930 196.100 196.000 178.000 196.000 C 155.440 196.000 140.330 163.790 124.340 129.700 C 110.150 99.370 95.440 68.000 78.000 68.000 C 63.800 68.000 46.870 88.760 27.660 129.700 C 26.697 131.656 24.345 132.480 22.372 131.553 C 20.398 130.626 19.530 128.290 20.420 126.300 C 41.600 81.070 59.900 60.000 78.000 60.000 C 100.560 60.000 115.670 92.210 131.660 126.300 C 145.850 156.630 160.560 188.000 178.000 188.000 C 192.200 188.000 209.130 167.240 228.340 126.300 C 229.303 124.344 231.655 123.520 233.628 124.447 C 235.602 125.374 236.470 127.710 235.580 129.700 Z"),
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
        return _waveSine!!
    }

private var _waveSine: ImageVector? = null
