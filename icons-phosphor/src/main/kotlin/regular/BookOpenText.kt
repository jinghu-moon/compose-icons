package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BookOpenText: ImageVector
    get() {
        if (_bookOpenText != null) return _bookOpenText!!
        _bookOpenText = phosphorRegularIcon(
            name = "BookOpenText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 48.000 L 160.000 48.000 C 147.410 48.000 135.554 53.928 128.000 64.000 C 120.446 53.928 108.590 48.000 96.000 48.000 L 24.000 48.000 C 19.582 48.000 16.000 51.582 16.000 56.000 L 16.000 200.000 C 16.000 204.418 19.582 208.000 24.000 208.000 L 96.000 208.000 C 109.255 208.000 120.000 218.745 120.000 232.000 C 120.000 236.418 123.582 240.000 128.000 240.000 C 132.418 240.000 136.000 236.418 136.000 232.000 C 136.000 218.745 146.745 208.000 160.000 208.000 L 232.000 208.000 C 236.418 208.000 240.000 204.418 240.000 200.000 L 240.000 56.000 C 240.000 51.582 236.418 48.000 232.000 48.000 ZM 96.000 192.000 L 32.000 192.000 L 32.000 64.000 L 96.000 64.000 C 109.255 64.000 120.000 74.745 120.000 88.000 L 120.000 200.000 C 113.083 194.795 104.657 191.986 96.000 192.000 ZM 224.000 192.000 L 160.000 192.000 C 151.343 191.986 142.917 194.795 136.000 200.000 L 136.000 88.000 C 136.000 74.745 146.745 64.000 160.000 64.000 L 224.000 64.000 ZM 160.000 88.000 L 200.000 88.000 C 204.418 88.000 208.000 91.582 208.000 96.000 C 208.000 100.418 204.418 104.000 200.000 104.000 L 160.000 104.000 C 155.582 104.000 152.000 100.418 152.000 96.000 C 152.000 91.582 155.582 88.000 160.000 88.000 ZM 208.000 128.000 C 208.000 132.418 204.418 136.000 200.000 136.000 L 160.000 136.000 C 155.582 136.000 152.000 132.418 152.000 128.000 C 152.000 123.582 155.582 120.000 160.000 120.000 L 200.000 120.000 C 204.418 120.000 208.000 123.582 208.000 128.000 ZM 208.000 160.000 C 208.000 164.418 204.418 168.000 200.000 168.000 L 160.000 168.000 C 155.582 168.000 152.000 164.418 152.000 160.000 C 152.000 155.582 155.582 152.000 160.000 152.000 L 200.000 152.000 C 204.418 152.000 208.000 155.582 208.000 160.000 Z"),
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
        return _bookOpenText!!
    }

private var _bookOpenText: ImageVector? = null
