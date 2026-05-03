package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.YinYang: ImageVector
    get() {
        if (_yinYang != null) return _yinYang!!
        _yinYang = phosphorFillIcon(
            name = "YinYang",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 140.000 80.000 C 140.000 86.627 134.627 92.000 128.000 92.000 C 121.373 92.000 116.000 86.627 116.000 80.000 C 116.000 73.373 121.373 68.000 128.000 68.000 C 134.627 68.000 140.000 73.373 140.000 80.000 ZM 232.000 128.000 C 232.000 185.438 185.438 232.000 128.000 232.000 C 70.562 232.000 24.000 185.438 24.000 128.000 C 24.000 70.562 70.562 24.000 128.000 24.000 C 185.412 24.061 231.939 70.588 232.000 128.000 ZM 140.000 176.000 C 140.000 169.373 134.627 164.000 128.000 164.000 C 121.373 164.000 116.000 169.373 116.000 176.000 C 116.000 182.627 121.373 188.000 128.000 188.000 C 134.627 188.000 140.000 182.627 140.000 176.000 ZM 172.000 84.000 C 171.972 59.711 152.289 40.028 128.000 40.000 C 88.823 40.024 54.381 65.944 43.510 103.582 C 32.639 141.220 47.959 181.512 81.090 202.420 C 73.392 186.310 74.497 167.376 84.018 152.271 C 93.540 137.166 110.145 128.003 128.000 128.000 C 152.289 127.972 171.972 108.289 172.000 84.000 Z"),
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
        return _yinYang!!
    }

private var _yinYang: ImageVector? = null
