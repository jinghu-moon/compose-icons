package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.WifiNone: ImageVector
    get() {
        if (_wifiNone != null) return _wifiNone!!
        _wifiNone = phosphorRegularIcon(
            name = "WifiNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 140.000 204.000 C 140.000 210.627 134.627 216.000 128.000 216.000 C 121.373 216.000 116.000 210.627 116.000 204.000 C 116.000 197.373 121.373 192.000 128.000 192.000 C 134.627 192.000 140.000 197.373 140.000 204.000 Z"),
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
