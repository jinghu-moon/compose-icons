package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SpeakerSimpleX: ImageVector
    get() {
        if (_speakerSimpleX != null) return _speakerSimpleX!!
        _speakerSimpleX = phosphorLightIcon(
            name = "SpeakerSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 162.640 26.610 C 160.582 25.602 158.130 25.854 156.320 27.260 L 85.940 82.000 L 40.000 82.000 C 32.268 82.000 26.000 88.268 26.000 96.000 L 26.000 160.000 C 26.000 167.732 32.268 174.000 40.000 174.000 L 85.940 174.000 L 156.320 228.740 C 158.129 230.145 160.581 230.397 162.639 229.390 C 164.696 228.382 166.000 226.291 166.000 224.000 L 166.000 32.000 C 166.001 29.709 164.697 27.618 162.640 26.610 ZM 154.000 211.730 L 91.680 163.260 C 90.627 162.443 89.333 162.000 88.000 162.000 L 40.000 162.000 C 38.895 162.000 38.000 161.105 38.000 160.000 L 38.000 96.000 C 38.000 94.895 38.895 94.000 40.000 94.000 L 88.000 94.000 C 89.333 94.000 90.627 93.557 91.680 92.740 L 154.000 44.270 ZM 252.240 147.730 C 253.845 149.226 254.506 151.478 253.963 153.604 C 253.420 155.730 251.760 157.390 249.634 157.933 C 247.508 158.476 245.256 157.815 243.760 156.210 L 224.000 136.480 L 204.240 156.240 C 201.876 158.443 198.192 158.378 195.907 156.093 C 193.622 153.808 193.557 150.124 195.760 147.760 L 215.520 128.000 L 195.760 108.240 C 193.557 105.876 193.622 102.192 195.907 99.907 C 198.192 97.622 201.876 97.557 204.240 99.760 L 224.000 119.520 L 243.760 99.760 C 246.124 97.557 249.808 97.622 252.093 99.907 C 254.378 102.192 254.443 105.876 252.240 108.240 L 232.480 128.000 Z"),
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
        return _speakerSimpleX!!
    }

private var _speakerSimpleX: ImageVector? = null
