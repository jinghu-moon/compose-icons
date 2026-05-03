package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SpeakerSimpleHigh: ImageVector
    get() {
        if (_speakerSimpleHigh != null) return _speakerSimpleHigh!!
        _speakerSimpleHigh = phosphorLightIcon(
            name = "SpeakerSimpleHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 162.640 26.610 C 160.582 25.602 158.130 25.854 156.320 27.260 L 85.940 82.000 L 40.000 82.000 C 32.268 82.000 26.000 88.268 26.000 96.000 L 26.000 160.000 C 26.000 167.732 32.268 174.000 40.000 174.000 L 85.940 174.000 L 156.320 228.740 C 158.129 230.145 160.581 230.397 162.639 229.390 C 164.696 228.382 166.000 226.291 166.000 224.000 L 166.000 32.000 C 166.001 29.709 164.697 27.618 162.640 26.610 ZM 154.000 211.730 L 91.680 163.260 C 90.627 162.443 89.333 162.000 88.000 162.000 L 40.000 162.000 C 38.895 162.000 38.000 161.105 38.000 160.000 L 38.000 96.000 C 38.000 94.895 38.895 94.000 40.000 94.000 L 88.000 94.000 C 89.333 94.000 90.627 93.557 91.680 92.740 L 154.000 44.270 ZM 206.000 104.000 L 206.000 152.000 C 206.000 155.314 203.314 158.000 200.000 158.000 C 196.686 158.000 194.000 155.314 194.000 152.000 L 194.000 104.000 C 194.000 100.686 196.686 98.000 200.000 98.000 C 203.314 98.000 206.000 100.686 206.000 104.000 ZM 238.000 88.000 L 238.000 168.000 C 238.000 171.314 235.314 174.000 232.000 174.000 C 228.686 174.000 226.000 171.314 226.000 168.000 L 226.000 88.000 C 226.000 84.686 228.686 82.000 232.000 82.000 C 235.314 82.000 238.000 84.686 238.000 88.000 Z"),
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
        return _speakerSimpleHigh!!
    }

private var _speakerSimpleHigh: ImageVector? = null
