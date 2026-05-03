package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Disc: ImageVector
    get() {
        if (_disc != null) return _disc!!
        _disc = phosphorRegularIcon(
            name = "Disc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 167.200 120.000 C 166.170 115.002 164.187 110.249 161.360 106.000 L 195.590 71.760 C 207.017 85.442 213.994 102.286 215.590 120.040 ZM 152.000 128.000 C 152.000 141.255 141.255 152.000 128.000 152.000 C 114.745 152.000 104.000 141.255 104.000 128.000 C 104.000 114.745 114.745 104.000 128.000 104.000 C 141.255 104.000 152.000 114.745 152.000 128.000 ZM 128.000 216.000 C 89.149 216.027 54.877 190.573 43.676 153.371 C 32.475 116.169 46.995 76.024 79.403 54.596 C 111.810 33.167 154.435 35.526 184.280 60.400 L 150.000 94.640 C 135.318 84.970 116.043 86.020 102.499 97.228 C 88.954 108.435 84.315 127.173 91.065 143.405 C 97.816 159.638 114.373 169.560 131.871 167.858 C 149.369 166.156 163.704 153.229 167.200 136.000 L 215.630 136.000 C 211.444 181.286 173.479 215.945 128.000 216.000 Z"),
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
        return _disc!!
    }

private var _disc: ImageVector? = null
