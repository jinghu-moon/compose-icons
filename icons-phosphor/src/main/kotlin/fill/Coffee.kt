package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Coffee: ImageVector
    get() {
        if (_coffee != null) return _coffee!!
        _coffee = phosphorFillIcon(
            name = "Coffee",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 80.000 L 32.000 80.000 C 27.582 80.000 24.000 83.582 24.000 88.000 L 24.000 136.000 C 24.048 163.550 35.894 189.759 56.540 208.000 L 32.000 208.000 C 27.582 208.000 24.000 211.582 24.000 216.000 C 24.000 220.418 27.582 224.000 32.000 224.000 L 208.000 224.000 C 212.418 224.000 216.000 220.418 216.000 216.000 C 216.000 211.582 212.418 208.000 208.000 208.000 L 183.460 208.000 C 195.712 197.141 205.003 183.346 210.460 167.910 C 231.551 166.610 247.992 149.131 248.000 128.000 L 248.000 120.000 C 248.000 97.909 230.091 80.000 208.000 80.000 ZM 232.000 128.000 C 231.993 138.630 224.994 147.988 214.800 151.000 C 215.593 146.039 215.994 141.024 216.000 136.000 L 216.000 97.380 C 225.587 100.769 231.997 109.832 232.000 120.000 ZM 112.000 56.000 L 112.000 24.000 C 112.000 19.582 115.582 16.000 120.000 16.000 C 124.418 16.000 128.000 19.582 128.000 24.000 L 128.000 56.000 C 128.000 60.418 124.418 64.000 120.000 64.000 C 115.582 64.000 112.000 60.418 112.000 56.000 ZM 144.000 56.000 L 144.000 24.000 C 144.000 19.582 147.582 16.000 152.000 16.000 C 156.418 16.000 160.000 19.582 160.000 24.000 L 160.000 56.000 C 160.000 60.418 156.418 64.000 152.000 64.000 C 147.582 64.000 144.000 60.418 144.000 56.000 ZM 80.000 56.000 L 80.000 24.000 C 80.000 19.582 83.582 16.000 88.000 16.000 C 92.418 16.000 96.000 19.582 96.000 24.000 L 96.000 56.000 C 96.000 60.418 92.418 64.000 88.000 64.000 C 83.582 64.000 80.000 60.418 80.000 56.000 Z"),
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
        return _coffee!!
    }

private var _coffee: ImageVector? = null
