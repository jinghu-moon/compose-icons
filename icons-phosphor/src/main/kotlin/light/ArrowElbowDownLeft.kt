package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowElbowDownLeft: ImageVector
    get() {
        if (_arrowElbowDownLeft != null) return _arrowElbowDownLeft!!
        _arrowElbowDownLeft = phosphorLightIcon(
            name = "ArrowElbowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 198.000 32.000 L 198.000 176.000 C 198.000 179.314 195.314 182.000 192.000 182.000 L 62.490 182.000 L 100.240 219.760 C 101.845 221.256 102.506 223.508 101.963 225.634 C 101.420 227.760 99.760 229.420 97.634 229.963 C 95.508 230.506 93.256 229.845 91.760 228.240 L 43.760 180.240 C 41.420 177.897 41.420 174.103 43.760 171.760 L 91.760 123.760 C 93.256 122.155 95.508 121.494 97.634 122.037 C 99.760 122.580 101.420 124.240 101.963 126.366 C 102.506 128.492 101.845 130.744 100.240 132.240 L 62.490 170.000 L 186.000 170.000 L 186.000 32.000 C 186.000 28.686 188.686 26.000 192.000 26.000 C 195.314 26.000 198.000 28.686 198.000 32.000 Z"),
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
        return _arrowElbowDownLeft!!
    }

private var _arrowElbowDownLeft: ImageVector? = null
