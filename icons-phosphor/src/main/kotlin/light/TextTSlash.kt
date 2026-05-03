package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextTSlash: ImageVector
    get() {
        if (_textTSlash != null) return _textTSlash!!
        _textTSlash = phosphorLightIcon(
            name = "TextTSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 220.440 C 210.823 221.512 209.268 222.073 207.677 221.997 C 206.087 221.922 204.591 221.218 203.520 220.040 L 134.000 143.520 L 134.000 194.000 L 160.000 194.000 C 163.314 194.000 166.000 196.686 166.000 200.000 C 166.000 203.314 163.314 206.000 160.000 206.000 L 96.000 206.000 C 92.686 206.000 90.000 203.314 90.000 200.000 C 90.000 196.686 92.686 194.000 96.000 194.000 L 122.000 194.000 L 122.000 130.320 L 62.000 64.320 L 62.000 88.000 C 62.000 91.314 59.314 94.000 56.000 94.000 C 52.686 94.000 50.000 91.314 50.000 88.000 L 50.000 56.000 C 50.004 54.713 50.421 53.462 51.190 52.430 L 43.560 44.000 C 41.695 41.516 42.034 38.019 44.342 35.940 C 46.650 33.861 50.163 33.887 52.440 36.000 L 212.440 212.000 C 214.636 214.457 214.439 218.225 212.000 220.440 ZM 105.790 62.000 L 122.000 62.000 L 122.000 80.430 C 122.000 83.744 124.686 86.430 128.000 86.430 C 131.314 86.430 134.000 83.744 134.000 80.430 L 134.000 62.000 L 194.000 62.000 L 194.000 88.000 C 194.000 91.314 196.686 94.000 200.000 94.000 C 203.314 94.000 206.000 91.314 206.000 88.000 L 206.000 56.000 C 206.000 52.686 203.314 50.000 200.000 50.000 L 105.790 50.000 C 102.476 50.000 99.790 52.686 99.790 56.000 C 99.790 59.314 102.476 62.000 105.790 62.000 Z"),
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
        return _textTSlash!!
    }

private var _textTSlash: ImageVector? = null
