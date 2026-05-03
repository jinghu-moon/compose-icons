package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Metronome: ImageVector
    get() {
        if (_metronome != null) return _metronome!!
        _metronome = phosphorRegularIcon(
            name = "Metronome",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 187.140 114.840 L 213.920 85.380 C 216.827 82.103 216.558 77.097 213.316 74.151 C 210.074 71.204 205.065 71.413 202.080 74.620 L 181.530 97.220 L 164.330 43.150 C 162.234 36.497 156.055 31.980 149.080 32.000 L 106.910 32.000 C 99.935 31.980 93.756 36.497 91.660 43.150 L 40.750 203.150 C 39.203 208.015 40.069 213.325 43.083 217.446 C 46.097 221.566 50.895 224.001 56.000 224.000 L 200.000 224.000 C 205.105 224.001 209.903 221.566 212.917 217.446 C 215.931 213.325 216.797 208.015 215.250 203.150 ZM 184.720 160.000 L 146.080 160.000 L 174.700 128.520 ZM 106.910 48.000 L 149.080 48.000 L 169.080 110.900 L 124.460 160.000 L 71.270 160.000 ZM 56.000 208.000 L 66.180 176.000 L 189.810 176.000 L 200.000 208.000 Z"),
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
