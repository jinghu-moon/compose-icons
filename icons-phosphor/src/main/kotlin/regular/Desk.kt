package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Desk: ImageVector
    get() {
        if (_desk != null) return _desk!!
        _desk = phosphorRegularIcon(
            name = "Desk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.000 64.000 L 8.000 64.000 C 3.582 64.000 0.000 67.582 0.000 72.000 C 0.000 76.418 3.582 80.000 8.000 80.000 L 16.000 80.000 L 16.000 192.000 C 16.000 196.418 19.582 200.000 24.000 200.000 C 28.418 200.000 32.000 196.418 32.000 192.000 L 32.000 144.000 L 224.000 144.000 L 224.000 192.000 C 224.000 196.418 227.582 200.000 232.000 200.000 C 236.418 200.000 240.000 196.418 240.000 192.000 L 240.000 80.000 L 248.000 80.000 C 252.418 80.000 256.000 76.418 256.000 72.000 C 256.000 67.582 252.418 64.000 248.000 64.000 ZM 32.000 80.000 L 120.000 80.000 L 120.000 128.000 L 32.000 128.000 ZM 224.000 128.000 L 136.000 128.000 L 136.000 80.000 L 224.000 80.000 ZM 96.000 104.000 C 96.000 108.418 92.418 112.000 88.000 112.000 L 64.000 112.000 C 59.582 112.000 56.000 108.418 56.000 104.000 C 56.000 99.582 59.582 96.000 64.000 96.000 L 88.000 96.000 C 92.418 96.000 96.000 99.582 96.000 104.000 ZM 160.000 104.000 C 160.000 99.582 163.582 96.000 168.000 96.000 L 192.000 96.000 C 196.418 96.000 200.000 99.582 200.000 104.000 C 200.000 108.418 196.418 112.000 192.000 112.000 L 168.000 112.000 C 163.582 112.000 160.000 108.418 160.000 104.000 Z"),
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
