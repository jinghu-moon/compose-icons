package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonSimple: ImageVector
    get() {
        if (_personSimple != null) return _personSimple!!
        _personSimple = phosphorLightIcon(
            name = "PersonSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 78.000 C 144.569 78.000 158.000 64.569 158.000 48.000 C 158.000 31.431 144.569 18.000 128.000 18.000 C 111.431 18.000 98.000 31.431 98.000 48.000 C 98.000 64.569 111.431 78.000 128.000 78.000 ZM 128.000 30.000 C 137.941 30.000 146.000 38.059 146.000 48.000 C 146.000 57.941 137.941 66.000 128.000 66.000 C 118.059 66.000 110.000 57.941 110.000 48.000 C 110.000 38.059 118.059 30.000 128.000 30.000 ZM 229.140 131.090 C 227.416 133.910 223.736 134.804 220.910 133.090 C 220.540 132.880 184.420 111.660 134.000 110.090 L 134.000 149.700 L 196.480 220.000 C 198.689 222.485 198.465 226.291 195.980 228.500 C 193.495 230.709 189.689 230.485 187.480 228.000 L 128.000 161.000 L 68.480 228.000 C 66.271 230.485 62.465 230.709 59.980 228.500 C 57.495 226.291 57.271 222.485 59.480 220.000 L 122.000 149.720 L 122.000 110.110 C 71.580 111.710 35.450 132.930 35.080 133.110 C 32.244 134.741 28.624 133.800 26.942 130.995 C 25.260 128.189 26.135 124.553 28.910 122.820 C 30.600 121.840 71.000 98.000 128.000 98.000 C 185.000 98.000 225.390 121.840 227.090 122.860 C 229.927 124.568 230.845 128.251 229.140 131.090 Z"),
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
        return _personSimple!!
    }

private var _personSimple: ImageVector? = null
