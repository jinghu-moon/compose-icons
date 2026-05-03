package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SpeakerSimpleSlash: ImageVector
    get() {
        if (_speakerSimpleSlash != null) return _speakerSimpleSlash!!
        _speakerSimpleSlash = phosphorLightIcon(
            name = "SpeakerSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 194.000 152.000 L 194.000 104.000 C 194.000 100.686 196.686 98.000 200.000 98.000 C 203.314 98.000 206.000 100.686 206.000 104.000 L 206.000 152.000 C 206.000 155.314 203.314 158.000 200.000 158.000 C 196.686 158.000 194.000 155.314 194.000 152.000 ZM 232.000 82.000 C 228.686 82.000 226.000 84.686 226.000 88.000 L 226.000 168.000 C 226.000 171.314 228.686 174.000 232.000 174.000 C 235.314 174.000 238.000 171.314 238.000 168.000 L 238.000 88.000 C 238.000 84.686 235.314 82.000 232.000 82.000 ZM 220.440 212.000 C 222.671 214.452 222.492 218.249 220.040 220.480 C 217.588 222.711 213.791 222.532 211.560 220.080 L 166.000 169.920 L 166.000 224.000 C 166.000 226.291 164.696 228.382 162.639 229.390 C 160.581 230.397 158.129 230.145 156.320 228.740 L 85.940 174.000 L 40.000 174.000 C 32.268 174.000 26.000 167.732 26.000 160.000 L 26.000 96.000 C 26.000 88.268 32.268 82.000 40.000 82.000 L 86.070 82.000 L 51.560 44.000 C 49.695 41.516 50.034 38.019 52.342 35.940 C 54.650 33.861 58.163 33.887 60.440 36.000 ZM 154.000 156.720 L 97.000 94.000 L 40.000 94.000 C 38.895 94.000 38.000 94.895 38.000 96.000 L 38.000 160.000 C 38.000 161.105 38.895 162.000 40.000 162.000 L 88.000 162.000 C 89.333 162.000 90.627 162.443 91.680 163.260 L 154.000 211.730 ZM 123.830 67.720 L 154.000 44.270 L 154.000 106.830 C 154.000 110.144 156.686 112.830 160.000 112.830 C 163.314 112.830 166.000 110.144 166.000 106.830 L 166.000 32.000 C 166.000 29.709 164.696 27.618 162.639 26.610 C 160.581 25.603 158.129 25.855 156.320 27.260 L 116.470 58.260 C 114.699 59.547 113.769 61.697 114.045 63.870 C 114.321 66.042 115.758 67.891 117.795 68.695 C 119.832 69.499 122.145 69.129 123.830 67.730 Z"),
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
        return _speakerSimpleSlash!!
    }

private var _speakerSimpleSlash: ImageVector? = null
