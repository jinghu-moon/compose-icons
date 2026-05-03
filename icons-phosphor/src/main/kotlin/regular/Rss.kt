package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Rss: ImageVector
    get() {
        if (_rss != null) return _rss!!
        _rss = phosphorRegularIcon(
            name = "Rss",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 106.910 149.090 C 120.457 162.562 128.051 180.894 128.000 200.000 C 128.000 204.418 124.418 208.000 120.000 208.000 C 115.582 208.000 112.000 204.418 112.000 200.000 C 112.000 169.072 86.928 144.000 56.000 144.000 C 51.582 144.000 48.000 140.418 48.000 136.000 C 48.000 131.582 51.582 128.000 56.000 128.000 C 75.106 127.949 93.438 135.543 106.910 149.090 ZM 56.000 80.000 C 51.582 80.000 48.000 83.582 48.000 88.000 C 48.000 92.418 51.582 96.000 56.000 96.000 C 113.438 96.000 160.000 142.562 160.000 200.000 C 160.000 204.418 163.582 208.000 168.000 208.000 C 172.418 208.000 176.000 204.418 176.000 200.000 C 176.000 133.726 122.274 80.000 56.000 80.000 ZM 174.790 81.210 C 143.355 49.600 100.580 31.880 56.000 32.000 C 51.582 32.000 48.000 35.582 48.000 40.000 C 48.000 44.418 51.582 48.000 56.000 48.000 C 96.335 47.889 135.037 63.921 163.480 92.520 C 192.079 120.963 208.111 159.665 208.000 200.000 C 208.000 204.418 211.582 208.000 216.000 208.000 C 220.418 208.000 224.000 204.418 224.000 200.000 C 224.120 155.420 206.400 112.645 174.790 81.210 ZM 60.000 184.000 C 53.373 184.000 48.000 189.373 48.000 196.000 C 48.000 202.627 53.373 208.000 60.000 208.000 C 66.627 208.000 72.000 202.627 72.000 196.000 C 72.000 189.373 66.627 184.000 60.000 184.000 Z"),
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
        return _rss!!
    }

private var _rss: ImageVector? = null
