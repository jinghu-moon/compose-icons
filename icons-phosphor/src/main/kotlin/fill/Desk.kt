package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Desk: ImageVector
    get() {
        if (_desk != null) return _desk!!
        _desk = phosphorFillIcon(
            name = "Desk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.000 64.000 L 8.000 64.000 C 3.582 64.000 0.000 67.582 0.000 72.000 C 0.000 76.418 3.582 80.000 8.000 80.000 L 16.000 80.000 L 16.000 192.000 C 16.000 196.418 19.582 200.000 24.000 200.000 C 28.418 200.000 32.000 196.418 32.000 192.000 L 32.000 144.000 L 224.000 144.000 L 224.000 192.000 C 224.000 196.418 227.582 200.000 232.000 200.000 C 236.418 200.000 240.000 196.418 240.000 192.000 L 240.000 80.000 L 248.000 80.000 C 252.418 80.000 256.000 76.418 256.000 72.000 C 256.000 67.582 252.418 64.000 248.000 64.000 ZM 80.000 112.000 L 56.000 112.000 C 51.582 112.000 48.000 108.418 48.000 104.000 C 48.000 99.582 51.582 96.000 56.000 96.000 L 80.000 96.000 C 84.418 96.000 88.000 99.582 88.000 104.000 C 88.000 108.418 84.418 112.000 80.000 112.000 ZM 136.000 120.000 C 136.000 124.418 132.418 128.000 128.000 128.000 C 123.582 128.000 120.000 124.418 120.000 120.000 L 120.000 88.000 C 120.000 83.582 123.582 80.000 128.000 80.000 C 132.418 80.000 136.000 83.582 136.000 88.000 ZM 200.000 112.000 L 176.000 112.000 C 171.582 112.000 168.000 108.418 168.000 104.000 C 168.000 99.582 171.582 96.000 176.000 96.000 L 200.000 96.000 C 204.418 96.000 208.000 99.582 208.000 104.000 C 208.000 108.418 204.418 112.000 200.000 112.000 Z"),
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
        return _desk!!
    }

private var _desk: ImageVector? = null
