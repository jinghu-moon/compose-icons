package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SpeakerX: ImageVector
    get() {
        if (_speakerX != null) return _speakerX!!
        _speakerX = phosphorLightIcon(
            name = "SpeakerX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 154.640 26.610 C 152.582 25.602 150.130 25.854 148.320 27.260 L 77.940 82.000 L 32.000 82.000 C 24.268 82.000 18.000 88.268 18.000 96.000 L 18.000 160.000 C 18.000 167.732 24.268 174.000 32.000 174.000 L 77.940 174.000 L 148.320 228.740 C 150.129 230.145 152.581 230.397 154.639 229.390 C 156.696 228.382 158.000 226.291 158.000 224.000 L 158.000 32.000 C 158.001 29.709 156.697 27.618 154.640 26.610 ZM 30.000 160.000 L 30.000 96.000 C 30.000 94.895 30.895 94.000 32.000 94.000 L 74.000 94.000 L 74.000 162.000 L 32.000 162.000 C 30.895 162.000 30.000 161.105 30.000 160.000 ZM 146.000 211.730 L 86.000 165.060 L 86.000 90.940 L 146.000 44.270 ZM 244.240 147.730 C 245.845 149.226 246.506 151.478 245.963 153.604 C 245.420 155.730 243.760 157.390 241.634 157.933 C 239.508 158.476 237.256 157.815 235.760 156.210 L 216.000 136.480 L 196.240 156.240 C 193.876 158.443 190.192 158.378 187.907 156.093 C 185.622 153.808 185.557 150.124 187.760 147.760 L 207.520 128.000 L 187.760 108.240 C 185.557 105.876 185.622 102.192 187.907 99.907 C 190.192 97.622 193.876 97.557 196.240 99.760 L 216.000 119.520 L 235.760 99.760 C 238.124 97.557 241.808 97.622 244.093 99.907 C 246.378 102.192 246.443 105.876 244.240 108.240 L 224.480 128.000 Z"),
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
        return _speakerX!!
    }

private var _speakerX: ImageVector? = null
