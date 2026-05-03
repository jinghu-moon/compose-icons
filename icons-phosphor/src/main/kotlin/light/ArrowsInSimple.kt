package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsInSimple: ImageVector
    get() {
        if (_arrowsInSimple != null) return _arrowsInSimple!!
        _arrowsInSimple = phosphorLightIcon(
            name = "ArrowsInSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.240 52.240 L 158.480 106.000 L 192.000 106.000 C 195.314 106.000 198.000 108.686 198.000 112.000 C 198.000 115.314 195.314 118.000 192.000 118.000 L 144.000 118.000 C 140.686 118.000 138.000 115.314 138.000 112.000 L 138.000 64.000 C 138.000 60.686 140.686 58.000 144.000 58.000 C 147.314 58.000 150.000 60.686 150.000 64.000 L 150.000 97.520 L 203.760 43.760 C 206.124 41.557 209.808 41.622 212.093 43.907 C 214.378 46.192 214.443 49.876 212.240 52.240 ZM 112.000 138.000 L 64.000 138.000 C 60.686 138.000 58.000 140.686 58.000 144.000 C 58.000 147.314 60.686 150.000 64.000 150.000 L 97.520 150.000 L 43.760 203.760 C 42.155 205.256 41.494 207.508 42.037 209.634 C 42.580 211.760 44.240 213.420 46.366 213.963 C 48.492 214.506 50.744 213.845 52.240 212.240 L 106.000 158.480 L 106.000 192.000 C 106.000 195.314 108.686 198.000 112.000 198.000 C 115.314 198.000 118.000 195.314 118.000 192.000 L 118.000 144.000 C 118.000 140.686 115.314 138.000 112.000 138.000 Z"),
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
        return _arrowsInSimple!!
    }

private var _arrowsInSimple: ImageVector? = null
