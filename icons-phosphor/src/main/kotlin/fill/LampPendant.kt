package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LampPendant: ImageVector
    get() {
        if (_lampPendant != null) return _lampPendant!!
        _lampPendant = phosphorFillIcon(
            name = "LampPendant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 176.000 74.780 L 176.000 72.000 C 176.000 63.163 168.837 56.000 160.000 56.000 L 136.000 56.000 L 136.000 16.000 C 136.000 11.582 132.418 8.000 128.000 8.000 C 123.582 8.000 120.000 11.582 120.000 16.000 L 120.000 56.000 L 96.000 56.000 C 87.163 56.000 80.000 63.163 80.000 72.000 L 80.000 74.780 C 40.859 93.273 15.923 132.711 16.000 176.000 C 16.000 180.418 19.582 184.000 24.000 184.000 L 88.000 184.000 C 88.000 206.091 105.909 224.000 128.000 224.000 C 150.091 224.000 168.000 206.091 168.000 184.000 L 232.000 184.000 C 236.418 184.000 240.000 180.418 240.000 176.000 C 240.077 132.711 215.141 93.273 176.000 74.780 ZM 128.000 208.000 C 114.745 208.000 104.000 197.255 104.000 184.000 L 152.000 184.000 C 152.000 197.255 141.255 208.000 128.000 208.000 Z"),
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
        return _lampPendant!!
    }

private var _lampPendant: ImageVector? = null
