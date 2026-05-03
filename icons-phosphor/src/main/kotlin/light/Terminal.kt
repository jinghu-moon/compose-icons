package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Terminal: ImageVector
    get() {
        if (_terminal != null) return _terminal!!
        _terminal = phosphorLightIcon(
            name = "Terminal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 116.000 132.480 L 44.000 196.480 C 41.515 198.689 37.709 198.465 35.500 195.980 C 33.291 193.495 33.515 189.689 36.000 187.480 L 103.000 128.000 L 36.000 68.490 C 33.515 66.281 33.291 62.475 35.500 59.990 C 37.709 57.505 41.515 57.281 44.000 59.490 L 116.000 123.490 C 117.292 124.629 118.031 126.268 118.031 127.990 C 118.031 129.712 117.292 131.351 116.000 132.490 ZM 216.000 186.000 L 120.000 186.000 C 116.686 186.000 114.000 188.686 114.000 192.000 C 114.000 195.314 116.686 198.000 120.000 198.000 L 216.000 198.000 C 219.314 198.000 222.000 195.314 222.000 192.000 C 222.000 188.686 219.314 186.000 216.000 186.000 Z"),
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
        return _terminal!!
    }

private var _terminal: ImageVector? = null
