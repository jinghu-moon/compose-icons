package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pulse: ImageVector
    get() {
        if (_pulse != null) return _pulse!!
        _pulse = phosphorLightIcon(
            name = "Pulse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 238.000 128.000 C 238.000 131.314 235.314 134.000 232.000 134.000 L 203.710 134.000 L 165.370 210.680 C 164.354 212.715 162.275 214.001 160.000 214.000 L 159.700 214.000 C 157.323 213.883 155.240 212.373 154.390 210.150 L 95.510 55.570 L 61.460 130.480 C 60.488 132.622 58.353 133.999 56.000 134.000 L 24.000 134.000 C 20.686 134.000 18.000 131.314 18.000 128.000 C 18.000 124.686 20.686 122.000 24.000 122.000 L 52.140 122.000 L 90.540 37.520 C 91.540 35.315 93.768 33.927 96.188 34.001 C 98.609 34.076 100.747 35.598 101.610 37.860 L 160.740 193.100 L 194.630 125.320 C 195.646 123.285 197.725 121.999 200.000 122.000 L 232.000 122.000 C 235.314 122.000 238.000 124.686 238.000 128.000 Z"),
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
        return _pulse!!
    }

private var _pulse: ImageVector? = null
