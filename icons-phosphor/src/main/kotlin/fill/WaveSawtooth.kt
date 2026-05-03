package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WaveSawtooth: ImageVector
    get() {
        if (_waveSawtooth != null) return _waveSawtooth!!
        _waveSawtooth = phosphorFillIcon(
            name = "WaveSawtooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 204.440 134.660 L 132.440 182.660 C 131.125 183.535 129.580 184.002 128.000 184.000 C 123.582 184.000 120.000 180.418 120.000 176.000 L 120.000 95.000 L 60.440 134.660 C 56.762 137.112 51.792 136.118 49.340 132.440 C 46.888 128.762 47.882 123.792 51.560 121.340 L 123.560 73.340 C 126.015 71.702 129.174 71.549 131.776 72.942 C 134.378 74.335 136.002 77.048 136.000 80.000 L 136.000 161.050 L 195.560 121.340 C 199.238 118.888 204.208 119.882 206.660 123.560 C 209.112 127.238 208.118 132.208 204.440 134.660 Z"),
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
        return _waveSawtooth!!
    }

private var _waveSawtooth: ImageVector? = null
