package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Laptop: ImageVector
    get() {
        if (_laptop != null) return _laptop!!
        _laptop = phosphorRegularIcon(
            name = "Laptop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 168.000 L 224.000 168.000 L 224.000 72.000 C 224.000 58.745 213.255 48.000 200.000 48.000 L 56.000 48.000 C 42.745 48.000 32.000 58.745 32.000 72.000 L 32.000 168.000 L 24.000 168.000 C 19.582 168.000 16.000 171.582 16.000 176.000 L 16.000 192.000 C 16.000 205.255 26.745 216.000 40.000 216.000 L 216.000 216.000 C 229.255 216.000 240.000 205.255 240.000 192.000 L 240.000 176.000 C 240.000 171.582 236.418 168.000 232.000 168.000 ZM 48.000 72.000 C 48.000 67.582 51.582 64.000 56.000 64.000 L 200.000 64.000 C 204.418 64.000 208.000 67.582 208.000 72.000 L 208.000 168.000 L 48.000 168.000 ZM 224.000 192.000 C 224.000 196.418 220.418 200.000 216.000 200.000 L 40.000 200.000 C 35.582 200.000 32.000 196.418 32.000 192.000 L 32.000 184.000 L 224.000 184.000 ZM 152.000 88.000 C 152.000 92.418 148.418 96.000 144.000 96.000 L 112.000 96.000 C 107.582 96.000 104.000 92.418 104.000 88.000 C 104.000 83.582 107.582 80.000 112.000 80.000 L 144.000 80.000 C 148.418 80.000 152.000 83.582 152.000 88.000 Z"),
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
        return _laptop!!
    }

private var _laptop: ImageVector? = null
