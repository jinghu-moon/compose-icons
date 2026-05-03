package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Synagogue: ImageVector
    get() {
        if (_synagogue != null) return _synagogue!!
        _synagogue = phosphorFillIcon(
            name = "Synagogue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 57.380 L 208.000 32.000 C 208.000 27.582 204.418 24.000 200.000 24.000 C 195.582 24.000 192.000 27.582 192.000 32.000 L 192.000 57.380 C 182.413 60.769 176.003 69.832 176.000 80.000 L 176.000 122.210 L 136.000 99.360 L 136.000 72.000 C 136.000 67.582 132.418 64.000 128.000 64.000 C 123.582 64.000 120.000 67.582 120.000 72.000 L 120.000 99.360 L 80.000 122.210 L 80.000 80.000 C 79.997 69.832 73.587 60.769 64.000 57.380 L 64.000 32.000 C 64.000 27.582 60.418 24.000 56.000 24.000 C 51.582 24.000 48.000 27.582 48.000 32.000 L 48.000 57.380 C 38.413 60.769 32.003 69.832 32.000 80.000 L 32.000 216.000 C 32.000 220.418 35.582 224.000 40.000 224.000 L 104.000 224.000 C 108.418 224.000 112.000 220.418 112.000 216.000 L 112.000 176.000 C 112.000 167.163 119.163 160.000 128.000 160.000 C 136.837 160.000 144.000 167.163 144.000 176.000 L 144.000 216.000 C 144.000 220.418 147.582 224.000 152.000 224.000 L 216.000 224.000 C 220.418 224.000 224.000 220.418 224.000 216.000 L 224.000 80.000 C 223.997 69.832 217.587 60.769 208.000 57.380 ZM 64.000 208.000 L 48.000 208.000 L 48.000 112.000 L 64.000 112.000 ZM 208.000 208.000 L 192.000 208.000 L 192.000 112.000 L 208.000 112.000 Z"),
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
