package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Church: ImageVector
    get() {
        if (_church != null) return _church!!
        _church = phosphorRegularIcon(
            name = "Church",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.120 145.140 L 192.000 123.470 L 192.000 104.000 C 192.026 101.116 190.498 98.442 188.000 97.000 L 136.000 67.360 L 136.000 48.000 L 152.000 48.000 C 156.418 48.000 160.000 44.418 160.000 40.000 C 160.000 35.582 156.418 32.000 152.000 32.000 L 136.000 32.000 L 136.000 16.000 C 136.000 11.582 132.418 8.000 128.000 8.000 C 123.582 8.000 120.000 11.582 120.000 16.000 L 120.000 32.000 L 104.000 32.000 C 99.582 32.000 96.000 35.582 96.000 40.000 C 96.000 44.418 99.582 48.000 104.000 48.000 L 120.000 48.000 L 120.000 67.360 L 68.000 97.050 C 65.502 98.492 63.974 101.166 64.000 104.050 L 64.000 123.520 L 27.880 145.140 C 25.472 146.587 23.999 149.191 24.000 152.000 L 24.000 216.000 C 24.000 220.418 27.582 224.000 32.000 224.000 L 112.000 224.000 C 116.418 224.000 120.000 220.418 120.000 216.000 L 120.000 168.000 C 120.000 163.582 123.582 160.000 128.000 160.000 C 132.418 160.000 136.000 163.582 136.000 168.000 L 136.000 216.000 C 136.000 220.418 139.582 224.000 144.000 224.000 L 224.000 224.000 C 228.418 224.000 232.000 220.418 232.000 216.000 L 232.000 152.000 C 232.001 149.191 230.528 146.587 228.120 145.140 ZM 40.000 156.530 L 64.000 142.130 L 64.000 208.000 L 40.000 208.000 ZM 128.000 144.000 C 114.745 144.000 104.000 154.745 104.000 168.000 L 104.000 208.000 L 80.000 208.000 L 80.000 108.640 L 128.000 81.210 L 176.000 108.640 L 176.000 208.000 L 152.000 208.000 L 152.000 168.000 C 152.000 154.745 141.255 144.000 128.000 144.000 ZM 216.000 208.000 L 192.000 208.000 L 192.000 142.130 L 216.000 156.530 Z"),
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
        return _church!!
    }

private var _church: ImageVector? = null
