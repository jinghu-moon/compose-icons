package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.WifiLow: ImageVector
    get() {
        if (_wifiLow != null) return _wifiLow!!
        _wifiLow = phosphorRegularIcon(
            name = "WifiLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M140 204c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM172.71 158.53c-26.658-19.374-62.762-19.374-89.42 0-3.573 2.601-4.361 7.607-1.76 11.18 2.601 3.573 7.607 4.361 11.18 1.76 21.039-15.301 49.541-15.301 70.58 0 3.573 2.601 8.579 1.813 11.18-1.76 2.601-3.573 1.813-8.579-1.76-11.18Z"),
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
        return _wifiLow!!
    }

private var _wifiLow: ImageVector? = null
