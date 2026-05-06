package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MopedFront: ImageVector
    get() {
        if (_mopedFront != null) return _mopedFront!!
        _mopedFront = phosphorBoldIcon(
            name = "MopedFront",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-37.68C164.939 17.088 147.663 4.042 128 4.042 108.337 4.042 91.061 17.088 85.68 36h-37.68C41.373 36 36 41.373 36 48c0 6.627 5.373 12 12 12h37.68c1.743 6.167 4.815 11.877 9 16.73C73.261 88.77 60.003 111.429 60 136v64c0 11.046 8.954 20 20 20h16c0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32h16c11.046 0 20-8.954 20-20v-64C195.989 111.42 182.715 88.76 161.28 76.73c4.185-4.853 7.257-10.563 9-16.73h37.72c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM136 220c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-56c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM172 196h-12v-32c0-17.673-14.327-32-32-32-17.673 0-32 14.327-32 32v32h-12v-60c0-24.301 19.699-44 44-44 24.301 0 44 19.699 44 44ZM108 48c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C116.954 68 108 59.046 108 48Z"),
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
        return _mopedFront!!
    }

private var _mopedFront: ImageVector? = null
