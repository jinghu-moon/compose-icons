package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WaveSawtooth: ImageVector
    get() {
        if (_waveSawtooth != null) return _waveSawtooth!!
        _waveSawtooth = phosphorBoldIcon(
            name = "WaveSawtooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 238.290 138.220 L 134.290 202.220 C 130.587 204.499 125.942 204.597 122.147 202.476 C 118.351 200.355 116.000 196.348 116.000 192.000 L 116.000 85.470 L 30.290 138.220 C 24.646 141.694 17.254 139.934 13.780 134.290 C 10.306 128.646 12.066 121.254 17.710 117.780 L 121.710 53.780 C 125.413 51.501 130.058 51.403 133.853 53.524 C 137.649 55.645 140.000 59.652 140.000 64.000 L 140.000 170.530 L 225.710 117.780 C 231.354 114.306 238.746 116.066 242.220 121.710 C 245.694 127.354 243.934 134.746 238.290 138.220 Z"),
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
