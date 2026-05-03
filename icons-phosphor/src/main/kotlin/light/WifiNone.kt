package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WifiNone: ImageVector
    get() {
        if (_wifiNone != null) return _wifiNone!!
        _wifiNone = phosphorLightIcon(
            name = "WifiNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 138.000 204.000 C 138.000 209.523 133.523 214.000 128.000 214.000 C 122.477 214.000 118.000 209.523 118.000 204.000 C 118.000 198.477 122.477 194.000 128.000 194.000 C 133.523 194.000 138.000 198.477 138.000 204.000 Z"),
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
        return _wifiNone!!
    }

private var _wifiNone: ImageVector? = null
