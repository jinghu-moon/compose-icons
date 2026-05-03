package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Synagogue: ImageVector
    get() {
        if (_synagogue != null) return _synagogue!!
        _synagogue = phosphorRegularIcon(
            name = "Synagogue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 57.380 L 208.000 32.000 C 208.000 27.582 204.418 24.000 200.000 24.000 C 195.582 24.000 192.000 27.582 192.000 32.000 L 192.000 57.380 C 182.413 60.769 176.003 69.832 176.000 80.000 L 176.000 122.210 L 136.000 99.360 L 136.000 72.000 C 136.000 67.582 132.418 64.000 128.000 64.000 C 123.582 64.000 120.000 67.582 120.000 72.000 L 120.000 99.360 L 80.000 122.210 L 80.000 80.000 C 79.997 69.832 73.587 60.769 64.000 57.380 L 64.000 32.000 C 64.000 27.582 60.418 24.000 56.000 24.000 C 51.582 24.000 48.000 27.582 48.000 32.000 L 48.000 57.380 C 38.413 60.769 32.003 69.832 32.000 80.000 L 32.000 216.000 C 32.000 220.418 35.582 224.000 40.000 224.000 L 112.000 224.000 C 116.418 224.000 120.000 220.418 120.000 216.000 L 120.000 176.000 C 120.000 171.582 123.582 168.000 128.000 168.000 C 132.418 168.000 136.000 171.582 136.000 176.000 L 136.000 216.000 C 136.000 220.418 139.582 224.000 144.000 224.000 L 216.000 224.000 C 220.418 224.000 224.000 220.418 224.000 216.000 L 224.000 80.000 C 223.997 69.832 217.587 60.769 208.000 57.380 ZM 200.000 72.000 C 204.418 72.000 208.000 75.582 208.000 80.000 L 208.000 104.000 L 192.000 104.000 L 192.000 80.000 C 192.000 75.582 195.582 72.000 200.000 72.000 ZM 56.000 72.000 C 60.418 72.000 64.000 75.582 64.000 80.000 L 64.000 104.000 L 48.000 104.000 L 48.000 80.000 C 48.000 75.582 51.582 72.000 56.000 72.000 ZM 48.000 120.000 L 64.000 120.000 L 64.000 208.000 L 48.000 208.000 ZM 128.000 152.000 C 114.745 152.000 104.000 162.745 104.000 176.000 L 104.000 208.000 L 80.000 208.000 L 80.000 140.640 L 128.000 113.210 L 176.000 140.640 L 176.000 208.000 L 152.000 208.000 L 152.000 176.000 C 152.000 162.745 141.255 152.000 128.000 152.000 ZM 192.000 208.000 L 192.000 120.000 L 208.000 120.000 L 208.000 208.000 Z"),
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
        return _synagogue!!
    }

private var _synagogue: ImageVector? = null
