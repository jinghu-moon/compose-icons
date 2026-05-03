package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Flower: ImageVector
    get() {
        if (_flower != null) return _flower!!
        _flower = phosphorFillIcon(
            name = "Flower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 210.350 129.360 C 209.540 128.890 208.650 128.440 207.730 128.000 C 208.650 127.560 209.540 127.110 210.350 126.640 C 222.828 119.546 230.548 106.309 230.580 91.955 C 230.611 77.601 222.949 64.331 210.503 57.182 C 198.056 50.033 182.733 50.101 170.350 57.360 C 169.540 57.830 168.700 58.360 167.870 58.950 C 167.950 57.950 168.000 56.950 168.000 55.950 C 168.000 33.859 150.091 15.950 128.000 15.950 C 105.909 15.950 88.000 33.859 88.000 55.950 C 88.000 56.890 88.000 57.890 88.130 58.950 C 87.300 58.380 86.460 57.830 85.650 57.360 C 73.267 50.101 57.944 50.033 45.497 57.182 C 33.051 64.331 25.389 77.601 25.420 91.955 C 25.452 106.309 33.172 119.546 45.650 126.640 C 46.460 127.110 47.350 127.560 48.270 128.000 C 47.350 128.440 46.460 128.890 45.650 129.360 C 33.172 136.454 25.452 149.691 25.420 164.045 C 25.389 178.399 33.051 191.669 45.497 198.818 C 57.944 205.967 73.267 205.899 85.650 198.640 C 86.460 198.170 87.300 197.640 88.130 197.050 C 88.050 198.050 88.000 199.050 88.000 200.000 C 88.000 222.091 105.909 240.000 128.000 240.000 C 150.091 240.000 168.000 222.091 168.000 200.000 C 168.000 199.060 167.950 198.060 167.870 197.050 C 168.700 197.620 169.540 198.170 170.350 198.640 C 176.409 202.150 183.287 203.999 190.290 204.000 C 193.809 203.995 197.312 203.531 200.710 202.620 C 216.337 198.432 227.903 185.242 230.013 169.201 C 232.123 153.160 224.362 137.428 210.350 129.340 ZM 128.000 156.000 C 112.536 156.000 100.000 143.464 100.000 128.000 C 100.000 112.536 112.536 100.000 128.000 100.000 C 143.464 100.000 156.000 112.536 156.000 128.000 C 156.000 143.464 143.464 156.000 128.000 156.000 Z"),
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
        return _flower!!
    }

private var _flower: ImageVector? = null
