package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Devices: ImageVector
    get() {
        if (_devices != null) return _devices!!
        _devices = phosphorFillIcon(
            name = "Devices",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 72.000 L 208.000 72.000 L 208.000 64.000 C 208.000 50.745 197.255 40.000 184.000 40.000 L 40.000 40.000 C 26.745 40.000 16.000 50.745 16.000 64.000 L 16.000 160.000 C 16.000 173.255 26.745 184.000 40.000 184.000 L 152.000 184.000 L 152.000 192.000 C 152.000 205.255 162.745 216.000 176.000 216.000 L 224.000 216.000 C 237.255 216.000 248.000 205.255 248.000 192.000 L 248.000 96.000 C 248.000 82.745 237.255 72.000 224.000 72.000 ZM 232.000 192.000 C 232.000 196.418 228.418 200.000 224.000 200.000 L 176.000 200.000 C 171.582 200.000 168.000 196.418 168.000 192.000 L 168.000 96.000 C 168.000 91.582 171.582 88.000 176.000 88.000 L 224.000 88.000 C 228.418 88.000 232.000 91.582 232.000 96.000 ZM 136.000 208.000 C 136.000 212.418 132.418 216.000 128.000 216.000 L 88.000 216.000 C 83.582 216.000 80.000 212.418 80.000 208.000 C 80.000 203.582 83.582 200.000 88.000 200.000 L 128.000 200.000 C 132.418 200.000 136.000 203.582 136.000 208.000 ZM 216.000 112.000 C 216.000 116.418 212.418 120.000 208.000 120.000 L 192.000 120.000 C 187.582 120.000 184.000 116.418 184.000 112.000 C 184.000 107.582 187.582 104.000 192.000 104.000 L 208.000 104.000 C 212.418 104.000 216.000 107.582 216.000 112.000 Z"),
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
        return _devices!!
    }

private var _devices: ImageVector? = null
