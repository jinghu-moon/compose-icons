package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tent: ImageVector
    get() {
        if (_tent != null) return _tent!!
        _tent = phosphorLightIcon(
            name = "Tent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 253.480 189.560 L 189.480 45.560 C 188.516 43.395 186.369 42.001 184.000 42.000 L 72.000 42.000 C 69.653 42.003 67.524 43.375 66.550 45.510 L 66.550 45.560 L 66.550 45.650 L 66.550 45.650 L 2.520 189.560 C 1.694 191.416 1.863 193.564 2.969 195.267 C 4.075 196.971 5.969 198.000 8.000 198.000 L 248.000 198.000 C 250.031 198.000 251.925 196.971 253.031 195.267 C 254.137 193.564 254.306 191.416 253.480 189.560 ZM 66.000 76.270 L 66.000 186.000 L 17.230 186.000 ZM 78.000 186.000 L 78.000 76.270 L 126.770 186.000 ZM 139.900 186.000 L 81.230 54.000 L 180.100 54.000 L 238.770 186.000 Z"),
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
        return _tent!!
    }

private var _tent: ImageVector? = null
