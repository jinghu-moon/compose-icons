package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TreePalm: ImageVector
    get() {
        if (_treePalm != null) return _treePalm!!
        _treePalm = phosphorFillIcon(
            name = "TreePalm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 239.840 60.330 C 239.322 62.891 237.586 65.038 235.190 66.080 L 179.000 90.550 C 197.282 95.438 212.877 107.383 222.360 123.760 C 231.971 140.160 234.566 159.742 229.560 178.080 C 228.864 180.648 226.937 182.703 224.419 183.561 C 221.900 184.420 219.119 183.969 217.000 182.360 L 136.000 120.680 L 136.000 224.000 C 136.000 228.418 132.418 232.000 128.000 232.000 C 123.582 232.000 120.000 228.418 120.000 224.000 L 120.000 120.680 L 39.000 182.360 C 36.881 183.974 34.097 184.427 31.575 183.568 C 29.053 182.709 27.124 180.652 26.430 178.080 C 21.424 159.742 24.019 140.160 33.630 123.760 C 43.115 107.380 58.714 95.436 77.000 90.550 L 20.810 66.080 C 18.416 65.037 16.681 62.892 16.164 60.332 C 15.646 57.773 16.410 55.121 18.210 53.230 C 30.855 39.687 48.552 31.999 67.080 31.999 C 85.608 31.999 103.305 39.687 115.950 53.230 C 120.750 58.288 124.792 64.014 127.950 70.230 C 131.124 64.011 135.183 58.284 140.000 53.230 C 152.645 39.687 170.342 31.999 188.870 31.999 C 207.398 31.999 225.095 39.687 237.740 53.230 C 239.559 55.111 240.343 57.762 239.840 60.330 Z"),
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
        return _treePalm!!
    }

private var _treePalm: ImageVector? = null
