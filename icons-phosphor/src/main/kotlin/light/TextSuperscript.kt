package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextSuperscript: ImageVector
    get() {
        if (_textSuperscript != null) return _textSuperscript!!
        _textSuperscript = phosphorLightIcon(
            name = "TextSuperscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 246.000 144.000 C 246.000 147.314 243.314 150.000 240.000 150.000 L 192.000 150.000 C 189.727 150.000 187.650 148.716 186.633 146.683 C 185.617 144.651 185.836 142.218 187.200 140.400 L 230.370 82.850 C 234.593 77.183 235.109 69.569 231.689 63.384 C 228.269 57.199 221.546 53.588 214.501 54.152 C 207.456 54.715 201.393 59.350 199.000 66.000 C 197.840 69.044 194.464 70.606 191.393 69.520 C 188.322 68.434 186.678 65.096 187.690 62.000 C 188.714 59.131 190.167 56.433 192.000 54.000 C 201.958 40.745 220.775 38.072 234.030 48.030 C 247.285 57.988 249.958 76.805 240.000 90.060 L 204.000 138.000 L 240.000 138.000 C 243.314 138.000 246.000 140.686 246.000 144.000 ZM 147.930 75.470 C 145.428 73.301 141.641 73.570 139.470 76.070 L 92.000 130.840 L 44.530 76.070 C 43.148 74.374 40.952 73.565 38.800 73.958 C 36.648 74.351 34.881 75.885 34.188 77.960 C 33.495 80.035 33.986 82.322 35.470 83.930 L 84.060 140.000 L 35.470 196.070 C 33.986 197.678 33.495 199.965 34.188 202.040 C 34.881 204.115 36.648 205.649 38.800 206.042 C 40.952 206.435 43.148 205.626 44.530 203.930 L 92.000 149.160 L 139.470 203.930 C 141.669 206.312 145.362 206.517 147.811 204.392 C 150.259 202.268 150.578 198.583 148.530 196.070 L 99.940 140.000 L 148.530 83.930 C 150.699 81.428 150.430 77.641 147.930 75.470 Z"),
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
        return _textSuperscript!!
    }

private var _textSuperscript: ImageVector? = null
