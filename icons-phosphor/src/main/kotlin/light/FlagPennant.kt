package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FlagPennant: ImageVector
    get() {
        if (_flagPennant != null) return _flagPennant!!
        _flagPennant = phosphorLightIcon(
            name = "FlagPennant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 242.000 98.330 L 58.000 34.330 C 56.161 33.680 54.122 33.964 52.531 35.092 C 50.939 36.219 49.996 38.050 50.000 40.000 L 50.000 216.000 C 50.000 219.314 52.686 222.000 56.000 222.000 C 59.314 222.000 62.000 219.314 62.000 216.000 L 62.000 172.270 L 242.000 109.670 C 244.417 108.834 246.038 106.557 246.038 104.000 C 246.038 101.443 244.417 99.166 242.000 98.330 ZM 62.000 159.560 L 62.000 48.440 L 221.740 104.000 Z"),
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
        return _flagPennant!!
    }

private var _flagPennant: ImageVector? = null
