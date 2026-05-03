package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SpeakerSimpleNone: ImageVector
    get() {
        if (_speakerSimpleNone != null) return _speakerSimpleNone!!
        _speakerSimpleNone = phosphorLightIcon(
            name = "SpeakerSimpleNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 162.640 26.610 C 160.582 25.602 158.130 25.854 156.320 27.260 L 85.940 82.000 L 40.000 82.000 C 32.268 82.000 26.000 88.268 26.000 96.000 L 26.000 160.000 C 26.000 167.732 32.268 174.000 40.000 174.000 L 85.940 174.000 L 156.320 228.740 C 158.129 230.145 160.581 230.397 162.639 229.390 C 164.696 228.382 166.000 226.291 166.000 224.000 L 166.000 32.000 C 166.001 29.709 164.697 27.618 162.640 26.610 ZM 154.000 211.730 L 91.680 163.260 C 90.627 162.443 89.333 162.000 88.000 162.000 L 40.000 162.000 C 38.895 162.000 38.000 161.105 38.000 160.000 L 38.000 96.000 C 38.000 94.895 38.895 94.000 40.000 94.000 L 88.000 94.000 C 89.333 94.000 90.627 93.557 91.680 92.740 L 154.000 44.270 Z"),
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
        return _speakerSimpleNone!!
    }

private var _speakerSimpleNone: ImageVector? = null
