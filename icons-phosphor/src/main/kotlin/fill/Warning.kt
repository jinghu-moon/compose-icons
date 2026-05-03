package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Warning: ImageVector
    get() {
        if (_warning != null) return _warning!!
        _warning = phosphorFillIcon(
            name = "Warning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.800 188.090 L 149.350 36.220 L 149.350 36.220 C 144.903 28.649 136.780 23.999 128.000 23.999 C 119.220 23.999 111.097 28.649 106.650 36.220 L 19.200 188.090 C 14.919 195.417 14.919 204.483 19.200 211.810 C 23.592 219.431 31.754 224.091 40.550 224.000 L 215.450 224.000 C 224.239 224.084 232.391 219.425 236.780 211.810 C 241.067 204.486 241.075 195.421 236.800 188.090 ZM 120.000 104.000 C 120.000 99.582 123.582 96.000 128.000 96.000 C 132.418 96.000 136.000 99.582 136.000 104.000 L 136.000 144.000 C 136.000 148.418 132.418 152.000 128.000 152.000 C 123.582 152.000 120.000 148.418 120.000 144.000 ZM 128.000 192.000 C 121.373 192.000 116.000 186.627 116.000 180.000 C 116.000 173.373 121.373 168.000 128.000 168.000 C 134.627 168.000 140.000 173.373 140.000 180.000 C 140.000 186.627 134.627 192.000 128.000 192.000 Z"),
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
        return _warning!!
    }

private var _warning: ImageVector? = null
