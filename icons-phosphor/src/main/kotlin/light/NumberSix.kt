package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSix: ImageVector
    get() {
        if (_numberSix != null) return _numberSix!!
        _numberSix = phosphorLightIcon(
            name = "NumberSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 106.000 C 121.170 105.998 114.403 107.298 108.060 109.830 L 141.230 51.000 C 142.856 48.112 141.833 44.451 138.945 42.825 C 136.057 41.199 132.396 42.222 130.770 45.110 L 81.230 133.110 C 69.063 154.299 72.640 181.019 89.953 198.261 C 107.266 215.504 133.999 218.972 155.139 206.719 C 176.279 194.465 186.556 169.543 180.199 145.951 C 173.842 122.358 152.434 105.973 128.000 106.000 ZM 128.000 202.000 C 104.804 202.000 86.000 183.196 86.000 160.000 C 86.000 136.804 104.804 118.000 128.000 118.000 C 151.196 118.000 170.000 136.804 170.000 160.000 C 170.000 183.196 151.196 202.000 128.000 202.000 Z"),
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
        return _numberSix!!
    }

private var _numberSix: ImageVector? = null
