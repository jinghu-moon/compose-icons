package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Tornado: ImageVector
    get() {
        if (_tornado != null) return _tornado!!
        _tornado = phosphorRegularIcon(
            name = "Tornado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 40.000 C 232.000 44.418 228.418 48.000 224.000 48.000 L 56.000 48.000 C 51.582 48.000 48.000 44.418 48.000 40.000 C 48.000 35.582 51.582 32.000 56.000 32.000 L 224.000 32.000 C 228.418 32.000 232.000 35.582 232.000 40.000 ZM 184.000 72.000 C 184.000 67.582 180.418 64.000 176.000 64.000 L 32.000 64.000 C 27.582 64.000 24.000 67.582 24.000 72.000 C 24.000 76.418 27.582 80.000 32.000 80.000 L 176.000 80.000 C 180.418 80.000 184.000 76.418 184.000 72.000 ZM 168.000 104.000 C 168.000 99.582 164.418 96.000 160.000 96.000 L 56.000 96.000 C 51.582 96.000 48.000 99.582 48.000 104.000 C 48.000 108.418 51.582 112.000 56.000 112.000 L 160.000 112.000 C 164.418 112.000 168.000 108.418 168.000 104.000 ZM 184.000 136.000 C 184.000 131.582 180.418 128.000 176.000 128.000 L 88.000 128.000 C 83.582 128.000 80.000 131.582 80.000 136.000 C 80.000 140.418 83.582 144.000 88.000 144.000 L 176.000 144.000 C 180.418 144.000 184.000 140.418 184.000 136.000 ZM 184.000 160.000 L 120.000 160.000 C 115.582 160.000 112.000 163.582 112.000 168.000 C 112.000 172.418 115.582 176.000 120.000 176.000 L 184.000 176.000 C 188.418 176.000 192.000 172.418 192.000 168.000 C 192.000 163.582 188.418 160.000 184.000 160.000 ZM 160.000 192.000 L 128.000 192.000 C 123.582 192.000 120.000 195.582 120.000 200.000 C 120.000 204.418 123.582 208.000 128.000 208.000 L 160.000 208.000 C 164.418 208.000 168.000 204.418 168.000 200.000 C 168.000 195.582 164.418 192.000 160.000 192.000 ZM 128.000 224.000 L 112.000 224.000 C 107.582 224.000 104.000 227.582 104.000 232.000 C 104.000 236.418 107.582 240.000 112.000 240.000 L 128.000 240.000 C 132.418 240.000 136.000 236.418 136.000 232.000 C 136.000 227.582 132.418 224.000 128.000 224.000 Z"),
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
        return _tornado!!
    }

private var _tornado: ImageVector? = null
