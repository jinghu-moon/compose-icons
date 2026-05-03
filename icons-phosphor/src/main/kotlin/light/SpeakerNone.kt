package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SpeakerNone: ImageVector
    get() {
        if (_speakerNone != null) return _speakerNone!!
        _speakerNone = phosphorLightIcon(
            name = "SpeakerNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 154.640 26.610 C 152.582 25.602 150.130 25.854 148.320 27.260 L 77.940 82.000 L 32.000 82.000 C 24.268 82.000 18.000 88.268 18.000 96.000 L 18.000 160.000 C 18.000 167.732 24.268 174.000 32.000 174.000 L 77.940 174.000 L 148.320 228.740 C 150.129 230.145 152.581 230.397 154.639 229.390 C 156.696 228.382 158.000 226.291 158.000 224.000 L 158.000 32.000 C 158.001 29.709 156.697 27.618 154.640 26.610 ZM 30.000 160.000 L 30.000 96.000 C 30.000 94.895 30.895 94.000 32.000 94.000 L 74.000 94.000 L 74.000 162.000 L 32.000 162.000 C 30.895 162.000 30.000 161.105 30.000 160.000 ZM 146.000 211.730 L 86.000 165.060 L 86.000 90.940 L 146.000 44.270 Z"),
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
        return _speakerNone!!
    }

private var _speakerNone: ImageVector? = null
