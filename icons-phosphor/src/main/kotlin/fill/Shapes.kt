package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Shapes: ImageVector
    get() {
        if (_shapes != null) return _shapes!!
        _shapes = phosphorFillIcon(
            name = "Shapes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 111.590 181.470 C 112.403 183.910 111.994 186.592 110.490 188.678 C 108.987 190.764 106.572 192.000 104.000 192.000 L 24.000 192.000 C 21.428 192.000 19.013 190.764 17.510 188.678 C 16.006 186.592 15.597 183.910 16.410 181.470 L 56.410 61.470 C 57.498 58.202 60.556 55.998 64.000 55.998 C 67.444 55.998 70.502 58.202 71.590 61.470 ZM 208.000 76.000 C 208.000 47.281 184.719 24.000 156.000 24.000 C 127.281 24.000 104.000 47.281 104.000 76.000 C 104.000 104.719 127.281 128.000 156.000 128.000 C 184.705 127.967 207.967 104.705 208.000 76.000 ZM 224.000 144.000 L 136.000 144.000 C 131.582 144.000 128.000 147.582 128.000 152.000 L 128.000 208.000 C 128.000 212.418 131.582 216.000 136.000 216.000 L 224.000 216.000 C 228.418 216.000 232.000 212.418 232.000 208.000 L 232.000 152.000 C 232.000 147.582 228.418 144.000 224.000 144.000 Z"),
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
        return _shapes!!
    }

private var _shapes: ImageVector? = null
