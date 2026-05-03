package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Metronome: ImageVector
    get() {
        if (_metronome != null) return _metronome!!
        _metronome = phosphorLightIcon(
            name = "Metronome",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 213.330 203.750 L 184.880 114.340 L 212.430 84.000 C 214.295 81.516 213.956 78.019 211.648 75.940 C 209.340 73.861 205.827 73.887 203.550 76.000 L 180.680 101.170 L 162.420 43.750 C 160.586 37.931 155.181 33.980 149.080 34.000 L 106.920 34.000 C 100.819 33.980 95.414 37.931 93.580 43.750 L 42.670 203.750 C 41.314 208.005 42.070 212.651 44.704 216.258 C 47.338 219.864 51.534 221.997 56.000 222.000 L 200.000 222.000 C 204.467 222.000 208.667 219.868 211.303 216.262 C 213.939 212.655 214.696 208.007 213.340 203.750 ZM 187.450 162.000 L 141.560 162.000 L 175.560 124.610 ZM 105.000 47.390 C 105.267 46.556 106.045 45.993 106.920 46.000 L 149.080 46.000 C 149.955 45.993 150.733 46.556 151.000 47.390 L 171.360 111.390 L 125.360 162.000 L 68.550 162.000 ZM 201.600 209.180 C 201.233 209.699 200.635 210.005 200.000 210.000 L 56.000 210.000 C 55.362 209.999 54.763 209.693 54.388 209.177 C 54.012 208.661 53.905 207.997 54.100 207.390 L 64.730 174.000 L 191.270 174.000 L 201.890 207.390 C 202.095 207.998 201.987 208.668 201.600 209.180 Z"),
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
        return _metronome!!
    }

private var _metronome: ImageVector? = null
