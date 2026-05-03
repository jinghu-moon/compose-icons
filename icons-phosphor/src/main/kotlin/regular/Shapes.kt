package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Shapes: ImageVector
    get() {
        if (_shapes != null) return _shapes!!
        _shapes = phosphorRegularIcon(
            name = "Shapes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 71.590 61.470 C 70.502 58.202 67.444 55.998 64.000 55.998 C 60.556 55.998 57.498 58.202 56.410 61.470 L 16.410 181.470 C 15.597 183.910 16.006 186.592 17.510 188.678 C 19.013 190.764 21.428 192.000 24.000 192.000 L 104.000 192.000 C 106.572 192.000 108.987 190.764 110.490 188.678 C 111.994 186.592 112.403 183.910 111.590 181.470 ZM 35.100 176.000 L 64.000 89.300 L 92.900 176.000 ZM 208.000 76.000 C 208.000 47.281 184.719 24.000 156.000 24.000 C 127.281 24.000 104.000 47.281 104.000 76.000 C 104.000 104.719 127.281 128.000 156.000 128.000 C 184.705 127.967 207.967 104.705 208.000 76.000 ZM 120.000 76.000 C 120.000 56.118 136.118 40.000 156.000 40.000 C 175.882 40.000 192.000 56.118 192.000 76.000 C 192.000 95.882 175.882 112.000 156.000 112.000 C 136.118 112.000 120.000 95.882 120.000 76.000 ZM 224.000 144.000 L 136.000 144.000 C 131.582 144.000 128.000 147.582 128.000 152.000 L 128.000 208.000 C 128.000 212.418 131.582 216.000 136.000 216.000 L 224.000 216.000 C 228.418 216.000 232.000 212.418 232.000 208.000 L 232.000 152.000 C 232.000 147.582 228.418 144.000 224.000 144.000 ZM 216.000 200.000 L 144.000 200.000 L 144.000 160.000 L 216.000 160.000 Z"),
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
        return _shapes!!
    }

private var _shapes: ImageVector? = null
