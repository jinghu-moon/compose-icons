package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BookOpenUser: ImageVector
    get() {
        if (_bookOpenUser != null) return _bookOpenUser!!
        _bookOpenUser = phosphorLightIcon(
            name = "BookOpenUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 74.000 L 160.000 74.000 C 147.038 74.010 134.975 80.625 128.000 91.550 C 121.025 80.625 108.962 74.010 96.000 74.000 L 24.000 74.000 C 20.686 74.000 18.000 76.686 18.000 80.000 L 18.000 200.000 C 18.000 203.314 20.686 206.000 24.000 206.000 L 96.000 206.000 C 110.359 206.000 122.000 217.641 122.000 232.000 C 122.000 235.314 124.686 238.000 128.000 238.000 C 131.314 238.000 134.000 235.314 134.000 232.000 C 134.000 217.641 145.641 206.000 160.000 206.000 L 232.000 206.000 C 235.314 206.000 238.000 203.314 238.000 200.000 L 238.000 80.000 C 238.000 76.686 235.314 74.000 232.000 74.000 ZM 96.000 194.000 L 30.000 194.000 L 30.000 86.000 L 96.000 86.000 C 110.359 86.000 122.000 97.641 122.000 112.000 L 122.000 204.310 C 114.967 197.681 105.665 193.992 96.000 194.000 ZM 226.000 194.000 L 160.000 194.000 C 150.332 193.994 141.028 197.691 134.000 204.330 L 134.000 112.000 C 134.000 97.641 145.641 86.000 160.000 86.000 L 226.000 86.000 ZM 91.200 44.400 C 99.887 32.817 113.521 26.000 128.000 26.000 C 142.479 26.000 156.113 32.817 164.800 44.400 C 166.788 47.051 166.251 50.812 163.600 52.800 C 160.949 54.788 157.188 54.251 155.200 51.600 C 148.779 43.039 138.702 38.000 128.000 38.000 C 117.298 38.000 107.221 43.039 100.800 51.600 C 98.812 54.251 95.051 54.788 92.400 52.800 C 89.749 50.812 89.212 47.051 91.200 44.400 Z"),
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
        return _bookOpenUser!!
    }

private var _bookOpenUser: ImageVector? = null
