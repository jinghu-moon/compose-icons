package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.StackOverflowLogo: ImageVector
    get() {
        if (_stackOverflowLogo != null) return _stackOverflowLogo!!
        _stackOverflowLogo = phosphorRegularIcon(
            name = "StackOverflowLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 152.09v63.91c0 4.418-3.582 8-8 8h-160c-4.418 0-8-3.582-8-8v-63.91c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v55.91h144v-55.91c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM88 184.09h80c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-80c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM92.88 131.09l77.27 20.68c.678 .186 1.377 .28 2.08 .28 3.99-.032 7.347-2.999 7.868-6.955 .521-3.956-1.952-7.691-5.798-8.755L97 115.61c-2.847-1.052-6.043-.402-8.254 1.677-2.21 2.079-3.054 5.23-2.178 8.136 .876 2.906 3.32 5.065 6.312 5.577ZM111.33 81.16l69.28 40c1.838 1.061 4.022 1.349 6.072 .799 2.05-.55 3.797-1.891 4.858-3.729 2.196-3.823 .886-8.702-2.93-10.91L119.33 67.27c-2.48-1.576-5.624-1.666-8.191-.234-2.566 1.432-4.14 4.156-4.101 7.094 .04 2.938 1.687 5.618 4.291 6.98ZM198.66 94.16c3.126 3.131 8.199 3.136 11.33 .01 3.131-3.126 3.136-8.199 .01-11.33L153.43 26.34c-3.143-2.991-8.097-2.932-11.167 .133-3.071 3.065-3.138 8.019-.153 11.167Z"),
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
        return _stackOverflowLogo!!
    }

private var _stackOverflowLogo: ImageVector? = null
